local base_info = {group_id = 241053003}
monsters = {
  {
    config_id = 3005,
    monster_id = 24010101,
    pos = {
      x = 0.078,
      y = -0.038,
      z = -9.84
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    drop_id = 11010210,
    disableWander = true,
    pose_id = 100,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 3006,
    monster_id = 21020201,
    pos = {
      x = 0.078,
      y = -0.038,
      z = -8.56
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
    monster_id = 21020201,
    pos = {
      x = 4.77,
      y = -0.038,
      z = -7.459
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
    config_id = 3020,
    monster_id = 21020201,
    pos = {
      x = -4.474,
      y = -0.038,
      z = -7.487
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
    config_id = 3021,
    gadget_id = 70900205,
    pos = {
      x = 5.073,
      y = -2.049,
      z = 0.305
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
    config_id = 1003012,
    name = "ANY_MONSTER_DIE_3012",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_3012",
    action = "action_EVENT_ANY_MONSTER_DIE_3012",
    trigger_count = 0
  },
  {
    config_id = 1003013,
    name = "ANY_MONSTER_DIE_3013",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_3013",
    action = "action_EVENT_ANY_MONSTER_DIE_3013",
    trigger_count = 0
  },
  {
    config_id = 1003014,
    name = "ANY_MONSTER_DIE_3014",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_3014",
    action = "action_EVENT_ANY_MONSTER_DIE_3014",
    trigger_count = 0
  },
  {
    config_id = 1003022,
    name = "ANY_MONSTER_LIVE_3022",
    event = EventType.EVENT_ANY_MONSTER_LIVE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_LIVE_3022",
    action = "action_EVENT_ANY_MONSTER_LIVE_3022"
  },
  {
    config_id = 1003023,
    name = "CHALLENGE_SUCCESS_3023",
    event = EventType.EVENT_CHALLENGE_SUCCESS,
    source = "1",
    condition = "",
    action = "action_EVENT_CHALLENGE_SUCCESS_3023"
  },
  {
    config_id = 1003024,
    name = "CHALLENGE_FAIL_3024",
    event = EventType.EVENT_CHALLENGE_FAIL,
    source = "1",
    condition = "",
    action = "action_EVENT_CHALLENGE_FAIL_3024"
  },
  {
    config_id = 1003025,
    name = "MONSTER_TIDE_DIE_3025",
    event = EventType.EVENT_MONSTER_TIDE_DIE,
    source = "1",
    condition = "condition_EVENT_MONSTER_TIDE_DIE_3025",
    action = "action_EVENT_MONSTER_TIDE_DIE_3025",
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
    gadgets = {3021},
    regions = {},
    triggers = {
      "ANY_MONSTER_LIVE_3022",
      "CHALLENGE_SUCCESS_3023",
      "CHALLENGE_FAIL_3024",
      "MONSTER_TIDE_DIE_3025"
    },
    rand_weight = 100
  },
  {
    monsters = {3006},
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_3012"
    },
    rand_weight = 100
  },
  {
    monsters = {3011},
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_3014"
    },
    rand_weight = 100
  },
  {
    monsters = {3020},
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_3013"
    },
    rand_weight = 100
  },
  {
    monsters = {3005},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_DIE_3012(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "wave") ~= 1 then
    return false
  end
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_3012(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 241053003, 3)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_3013(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "wave") ~= 3 then
    return false
  end
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_3013(context, evt)
  if 0 ~= ScriptLib.AutoMonsterTide(context, 1, 241053003, {3005}, 1, 1, 1) then
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_3014(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "wave") ~= 2 then
    return false
  end
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_3014(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 241053003, 4)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_LIVE_3022(context, evt)
  if 3006 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_LIVE_3022(context, evt)
  if 0 ~= ScriptLib.ActiveChallenge(context, 1, 1, 241053003, 4, 0, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_challenge")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_SUCCESS_3023(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "stage", 1, 241053001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 241053002, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "wave", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_FAIL_3024(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 241053002, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 241053003, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "wave", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_MONSTER_TIDE_DIE_3025(context, evt)
  if 1 ~= evt.param1 then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "stage", 241053001) ~= 1 then
    return false
  end
  return true
end
function action_EVENT_MONSTER_TIDE_DIE_3025(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 241053002, suite = 1}) then
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
