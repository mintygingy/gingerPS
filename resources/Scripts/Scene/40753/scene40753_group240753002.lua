local base_info = {group_id = 240753002}
monsters = {
  {
    config_id = 2001,
    monster_id = 24030201,
    pos = {
      x = 5.275,
      y = 9.189,
      z = -10.961
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {1007},
    pose_id = 101
  },
  {
    config_id = 2007,
    monster_id = 24030101,
    pos = {
      x = -5.176,
      y = 9.189,
      z = -10.674
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {1007},
    pose_id = 101
  }
}
npcs = {}
gadgets = {
  {
    config_id = 2021,
    gadget_id = 70900205,
    pos = {
      x = 5.734,
      y = 7.417,
      z = 5.981
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
    monsters = {2001, 2007},
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
  if 0 ~= ScriptLib.ActiveChallenge(context, 1, 191, 300, 240753002, 2, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_challenge")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_SUCCESS_2023(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 240753003, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_FAIL_2024(context, evt)
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 240753001, 1001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 240753001, 1001, {7}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 240753003, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 240753002, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_2025(context, evt)
  if ScriptLib.GetGroupMonsterCountByGroupId(context, 240753002) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_2025(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 240753002, 3)
  return 0
end
