local base_info = {group_id = 220147003}
monsters = {
  {
    config_id = 3004,
    monster_id = 26090901,
    pos = {
      x = 760.544,
      y = 56.953,
      z = 370.671
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    pose_id = 101
  },
  {
    config_id = 3005,
    monster_id = 26090901,
    pos = {
      x = 750.666,
      y = 56.953,
      z = 374.785
    },
    rot = {
      x = 0.0,
      y = 55.625,
      z = 0.0
    },
    level = 1,
    pose_id = 101
  },
  {
    config_id = 3006,
    monster_id = 26090801,
    pos = {
      x = 760.515,
      y = 56.846,
      z = 384.575
    },
    rot = {
      x = 0.0,
      y = 201.247,
      z = 0.0
    },
    level = 1,
    pose_id = 101
  },
  {
    config_id = 3007,
    monster_id = 26090401,
    pos = {
      x = 765.556,
      y = 56.953,
      z = 378.013
    },
    rot = {
      x = 0.0,
      y = 273.447,
      z = 0.0
    },
    level = 1,
    pose_id = 101
  },
  {
    config_id = 3008,
    monster_id = 26090401,
    pos = {
      x = 753.138,
      y = 56.809,
      z = 383.461
    },
    rot = {
      x = 0.0,
      y = 162.839,
      z = 0.0
    },
    level = 1,
    pose_id = 101
  }
}
npcs = {}
gadgets = {
  {
    config_id = 3001,
    gadget_id = 70290508,
    pos = {
      x = 757.793,
      y = 56.945,
      z = 377.707
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 3002,
    gadget_id = 70290527,
    pos = {
      x = 748.32,
      y = 64.85,
      z = 356.63
    },
    rot = {
      x = 0.0,
      y = 20.555,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3003,
    gadget_id = 70290484,
    pos = {
      x = 757.793,
      y = 56.945,
      z = 377.707
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3009,
    gadget_id = 70900201,
    pos = {
      x = 757.793,
      y = 59.529,
      z = 377.707
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3010,
    gadget_id = 70360001,
    pos = {
      x = 757.793,
      y = 56.945,
      z = 377.707
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
    config_id = 1003011,
    name = "ANY_MONSTER_DIE_3011",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_3011",
    action = "action_EVENT_ANY_MONSTER_DIE_3011"
  },
  {
    config_id = 1003012,
    name = "SELECT_OPTION_3012",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_3012",
    action = "action_EVENT_SELECT_OPTION_3012"
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
    gadgets = {
      3001,
      3002,
      3003,
      3009
    },
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_3011",
      "SELECT_OPTION_3012"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {3010},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {
      3004,
      3005,
      3006,
      3007,
      3008
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_DIE_3011(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_3011(context, evt)
  local pos = {
    x = 757.7932,
    y = 56.94489,
    z = 377.7069
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
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3003, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220147003, 2)
  return 0
end
function condition_EVENT_SELECT_OPTION_3012(context, evt)
  if 3010 ~= evt.param1 then
    return false
  end
  if 220 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_3012(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220147003, 3010, 220) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3001, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValueByGroup(context, "KeyNum", 1, 220147002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable_by_group")
    return -1
  end
  local pos = {
    x = 748.97,
    y = 64.63577,
    z = 360.614
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
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 3009}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.ShowReminder(context, 33010150) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
