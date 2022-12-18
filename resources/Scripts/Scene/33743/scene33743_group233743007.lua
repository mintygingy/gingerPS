local base_info = {group_id = 233743007}
monsters = {
  {
    config_id = 7001,
    monster_id = 20060101,
    pos = {
      x = 0.032,
      y = -0.102,
      z = -10.087
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  },
  {
    config_id = 7002,
    monster_id = 20060401,
    pos = {
      x = -2.993,
      y = -0.102,
      z = -8.005
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  },
  {
    config_id = 7003,
    monster_id = 20060401,
    pos = {
      x = 3.023,
      y = -0.102,
      z = -8.073
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  },
  {
    config_id = 7004,
    monster_id = 20060301,
    pos = {
      x = 0.032,
      y = -0.102,
      z = -6.075
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  },
  {
    config_id = 7005,
    monster_id = 20060201,
    pos = {
      x = -8.009,
      y = -0.102,
      z = -3.025
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  },
  {
    config_id = 7006,
    monster_id = 20060201,
    pos = {
      x = -8.0,
      y = -0.102,
      z = 4.041
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  },
  {
    config_id = 7007,
    monster_id = 20060401,
    pos = {
      x = -5.947,
      y = -0.102,
      z = -0.002
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  },
  {
    config_id = 7008,
    monster_id = 20060101,
    pos = {
      x = -9.997,
      y = -0.102,
      z = -0.017
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  },
  {
    config_id = 7009,
    monster_id = 20060301,
    pos = {
      x = 8.023,
      y = -0.102,
      z = -3.054
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  },
  {
    config_id = 7011,
    monster_id = 20060401,
    pos = {
      x = 8.001,
      y = -0.102,
      z = 3.063
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  },
  {
    config_id = 7021,
    monster_id = 20060201,
    pos = {
      x = 10.036,
      y = -0.102,
      z = 0.008
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  },
  {
    config_id = 7022,
    monster_id = 20060101,
    pos = {
      x = 5.932,
      y = -0.102,
      z = 0.002
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
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
    config_id = 1007012,
    name = "MONSTER_TIDE_DIE_7012",
    event = EventType.EVENT_MONSTER_TIDE_DIE,
    source = "1",
    condition = "condition_EVENT_MONSTER_TIDE_DIE_7012",
    action = "action_EVENT_MONSTER_TIDE_DIE_7012"
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
    triggers = {
      "MONSTER_TIDE_DIE_7012",
      "ANY_MONSTER_LIVE_7013",
      "CHALLENGE_SUCCESS_7014",
      "CHALLENGE_FAIL_7015"
    },
    rand_weight = 100
  },
  {
    monsters = {
      7001,
      7002,
      7003,
      7004,
      7005,
      7006,
      7007,
      7008,
      7009,
      7011,
      7021,
      7022
    },
    gadgets = {7010},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_MONSTER_TIDE_DIE_7012(context, evt)
  if 12 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_MONSTER_TIDE_DIE_7012(context, evt)
  ScriptLib.DelAllSubEntityByOriginOwnerConfigId(context, 7009)
  ScriptLib.DelAllSubEntityByOriginOwnerConfigId(context, 7011)
  ScriptLib.DelAllSubEntityByOriginOwnerConfigId(context, 7021)
  ScriptLib.DelAllSubEntityByOriginOwnerConfigId(context, 7022)
  return 0
end
function condition_EVENT_ANY_MONSTER_LIVE_7013(context, evt)
  if 7001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_LIVE_7013(context, evt)
  if 0 ~= ScriptLib.ActiveChallenge(context, 1, 197, 600, 233743007, 12, 0) then
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
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "TPL_TIME", evt.param2, 233743005) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : save_challenge_remainTime")
    return -1
  end
  if 0 ~= ScriptLib.SetIsAllowUseSkill(context, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : tower_allow_use_skill")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "stage", 1, 233743005) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.TowerMirrorTeamSetUp(context, 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : tower_team_setup")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 233743006, 6001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 233743006, 6001, {176}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
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
function action_EVENT_CHALLENGE_FAIL_7015(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 233743007, suite = 1}) then
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
