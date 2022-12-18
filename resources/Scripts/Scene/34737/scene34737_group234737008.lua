local base_info = {group_id = 234737008}
monsters = {
  {
    config_id = 8001,
    monster_id = 20011304,
    pos = {
      x = -10.017,
      y = -0.102,
      z = 3.028
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 8002,
    monster_id = 21030203,
    pos = {
      x = 0.012,
      y = -0.102,
      z = -10.011
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 8003,
    monster_id = 20011304,
    pos = {
      x = -10.159,
      y = -0.102,
      z = -3.122
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 8004,
    monster_id = 20011103,
    pos = {
      x = 10.056,
      y = -0.102,
      z = -2.95
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 8005,
    monster_id = 22010302,
    pos = {
      x = -2.933,
      y = -0.102,
      z = 10.002
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {1026}
  },
  {
    config_id = 8006,
    monster_id = 22010304,
    pos = {
      x = 3.055,
      y = -0.102,
      z = 9.997
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {6106},
    isElite = true
  },
  {
    config_id = 8017,
    monster_id = 20011103,
    pos = {
      x = 10.157,
      y = -0.102,
      z = 3.033
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  }
}
npcs = {}
gadgets = {
  {
    config_id = 8009,
    gadget_id = 70900205,
    pos = {
      x = 5.917,
      y = -0.566,
      z = 2.6
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
    config_id = 1008010,
    name = "ANY_MONSTER_LIVE_8010",
    event = EventType.EVENT_ANY_MONSTER_LIVE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_LIVE_8010",
    action = "action_EVENT_ANY_MONSTER_LIVE_8010"
  },
  {
    config_id = 1008012,
    name = "CHALLENGE_SUCCESS_8012",
    event = EventType.EVENT_CHALLENGE_SUCCESS,
    source = "2",
    condition = "",
    action = "action_EVENT_CHALLENGE_SUCCESS_8012"
  },
  {
    config_id = 1008013,
    name = "CHALLENGE_FAIL_8013",
    event = EventType.EVENT_CHALLENGE_FAIL,
    source = "2",
    condition = "",
    action = "action_EVENT_CHALLENGE_FAIL_8013"
  },
  {
    config_id = 1008020,
    name = "ANY_MONSTER_DIE_8020",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_8020",
    action = "action_EVENT_ANY_MONSTER_DIE_8020"
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
    gadgets = {8009},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {
      8001,
      8002,
      8003,
      8004,
      8017
    },
    gadgets = {8009},
    regions = {},
    triggers = {
      "ANY_MONSTER_LIVE_8010",
      "CHALLENGE_SUCCESS_8012",
      "CHALLENGE_FAIL_8013",
      "ANY_MONSTER_DIE_8020"
    },
    rand_weight = 100
  },
  {
    monsters = {8005, 8006},
    gadgets = {8009},
    regions = {},
    triggers = {
      "CHALLENGE_SUCCESS_8012",
      "CHALLENGE_FAIL_8013"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_LIVE_8010(context, evt)
  if 8001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_LIVE_8010(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "monster_wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  local tpl_time = ScriptLib.GetGroupVariableValueByGroup(context, "TPL_TIME", 234737005)
  if tpl_time == nil or tpl_time < 0 then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_challenge_by_remainTime")
    return -1
  elseif tpl_time < 1 then
    tpl_time = 0
  end
  if 0 ~= ScriptLib.ActiveChallenge(context, 2, 198, tpl_time, 234737008, 7, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_challenge_by_remainTime")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_SUCCESS_8012(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "stage", 2, 234737005) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 234737009, 9001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 234737009, 9002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_FAIL_8013(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 234737008, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.CauseDungeonFail(context) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : cause_dungeonfail")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 234737009, 9001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 234737009, 9002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_8020(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "monster_wave") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_8020(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "monster_wave", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 234737008, 3)
  return 0
end
