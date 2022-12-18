local base_info = {group_id = 220133097}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 97001,
    gadget_id = 70290286,
    pos = {
      x = -55.263,
      y = 203.003,
      z = 640.513
    },
    rot = {
      x = 0.0,
      y = 131.006,
      z = 0.0
    },
    level = 1,
    persistent = true,
    server_global_value_config = {SGV_XinyanPortal_Pic = 313}
  },
  {
    config_id = 97002,
    gadget_id = 70290264,
    pos = {
      x = -55.263,
      y = 203.003,
      z = 640.513
    },
    rot = {
      x = 0.0,
      y = 131.006,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 97009,
    gadget_id = 70290502,
    pos = {
      x = -55.263,
      y = 203.003,
      z = 640.513
    },
    rot = {
      x = 0.0,
      y = 131.006,
      z = 0.0
    },
    level = 1,
    persistent = true
  }
}
regions = {
  {
    config_id = 97006,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = -55.263,
      y = 203.003,
      z = 640.513
    }
  }
}
triggers = {
  {
    config_id = 1097005,
    name = "GADGET_STATE_CHANGE_97005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_97005",
    action = "action_EVENT_GADGET_STATE_CHANGE_97005",
    trigger_count = 0
  },
  {
    config_id = 1097006,
    name = "LEAVE_REGION_97006",
    event = EventType.EVENT_LEAVE_REGION,
    source = "",
    condition = "condition_EVENT_LEAVE_REGION_97006",
    action = "action_EVENT_LEAVE_REGION_97006",
    trigger_count = 0
  },
  {
    config_id = 1097007,
    name = "GADGET_CREATE_97007",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_97007",
    action = "action_EVENT_GADGET_CREATE_97007",
    trigger_count = 0
  },
  {
    config_id = 1097008,
    name = "GROUP_LOAD_97008",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_97008",
    trigger_count = 0
  },
  {
    config_id = 1097010,
    name = "TIME_AXIS_PASS_97010",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_97010",
    action = "action_EVENT_TIME_AXIS_PASS_97010",
    trigger_count = 0
  }
}
variables = {}
garbages = {
  gadgets = {
    {
      config_id = 97003,
      gadget_id = 70310172,
      pos = {
        x = -55.205,
        y = 203.052,
        z = 637.037
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
      config_id = 1097004,
      name = "GADGET_STATE_CHANGE_97004",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_97004",
      action = "action_EVENT_GADGET_STATE_CHANGE_97004",
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
    gadgets = {97001},
    regions = {97006},
    triggers = {
      "GADGET_STATE_CHANGE_97005",
      "LEAVE_REGION_97006",
      "GADGET_CREATE_97007",
      "GROUP_LOAD_97008",
      "TIME_AXIS_PASS_97010"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {97009},
    regions = {},
    triggers = {
      "GROUP_LOAD_97008"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_97005(context, evt)
  if 97001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_97005(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 97002}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "CloseTime", {8}, false)
  return 0
end
function condition_EVENT_LEAVE_REGION_97006(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133097, 97001) then
    return false
  end
  return true
end
function action_EVENT_LEAVE_REGION_97006(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 97001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220133097, EntityType.GADGET, 97002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_97007(context, evt)
  if 97001 ~= evt.param1 or GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 0, evt.param1) then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_97007(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 97001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_LOAD_97008(context, evt)
  if ScriptLib.GetHostQuestState(context, 4007010) == 3 then
    ScriptLib.RefreshGroup(context, {group_id = 220133097, suite = 1})
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_97010(context, evt)
  if "CloseTime" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_97010(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 97001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220133097, EntityType.GADGET, 97002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
