local base_info = {group_id = 220133093}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 93001,
    gadget_id = 70290286,
    pos = {
      x = 5078.11,
      y = 518.793,
      z = -1619.305
    },
    rot = {
      x = 353.347,
      y = 250.998,
      z = 357.818
    },
    level = 1,
    persistent = true,
    server_global_value_config = {SGV_XinyanPortal_Pic = 128}
  },
  {
    config_id = 93002,
    gadget_id = 70290264,
    pos = {
      x = 5078.11,
      y = 518.793,
      z = -1619.305
    },
    rot = {
      x = 353.347,
      y = 250.998,
      z = 357.818
    },
    level = 1
  }
}
regions = {
  {
    config_id = 93006,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 5078.11,
      y = 518.793,
      z = -1619.305
    }
  }
}
triggers = {
  {
    config_id = 1093005,
    name = "GADGET_STATE_CHANGE_93005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_93005",
    action = "action_EVENT_GADGET_STATE_CHANGE_93005",
    trigger_count = 0
  },
  {
    config_id = 1093006,
    name = "LEAVE_REGION_93006",
    event = EventType.EVENT_LEAVE_REGION,
    source = "",
    condition = "condition_EVENT_LEAVE_REGION_93006",
    action = "action_EVENT_LEAVE_REGION_93006",
    trigger_count = 0
  },
  {
    config_id = 1093007,
    name = "GADGET_CREATE_93007",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_93007",
    action = "action_EVENT_GADGET_CREATE_93007",
    trigger_count = 0
  },
  {
    config_id = 1093008,
    name = "TIME_AXIS_PASS_93008",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_93008",
    action = "action_EVENT_TIME_AXIS_PASS_93008",
    trigger_count = 0
  }
}
variables = {}
garbages = {
  gadgets = {
    {
      config_id = 93003,
      gadget_id = 70310172,
      pos = {
        x = 5077.192,
        y = 519.01,
        z = -1619.859
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
      config_id = 1093004,
      name = "GADGET_STATE_CHANGE_93004",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_93004",
      action = "action_EVENT_GADGET_STATE_CHANGE_93004",
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
    gadgets = {93001},
    regions = {93006},
    triggers = {
      "GADGET_STATE_CHANGE_93005",
      "LEAVE_REGION_93006",
      "GADGET_CREATE_93007",
      "TIME_AXIS_PASS_93008"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_93005(context, evt)
  if 93001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_93005(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 93002}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "CloseTime", {8}, false)
  return 0
end
function condition_EVENT_LEAVE_REGION_93006(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133093, 93001) then
    return false
  end
  return true
end
function action_EVENT_LEAVE_REGION_93006(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 93001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220133093, EntityType.GADGET, 93002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_93007(context, evt)
  if 93001 ~= evt.param1 or GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 0, evt.param1) then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_93007(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 93001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_93008(context, evt)
  if "CloseTime" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_93008(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 93001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220133093, EntityType.GADGET, 93002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
