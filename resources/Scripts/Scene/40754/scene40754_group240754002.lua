local base_info = {group_id = 240754002}
monsters = {
  {
    config_id = 2001,
    monster_id = 26090701,
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
    pose_id = 101
  },
  {
    config_id = 2004,
    monster_id = 26090701,
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
    pose_id = 101
  },
  {
    config_id = 2005,
    monster_id = 26090101,
    pos = {
      x = 4.556,
      y = 9.082,
      z = 4.639
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    pose_id = 101
  },
  {
    config_id = 2006,
    monster_id = 26090201,
    pos = {
      x = 1.092,
      y = 9.082,
      z = 6.02
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    pose_id = 101
  },
  {
    config_id = 2007,
    monster_id = 26090201,
    pos = {
      x = -2.078,
      y = 9.082,
      z = 5.852
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    pose_id = 101
  },
  {
    config_id = 2008,
    monster_id = 26090101,
    pos = {
      x = -5.336,
      y = 9.082,
      z = 4.514
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    pose_id = 101
  },
  {
    config_id = 2009,
    monster_id = 26090401,
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
    pose_id = 101
  },
  {
    config_id = 2010,
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
    pose_id = 101
  },
  {
    config_id = 2011,
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
    pose_id = 101
  },
  {
    config_id = 2012,
    monster_id = 26090401,
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
garbages = {
  triggers = {
    {
      config_id = 1002025,
      name = "ANY_MONSTER_DIE_2025",
      event = EventType.EVENT_ANY_MONSTER_DIE,
      source = "",
      condition = "condition_EVENT_ANY_MONSTER_DIE_2025",
      action = "action_EVENT_ANY_MONSTER_DIE_2025"
    }
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
    monsters = {},
    gadgets = {2021},
    regions = {},
    triggers = {
      "ANY_MONSTER_LIVE_2022",
      "CHALLENGE_SUCCESS_2023",
      "CHALLENGE_FAIL_2024"
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
function condition_EVENT_ANY_MONSTER_LIVE_2022(context, evt)
  if 2001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_LIVE_2022(context, evt)
  if 0 ~= ScriptLib.ActiveChallenge(context, 1, 191, 300, 240754002, 12, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_challenge")
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "monster_wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "challenge", 1, 240754001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_SUCCESS_2023(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 240754003, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "challenge", 0, 240754001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_FAIL_2024(context, evt)
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 240754001, 1001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 240754001, 1001, {7}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 240754003, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 240754002, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "challenge", 0, 240754001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  return 0
end
