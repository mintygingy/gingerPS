local base_info = {group_id = 220148003}
monsters = {
  [3002] = {
    config_id = 3002,
    monster_id = 22050201,
    pos = {
      x = 492.448,
      y = 74.937,
      z = 502.884
    },
    rot = {
      x = 0.0,
      y = 299.101,
      z = 0.0
    },
    level = 1,
    affix = {6116, 6117},
    pose_id = 101
  },
  [3016] = {
    config_id = 3016,
    monster_id = 22050101,
    pos = {
      x = 494.733,
      y = 74.738,
      z = 511.905
    },
    rot = {
      x = 0.0,
      y = 272.067,
      z = 0.0
    },
    level = 1,
    affix = {6116, 6117},
    pose_id = 101
  }
}
npcs = {}
gadgets = {
  [3001] = {
    config_id = 3001,
    gadget_id = 70360001,
    pos = {
      x = 510.79,
      y = 75.253,
      z = 509.987
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [3005] = {
    config_id = 3005,
    gadget_id = 70310193,
    pos = {
      x = 493.932,
      y = 74.937,
      z = 507.428
    },
    rot = {
      x = 0.0,
      y = 202.472,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  [3006] = {
    config_id = 3006,
    gadget_id = 70310195,
    pos = {
      x = 500.396,
      y = 75.789,
      z = 527.898
    },
    rot = {
      x = 0.0,
      y = 187.278,
      z = 0.0
    },
    level = 1
  },
  [3007] = {
    config_id = 3007,
    gadget_id = 70310195,
    pos = {
      x = 513.893,
      y = 75.762,
      z = 500.697
    },
    rot = {
      x = 0.0,
      y = 290.466,
      z = 0.0
    },
    level = 1
  },
  [3008] = {
    config_id = 3008,
    gadget_id = 70310195,
    pos = {
      x = 505.534,
      y = 75.625,
      z = 487.704
    },
    rot = {
      x = 0.0,
      y = 331.504,
      z = 0.0
    },
    level = 1
  },
  [3017] = {
    config_id = 3017,
    gadget_id = 70310198,
    pos = {
      x = 475.41,
      y = 75.634,
      z = 518.219
    },
    rot = {
      x = 0.0,
      y = 226.99,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1003009,
    name = "GADGET_STATE_CHANGE_3009",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_3009",
    action = "action_EVENT_GADGET_STATE_CHANGE_3009",
    trigger_count = 0
  },
  {
    config_id = 1003010,
    name = "GADGET_STATE_CHANGE_3010",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_3010",
    action = "action_EVENT_GADGET_STATE_CHANGE_3010",
    trigger_count = 0
  },
  {
    config_id = 1003018,
    name = "GADGET_STATE_CHANGE_3018",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_3018",
    action = "action_EVENT_GADGET_STATE_CHANGE_3018",
    trigger_count = 0
  },
  {
    config_id = 1003019,
    name = "VARIABLE_CHANGE_3019",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_3019",
    action = "action_EVENT_VARIABLE_CHANGE_3019"
  },
  {
    config_id = 1003027,
    name = "LUA_NOTIFY_3027",
    event = EventType.EVENT_LUA_NOTIFY,
    source = "DF_CoreDie",
    condition = "",
    action = "action_EVENT_LUA_NOTIFY_3027",
    trigger_count = 0
  },
  {
    config_id = 1003031,
    name = "ANY_MONSTER_DIE_3031",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_3031",
    action = "action_EVENT_ANY_MONSTER_DIE_3031"
  },
  {
    config_id = 1003032,
    name = "ANY_MONSTER_DIE_3032",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_3032",
    action = "action_EVENT_ANY_MONSTER_DIE_3032"
  },
  {
    config_id = 1003033,
    name = "VARIABLE_CHANGE_3033",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_3033",
    action = "action_EVENT_VARIABLE_CHANGE_3033"
  }
}
variables = {
  {
    config_id = 1,
    name = "BossNum",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 2,
    name = "PointNum",
    value = 3,
    no_refresh = false
  }
}
init_config = {
  suite = 1,
  end_suite = 3,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {
      3001,
      3005,
      3006,
      3007,
      3008,
      3017
    },
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_3009",
      "GADGET_STATE_CHANGE_3010",
      "GADGET_STATE_CHANGE_3018",
      "VARIABLE_CHANGE_3019",
      "LUA_NOTIFY_3027"
    },
    rand_weight = 100
  },
  {
    monsters = {3002, 3016},
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_3031",
      "ANY_MONSTER_DIE_3032",
      "VARIABLE_CHANGE_3033"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {3017},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_3009(context, evt)
  if 3006 ~= evt.param2 or GadgetState.GearStop ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_3009(context, evt)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "PointNum", -1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_3010(context, evt)
  if 3007 ~= evt.param2 or GadgetState.GearStop ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_3010(context, evt)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "PointNum", -1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_3018(context, evt)
  if 3008 ~= evt.param2 or GadgetState.GearStop ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_3018(context, evt)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "PointNum", -1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_3019(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "PointNum") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_3019(context, evt)
  if 0 ~= ScriptLib.KillGroupEntity(context, {
    group_id = 220148004,
    kill_policy = GroupKillPolicy.GROUP_KILL_MONSTER
  }) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_monster_by_group")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3005, GadgetState.GatherDrop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220148003, 2)
  return 0
end
function action_EVENT_LUA_NOTIFY_3027(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3005, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_3031(context, evt)
  if 3002 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_3031(context, evt)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "BossNum", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_3032(context, evt)
  if 3016 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_3032(context, evt)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "BossNum", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_3033(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "BossNum") ~= 2 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_3033(context, evt)
  local pos = {
    x = 493.9315,
    y = 74.93681,
    z = 507.4277
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = true,
    duration = 3,
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
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3005, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
