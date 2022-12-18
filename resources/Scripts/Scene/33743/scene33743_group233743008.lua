local base_info = {group_id = 233743008}
monsters = {
  {
    config_id = 8001,
    monster_id = 25210401,
    pos = {
      x = 4.017,
      y = -0.102,
      z = -8.022
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
    config_id = 8002,
    monster_id = 25210101,
    pos = {
      x = 0.011,
      y = -0.102,
      z = -10.094
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
    monster_id = 25210401,
    pos = {
      x = -4.072,
      y = -0.102,
      z = -7.993
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
    config_id = 8004,
    monster_id = 25210301,
    pos = {
      x = 10.111,
      y = -0.102,
      z = -0.056
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
    monster_id = 25210501,
    pos = {
      x = 8.024,
      y = -0.102,
      z = -2.966
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
    config_id = 8006,
    monster_id = 25210501,
    pos = {
      x = 8.049,
      y = -0.102,
      z = 3.077
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
    config_id = 8007,
    monster_id = 25210101,
    pos = {
      x = -10.074,
      y = -0.102,
      z = -0.017
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
    config_id = 8008,
    monster_id = 25210501,
    pos = {
      x = -8.084,
      y = -0.102,
      z = 3.008
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
    config_id = 8011,
    monster_id = 25210401,
    pos = {
      x = -8.084,
      y = -0.102,
      z = -3.03
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
    config_id = 8014,
    monster_id = 25210201,
    pos = {
      x = 9.635,
      y = -0.102,
      z = -9.725
    },
    rot = {
      x = 0.0,
      y = 312.965,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 8015,
    monster_id = 25210201,
    pos = {
      x = -9.805,
      y = -0.102,
      z = -9.89
    },
    rot = {
      x = 0.0,
      y = 43.176,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 8016,
    monster_id = 25210201,
    pos = {
      x = 9.795,
      y = -0.102,
      z = 9.236
    },
    rot = {
      x = 0.0,
      y = 209.819,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 8017,
    monster_id = 25210201,
    pos = {
      x = -9.611,
      y = -0.102,
      z = 9.388
    },
    rot = {
      x = 0.0,
      y = 146.312,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 8018,
    monster_id = 25310301,
    pos = {
      x = 4.017,
      y = -0.102,
      z = 8.016
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
    config_id = 8019,
    monster_id = 23020102,
    pos = {
      x = 0.011,
      y = -0.102,
      z = 10.009
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {6105},
    isElite = true
  },
  {
    config_id = 8020,
    monster_id = 25310301,
    pos = {
      x = -4.072,
      y = -0.102,
      z = 8.045
    },
    rot = {
      x = 0.0,
      y = 180.0,
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
    config_id = 1008021,
    name = "MONSTER_TIDE_DIE_8021",
    event = EventType.EVENT_MONSTER_TIDE_DIE,
    source = "1",
    condition = "condition_EVENT_MONSTER_TIDE_DIE_8021",
    action = "action_EVENT_MONSTER_TIDE_DIE_8021"
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
    triggers = {
      "ANY_MONSTER_LIVE_8010",
      "CHALLENGE_SUCCESS_8012",
      "CHALLENGE_FAIL_8013",
      "MONSTER_TIDE_DIE_8021"
    },
    rand_weight = 100
  },
  {
    monsters = {
      8001,
      8002,
      8003,
      8004,
      8005,
      8006,
      8007,
      8008,
      8011,
      8014,
      8015,
      8016,
      8017
    },
    gadgets = {8009},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {
      8018,
      8019,
      8020
    },
    gadgets = {},
    regions = {},
    triggers = {},
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
  local tpl_time = ScriptLib.GetGroupVariableValueByGroup(context, "TPL_TIME", 233743005)
  if tpl_time == nil or tpl_time < 0 then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_challenge_by_remainTime")
    return -1
  elseif tpl_time < 1 then
    tpl_time = 0
  end
  if 0 ~= ScriptLib.ActiveChallenge(context, 2, 198, tpl_time, 233743008, 20, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_challenge_by_remainTime")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_SUCCESS_8012(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "stage", 2, 233743005) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 233743009, 9001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 233743009, 9002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_FAIL_8013(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 233743008, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.CauseDungeonFail(context) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : cause_dungeonfail")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 233743009, 9001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 233743009, 9002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function condition_EVENT_MONSTER_TIDE_DIE_8021(context, evt)
  if 9 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_MONSTER_TIDE_DIE_8021(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 233743008, 3)
  return 0
end
