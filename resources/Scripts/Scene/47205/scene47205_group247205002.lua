local base_info = {group_id = 247205002}
local defs = {
  gadget_1 = 2001,
  group_1 = 247205002,
  challenge1 = 1,
  challenge_father = 999,
  group_core = 247205001,
  gadget_rune = 1018,
  MonsterCount = 6,
  challenge_kill = 233
}
monsters = {
  {
    config_id = 2006,
    monster_id = 20060201,
    pos = {
      x = 242.073,
      y = 157.414,
      z = 287.574
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
    config_id = 2007,
    monster_id = 20050703,
    pos = {
      x = 241.145,
      y = 157.414,
      z = 287.574
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 2008,
    monster_id = 20060201,
    pos = {
      x = 244.506,
      y = 157.414,
      z = 287.576
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
    config_id = 2009,
    monster_id = 20011001,
    pos = {
      x = 239.517,
      y = 157.461,
      z = 287.554
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 2010,
    monster_id = 20011001,
    pos = {
      x = 247.052,
      y = 157.414,
      z = 287.501
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 2011,
    monster_id = 20050703,
    pos = {
      x = 245.279,
      y = 157.414,
      z = 287.576
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
    config_id = 2001,
    gadget_id = 70360001,
    pos = {
      x = 243.351,
      y = 158.345,
      z = 292.208
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
    config_id = 1002002,
    name = "GADGET_CREATE_2002",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_2002",
    action = "action_EVENT_GADGET_CREATE_2002",
    trigger_count = 0
  },
  {
    config_id = 1002003,
    name = "SELECT_OPTION_2003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_2003",
    action = "action_EVENT_SELECT_OPTION_2003",
    trigger_count = 0
  },
  {
    config_id = 1002004,
    name = "ANY_MONSTER_DIE_2004",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "",
    action = "action_EVENT_ANY_MONSTER_DIE_2004",
    trigger_count = 0
  },
  {
    config_id = 1002005,
    name = "VARIABLE_CHANGE_2005",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_2005",
    action = "action_EVENT_VARIABLE_CHANGE_2005"
  },
  {
    config_id = 1002012,
    name = "ANY_MONSTER_DIE_2012",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_2012",
    action = "action_EVENT_ANY_MONSTER_DIE_2012"
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
    gadgets = {2001},
    regions = {},
    triggers = {
      "GADGET_CREATE_2002",
      "SELECT_OPTION_2003",
      "ANY_MONSTER_DIE_2004",
      "VARIABLE_CHANGE_2005"
    },
    rand_weight = 100
  },
  {
    monsters = {2007, 2011},
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_2012"
    },
    rand_weight = 100
  },
  {
    monsters = {
      2006,
      2008,
      2009,
      2010
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_2002(context, evt)
  if 2001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_2002(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptions(context, {7}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_work_options")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_2003(context, evt)
  if 2001 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_2003(context, evt)
  ScriptLib.ExecuteGroupLua(context, defs.group_core, "SetKillMonsterTarget", {
    defs.group_1,
    defs.MonsterCount
  })
  ScriptLib.ExecuteGroupLua(context, defs.group_core, "StartSubChallengeKillMonster", {
    defs.challenge1,
    defs.challenge_kill
  })
  ScriptLib.AddExtraGroupSuite(context, 247205002, 2)
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
function action_EVENT_ANY_MONSTER_DIE_2004(context, evt)
  ScriptLib.ExecuteGroupLua(context, defs.group_core, "AddMistTrialChildChallengeScore", {1})
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_2005(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "success") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_2005(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "success", 99) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
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
function condition_EVENT_ANY_MONSTER_DIE_2012(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_2012(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 247205002, 3)
  return 0
end
