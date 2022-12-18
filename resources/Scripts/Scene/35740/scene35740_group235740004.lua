local base_info = {group_id = 235740004}
monsters = {
  {
    config_id = 4001,
    monster_id = 26120301,
    pos = {
      x = 0.034,
      y = -0.102,
      z = 10.01
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {1026},
    isElite = true,
    pose_id = 101
  },
  {
    config_id = 4004,
    monster_id = 26050601,
    pos = {
      x = 0.034,
      y = -0.102,
      z = -10.047
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {6106},
    isElite = true
  },
  {
    config_id = 4005,
    monster_id = 26051101,
    pos = {
      x = -10.052,
      y = -0.102,
      z = -0.12
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
    config_id = 4006,
    monster_id = 26051001,
    pos = {
      x = 10.075,
      y = -0.102,
      z = -0.141
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
    config_id = 4007,
    monster_id = 26120101,
    pos = {
      x = -10.052,
      y = -0.102,
      z = -0.12
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 201
  },
  {
    config_id = 4008,
    monster_id = 26120201,
    pos = {
      x = 10.075,
      y = -0.102,
      z = -0.141
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {6101},
    isElite = true,
    pose_id = 201
  }
}
npcs = {}
gadgets = {
  {
    config_id = 4010,
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
    config_id = 1004002,
    name = "ANY_MONSTER_LIVE_4002",
    event = EventType.EVENT_ANY_MONSTER_LIVE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_LIVE_4002",
    action = "action_EVENT_ANY_MONSTER_LIVE_4002"
  },
  {
    config_id = 1004003,
    name = "ANY_MONSTER_DIE_4003",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_4003",
    action = "action_EVENT_ANY_MONSTER_DIE_4003"
  },
  {
    config_id = 1004014,
    name = "CHALLENGE_SUCCESS_4014",
    event = EventType.EVENT_CHALLENGE_SUCCESS,
    source = "1",
    condition = "",
    action = "action_EVENT_CHALLENGE_SUCCESS_4014"
  },
  {
    config_id = 1004015,
    name = "CHALLENGE_FAIL_4015",
    event = EventType.EVENT_CHALLENGE_FAIL,
    source = "1",
    condition = "",
    action = "action_EVENT_CHALLENGE_FAIL_4015"
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
    gadgets = {4010},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {
      4004,
      4005,
      4006
    },
    gadgets = {4010},
    regions = {},
    triggers = {
      "ANY_MONSTER_LIVE_4002",
      "ANY_MONSTER_DIE_4003",
      "CHALLENGE_SUCCESS_4014",
      "CHALLENGE_FAIL_4015"
    },
    rand_weight = 100
  },
  {
    monsters = {
      4001,
      4007,
      4008
    },
    gadgets = {},
    regions = {},
    triggers = {
      "CHALLENGE_SUCCESS_4014",
      "CHALLENGE_FAIL_4015"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_LIVE_4002(context, evt)
  if 4004 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_LIVE_4002(context, evt)
  if 0 ~= ScriptLib.ActiveChallenge(context, 1, 197, 600, 235740004, 6, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_challenge")
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "monster_wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_4003(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "monster_wave") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_4003(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 235740004, 3)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "monster_wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_SUCCESS_4014(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "TPL_TIME", evt.param2, 235740002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : save_challenge_remainTime")
    return -1
  end
  if 0 ~= ScriptLib.SetIsAllowUseSkill(context, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : tower_allow_use_skill")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "stage", 1, 235740002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.TowerMirrorTeamSetUp(context, 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : tower_team_setup")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 235740003, 3001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 235740003, 3001, {176}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 235740001, 1001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 235740001, 1002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_FAIL_4015(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 235740004, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.CauseDungeonFail(context) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : cause_dungeonfail")
    return -1
  end
  return 0
end
