local base_info = {group_id = 220133009}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 9001,
    gadget_id = 70290286,
    pos = {
      x = 5048.34,
      y = 537.56,
      z = -1740.16
    },
    rot = {
      x = 8.283,
      y = 1.704,
      z = 2.29
    },
    level = 1,
    state = GadgetState.GearStop,
    persistent = true,
    server_global_value_config = {SGV_XinyanPortal_Pic = 125}
  },
  {
    config_id = 9002,
    gadget_id = 70290264,
    pos = {
      x = 5048.34,
      y = 537.56,
      z = -1740.16
    },
    rot = {
      x = 8.283,
      y = 1.704,
      z = 2.29
    },
    level = 1
  },
  {
    config_id = 9005,
    gadget_id = 70310172,
    pos = {
      x = 5048.34,
      y = 537.56,
      z = -1740.16
    },
    rot = {
      x = 8.283,
      y = 1.704,
      z = 2.29
    },
    level = 1,
    isOneoff = true,
    interact_id = 126
  }
}
regions = {
  {
    config_id = 9006,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 5048.34,
      y = 537.56,
      z = -1740.16
    }
  }
}
triggers = {
  {
    config_id = 1009003,
    name = "GADGET_STATE_CHANGE_9003",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_9003",
    action = "action_EVENT_GADGET_STATE_CHANGE_9003",
    trigger_count = 0
  },
  {
    config_id = 1009004,
    name = "GADGET_STATE_CHANGE_9004",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_9004",
    action = "action_EVENT_GADGET_STATE_CHANGE_9004",
    trigger_count = 0
  },
  {
    config_id = 1009006,
    name = "LEAVE_REGION_9006",
    event = EventType.EVENT_LEAVE_REGION,
    source = "",
    condition = "condition_EVENT_LEAVE_REGION_9006",
    action = "action_EVENT_LEAVE_REGION_9006",
    trigger_count = 0
  },
  {
    config_id = 1009007,
    name = "GADGET_CREATE_9007",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_9007",
    action = "action_EVENT_GADGET_CREATE_9007",
    trigger_count = 0
  },
  {
    config_id = 1009008,
    name = "TIME_AXIS_PASS_9008",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_9008",
    action = "action_EVENT_TIME_AXIS_PASS_9008",
    trigger_count = 0
  }
}
variables = {}
init_config = {
  suite = 1,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {9001, 9005},
    regions = {9006},
    triggers = {
      "GADGET_STATE_CHANGE_9003",
      "GADGET_STATE_CHANGE_9004",
      "LEAVE_REGION_9006",
      "GADGET_CREATE_9007",
      "TIME_AXIS_PASS_9008"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_9003(context, evt)
  if 9005 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_9003(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 9001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 9005}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_9004(context, evt)
  if 9001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_9004(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 9002}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "CloseTime", {8}, false)
  return 0
end
function condition_EVENT_LEAVE_REGION_9006(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133009, 9001) then
    return false
  end
  return true
end
function action_EVENT_LEAVE_REGION_9006(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 9001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220133009, EntityType.GADGET, 9002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_9007(context, evt)
  if 9001 ~= evt.param1 or GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 0, evt.param1) then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_9007(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 9001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_9008(context, evt)
  if "CloseTime" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_9008(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 9001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220133009, EntityType.GADGET, 9002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
