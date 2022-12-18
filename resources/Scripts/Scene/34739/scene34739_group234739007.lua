local base_info = {group_id = 234739007}
monsters = {
  {
    config_id = 7001,
    monster_id = 20050802,
    pos = {
      x = 0.032,
      y = -0.102,
      z = -10.174
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
    config_id = 7002,
    monster_id = 20050203,
    pos = {
      x = -6.864,
      y = -0.102,
      z = -10.021
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
    config_id = 7003,
    monster_id = 20050203,
    pos = {
      x = 7.069,
      y = -0.102,
      z = -10.089
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
    config_id = 7004,
    monster_id = 20050502,
    pos = {
      x = 0.032,
      y = -0.102,
      z = 9.972
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
    config_id = 7005,
    monster_id = 20050603,
    pos = {
      x = -6.864,
      y = -0.102,
      z = 10.126
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
    config_id = 7006,
    monster_id = 20050603,
    pos = {
      x = 7.069,
      y = -0.102,
      z = 10.058
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
    config_id = 7008,
    monster_id = 20050302,
    pos = {
      x = -10.002,
      y = -0.102,
      z = -0.022
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
    config_id = 7009,
    monster_id = 20050403,
    pos = {
      x = -9.97,
      y = -0.102,
      z = -5.006
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
    config_id = 7011,
    monster_id = 20050403,
    pos = {
      x = -9.953,
      y = -0.102,
      z = 5.074
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
    config_id = 7012,
    monster_id = 20050302,
    pos = {
      x = 10.092,
      y = -0.102,
      z = -0.038
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
    config_id = 7016,
    monster_id = 20050703,
    pos = {
      x = 10.124,
      y = -0.102,
      z = -5.023
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
    config_id = 7017,
    monster_id = 20050703,
    pos = {
      x = 10.141,
      y = -0.102,
      z = 5.058
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
    config_id = 7018,
    monster_id = 20050901,
    pos = {
      x = -2.932,
      y = -0.102,
      z = -15.054
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
    config_id = 7019,
    monster_id = 20050901,
    pos = {
      x = 3.035,
      y = -0.102,
      z = -15.122
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
    config_id = 7021,
    monster_id = 20050901,
    pos = {
      x = -2.932,
      y = -0.102,
      z = 13.971
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
    config_id = 7022,
    monster_id = 20050901,
    pos = {
      x = 3.035,
      y = -0.102,
      z = 13.903
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
    config_id = 7010,
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
    config_id = 1007007,
    name = "ANY_MONSTER_DIE_7007",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_7007",
    action = "action_EVENT_ANY_MONSTER_DIE_7007"
  },
  {
    config_id = 1007013,
    name = "ANY_MONSTER_LIVE_7013",
    event = EventType.EVENT_ANY_MONSTER_LIVE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_LIVE_7013",
    action = "action_EVENT_ANY_MONSTER_LIVE_7013"
  },
  {
    config_id = 1007014,
    name = "CHALLENGE_SUCCESS_7014",
    event = EventType.EVENT_CHALLENGE_SUCCESS,
    source = "1",
    condition = "",
    action = "action_EVENT_CHALLENGE_SUCCESS_7014"
  },
  {
    config_id = 1007015,
    name = "CHALLENGE_FAIL_7015",
    event = EventType.EVENT_CHALLENGE_FAIL,
    source = "1",
    condition = "",
    action = "action_EVENT_CHALLENGE_FAIL_7015"
  },
  {
    config_id = 1007020,
    name = "ANY_MONSTER_DIE_7020",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_7020",
    action = "action_EVENT_ANY_MONSTER_DIE_7020"
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
    gadgets = {7010},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {
      7001,
      7002,
      7003,
      7018,
      7019
    },
    gadgets = {7010},
    regions = {},
    triggers = {
      "ANY_MONSTER_LIVE_7013",
      "CHALLENGE_SUCCESS_7014",
      "CHALLENGE_FAIL_7015",
      "ANY_MONSTER_DIE_7020"
    },
    rand_weight = 100
  },
  {
    monsters = {
      7004,
      7005,
      7006,
      7021,
      7022
    },
    gadgets = {7010},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_7007",
      "CHALLENGE_SUCCESS_7014",
      "CHALLENGE_FAIL_7015"
    },
    rand_weight = 100
  },
  {
    monsters = {
      7008,
      7009,
      7011,
      7012,
      7016,
      7017
    },
    gadgets = {7010},
    regions = {},
    triggers = {
      "CHALLENGE_SUCCESS_7014",
      "CHALLENGE_FAIL_7015"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_DIE_7007(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "monster_wave") ~= 2 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_7007(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "monster_wave", 3) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 234739007, 4)
  return 0
end
function condition_EVENT_ANY_MONSTER_LIVE_7013(context, evt)
  if 7001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_LIVE_7013(context, evt)
  if 0 ~= ScriptLib.ActiveChallenge(context, 1, 197, 600, 234739007, 16, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_challenge")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "monster_wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_SUCCESS_7014(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "TPL_TIME", evt.param2, 234739005) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : save_challenge_remainTime")
    return -1
  end
  if 0 ~= ScriptLib.SetIsAllowUseSkill(context, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : tower_allow_use_skill")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "stage", 1, 234739005) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.TowerMirrorTeamSetUp(context, 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : tower_team_setup")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 234739006, 6001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 234739006, 6001, {176}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 234739009, 9001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 234739009, 9002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_FAIL_7015(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 234739007, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.CauseDungeonFail(context) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : cause_dungeonfail")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 234739009, 9001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 234739009, 9002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_7020(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "monster_wave") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_7020(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "monster_wave", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 234739007, 3)
  return 0
end
