local base_info = {group_id = 247205004}
local defs = {
  gadget_1 = 4001,
  group_1 = 247205004,
  challenge1 = 3,
  challenge_father = 999,
  group_core = 247205001,
  gadget_rune = 1020,
  MonsterCount = 8,
  challenge_kill = 233
}
monsters = {
  {
    config_id = 4006,
    monster_id = 25010601,
    pos = {
      x = 239.917,
      y = 162.354,
      z = 446.489
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
    config_id = 4007,
    monster_id = 25010601,
    pos = {
      x = 246.582,
      y = 162.354,
      z = 446.429
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
    config_id = 4008,
    monster_id = 25210501,
    pos = {
      x = 244.554,
      y = 162.406,
      z = 446.781
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
    config_id = 4009,
    monster_id = 25210403,
    pos = {
      x = 242.05,
      y = 162.354,
      z = 446.781
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
    config_id = 4010,
    monster_id = 25210302,
    pos = {
      x = 238.461,
      y = 162.354,
      z = 444.207
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
    config_id = 4011,
    monster_id = 25010201,
    pos = {
      x = 248.122,
      y = 162.354,
      z = 444.207
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
    config_id = 4012,
    monster_id = 25070101,
    pos = {
      x = 248.122,
      y = 162.354,
      z = 442.078
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
    config_id = 4014,
    monster_id = 25210201,
    pos = {
      x = 238.461,
      y = 162.354,
      z = 442.078
    },
    rot = {
      x = 0.0,
      y = 90.0,
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
    gadget_id = 70360001,
    pos = {
      x = 243.289,
      y = 163.324,
      z = 441.907
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 4013,
    gadget_id = 70310043,
    pos = {
      x = 243.262,
      y = 162.282,
      z = 441.888
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
    name = "GADGET_CREATE_4002",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_4002",
    action = "action_EVENT_GADGET_CREATE_4002",
    trigger_count = 0
  },
  {
    config_id = 1004003,
    name = "SELECT_OPTION_4003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_4003",
    action = "action_EVENT_SELECT_OPTION_4003",
    trigger_count = 0
  },
  {
    config_id = 1004004,
    name = "ANY_MONSTER_DIE_4004",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "",
    action = "action_EVENT_ANY_MONSTER_DIE_4004",
    trigger_count = 0
  },
  {
    config_id = 1004005,
    name = "VARIABLE_CHANGE_4005",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_4005",
    action = "action_EVENT_VARIABLE_CHANGE_4005"
  }
}
variables = {
  {
    config_id = 1,
    name = "success",
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
    gadgets = {4001},
    regions = {},
    triggers = {
      "GADGET_CREATE_4002",
      "SELECT_OPTION_4003",
      "ANY_MONSTER_DIE_4004",
      "VARIABLE_CHANGE_4005"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {4013},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_4002(context, evt)
  if 4001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_4002(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptions(context, {7}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_work_options")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_4003(context, evt)
  if 4001 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_4003(context, evt)
  ScriptLib.ExecuteGroupLua(context, defs.group_core, "SetKillMonsterTarget", {
    defs.group_1,
    defs.MonsterCount
  })
  ScriptLib.ExecuteGroupLua(context, defs.group_core, "StartSubChallengeKillMonster", {
    defs.challenge1,
    defs.challenge_kill
  })
  ScriptLib.AutoMonsterTide(context, 1, defs.group_1, {
    4006,
    4007,
    4008,
    4009,
    4010,
    4011,
    4012,
    4014
  }, 8, 4, 4)
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, defs.group_core, defs.gadget_rune, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.ShowReminder(context, 43001009) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, defs.group_1, defs.gadget_1, 7) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, defs.gadget_1, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function action_EVENT_ANY_MONSTER_DIE_4004(context, evt)
  ScriptLib.ExecuteGroupLua(context, defs.group_core, "AddMistTrialChildChallengeScore", {1})
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_4005(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "success") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_4005(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "success", 99) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  ScriptLib.RemoveExtraGroupSuite(context, defs.group_1, 2)
  ScriptLib.ChangeGroupVariableValueByGroup(context, "runes", 1, defs.group_core)
  ScriptLib.PrintContextLog(context, "\231\172\166\230\150\135\232\174\161\230\149\176+1")
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, defs.group_core, defs.gadget_rune, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  ScriptLib.PrintContextLog(context, "1\229\143\183\230\156\186\229\133\179\229\144\175\229\138\168")
  ScriptLib.ExecuteGroupLua(context, defs.group_core, "AddMistTrialKeyProgress", {
    1,
    defs.challenge1
  })
  return 0
end
