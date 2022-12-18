local base_info = {group_id = 240051006}
monsters = {
  {
    config_id = 6005,
    monster_id = 24030201,
    pos = {
      x = 467.537,
      y = 68.554,
      z = 497.655
    },
    rot = {
      x = 0.0,
      y = 293.655,
      z = 0.0
    },
    level = 1,
    pose_id = 102
  }
}
npcs = {}
gadgets = {
  {
    config_id = 6001,
    gadget_id = 70290508,
    pos = {
      x = 462.098,
      y = 68.552,
      z = 498.894
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6002,
    gadget_id = 70290484,
    pos = {
      x = 462.098,
      y = 68.552,
      z = 498.894
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6003,
    gadget_id = 70360001,
    pos = {
      x = 462.098,
      y = 68.552,
      z = 498.894
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {220}
    }
  }
}
regions = {}
triggers = {
  {
    config_id = 1006004,
    name = "SELECT_OPTION_6004",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_6004",
    action = "action_EVENT_SELECT_OPTION_6004"
  },
  {
    config_id = 1006006,
    name = "ANY_MONSTER_DIE_6006",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_6006",
    action = "action_EVENT_ANY_MONSTER_DIE_6006"
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
    monsters = {6005},
    gadgets = {6001, 6002},
    regions = {},
    triggers = {
      "SELECT_OPTION_6004",
      "ANY_MONSTER_DIE_6006"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {6003},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_6004(context, evt)
  if 6003 ~= evt.param1 then
    return false
  end
  if 220 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_6004(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 240051006, 6003, 220) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 6001, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  local pos = {
    x = 448.3215,
    y = 69.43208,
    z = 506.8563
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
  ScriptLib.AddExtraGroupSuite(context, 240051007, 3)
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_6006(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_6006(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 6002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 240051006, 2)
  local pos = {
    x = 462.0978,
    y = 68.552,
    z = 498.8942
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
