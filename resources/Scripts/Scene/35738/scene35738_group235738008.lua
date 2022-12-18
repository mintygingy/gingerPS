local base_info = {group_id = 235738008}
monsters = {
  {
    config_id = 8001,
    monster_id = 23050101,
    pos = {
      x = -0.003,
      y = -0.102,
      z = -10.063
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {1026},
    isElite = true
  },
  {
    config_id = 8002,
    monster_id = 23030102,
    pos = {
      x = -10.087,
      y = -0.102,
      z = -0.104
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {9002}
  },
  {
    config_id = 8003,
    monster_id = 23030102,
    pos = {
      x = 10.023,
      y = -0.102,
      z = -0.104
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {9002}
  }
}
npcs = {}
gadgets = {
  {
    config_id = 8008,
    gadget_id = 70900205,
    pos = {
      x = 5.987,
      y = -1.198,
      z = 3.099
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
    config_id = 1008005,
    name = "ANY_MONSTER_LIVE_8005",
    event = EventType.EVENT_ANY_MONSTER_LIVE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_LIVE_8005",
    action = "action_EVENT_ANY_MONSTER_LIVE_8005"
  },
  {
    config_id = 1008009,
    name = "ANY_MONSTER_DIE_8009",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_8009",
    action = "action_EVENT_ANY_MONSTER_DIE_8009"
  },
  {
    config_id = 1008011,
    name = "CHALLENGE_SUCCESS_8011",
    event = EventType.EVENT_CHALLENGE_SUCCESS,
    source = "2",
    condition = "",
    action = "action_EVENT_CHALLENGE_SUCCESS_8011"
  },
  {
    config_id = 1008012,
    name = "CHALLENGE_FAIL_8012",
    event = EventType.EVENT_CHALLENGE_FAIL,
    source = "2",
    condition = "",
    action = "action_EVENT_CHALLENGE_FAIL_8012"
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
    gadgets = {8008},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {
      8001,
      8002,
      8003
    },
    gadgets = {8008},
    regions = {},
    triggers = {
      "ANY_MONSTER_LIVE_8005",
      "ANY_MONSTER_DIE_8009",
      "CHALLENGE_SUCCESS_8011",
      "CHALLENGE_FAIL_8012"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {8008},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_LIVE_8005(context, evt)
  if 8001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_LIVE_8005(context, evt)
  local tpl_time = ScriptLib.GetGroupVariableValueByGroup(context, "TPL_TIME", 235738005)
  if tpl_time == nil or tpl_time < 0 then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_challenge_by_remainTime")
    return -1
  elseif tpl_time < 1 then
    tpl_time = 0
  end
  if 0 ~= ScriptLib.ActiveChallenge(context, 2, 198, tpl_time, 235738008, 3, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_challenge_by_remainTime")
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "monster_wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_8009(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "monster_wave") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_8009(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 235738008, 3)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "monster_wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_SUCCESS_8011(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "stage", 2, 235738005) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 235738009, 9001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 235738009, 9002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_FAIL_8012(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 235738008, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.CauseDungeonFail(context) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : cause_dungeonfail")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 235738009, 9001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 235738009, 9002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
