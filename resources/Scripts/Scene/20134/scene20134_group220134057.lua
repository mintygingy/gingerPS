local base_info = {group_id = 220134057}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 57001,
    gadget_id = 70310400,
    pos = {
      x = 776.971,
      y = 624.193,
      z = -1784.566
    },
    rot = {
      x = 0.0,
      y = 302.264,
      z = 0.0
    },
    level = 1,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1057002,
    name = "GADGET_GIVING_FINISHED_57002",
    event = EventType.EVENT_GADGET_GIVING_FINISHED,
    source = "",
    condition = "",
    action = "action_EVENT_GADGET_GIVING_FINISHED_57002",
    trigger_count = 0
  },
  {
    config_id = 1057003,
    name = "GROUP_LOAD_57003",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_57003",
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
    gadgets = {57001},
    regions = {},
    triggers = {
      "GADGET_GIVING_FINISHED_57002",
      "GROUP_LOAD_57003"
    },
    rand_weight = 100
  }
}
function action_EVENT_GADGET_GIVING_FINISHED_57002(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 57001, GadgetState.ChestLocked) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  local pos = {
    x = 722,
    y = 657,
    z = -1768
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 2,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = 2,
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
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "star4", 1, 220134069) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "star4", 1, 220134092) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.GoToGroupSuite(context, 220134055, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : goto_groupSuite")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_LOAD_57003(context, evt)
  ScriptLib.ActiveGadgetItemGiving(context, 10000112, 220134057, 57001)
  return 0
end
