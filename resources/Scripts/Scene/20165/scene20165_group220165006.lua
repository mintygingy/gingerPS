local base_info = {group_id = 220165006}
monsters = {
  {
    config_id = 6001,
    monster_id = 22050101,
    pos = {
      x = -560.28,
      y = 49.483,
      z = 801.619
    },
    rot = {
      x = 0.0,
      y = 102.445,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    affix = {1110},
    isElite = true,
    pose_id = 101,
    title_id = 10140,
    special_name_id = 10191
  },
  {
    config_id = 6002,
    monster_id = 22050201,
    pos = {
      x = -564.021,
      y = 51.396,
      z = 753.366
    },
    rot = {
      x = 0.0,
      y = 19.714,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    affix = {1110, 1047},
    pose_id = 101
  },
  {
    config_id = 6003,
    monster_id = 26040104,
    pos = {
      x = -549.398,
      y = 51.396,
      z = 750.374
    },
    rot = {
      x = 0.0,
      y = 349.208,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    affix = {1110, 1047}
  },
  {
    config_id = 6004,
    monster_id = 21020501,
    pos = {
      x = -553.937,
      y = 51.396,
      z = 757.404
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    affix = {1110, 1047}
  },
  {
    config_id = 6009,
    monster_id = 21010201,
    pos = {
      x = -554.454,
      y = 51.396,
      z = 751.776
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    affix = {1110, 1047}
  }
}
npcs = {}
gadgets = {}
regions = {}
triggers = {
  {
    config_id = 1006006,
    name = "GROUP_REFRESH_6006",
    event = EventType.EVENT_GROUP_REFRESH,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_REFRESH_6006"
  },
  {
    config_id = 1006007,
    name = "TIME_AXIS_PASS_6007",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_6007",
    action = "action_EVENT_TIME_AXIS_PASS_6007"
  },
  {
    config_id = 1006008,
    name = "TIME_AXIS_PASS_6008",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_6008",
    action = "action_EVENT_TIME_AXIS_PASS_6008"
  },
  {
    config_id = 1006010,
    name = "ANY_MONSTER_DIE_6010",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_6010",
    action = "action_EVENT_ANY_MONSTER_DIE_6010"
  },
  {
    config_id = 1006011,
    name = "ANY_MONSTER_DIE_6011",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_6011",
    action = "action_EVENT_ANY_MONSTER_DIE_6011"
  },
  {
    config_id = 1006012,
    name = "TIME_AXIS_PASS_6012",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_6012",
    action = "action_EVENT_TIME_AXIS_PASS_6012"
  },
  {
    config_id = 1006013,
    name = "ANY_MONSTER_DIE_6013",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_6013",
    action = "action_EVENT_ANY_MONSTER_DIE_6013"
  },
  {
    config_id = 1006014,
    name = "TIME_AXIS_PASS_6014",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_6014",
    action = "action_EVENT_TIME_AXIS_PASS_6014"
  }
}
variables = {
  {
    config_id = 1,
    name = "secondwave",
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
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {6001},
    gadgets = {},
    regions = {},
    triggers = {
      "GROUP_REFRESH_6006",
      "TIME_AXIS_PASS_6007",
      "TIME_AXIS_PASS_6008",
      "TIME_AXIS_PASS_6012",
      "ANY_MONSTER_DIE_6013",
      "TIME_AXIS_PASS_6014"
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
function action_EVENT_GROUP_REFRESH_6006(context, evt)
  ScriptLib.InitTimeAxis(context, "FinalBattle", {
    5,
    40,
    70
  }, false)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_6007(context, evt)
  if "FinalBattle" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_6007(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 500660260) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  if 0 ~= ScriptLib.CreateMonster(context, {config_id = 6002, delay_time = 0}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_monster")
    return -1
  end
  if 0 ~= ScriptLib.CreateMonster(context, {config_id = 6009, delay_time = 0}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_monster")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_6008(context, evt)
  if "FinalBattle" ~= evt.source_name or 2 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_6008(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 500660261) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  if 0 ~= ScriptLib.CreateMonster(context, {config_id = 6003, delay_time = 0}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_monster")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_6010(context, evt)
  if 6002 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_6010(context, evt)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "secondwave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_6011(context, evt)
  if 6009 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_6011(context, evt)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "secondwave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_6012(context, evt)
  if "FinalBattle" ~= evt.source_name or 3 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_6012(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 500660265) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  if 0 ~= ScriptLib.CreateMonster(context, {config_id = 6004, delay_time = 0}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_monster")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_6013(context, evt)
  if 6001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_6013(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 500660266) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  if 0 ~= ScriptLib.KillGroupEntity(context, {
    group_id = 220165006,
    kill_policy = GroupKillPolicy.GROUP_KILL_MONSTER
  }) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_monster_by_group")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "FinalBattleFin", {5}, false)
  ScriptLib.EndTimeAxis(context, "FinalBattle")
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_6014(context, evt)
  if "FinalBattleFin" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_6014(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "2201650061") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  if 0 ~= ScriptLib.KillGroupEntity(context, {
    group_id = 220165006,
    kill_policy = GroupKillPolicy.GROUP_KILL_MONSTER
  }) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_monster_by_group")
    return -1
  end
  return 0
end
