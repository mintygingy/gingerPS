local base_info = {group_id = 220133088}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 88001,
    gadget_id = 70290286,
    pos = {
      x = -54.05,
      y = 164.234,
      z = 492.02
    },
    rot = {
      x = 0.0,
      y = 54.714,
      z = 0.0
    },
    level = 1,
    persistent = true,
    server_global_value_config = {SGV_XinyanPortal_Pic = 122}
  },
  {
    config_id = 88002,
    gadget_id = 70290264,
    pos = {
      x = -54.05,
      y = 164.234,
      z = 492.02
    },
    rot = {
      x = 0.0,
      y = 54.714,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 88009,
    gadget_id = 70290502,
    pos = {
      x = -54.05,
      y = 164.234,
      z = 492.02
    },
    rot = {
      x = 0.0,
      y = 54.714,
      z = 0.0
    },
    level = 1,
    persistent = true
  }
}
regions = {
  {
    config_id = 88006,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = -54.05,
      y = 164.234,
      z = 492.02
    }
  }
}
triggers = {
  {
    config_id = 1088005,
    name = "GADGET_STATE_CHANGE_88005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_88005",
    action = "action_EVENT_GADGET_STATE_CHANGE_88005",
    trigger_count = 0
  },
  {
    config_id = 1088006,
    name = "LEAVE_REGION_88006",
    event = EventType.EVENT_LEAVE_REGION,
    source = "",
    condition = "condition_EVENT_LEAVE_REGION_88006",
    action = "action_EVENT_LEAVE_REGION_88006",
    trigger_count = 0
  },
  {
    config_id = 1088007,
    name = "GADGET_CREATE_88007",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_88007",
    action = "action_EVENT_GADGET_CREATE_88007",
    trigger_count = 0
  },
  {
    config_id = 1088008,
    name = "GROUP_LOAD_88008",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_88008",
    trigger_count = 0
  },
  {
    config_id = 1088010,
    name = "TIME_AXIS_PASS_88010",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_88010",
    action = "action_EVENT_TIME_AXIS_PASS_88010",
    trigger_count = 0
  }
}
variables = {}
garbages = {
  gadgets = {
    {
      config_id = 88003,
      gadget_id = 70310172,
      pos = {
        x = -54.05,
        y = 164.234,
        z = 492.02
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
      config_id = 1088004,
      name = "GADGET_STATE_CHANGE_88004",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_88004",
      action = "action_EVENT_GADGET_STATE_CHANGE_88004",
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
    gadgets = {88001},
    regions = {88006},
    triggers = {
      "GADGET_STATE_CHANGE_88005",
      "LEAVE_REGION_88006",
      "GADGET_CREATE_88007",
      "GROUP_LOAD_88008",
      "TIME_AXIS_PASS_88010"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {88009},
    regions = {},
    triggers = {
      "GROUP_LOAD_88008"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_88005(context, evt)
  if 88001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_88005(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 88002}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "CloseTime", {8}, false)
  return 0
end
function condition_EVENT_LEAVE_REGION_88006(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133088, 88001) then
    return false
  end
  return true
end
function action_EVENT_LEAVE_REGION_88006(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 88001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220133088, EntityType.GADGET, 88002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_88007(context, evt)
  if 88001 ~= evt.param1 or GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 0, evt.param1) then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_88007(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 88001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_LOAD_88008(context, evt)
  if ScriptLib.GetHostQuestState(context, 4007010) == 3 then
    ScriptLib.RefreshGroup(context, {group_id = 220133088, suite = 1})
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_88010(context, evt)
  if "CloseTime" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_88010(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 88001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220133088, EntityType.GADGET, 88002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
