local base_info = {group_id = 220133095}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 95001,
    gadget_id = 70290286,
    pos = {
      x = 5024.706,
      y = 539.615,
      z = -1827.385
    },
    rot = {
      x = 349.012,
      y = 55.278,
      z = 23.949
    },
    level = 1,
    persistent = true,
    server_global_value_config = {SGV_XinyanPortal_Pic = 124}
  },
  {
    config_id = 95002,
    gadget_id = 70290264,
    pos = {
      x = 5024.706,
      y = 539.615,
      z = -1827.385
    },
    rot = {
      x = 349.012,
      y = 55.278,
      z = 23.949
    },
    level = 1
  }
}
regions = {
  {
    config_id = 95006,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 5024.706,
      y = 539.615,
      z = -1827.385
    }
  }
}
triggers = {
  {
    config_id = 1095005,
    name = "GADGET_STATE_CHANGE_95005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_95005",
    action = "action_EVENT_GADGET_STATE_CHANGE_95005",
    trigger_count = 0
  },
  {
    config_id = 1095006,
    name = "LEAVE_REGION_95006",
    event = EventType.EVENT_LEAVE_REGION,
    source = "",
    condition = "condition_EVENT_LEAVE_REGION_95006",
    action = "action_EVENT_LEAVE_REGION_95006",
    trigger_count = 0
  },
  {
    config_id = 1095007,
    name = "GADGET_CREATE_95007",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_95007",
    action = "action_EVENT_GADGET_CREATE_95007",
    trigger_count = 0
  },
  {
    config_id = 1095008,
    name = "TIME_AXIS_PASS_95008",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_95008",
    action = "action_EVENT_TIME_AXIS_PASS_95008",
    trigger_count = 0
  }
}
variables = {}
garbages = {
  gadgets = {
    {
      config_id = 95003,
      gadget_id = 70310172,
      pos = {
        x = 5027.033,
        y = 540.289,
        z = -1826.958
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
      config_id = 1095004,
      name = "GADGET_STATE_CHANGE_95004",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_95004",
      action = "action_EVENT_GADGET_STATE_CHANGE_95004",
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
    gadgets = {95001},
    regions = {95006},
    triggers = {
      "GADGET_STATE_CHANGE_95005",
      "LEAVE_REGION_95006",
      "GADGET_CREATE_95007",
      "TIME_AXIS_PASS_95008"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_95005(context, evt)
  if 95001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_95005(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 95002}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "CloseTime", {8}, false)
  return 0
end
function condition_EVENT_LEAVE_REGION_95006(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133095, 95001) then
    return false
  end
  return true
end
function action_EVENT_LEAVE_REGION_95006(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 95001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220133095, EntityType.GADGET, 95002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_95007(context, evt)
  if 95001 ~= evt.param1 or GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 0, evt.param1) then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_95007(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 95002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_95008(context, evt)
  if "CloseTime" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_95008(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 95001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220133095, EntityType.GADGET, 95002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
