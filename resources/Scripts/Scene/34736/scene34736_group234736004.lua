local base_info = {group_id = 234736004}
monsters = {
  {
    config_id = 4009,
    monster_id = 20040501,
    pos = {
      x = 0.085,
      y = -0.102,
      z = -0.088
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  }
}
npcs = {}
gadgets = {
  {
    config_id = 4001,
    gadget_id = 70350356,
    pos = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    mark_flag = 12
  },
  {
    config_id = 4002,
    gadget_id = 70350356,
    pos = {
      x = -6.7,
      y = -0.102,
      z = 10.038
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    mark_flag = 3
  },
  {
    config_id = 4004,
    gadget_id = 70350356,
    pos = {
      x = 6.7,
      y = -0.102,
      z = 10.038
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    mark_flag = 4
  },
  {
    config_id = 4005,
    gadget_id = 70350356,
    pos = {
      x = -6.7,
      y = -0.102,
      z = -9.536
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    mark_flag = 5
  },
  {
    config_id = 4006,
    gadget_id = 70350356,
    pos = {
      x = 6.7,
      y = -0.102,
      z = -9.536
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    mark_flag = 6
  },
  {
    config_id = 4007,
    gadget_id = 70350356,
    pos = {
      x = -15.5,
      y = 0.0,
      z = 0.0
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    mark_flag = 7
  },
  {
    config_id = 4008,
    gadget_id = 70350356,
    pos = {
      x = 15.5,
      y = 0.0,
      z = 0.0
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    mark_flag = 8
  },
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
    config_id = 1004003,
    name = "ANY_MONSTER_LIVE_4003",
    event = EventType.EVENT_ANY_MONSTER_LIVE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_LIVE_4003",
    action = "action_EVENT_ANY_MONSTER_LIVE_4003"
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
    gadgets = {
      4001,
      4002,
      4004,
      4005,
      4006,
      4007,
      4008,
      4010
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {4009},
    gadgets = {
      4001,
      4002,
      4004,
      4005,
      4006,
      4007,
      4008,
      4010
    },
    regions = {},
    triggers = {
      "ANY_MONSTER_LIVE_4003",
      "CHALLENGE_SUCCESS_4014",
      "CHALLENGE_FAIL_4015"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_LIVE_4003(context, evt)
  if 4009 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_LIVE_4003(context, evt)
  if 0 ~= ScriptLib.ActiveChallenge(context, 1, 197, 600, 234736004, 1, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_challenge")
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "monster_wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_SUCCESS_4014(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "TPL_TIME", evt.param2, 234736002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : save_challenge_remainTime")
    return -1
  end
  if 0 ~= ScriptLib.SetIsAllowUseSkill(context, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : tower_allow_use_skill")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "stage", 1, 234736002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.TowerMirrorTeamSetUp(context, 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : tower_team_setup")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 234736003, 3001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 234736003, 3001, {176}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 234736001, 1001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 234736001, 1002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_FAIL_4015(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 234736004, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.CauseDungeonFail(context) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : cause_dungeonfail")
    return -1
  end
  return 0
end
