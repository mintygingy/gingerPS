local base_info = {group_id = 247203009}
local defs = {
  group_1 = 247203009,
  challenge1 = 201,
  challenge_father = 999,
  group_core = 247203001,
  galleryid = 31001,
  gadget_1 = 9001,
  MonsterCount = 5,
  challenge_kill = 233
}
monsters = {
  {
    config_id = 9006,
    monster_id = 25010701,
    pos = {
      x = 323.08,
      y = 163.189,
      z = 482.633
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
    config_id = 9007,
    monster_id = 25010701,
    pos = {
      x = 325.82,
      y = 163.189,
      z = 482.519
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
    config_id = 9008,
    monster_id = 25010201,
    pos = {
      x = 320.662,
      y = 163.189,
      z = 482.203
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
    config_id = 9009,
    monster_id = 25010201,
    pos = {
      x = 328.214,
      y = 163.189,
      z = 482.218
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
    config_id = 9010,
    monster_id = 25010301,
    pos = {
      x = 324.523,
      y = 163.189,
      z = 483.883
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  }
}
npcs = {}
gadgets = {
  {
    config_id = 9001,
    gadget_id = 70360397,
    pos = {
      x = 324.515,
      y = 163.242,
      z = 473.903
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {0}
    }
  },
  {
    config_id = 9014,
    gadget_id = 70310041,
    pos = {
      x = 324.441,
      y = 163.375,
      z = 467.962
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
    config_id = 1009002,
    name = "GADGET_CREATE_9002",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_9002",
    action = "action_EVENT_GADGET_CREATE_9002"
  },
  {
    config_id = 1009003,
    name = "SELECT_OPTION_9003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_9003",
    action = "action_EVENT_SELECT_OPTION_9003",
    trigger_count = 0
  },
  {
    config_id = 1009004,
    name = "VARIABLE_CHANGE_9004",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_9004",
    action = "action_EVENT_VARIABLE_CHANGE_9004",
    trigger_count = 0
  },
  {
    config_id = 1009005,
    name = "ANY_MONSTER_DIE_9005",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "",
    action = "action_EVENT_ANY_MONSTER_DIE_9005",
    trigger_count = 0
  },
  {
    config_id = 1009013,
    name = "SELECT_OPTION_9013",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_9013",
    action = "action_EVENT_SELECT_OPTION_9013"
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
    gadgets = {9001},
    regions = {},
    triggers = {
      "GADGET_CREATE_9002",
      "SELECT_OPTION_9003",
      "VARIABLE_CHANGE_9004",
      "ANY_MONSTER_DIE_9005",
      "SELECT_OPTION_9013"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {9014},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_9002(context, evt)
  if 9001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_9002(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 247203009, 9001, {7}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_9003(context, evt)
  if 9001 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_9003(context, evt)
  ScriptLib.ExecuteGroupLua(context, defs.group_core, "SetKillMonsterTarget", {
    defs.group_1,
    defs.MonsterCount
  })
  ScriptLib.ExecuteGroupLua(context, defs.group_core, "StartSubChallengeKillMonster", {
    defs.challenge1,
    defs.challenge_kill
  })
  ScriptLib.PrintContextLog(context, "\229\173\144\230\140\145\230\136\152\230\140\130\230\142\165\229\174\140\230\136\144!!!!!!!!")
  ScriptLib.AutoMonsterTide(context, 1, defs.group_1, {
    9006,
    9007,
    9008,
    9009,
    9010
  }, 5, 4, 4)
  ScriptLib.PrintContextLog(context, "\230\128\170\231\137\169\230\189\174\229\188\128\229\144\175!!!!!!!!")
  if 0 ~= ScriptLib.ShowReminder(context, 43001009) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, defs.group_1, 2)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, defs.group_1, defs.gadget_1, 7) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  ScriptLib.PrintContextLog(context, "\230\147\141\228\189\156\229\143\176\229\136\135\230\141\162\229\136\176GearStart!!!!!!!!")
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, defs.gadget_1, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.PrintContextLog(context, "\230\147\141\228\189\156\229\143\176\229\136\135\230\141\162\229\136\176GearStart!!!!!!!!")
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_9004(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "success") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_9004(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "success", 99) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, defs.group_1, defs.gadget_1, {65}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, defs.gadget_1, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function action_EVENT_ANY_MONSTER_DIE_9005(context, evt)
  ScriptLib.ExecuteGroupLua(context, defs.group_core, "AddMistTrialChildChallengeScore", {1})
  return 0
end
function condition_EVENT_SELECT_OPTION_9013(context, evt)
  if 9001 ~= evt.param1 then
    return false
  end
  if 65 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_9013(context, evt)
  ScriptLib.ExecuteGroupLua(context, defs.group_core, "ModifyMistTrialAbility", {1})
  ScriptLib.ExecuteGroupLua(context, defs.group_core, "ModifyMistTrialAbility", {0})
  ScriptLib.PrintContextLog(context, "\229\156\176\232\132\137\229\188\130\229\184\184\229\141\135\231\186\167\239\188\140\229\164\141\230\180\187\229\155\158\232\161\128\239\188\129\239\188\129\239\188\129\239\188\129\239\188\129")
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, defs.group_1, defs.gadget_1, 65) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, defs.gadget_1, GadgetState.GearAction1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.RemoveExtraGroupSuite(context, defs.group_1, 2)
  if 0 ~= ScriptLib.ShowReminder(context, 47201005) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
