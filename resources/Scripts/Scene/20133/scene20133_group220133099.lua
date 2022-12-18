local base_info = {group_id = 220133099}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 99001,
    gadget_id = 70290286,
    pos = {
      x = 2656.74,
      y = 583.987,
      z = -1748.14
    },
    rot = {
      x = 0.0,
      y = 223.648,
      z = 0.0
    },
    level = 1,
    persistent = true,
    server_global_value_config = {SGV_XinyanPortal_Pic = 312}
  },
  {
    config_id = 99002,
    gadget_id = 70290264,
    pos = {
      x = 2656.74,
      y = 583.987,
      z = -1748.14
    },
    rot = {
      x = 0.0,
      y = 223.648,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  {
    config_id = 99006,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 2656.74,
      y = 583.987,
      z = -1748.14
    }
  }
}
triggers = {
  {
    config_id = 1099005,
    name = "GADGET_STATE_CHANGE_99005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_99005",
    action = "action_EVENT_GADGET_STATE_CHANGE_99005",
    trigger_count = 0
  },
  {
    config_id = 1099006,
    name = "LEAVE_REGION_99006",
    event = EventType.EVENT_LEAVE_REGION,
    source = "",
    condition = "condition_EVENT_LEAVE_REGION_99006",
    action = "action_EVENT_LEAVE_REGION_99006",
    trigger_count = 0
  },
  {
    config_id = 1099007,
    name = "GADGET_CREATE_99007",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_99007",
    action = "action_EVENT_GADGET_CREATE_99007",
    trigger_count = 0
  },
  {
    config_id = 1099008,
    name = "TIME_AXIS_PASS_99008",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_99008",
    action = "action_EVENT_TIME_AXIS_PASS_99008",
    trigger_count = 0
  }
}
variables = {}
garbages = {
  gadgets = {
    {
      config_id = 99003,
      gadget_id = 70310172,
      pos = {
        x = 2650.17,
        y = 584.466,
        z = -1748.756
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
      config_id = 1099004,
      name = "GADGET_STATE_CHANGE_99004",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_99004",
      action = "action_EVENT_GADGET_STATE_CHANGE_99004",
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
    gadgets = {99001},
    regions = {99006},
    triggers = {
      "GADGET_STATE_CHANGE_99005",
      "LEAVE_REGION_99006",
      "GADGET_CREATE_99007",
      "TIME_AXIS_PASS_99008"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_99005(context, evt)
  if 99001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_99005(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 99002}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "CloseTime", {8}, false)
  return 0
end
function condition_EVENT_LEAVE_REGION_99006(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133099, 99001) then
    return false
  end
  return true
end
function action_EVENT_LEAVE_REGION_99006(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 99001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220133099, EntityType.GADGET, 99002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_99007(context, evt)
  if 99001 ~= evt.param1 or GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 0, evt.param1) then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_99007(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 99001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_99008(context, evt)
  if "CloseTime" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_99008(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 99001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220133099, EntityType.GADGET, 99002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
