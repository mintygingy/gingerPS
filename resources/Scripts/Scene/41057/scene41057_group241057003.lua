local base_info = {group_id = 241057003}
monsters = {
  {
    config_id = 3005,
    monster_id = 21010101,
    pos = {
      x = 2.465,
      y = 0.024,
      z = -6.868
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    drop_id = 11010210,
    disableWander = true
  },
  {
    config_id = 3006,
    monster_id = 21010101,
    pos = {
      x = -2.681,
      y = 0.024,
      z = -6.834
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    drop_id = 11010210,
    disableWander = true
  },
  {
    config_id = 3007,
    monster_id = 21010201,
    pos = {
      x = 4.862,
      y = 0.025,
      z = -5.673
    },
    rot = {
      x = 0.0,
      y = 330.0,
      z = 0.0
    },
    level = 1,
    drop_id = 11010210,
    disableWander = true
  },
  {
    config_id = 3008,
    monster_id = 21010201,
    pos = {
      x = -4.938,
      y = 0.025,
      z = -5.531
    },
    rot = {
      x = 0.0,
      y = 30.0,
      z = 0.0
    },
    level = 1,
    drop_id = 11010210,
    disableWander = true
  },
  {
    config_id = 3009,
    monster_id = 21010201,
    pos = {
      x = -0.02,
      y = 0.024,
      z = -7.142
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    drop_id = 11010210,
    disableWander = true
  },
  {
    config_id = 3011,
    monster_id = 20010601,
    pos = {
      x = 1.593,
      y = 0.027,
      z = -9.942
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    drop_id = 11010210,
    disableWander = true
  },
  {
    config_id = 3013,
    monster_id = 20010601,
    pos = {
      x = -1.299,
      y = 0.027,
      z = -9.852
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    drop_id = 11010210,
    disableWander = true
  },
  {
    config_id = 3014,
    monster_id = 20010501,
    pos = {
      x = 4.246,
      y = 0.026,
      z = -8.782
    },
    rot = {
      x = 0.0,
      y = 330.0,
      z = 0.0
    },
    level = 1,
    drop_id = 11010210,
    disableWander = true
  },
  {
    config_id = 3015,
    monster_id = 20010501,
    pos = {
      x = -3.864,
      y = 0.026,
      z = -8.673
    },
    rot = {
      x = 0.0,
      y = 30.0,
      z = 0.0
    },
    level = 1,
    drop_id = 11010210,
    disableWander = true
  },
  {
    config_id = 3017,
    monster_id = 21020201,
    pos = {
      x = -4.708,
      y = 0.024,
      z = -5.799
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    drop_id = 11010210,
    disableWander = true
  },
  {
    config_id = 3018,
    monster_id = 21020201,
    pos = {
      x = 4.974,
      y = 0.026,
      z = -5.69
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    drop_id = 11010210,
    disableWander = true
  },
  {
    config_id = 3034,
    monster_id = 22010301,
    pos = {
      x = 0.185,
      y = 0.026,
      z = -8.612
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    drop_id = 11010210,
    disableWander = true
  }
}
npcs = {}
gadgets = {
  {
    config_id = 3020,
    gadget_id = 70900205,
    pos = {
      x = 5.183,
      y = -1.985,
      z = 0.325
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1003001,
    name = "ANY_MONSTER_LIVE_3001",
    event = EventType.EVENT_ANY_MONSTER_LIVE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_LIVE_3001",
    action = "action_EVENT_ANY_MONSTER_LIVE_3001"
  },
  {
    config_id = 1003002,
    name = "CHALLENGE_SUCCESS_3002",
    event = EventType.EVENT_CHALLENGE_SUCCESS,
    source = "1",
    condition = "",
    action = "action_EVENT_CHALLENGE_SUCCESS_3002"
  },
  {
    config_id = 1003003,
    name = "CHALLENGE_FAIL_3003",
    event = EventType.EVENT_CHALLENGE_FAIL,
    source = "1",
    condition = "",
    action = "action_EVENT_CHALLENGE_FAIL_3003"
  },
  {
    config_id = 1003004,
    name = "MONSTER_TIDE_DIE_3004",
    event = EventType.EVENT_MONSTER_TIDE_DIE,
    source = "1",
    condition = "condition_EVENT_MONSTER_TIDE_DIE_3004",
    action = "action_EVENT_MONSTER_TIDE_DIE_3004",
    trigger_count = 0
  },
  {
    config_id = 1003010,
    name = "ANY_MONSTER_DIE_3010",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_3010",
    action = "action_EVENT_ANY_MONSTER_DIE_3010",
    trigger_count = 0
  },
  {
    config_id = 1003016,
    name = "ANY_MONSTER_DIE_3016",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_3016",
    action = "action_EVENT_ANY_MONSTER_DIE_3016",
    trigger_count = 0
  },
  {
    config_id = 1003019,
    name = "ANY_MONSTER_DIE_3019",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_3019",
    action = "action_EVENT_ANY_MONSTER_DIE_3019",
    trigger_count = 0
  },
  {
    config_id = 1003033,
    name = "ANY_MONSTER_DIE_3033",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_3033",
    action = "action_EVENT_ANY_MONSTER_DIE_3033",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "wave",
    value = 0,
    no_refresh = false
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
    gadgets = {3020},
    regions = {},
    triggers = {
      "ANY_MONSTER_LIVE_3001",
      "CHALLENGE_SUCCESS_3002",
      "CHALLENGE_FAIL_3003",
      "MONSTER_TIDE_DIE_3004"
    },
    rand_weight = 100
  },
  {
    monsters = {
      3005,
      3006,
      3007,
      3008,
      3009
    },
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_3010"
    },
    rand_weight = 100
  },
  {
    monsters = {
      3011,
      3013,
      3014,
      3015
    },
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_3016"
    },
    rand_weight = 100
  },
  {
    monsters = {3017},
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_3019"
    },
    rand_weight = 100
  },
  {
    monsters = {3018},
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_3033"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_LIVE_3001(context, evt)
  if 3005 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_LIVE_3001(context, evt)
  if 0 ~= ScriptLib.ActiveChallenge(context, 1, 1, 241057003, 12, 0, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_challenge")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_SUCCESS_3002(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "stage", 1, 241057001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 241057002, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "wave", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_FAIL_3003(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 241057002, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 241057003, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "wave", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_MONSTER_TIDE_DIE_3004(context, evt)
  if 1 ~= evt.param1 then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "stage", 241057001) ~= 1 then
    return false
  end
  return true
end
function action_EVENT_MONSTER_TIDE_DIE_3004(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 241057002, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.sendShowCommonTipsToClient(context, "", "UI_COMMON_TIPS_TEXT_AVATAR_TRY_OUT", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : show_common_tips")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "wave", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_3010(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "wave") ~= 1 then
    return false
  end
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_3010(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 241057003, 3)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_3016(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "wave") ~= 2 then
    return false
  end
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_3016(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 241057003, 4)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_3019(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "wave") ~= 3 then
    return false
  end
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_3019(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 241057003, 5)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_3033(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "wave") ~= 4 then
    return false
  end
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_3033(context, evt)
  if 0 ~= ScriptLib.AutoMonsterTide(context, 1, 241057003, {3034}, 1, 1, 1) then
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
