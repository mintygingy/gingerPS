local base_info = {group_id = 220133063}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 63002,
    gadget_id = 70900055,
    pos = {
      x = 4306.157,
      y = 542.361,
      z = 279.225
    },
    rot = {
      x = 1.911,
      y = 336.444,
      z = 347.306
    },
    level = 1,
    state = GadgetState.GearStop,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1063001,
    name = "GROUP_LOAD_63001",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_63001",
    action = "action_EVENT_GROUP_LOAD_63001",
    trigger_count = 0
  },
  {
    config_id = 1063003,
    name = "GADGET_STATE_CHANGE_63003",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_63003",
    action = "action_EVENT_GADGET_STATE_CHANGE_63003",
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
    gadgets = {63002},
    regions = {},
    triggers = {
      "GROUP_LOAD_63001",
      "GADGET_STATE_CHANGE_63003"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GROUP_LOAD_63001(context, evt)
  if ScriptLib.GetGroupVariableValueByGroup(context, "isFinished", 220133035) ~= 1 then
    return false
  end
  if GadgetState.GearStop ~= ScriptLib.GetGadgetStateByConfigId(context, 220133063, 63002) then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_63001(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 63002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_63003(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133063, 63002) then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_63003(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220133103, 2)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "DoorCreated", 1, 220133103) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  local pos = {
    x = 4302.32,
    y = 542.1581,
    z = 290.11
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = true,
    duration = 2,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = 0,
    is_set_follow_pos = false,
    follow_pos = pos_follow,
    is_force_walk = false,
    is_change_play_mode = false,
    is_set_screen_XY = false,
    screen_x = 0,
    screen_y = 0
  }) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_cameraLook_Begin")
    return -1
  end
  return 0
end
