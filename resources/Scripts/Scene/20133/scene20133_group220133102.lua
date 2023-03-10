local base_info = {group_id = 220133102}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 102001,
    gadget_id = 70290286,
    pos = {
      x = 4383.31,
      y = 535.636,
      z = 226.301
    },
    rot = {
      x = 5.876,
      y = 270.155,
      z = 352.82
    },
    level = 1,
    persistent = true,
    server_global_value_config = {SGV_XinyanPortal_Pic = 321}
  },
  {
    config_id = 102002,
    gadget_id = 70290264,
    pos = {
      x = 4383.31,
      y = 535.636,
      z = 226.301
    },
    rot = {
      x = 5.876,
      y = 270.155,
      z = 352.82
    },
    level = 1
  }
}
regions = {
  {
    config_id = 102006,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 4383.31,
      y = 535.636,
      z = 226.301
    }
  }
}
triggers = {
  {
    config_id = 1102005,
    name = "GADGET_STATE_CHANGE_102005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_102005",
    action = "action_EVENT_GADGET_STATE_CHANGE_102005",
    trigger_count = 0
  },
  {
    config_id = 1102006,
    name = "LEAVE_REGION_102006",
    event = EventType.EVENT_LEAVE_REGION,
    source = "",
    condition = "condition_EVENT_LEAVE_REGION_102006",
    action = "action_EVENT_LEAVE_REGION_102006",
    trigger_count = 0
  },
  {
    config_id = 1102007,
    name = "GADGET_CREATE_102007",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_102007",
    action = "action_EVENT_GADGET_CREATE_102007",
    trigger_count = 0
  },
  {
    config_id = 1102008,
    name = "TIME_AXIS_PASS_102008",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_102008",
    action = "action_EVENT_TIME_AXIS_PASS_102008",
    trigger_count = 0
  }
}
variables = {}
garbages = {
  gadgets = {
    {
      config_id = 102003,
      gadget_id = 70310172,
      pos = {
        x = 4381.674,
        y = 535.736,
        z = 226.161
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
      config_id = 1102004,
      name = "GADGET_STATE_CHANGE_102004",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_102004",
      action = "action_EVENT_GADGET_STATE_CHANGE_102004",
      trigger_count = 0
    }
  }
}
init_config = {
  suite = 1,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {102001},
    regions = {102006},
    triggers = {
      "GADGET_STATE_CHANGE_102005",
      "LEAVE_REGION_102006",
      "GADGET_CREATE_102007",
      "TIME_AXIS_PASS_102008"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_102005(context, evt)
  if 102001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_102005(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 102002}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "CloseTime", {8}, false)
  return 0
end
function condition_EVENT_LEAVE_REGION_102006(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133102, 102001) then
    return false
  end
  return true
end
function action_EVENT_LEAVE_REGION_102006(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 102001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220133102, EntityType.GADGET, 102002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_102007(context, evt)
  if 102001 ~= evt.param1 or GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 0, evt.param1) then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_102007(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 102001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_102008(context, evt)
  if "CloseTime" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_102008(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 102001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220133102, EntityType.GADGET, 102002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
