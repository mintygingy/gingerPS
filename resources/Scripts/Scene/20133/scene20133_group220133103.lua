local base_info = {group_id = 220133103}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 103001,
    gadget_id = 70290286,
    pos = {
      x = 4302.32,
      y = 542.158,
      z = 290.11
    },
    rot = {
      x = 357.935,
      y = 171.11,
      z = 8.42
    },
    level = 1,
    persistent = true,
    server_global_value_config = {SGV_XinyanPortal_Pic = 322}
  },
  {
    config_id = 103002,
    gadget_id = 70290264,
    pos = {
      x = 4302.32,
      y = 542.158,
      z = 290.11
    },
    rot = {
      x = 357.935,
      y = 171.11,
      z = 8.42
    },
    level = 1
  }
}
regions = {
  {
    config_id = 103006,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 4302.32,
      y = 542.158,
      z = 290.11
    }
  }
}
triggers = {
  {
    config_id = 1103005,
    name = "GADGET_STATE_CHANGE_103005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_103005",
    action = "action_EVENT_GADGET_STATE_CHANGE_103005",
    trigger_count = 0
  },
  {
    config_id = 1103006,
    name = "LEAVE_REGION_103006",
    event = EventType.EVENT_LEAVE_REGION,
    source = "",
    condition = "condition_EVENT_LEAVE_REGION_103006",
    action = "action_EVENT_LEAVE_REGION_103006",
    trigger_count = 0
  },
  {
    config_id = 1103007,
    name = "GADGET_CREATE_103007",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_103007",
    action = "action_EVENT_GADGET_CREATE_103007",
    trigger_count = 0
  },
  {
    config_id = 1103008,
    name = "GROUP_LOAD_103008",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_103008",
    action = "action_EVENT_GROUP_LOAD_103008",
    trigger_count = 0
  },
  {
    config_id = 1103009,
    name = "TIME_AXIS_PASS_103009",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_103009",
    action = "action_EVENT_TIME_AXIS_PASS_103009",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "DoorCreated",
    value = 0,
    no_refresh = true
  }
}
garbages = {
  gadgets = {
    {
      config_id = 103003,
      gadget_id = 70310172,
      pos = {
        x = 4302.698,
        y = 542.168,
        z = 287.524
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
      config_id = 1103004,
      name = "GADGET_STATE_CHANGE_103004",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_103004",
      action = "action_EVENT_GADGET_STATE_CHANGE_103004",
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
    gadgets = {},
    regions = {},
    triggers = {
      "GROUP_LOAD_103008"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {103001},
    regions = {103006},
    triggers = {
      "GADGET_STATE_CHANGE_103005",
      "LEAVE_REGION_103006",
      "GADGET_CREATE_103007",
      "TIME_AXIS_PASS_103009"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_103005(context, evt)
  if 103001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_103005(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 103002}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "CloseTime", {8}, false)
  return 0
end
function condition_EVENT_LEAVE_REGION_103006(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133103, 103001) then
    return false
  end
  return true
end
function action_EVENT_LEAVE_REGION_103006(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 103001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220133103, EntityType.GADGET, 103002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_103007(context, evt)
  if 103001 ~= evt.param1 or GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 0, evt.param1) then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_103007(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 103001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_103008(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "DoorCreated") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_103008(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220133103, 2)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_103009(context, evt)
  if "CloseTime" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_103009(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 103001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220133103, EntityType.GADGET, 103002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
