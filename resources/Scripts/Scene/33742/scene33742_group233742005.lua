local base_info = {group_id = 233742005}
monsters = {
  {
    config_id = 5002,
    monster_id = 25410101,
    pos = {
      x = -4.013,
      y = -0.102,
      z = 10.064
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 5003,
    monster_id = 25410201,
    pos = {
      x = 4.1,
      y = -0.102,
      z = 10.064
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 1
  },
  {
    config_id = 5006,
    monster_id = 24040101,
    pos = {
      x = 0.029,
      y = -0.102,
      z = -7.067
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5222},
    isElite = true,
    pose_id = 1
  },
  {
    config_id = 5007,
    monster_id = 24040301,
    pos = {
      x = -4.032,
      y = -0.102,
      z = -10.042
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5222},
    isElite = true,
    pose_id = 1
  },
  {
    config_id = 5008,
    monster_id = 24040201,
    pos = {
      x = 4.05,
      y = -0.102,
      z = -10.042
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5222},
    isElite = true,
    pose_id = 1
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
    config_id = 1005005,
    name = "ANY_MONSTER_DIE_5005",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_5005",
    action = "action_EVENT_ANY_MONSTER_DIE_5005"
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
    monsters = {
      5006,
      5007,
      5008
    },
    gadgets = {5011},
    regions = {},
    triggers = {
      "ANY_MONSTER_LIVE_5004",
      "ANY_MONSTER_DIE_5005",
      "CHALLENGE_SUCCESS_5015",
      "CHALLENGE_FAIL_5016"
    },
    rand_weight = 100
  },
  {
    monsters = {5002, 5003},
    gadgets = {},
    regions = {},
    triggers = {
      "CHALLENGE_SUCCESS_5015",
      "CHALLENGE_FAIL_5016"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_LIVE_5004(context, evt)
  if 5006 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_LIVE_5004(context, evt)
  local tpl_time = ScriptLib.GetGroupVariableValueByGroup(context, "TPL_TIME", 233742002)
  if tpl_time == nil or tpl_time < 0 then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_challenge_by_remainTime")
    return -1
  elseif tpl_time < 1 then
    tpl_time = 0
  end
  if 0 ~= ScriptLib.ActiveChallenge(context, 2, 198, tpl_time, 233742005, 5, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_challenge_by_remainTime")
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "monster_wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_5005(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "monster_wave") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_5005(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 233742005, 3)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "monster_wave", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_SUCCESS_5015(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "stage", 2, 233742002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_FAIL_5016(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 233742005, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.CauseDungeonFail(context) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : cause_dungeonfail")
    return -1
  end
  return 0
end
