local base_info = {group_id = 220133100}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 100001,
    gadget_id = 70290286,
    pos = {
      x = -130.382,
      y = 183.089,
      z = 634.454
    },
    rot = {
      x = 8.014,
      y = 117.521,
      z = 12.7
    },
    level = 1,
    persistent = true,
    server_global_value_config = {SGV_XinyanPortal_Pic = 314}
  },
  {
    config_id = 100002,
    gadget_id = 70290264,
    pos = {
      x = -130.382,
      y = 183.089,
      z = 634.454
    },
    rot = {
      x = 8.014,
      y = 117.521,
      z = 12.7
    },
    level = 1
  },
  {
    config_id = 100008,
    gadget_id = 70290502,
    pos = {
      x = -130.382,
      y = 183.089,
      z = 634.454
    },
    rot = {
      x = 8.014,
      y = 117.521,
      z = 12.7
    },
    level = 1,
    persistent = true
  }
}
regions = {
  {
    config_id = 100006,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = -130.382,
      y = 183.089,
      z = 634.454
    }
  }
}
triggers = {
  {
    config_id = 1100005,
    name = "GADGET_STATE_CHANGE_100005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_100005",
    action = "action_EVENT_GADGET_STATE_CHANGE_100005",
    trigger_count = 0
  },
  {
    config_id = 1100006,
    name = "LEAVE_REGION_100006",
    event = EventType.EVENT_LEAVE_REGION,
    source = "",
    condition = "condition_EVENT_LEAVE_REGION_100006",
    action = "action_EVENT_LEAVE_REGION_100006",
    trigger_count = 0
  },
  {
    config_id = 1100007,
    name = "GADGET_CREATE_100007",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_100007",
    action = "action_EVENT_GADGET_CREATE_100007",
    trigger_count = 0
  },
  {
    config_id = 1100009,
    name = "GROUP_LOAD_100009",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_100009",
    trigger_count = 0
  },
  {
    config_id = 1100010,
    name = "TIME_AXIS_PASS_100010",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_100010",
    action = "action_EVENT_TIME_AXIS_PASS_100010",
    trigger_count = 0
  }
}
variables = {}
garbages = {
  gadgets = {
    {
      config_id = 100003,
      gadget_id = 70310172,
      pos = {
        x = -128.104,
        y = 182.723,
        z = 632.864
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
      config_id = 1100004,
      name = "GADGET_STATE_CHANGE_100004",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_100004",
      action = "action_EVENT_GADGET_STATE_CHANGE_100004",
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
    gadgets = {100001},
    regions = {100006},
    triggers = {
      "GADGET_STATE_CHANGE_100005",
      "LEAVE_REGION_100006",
      "GADGET_CREATE_100007",
      "GROUP_LOAD_100009",
      "TIME_AXIS_PASS_100010"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {100008},
    regions = {},
    triggers = {
      "GROUP_LOAD_100009"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_100005(context, evt)
  if 100001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_100005(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 100002}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "CloseTime", {8}, false)
  return 0
end
function condition_EVENT_LEAVE_REGION_100006(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133100, 100001) then
    return false
  end
  return true
end
function action_EVENT_LEAVE_REGION_100006(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 100001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220133100, EntityType.GADGET, 100002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_100007(context, evt)
  if 100001 ~= evt.param1 or GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 0, evt.param1) then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_100007(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 100001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_LOAD_100009(context, evt)
  if ScriptLib.GetHostQuestState(context, 4007010) == 3 then
    ScriptLib.RefreshGroup(context, {group_id = 220133100, suite = 1})
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_100010(context, evt)
  if "CloseTime" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_100010(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 100001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220133100, EntityType.GADGET, 100002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
