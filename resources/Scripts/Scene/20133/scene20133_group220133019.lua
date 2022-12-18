local base_info = {group_id = 220133019}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 19001,
    gadget_id = 70290286,
    pos = {
      x = 2170.328,
      y = 564.821,
      z = 598.71
    },
    rot = {
      x = 358.912,
      y = 140.043,
      z = 0.554
    },
    level = 1,
    state = GadgetState.GearStop,
    persistent = true,
    server_global_value_config = {SGV_XinyanPortal_Pic = 112}
  },
  {
    config_id = 19002,
    gadget_id = 70290264,
    pos = {
      x = 2170.328,
      y = 564.821,
      z = 598.71
    },
    rot = {
      x = 358.912,
      y = 140.043,
      z = 0.554
    },
    level = 1
  },
  {
    config_id = 19003,
    gadget_id = 70310172,
    pos = {
      x = 2170.328,
      y = 564.821,
      z = 598.71
    },
    rot = {
      x = 358.912,
      y = 140.043,
      z = 0.554
    },
    level = 1,
    isOneoff = true,
    persistent = true,
    interact_id = 119
  }
}
regions = {
  {
    config_id = 19006,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 2170.328,
      y = 564.821,
      z = 598.71
    }
  }
}
triggers = {
  {
    config_id = 1019004,
    name = "GADGET_STATE_CHANGE_19004",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_19004",
    action = "action_EVENT_GADGET_STATE_CHANGE_19004",
    trigger_count = 0
  },
  {
    config_id = 1019005,
    name = "GADGET_STATE_CHANGE_19005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_19005",
    action = "action_EVENT_GADGET_STATE_CHANGE_19005",
    trigger_count = 0
  },
  {
    config_id = 1019006,
    name = "LEAVE_REGION_19006",
    event = EventType.EVENT_LEAVE_REGION,
    source = "",
    condition = "condition_EVENT_LEAVE_REGION_19006",
    action = "action_EVENT_LEAVE_REGION_19006",
    trigger_count = 0
  },
  {
    config_id = 1019007,
    name = "GADGET_CREATE_19007",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_19007",
    action = "action_EVENT_GADGET_CREATE_19007",
    trigger_count = 0
  },
  {
    config_id = 1019008,
    name = "TIME_AXIS_PASS_19008",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_19008",
    action = "action_EVENT_TIME_AXIS_PASS_19008",
    trigger_count = 0
  },
  {
    config_id = 1019009,
    name = "QUEST_FINISH_19009",
    event = EventType.EVENT_QUEST_FINISH,
    source = "4006805",
    condition = "",
    action = "action_EVENT_QUEST_FINISH_19009",
    trigger_count = 0
  },
  {
    config_id = 1019010,
    name = "GROUP_LOAD_19010",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_19010",
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
    gadgets = {19001},
    regions = {19006},
    triggers = {
      "GADGET_STATE_CHANGE_19004",
      "GADGET_STATE_CHANGE_19005",
      "LEAVE_REGION_19006",
      "GADGET_CREATE_19007",
      "TIME_AXIS_PASS_19008",
      "QUEST_FINISH_19009",
      "GROUP_LOAD_19010"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_19004(context, evt)
  if 19003 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_19004(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 19001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 19003}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_19005(context, evt)
  if 19001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_19005(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 19002}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "CloseTime", {8}, false)
  return 0
end
function condition_EVENT_LEAVE_REGION_19006(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133019, 19001) then
    return false
  end
  return true
end
function action_EVENT_LEAVE_REGION_19006(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 19001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220133019, EntityType.GADGET, 19002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_19007(context, evt)
  if 19001 ~= evt.param1 or GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 0, evt.param1) then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_19007(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 19001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_19008(context, evt)
  if "CloseTime" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_19008(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 19001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220133019, EntityType.GADGET, 19002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function action_EVENT_QUEST_FINISH_19009(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 19003}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_LOAD_19010(context, evt)
  if ScriptLib.GetHostQuestState(context, 4006805) == 3 then
    ScriptLib.CreateGadget(context, {config_id = 19003})
  end
  return 0
end
