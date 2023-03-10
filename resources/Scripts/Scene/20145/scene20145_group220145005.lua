local base_info = {group_id = 220145005}
monsters = {
  {
    config_id = 5002,
    monster_id = 26090701,
    pos = {
      x = 460.475,
      y = 68.446,
      z = 494.635
    },
    rot = {
      x = 0.0,
      y = 2.879,
      z = 0.0
    },
    level = 1,
    pose_id = 102
  },
  {
    config_id = 5003,
    monster_id = 26090901,
    pos = {
      x = 462.399,
      y = 68.449,
      z = 502.752
    },
    rot = {
      x = 0.0,
      y = 192.775,
      z = 0.0
    },
    level = 1,
    pose_id = 102
  },
  {
    config_id = 5004,
    monster_id = 26090501,
    pos = {
      x = 455.893,
      y = 68.446,
      z = 503.921
    },
    rot = {
      x = 0.0,
      y = 136.089,
      z = 0.0
    },
    level = 1,
    pose_id = 102
  },
  {
    config_id = 5006,
    monster_id = 26090401,
    pos = {
      x = 467.649,
      y = 68.446,
      z = 491.909
    },
    rot = {
      x = 0.0,
      y = 323.391,
      z = 0.0
    },
    level = 1,
    pose_id = 102
  },
  {
    config_id = 5007,
    monster_id = 26090101,
    pos = {
      x = 466.148,
      y = 68.444,
      z = 496.612
    },
    rot = {
      x = 0.0,
      y = 300.973,
      z = 0.0
    },
    level = 1,
    pose_id = 102
  },
  {
    config_id = 5008,
    monster_id = 26090101,
    pos = {
      x = 457.589,
      y = 68.447,
      z = 499.293
    },
    rot = {
      x = 0.0,
      y = 120.95,
      z = 0.0
    },
    level = 1,
    pose_id = 102
  }
}
npcs = {}
gadgets = {
  {
    config_id = 5001,
    gadget_id = 70290484,
    pos = {
      x = 462.018,
      y = 68.435,
      z = 498.83
    },
    rot = {
      x = 0.0,
      y = 28.785,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5005,
    gadget_id = 70290508,
    pos = {
      x = 462.018,
      y = 68.435,
      z = 498.83
    },
    rot = {
      x = 0.0,
      y = 28.785,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 5011,
    gadget_id = 70360001,
    pos = {
      x = 462.08,
      y = 68.561,
      z = 498.809
    },
    rot = {
      x = 0.0,
      y = 28.785,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {220}
    }
  },
  {
    config_id = 5012,
    gadget_id = 70900201,
    pos = {
      x = 462.018,
      y = 70.553,
      z = 498.83
    },
    rot = {
      x = 0.0,
      y = 28.785,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1005009,
    name = "ANY_MONSTER_DIE_5009",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_5009",
    action = "action_EVENT_ANY_MONSTER_DIE_5009"
  },
  {
    config_id = 1005010,
    name = "SELECT_OPTION_5010",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_5010",
    action = "action_EVENT_SELECT_OPTION_5010"
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
    monsters = {
      5002,
      5003,
      5004,
      5006,
      5007,
      5008
    },
    gadgets = {
      5001,
      5005,
      5012
    },
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_5009",
      "SELECT_OPTION_5010"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {5011},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_DIE_5009(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_5009(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  local pos = {
    x = 462.0182,
    y = 68.43479,
    z = 498.8304
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
  ScriptLib.AddExtraGroupSuite(context, 220145005, 2)
  if 0 ~= ScriptLib.ShowReminder(context, 201450101) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_5010(context, evt)
  if 5011 ~= evt.param1 then
    return false
  end
  if 220 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_5010(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220145005, 5011, 220) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5005, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValueByGroup(context, "KeyNum", 1, 220145001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 5012}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
