local base_info = {group_id = 233736005}
monsters = {
  {
    config_id = 5001,
    monster_id = 25080101,
    pos = {
      x = -0.005,
      y = -0.102,
      z = -10.027
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 1
  },
  {
    config_id = 5002,
    monster_id = 25080201,
    pos = {
      x = 4.095,
      y = -0.102,
      z = -10.027
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 1
  },
  {
    config_id = 5004,
    monster_id = 25100101,
    pos = {
      x = 10.049,
      y = -0.102,
      z = -0.084
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 1
  },
  {
    config_id = 5005,
    monster_id = 25100201,
    pos = {
      x = -9.942,
      y = -0.102,
      z = -0.07
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 1
  },
  {
    config_id = 5017,
    monster_id = 25080301,
    pos = {
      x = -3.96,
      y = -0.102,
      z = -10.027
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
    config_id = 5008,
    gadget_id = 70350031,
    pos = {
      x = 0.037,
      y = -0.08,
      z = -0.004
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5011,
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
    config_id = 1005003,
    name = "ANY_MONSTER_LIVE_5003",
    event = EventType.EVENT_ANY_MONSTER_LIVE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_LIVE_5003",
    action = "action_EVENT_ANY_MONSTER_LIVE_5003"
  },
  {
    config_id = 1005006,
    name = "ANY_MONSTER_DIE_5006",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_5006",
    action = "action_EVENT_ANY_MONSTER_DIE_5006"
  },
  {
    config_id = 1005015,
    name = "CHALLENGE_SUCCESS_5015",
    event = EventType.EVENT_CHALLENGE_SUCCESS,
    source = "2",
    condition = "",
    action = "action_EVENT_CHALLENGE_SUCCESS_5015"
  },
  {
    config_id = 1005016,
    name = "CHALLENGE_FAIL_5016",
    event = EventType.EVENT_CHALLENGE_FAIL,
    source = "2",
    condition = "",
    action = "action_EVENT_CHALLENGE_FAIL_5016"
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
    gadgets = {5011},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {
      5001,
      5002,
      5017
    },
    gadgets = {5011},
    regions = {},
    triggers = {
      "ANY_MONSTER_LIVE_5003",
      "ANY_MONSTER_DIE_5006",
      "CHALLENGE_SUCCESS_5015",
      "CHALLENGE_FAIL_5016"
    },
    rand_weight = 100
  },
  {
    monsters = {5004, 5005},
    gadgets = {5011},
    regions = {},
    triggers = {
      "CHALLENGE_SUCCESS_5015",
      "CHALLENGE_FAIL_5016"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {5008, 5011},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_LIVE_5003(context, evt)
  if 5017 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_LIVE_5003(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "monster_wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  local tpl_time = ScriptLib.GetGroupVariableValueByGroup(context, "TPL_TIME", 233736002)
  if tpl_time == nil or tpl_time < 0 then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_challenge_by_remainTime")
    return -1
  elseif tpl_time < 1 then
    tpl_time = 0
  end
  if 0 ~= ScriptLib.ActiveChallenge(context, 2, 198, tpl_time, 233736005, 5, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_challenge_by_remainTime")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5008, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_5006(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "monster_wave") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_5006(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "monster_wave", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 233736005, 3)
  return 0
end
function action_EVENT_CHALLENGE_SUCCESS_5015(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "stage", 2, 233736002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_FAIL_5016(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 233736005, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.CauseDungeonFail(context) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : cause_dungeonfail")
    return -1
  end
  return 0
end
