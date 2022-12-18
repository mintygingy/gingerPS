local base_info = {group_id = 234744005}
monsters = {
  {
    config_id = 5001,
    monster_id = 21020801,
    pos = {
      x = -10.01,
      y = -0.102,
      z = -0.098
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {1027},
    isElite = true
  },
  {
    config_id = 5002,
    monster_id = 21020801,
    pos = {
      x = 10.045,
      y = -0.102,
      z = -0.11
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {6104},
    isElite = true
  },
  {
    config_id = 5005,
    monster_id = 21020401,
    pos = {
      x = -0.025,
      y = -0.102,
      z = -10.138
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {1029},
    isElite = true
  },
  {
    config_id = 5010,
    monster_id = 21020401,
    pos = {
      x = 0.029,
      y = -0.102,
      z = 10.0
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {6101},
    isElite = true
  }
}
npcs = {}
gadgets = {
  {
    config_id = 5011,
    gadget_id = 70900205,
    pos = {
      x = 6.204,
      y = -1.386,
      z = 3.136
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
    config_id = 1005004,
    name = "ANY_MONSTER_LIVE_5004",
    event = EventType.EVENT_ANY_MONSTER_LIVE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_LIVE_5004",
    action = "action_EVENT_ANY_MONSTER_LIVE_5004"
  },
  {
    config_id = 1005008,
    name = "ANY_MONSTER_DIE_5008",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_5008",
    action = "action_EVENT_ANY_MONSTER_DIE_5008"
  },
  {
    config_id = 1005015,
    name = "CHALLENGE_SUCCESS_5015",
    event = EventType.EVENT_CHALLENGE_SUCCESS,
    source = "2",
    condition = "",
    action = "action_EVENT_CHALLENGE_SUCCESS_5015"
  },
  {
    config_id = 1005016,
    name = "CHALLENGE_FAIL_5016",
    event = EventType.EVENT_CHALLENGE_FAIL,
    source = "2",
    condition = "",
    action = "action_EVENT_CHALLENGE_FAIL_5016"
  }
}
variables = {
  {
    config_id = 1,
    name = "monster_wave",
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
    gadgets = {5011},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {5005, 5010},
    gadgets = {5011},
    regions = {},
    triggers = {
      "ANY_MONSTER_LIVE_5004",
      "ANY_MONSTER_DIE_5008",
      "CHALLENGE_SUCCESS_5015",
      "CHALLENGE_FAIL_5016"
    },
    rand_weight = 100
  },
  {
    monsters = {5001, 5002},
    gadgets = {},
    regions = {},
    triggers = {
      "CHALLENGE_SUCCESS_5015",
      "CHALLENGE_FAIL_5016"
    },
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
function condition_EVENT_ANY_MONSTER_LIVE_5004(context, evt)
  if 5005 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_LIVE_5004(context, evt)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "monster_wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  local tpl_time = ScriptLib.GetGroupVariableValueByGroup(context, "TPL_TIME", 234744002)
  if tpl_time == nil or tpl_time < 0 then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_challenge_by_remainTime")
    return -1
  elseif tpl_time < 1 then
    tpl_time = 0
  end
  if 0 ~= ScriptLib.ActiveChallenge(context, 2, 198, tpl_time, 234744005, 4, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_challenge_by_remainTime")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_5008(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "monster_wave") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_5008(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "monster_wave", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 234744005, 3)
  return 0
end
function action_EVENT_CHALLENGE_SUCCESS_5015(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "stage", 2, 234744002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_FAIL_5016(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 234744005, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.CauseDungeonFail(context) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : cause_dungeonfail")
    return -1
  end
  return 0
end
