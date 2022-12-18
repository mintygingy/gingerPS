local base_info = {group_id = 240653001}
monsters = {
  {
    config_id = 1008,
    monster_id = 25310101,
    pos = {
      x = 3.787,
      y = 0.192,
      z = -2.572
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    affix = {1008},
    pose_id = 1
  },
  {
    config_id = 1011,
    monster_id = 25310301,
    pos = {
      x = -0.03,
      y = 0.192,
      z = -3.311
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    affix = {6104, 1008}
  },
  {
    config_id = 1012,
    monster_id = 25310201,
    pos = {
      x = -4.607,
      y = 0.192,
      z = -2.466
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    affix = {1008},
    pose_id = 1
  }
}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 70360010,
    pos = {
      x = 0.1,
      y = 0.036,
      z = 3.216
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
    config_id = 1001004,
    name = "CHALLENGE_SUCCESS_1004",
    event = EventType.EVENT_CHALLENGE_SUCCESS,
    source = "",
    condition = "",
    action = "action_EVENT_CHALLENGE_SUCCESS_1004"
  },
  {
    config_id = 1001005,
    name = "CHALLENGE_FAIL_1005",
    event = EventType.EVENT_CHALLENGE_FAIL,
    source = "",
    condition = "",
    action = "action_EVENT_CHALLENGE_FAIL_1005"
  },
  {
    config_id = 1001023,
    name = "ANY_MONSTER_LIVE_1023",
    event = EventType.EVENT_ANY_MONSTER_LIVE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_LIVE_1023",
    action = "action_EVENT_ANY_MONSTER_LIVE_1023",
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
      1012
    },
    gadgets = {},
    regions = {},
    triggers = {
      "CHALLENGE_SUCCESS_1004",
      "CHALLENGE_FAIL_1005",
      "ANY_MONSTER_LIVE_1023"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {},
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
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 240653001, 1001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 240653001, 1001, {7}) then
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
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 240653002, suite = 2}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 240653001, 2)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 240653001, 1001, 7) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "challenge", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_SUCCESS_1004(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 240653002, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_FAIL_1005(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 240653002, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 240653001, 1001, {7}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  ScriptLib.RemoveExtraGroupSuite(context, 240653001, 2)
  ScriptLib.SetGroupVariableValue(context, "challenge", 0)
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
  if 0 ~= ScriptLib.ActiveChallenge(context, 1, 191, 360, 240653001, 3, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_challenge")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "challenge", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
