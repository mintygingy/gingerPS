local base_info = {group_id = 247207003}
local defs = {
  gadget_1 = 3001,
  group_1 = 247207003,
  challenge1 = 2,
  challenge_father = 999,
  group_core = 247207001,
  gadget_rune = 1019,
  MonsterCount = 2,
  challenge_kill = 233
}
monsters = {
  {
    config_id = 3007,
    monster_id = 24020301,
    pos = {
      x = 330.22,
      y = 154.979,
      z = 362.804
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 100
  },
  {
    config_id = 3008,
    monster_id = 24020201,
    pos = {
      x = 330.156,
      y = 154.979,
      z = 367.269
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 100
  }
}
npcs = {}
gadgets = {
  {
    config_id = 3001,
    gadget_id = 70360001,
    pos = {
      x = 324.553,
      y = 155.876,
      z = 365.009
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
    config_id = 1003002,
    name = "GADGET_CREATE_3002",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_3002",
    action = "action_EVENT_GADGET_CREATE_3002",
    trigger_count = 0
  },
  {
    config_id = 1003003,
    name = "SELECT_OPTION_3003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_3003",
    action = "action_EVENT_SELECT_OPTION_3003",
    trigger_count = 0
  },
  {
    config_id = 1003004,
    name = "ANY_MONSTER_DIE_3004",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "",
    action = "action_EVENT_ANY_MONSTER_DIE_3004",
    trigger_count = 0
  },
  {
    config_id = 1003005,
    name = "VARIABLE_CHANGE_3005",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_3005",
    action = "action_EVENT_VARIABLE_CHANGE_3005"
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
    gadgets = {3001},
    regions = {},
    triggers = {
      "GADGET_CREATE_3002",
      "SELECT_OPTION_3003",
      "ANY_MONSTER_DIE_3004",
      "VARIABLE_CHANGE_3005"
    },
    rand_weight = 100
  },
  {
    monsters = {3007, 3008},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_3002(context, evt)
  if 3001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_3002(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptions(context, {7}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_work_options")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_3003(context, evt)
  if 3001 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_3003(context, evt)
  ScriptLib.ExecuteGroupLua(context, defs.group_core, "SetKillMonsterTarget", {
    defs.group_1,
    defs.MonsterCount
  })
  ScriptLib.ExecuteGroupLua(context, defs.group_core, "StartSubChallengeKillMonster", {
    defs.challenge1,
    defs.challenge_kill
  })
  ScriptLib.AddExtraGroupSuite(context, 247207003, 2)
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
function action_EVENT_ANY_MONSTER_DIE_3004(context, evt)
  ScriptLib.ExecuteGroupLua(context, defs.group_core, "AddMistTrialChildChallengeScore", {1})
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_3005(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "success") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_3005(context, evt)
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
