local base_info = {group_id = 240757002}
monsters = {
  {
    config_id = 2001,
    monster_id = 26090101,
    pos = {
      x = 5.337,
      y = 9.082,
      z = -3.312
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    affix = {1008},
    pose_id = 101
  },
  {
    config_id = 2002,
    monster_id = 26090201,
    pos = {
      x = 0.91,
      y = 9.082,
      z = -5.101
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    affix = {1008},
    pose_id = 101
  },
  {
    config_id = 2003,
    monster_id = 26090201,
    pos = {
      x = -2.316,
      y = 9.082,
      z = -5.077
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    affix = {1008},
    pose_id = 101
  },
  {
    config_id = 2004,
    monster_id = 26090101,
    pos = {
      x = -5.081,
      y = 9.082,
      z = -3.065
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    affix = {1008},
    pose_id = 101
  },
  {
    config_id = 2005,
    monster_id = 26090201,
    pos = {
      x = 5.337,
      y = 9.082,
      z = -5.502
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    affix = {1008},
    pose_id = 101
  },
  {
    config_id = 2006,
    monster_id = 26120301,
    pos = {
      x = 0.91,
      y = 9.082,
      z = -7.29
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    affix = {1008},
    pose_id = 101
  },
  {
    config_id = 2007,
    monster_id = 26120301,
    pos = {
      x = -0.869,
      y = 9.082,
      z = -8.978
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    affix = {1008},
    pose_id = 101
  },
  {
    config_id = 2008,
    monster_id = 26120101,
    pos = {
      x = -2.316,
      y = 9.082,
      z = -7.267
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    affix = {1008},
    pose_id = 201
  },
  {
    config_id = 2009,
    monster_id = 26090101,
    pos = {
      x = -5.081,
      y = 9.082,
      z = -5.254
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    affix = {1008},
    pose_id = 101
  }
}
npcs = {}
gadgets = {
  {
    config_id = 2021,
    gadget_id = 70900205,
    pos = {
      x = 5.683,
      y = 7.509,
      z = 6.538
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
    config_id = 1002022,
    name = "ANY_MONSTER_LIVE_2022",
    event = EventType.EVENT_ANY_MONSTER_LIVE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_LIVE_2022",
    action = "action_EVENT_ANY_MONSTER_LIVE_2022"
  },
  {
    config_id = 1002023,
    name = "CHALLENGE_SUCCESS_2023",
    event = EventType.EVENT_CHALLENGE_SUCCESS,
    source = "1",
    condition = "",
    action = "action_EVENT_CHALLENGE_SUCCESS_2023"
  },
  {
    config_id = 1002024,
    name = "CHALLENGE_FAIL_2024",
    event = EventType.EVENT_CHALLENGE_FAIL,
    source = "1",
    condition = "",
    action = "action_EVENT_CHALLENGE_FAIL_2024"
  },
  {
    config_id = 1002025,
    name = "ANY_MONSTER_DIE_2025",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_2025",
    action = "action_EVENT_ANY_MONSTER_DIE_2025"
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
    gadgets = {2021},
    regions = {},
    triggers = {
      "CHALLENGE_SUCCESS_2023",
      "CHALLENGE_FAIL_2024"
    },
    rand_weight = 100
  },
  {
    monsters = {
      2001,
      2002,
      2003,
      2004,
      2007
    },
    gadgets = {2021},
    regions = {},
    triggers = {
      "ANY_MONSTER_LIVE_2022",
      "CHALLENGE_SUCCESS_2023",
      "CHALLENGE_FAIL_2024",
      "ANY_MONSTER_DIE_2025"
    },
    rand_weight = 100
  },
  {
    monsters = {
      2005,
      2006,
      2008,
      2009
    },
    gadgets = {2021},
    regions = {},
    triggers = {
      "CHALLENGE_SUCCESS_2023",
      "CHALLENGE_FAIL_2024"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_LIVE_2022(context, evt)
  if 2001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_LIVE_2022(context, evt)
  if 0 ~= ScriptLib.ActiveChallenge(context, 1, 191, 300, 240757002, 9, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_challenge")
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "monster_wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "challenge", 1, 240757001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_SUCCESS_2023(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 240757003, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "challenge", 0, 240757001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_FAIL_2024(context, evt)
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 240757001, 1001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 240757001, 1001, {7}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 240757003, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 240757002, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "challenge", 0, 240757001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_2025(context, evt)
  if ScriptLib.GetGroupMonsterCountByGroupId(context, 240757002) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "monster_wave") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_2025(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 240757002, 3)
  return 0
end
