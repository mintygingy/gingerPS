local base_info = {group_id = 220133094}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 94001,
    gadget_id = 70290286,
    pos = {
      x = -47.738,
      y = 157.17,
      z = 696.886
    },
    rot = {
      x = 0.0,
      y = 148.409,
      z = 0.0
    },
    level = 1,
    persistent = true,
    server_global_value_config = {SGV_XinyanPortal_Pic = 123}
  },
  {
    config_id = 94002,
    gadget_id = 70290264,
    pos = {
      x = -47.738,
      y = 157.17,
      z = 696.886
    },
    rot = {
      x = 0.0,
      y = 148.409,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 94008,
    gadget_id = 70290502,
    pos = {
      x = -47.738,
      y = 157.17,
      z = 696.886
    },
    rot = {
      x = 0.0,
      y = 148.409,
      z = 0.0
    },
    level = 1,
    persistent = true
  }
}
regions = {
  {
    config_id = 94006,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = -47.738,
      y = 157.17,
      z = 696.886
    }
  }
}
triggers = {
  {
    config_id = 1094005,
    name = "GADGET_STATE_CHANGE_94005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_94005",
    action = "action_EVENT_GADGET_STATE_CHANGE_94005",
    trigger_count = 0
  },
  {
    config_id = 1094006,
    name = "LEAVE_REGION_94006",
    event = EventType.EVENT_LEAVE_REGION,
    source = "",
    condition = "condition_EVENT_LEAVE_REGION_94006",
    action = "action_EVENT_LEAVE_REGION_94006",
    trigger_count = 0
  },
  {
    config_id = 1094007,
    name = "GADGET_CREATE_94007",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_94007",
    action = "action_EVENT_GADGET_CREATE_94007",
    trigger_count = 0
  },
  {
    config_id = 1094009,
    name = "GROUP_LOAD_94009",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_94009",
    trigger_count = 0
  },
  {
    config_id = 1094010,
    name = "TIME_AXIS_PASS_94010",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_94010",
    action = "action_EVENT_TIME_AXIS_PASS_94010",
    trigger_count = 0
  }
}
variables = {}
garbages = {
  gadgets = {
    {
      config_id = 94003,
      gadget_id = 70310172,
      pos = {
        x = -46.403,
        y = 157.46,
        z = 693.994
      },
      rot = {
        x = 0.0,
        y = 54.714,
        z = 0.0
      },
      level = 1,
      isOneoff = true,
      interact_id = 126
    }
  },
  triggers = {
    {
      config_id = 1094004,
      name = "GADGET_STATE_CHANGE_94004",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_94004",
      action = "action_EVENT_GADGET_STATE_CHANGE_94004",
      trigger_count = 0
    }
  }
}
init_config = {
  suite = 2,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {94001},
    regions = {94006},
    triggers = {
      "GADGET_STATE_CHANGE_94005",
      "LEAVE_REGION_94006",
      "GADGET_CREATE_94007",
      "GROUP_LOAD_94009",
      "TIME_AXIS_PASS_94010"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {94008},
    regions = {},
    triggers = {
      "GROUP_LOAD_94009"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_94005(context, evt)
  if 94001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_94005(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 94002}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "CloseTime", {8}, false)
  return 0
end
function condition_EVENT_LEAVE_REGION_94006(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133094, 94001) then
    return false
  end
  return true
end
function action_EVENT_LEAVE_REGION_94006(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 94001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220133094, EntityType.GADGET, 94002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_94007(context, evt)
  if 94001 ~= evt.param1 or GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 0, evt.param1) then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_94007(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 94002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_LOAD_94009(context, evt)
  if ScriptLib.GetHostQuestState(context, 4007010) == 3 then
    ScriptLib.RefreshGroup(context, {group_id = 220133094, suite = 1})
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_94010(context, evt)
  if "CloseTime" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_94010(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 94001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220133094, EntityType.GADGET, 94002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
