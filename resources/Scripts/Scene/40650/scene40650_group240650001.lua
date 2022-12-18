local base_info = {group_id = 240650001}
monsters = {
  {
    config_id = 1004,
    monster_id = 25210202,
    pos = {
      x = -3.468,
      y = 0.192,
      z = -5.174
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1005,
    monster_id = 25210202,
    pos = {
      x = 0.06,
      y = 0.192,
      z = -5.174
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1008,
    monster_id = 25210501,
    pos = {
      x = -3.338,
      y = 0.192,
      z = -2.572
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1011,
    monster_id = 25210302,
    pos = {
      x = -0.03,
      y = 0.192,
      z = -0.263
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1012,
    monster_id = 25210501,
    pos = {
      x = 2.545,
      y = 0.192,
      z = -2.466
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1013,
    monster_id = 25210203,
    pos = {
      x = 0.154,
      y = 0.192,
      z = -6.427
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1017,
    monster_id = 25210201,
    pos = {
      x = 3.358,
      y = 0.192,
      z = -5.174
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1019,
    monster_id = 25310201,
    pos = {
      x = -0.031,
      y = 0.192,
      z = -2.047
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 1
  }
}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 70360010,
    pos = {
      x = -0.018,
      y = 0.036,
      z = 3.338
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  }
}
regions = {
  {
    config_id = 1002,
    shape = RegionShape.CUBIC,
    size = {
      x = 50.0,
      y = 15.0,
      z = 5.0
    },
    pos = {
      x = -0.007,
      y = 3.752,
      z = 22.461
    }
  }
}
triggers = {
  {
    config_id = 1001002,
    name = "ENTER_REGION_1002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_1002",
    action = "action_EVENT_ENTER_REGION_1002",
    forbid_guest = false
  },
  {
    config_id = 1001003,
    name = "SELECT_OPTION_1003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_1003",
    action = "action_EVENT_SELECT_OPTION_1003",
    trigger_count = 0
  },
  {
    config_id = 1001009,
    name = "CHALLENGE_FAIL_1009",
    event = EventType.EVENT_CHALLENGE_FAIL,
    source = "",
    condition = "",
    action = "action_EVENT_CHALLENGE_FAIL_1009",
    trigger_count = 0
  },
  {
    config_id = 1001010,
    name = "CHALLENGE_SUCCESS_1010",
    event = EventType.EVENT_CHALLENGE_SUCCESS,
    source = "",
    condition = "",
    action = "action_EVENT_CHALLENGE_SUCCESS_1010"
  },
  {
    config_id = 1001023,
    name = "ANY_MONSTER_LIVE_1023",
    event = EventType.EVENT_ANY_MONSTER_LIVE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_LIVE_1023",
    action = "action_EVENT_ANY_MONSTER_LIVE_1023",
    trigger_count = 0
  },
  {
    config_id = 1001024,
    name = "ANY_MONSTER_DIE_1024",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_1024",
    action = "action_EVENT_ANY_MONSTER_DIE_1024",
    trigger_count = 0
  },
  {
    config_id = 1001025,
    name = "ANY_MONSTER_DIE_1025",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_1025",
    action = "action_EVENT_ANY_MONSTER_DIE_1025",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "challenge",
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
    gadgets = {1001},
    regions = {1002},
    triggers = {
      "ENTER_REGION_1002",
      "SELECT_OPTION_1003"
    },
    rand_weight = 100
  },
  {
    monsters = {
      1008,
      1011,
      1012,
      1013
    },
    gadgets = {},
    regions = {},
    triggers = {
      "CHALLENGE_FAIL_1009",
      "CHALLENGE_SUCCESS_1010",
      "ANY_MONSTER_LIVE_1023",
      "ANY_MONSTER_DIE_1024"
    },
    rand_weight = 100
  },
  {
    monsters = {
      1004,
      1005,
      1017
    },
    gadgets = {},
    regions = {},
    triggers = {
      "CHALLENGE_FAIL_1009",
      "CHALLENGE_SUCCESS_1010",
      "ANY_MONSTER_DIE_1025"
    },
    rand_weight = 100
  },
  {
    monsters = {1019},
    gadgets = {},
    regions = {},
    triggers = {
      "CHALLENGE_FAIL_1009",
      "CHALLENGE_SUCCESS_1010"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_1002(context, evt)
  if evt.param1 ~= 1002 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_1002(context, evt)
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 240650001, 1001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 240650001, 1001, {7}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_1003(context, evt)
  if 1001 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_1003(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1001, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 240650002, suite = 2}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 240650001, 2)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 240650001, 1001, 7) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "challenge", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_FAIL_1009(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 240650002, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 240650001, 1001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 240650001, 1001, {7}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  ScriptLib.RemoveExtraGroupSuite(context, 240650001, 2)
  ScriptLib.RemoveExtraGroupSuite(context, 240650001, 3)
  ScriptLib.RemoveExtraGroupSuite(context, 240650001, 4)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "challenge", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_SUCCESS_1010(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 240650002, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_LIVE_1023(context, evt)
  if 1008 ~= evt.param1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "challenge") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_LIVE_1023(context, evt)
  if 0 ~= ScriptLib.ActiveChallenge(context, 1, 191, 360, 240650001, 8, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_challenge")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "challenge", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_1024(context, evt)
  if ScriptLib.GetGroupMonsterCountByGroupId(context, 240650001) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "challenge") ~= 2 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_1024(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 240650001, 3)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "challenge", 3) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_1025(context, evt)
  if ScriptLib.GetGroupMonsterCountByGroupId(context, 240650001) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "challenge") ~= 3 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_1025(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 240650001, 4)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "challenge", 4) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
