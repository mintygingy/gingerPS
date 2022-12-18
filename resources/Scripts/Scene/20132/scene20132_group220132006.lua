local base_info = {group_id = 220132006}
monsters = {
  {
    config_id = 6001,
    monster_id = 22020103,
    pos = {
      x = 520.445,
      y = 104.076,
      z = 372.474
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101,
    title_id = 10122,
    special_name_id = 10170
  }
}
npcs = {}
gadgets = {
  {
    config_id = 6002,
    gadget_id = 70290506,
    pos = {
      x = 448.442,
      y = 59.203,
      z = 458.634
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6005,
    gadget_id = 70360001,
    pos = {
      x = 448.528,
      y = 60.286,
      z = 459.762
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6009,
    gadget_id = 70950156,
    pos = {
      x = 520.263,
      y = 104.073,
      z = 372.141
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_REMOTE
  }
}
regions = {}
triggers = {
  {
    config_id = 1006003,
    name = "GADGET_STATE_CHANGE_6003",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_6003",
    action = "action_EVENT_GADGET_STATE_CHANGE_6003"
  },
  {
    config_id = 1006004,
    name = "SELECT_OPTION_6004",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_6004",
    action = "action_EVENT_SELECT_OPTION_6004"
  },
  {
    config_id = 1006006,
    name = "SPECIFIC_MONSTER_HP_CHANGE_6006",
    event = EventType.EVENT_SPECIFIC_MONSTER_HP_CHANGE,
    source = "6001",
    condition = "condition_EVENT_SPECIFIC_MONSTER_HP_CHANGE_6006",
    action = "action_EVENT_SPECIFIC_MONSTER_HP_CHANGE_6006"
  },
  {
    config_id = 1006007,
    name = "QUEST_FINISH_6007",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_6007",
    action = "action_EVENT_QUEST_FINISH_6007"
  },
  {
    config_id = 1006008,
    name = "TIMER_EVENT_6008",
    event = EventType.EVENT_TIMER_EVENT,
    source = "1",
    condition = "",
    action = "action_EVENT_TIMER_EVENT_6008"
  },
  {
    config_id = 1006010,
    name = "DUNGEON_ALL_AVATAR_DIE_6010",
    event = EventType.EVENT_DUNGEON_ALL_AVATAR_DIE,
    source = "",
    condition = "condition_EVENT_DUNGEON_ALL_AVATAR_DIE_6010",
    action = "action_EVENT_DUNGEON_ALL_AVATAR_DIE_6010"
  }
}
variables = {
  {
    config_id = 1,
    name = "BossSheild",
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
    gadgets = {6002, 6005},
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_6003",
      "SELECT_OPTION_6004",
      "QUEST_FINISH_6007"
    },
    rand_weight = 100
  },
  {
    monsters = {6001},
    gadgets = {6009},
    regions = {},
    triggers = {
      "SPECIFIC_MONSTER_HP_CHANGE_6006",
      "TIMER_EVENT_6008",
      "DUNGEON_ALL_AVATAR_DIE_6010"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_6003(context, evt)
  if 6002 ~= evt.param2 or GadgetState.Action03 ~= evt.param1 or GadgetState.Action02 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_6003(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220132006, 6005, {769}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  ScriptLib.RemoveExtraGroupSuite(context, 220132002, 11)
  return 0
end
function condition_EVENT_SELECT_OPTION_6004(context, evt)
  if 6005 ~= evt.param1 then
    return false
  end
  if 769 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_6004(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 6002, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220132006, 6005, 769) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220132011, suite = 4}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220132002, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220132008, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220132009, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220132010, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_SPECIFIC_MONSTER_HP_CHANGE_6006(context, evt)
  if evt.type ~= EventType.EVENT_SPECIFIC_MONSTER_HP_CHANGE or evt.param3 > 21 then
    return false
  end
  return true
end
function action_EVENT_SPECIFIC_MONSTER_HP_CHANGE_6006(context, evt)
  if 0 ~= ScriptLib.CreateGroupTimerEvent(context, 220132006, "1", 25) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_timerevent_by_group")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "BossSheild", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_FINISH_6007(context, evt)
  if 300313 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_6007(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220132006, 2)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220132011, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  ScriptLib.ActivateDungeonCheckPoint(context, 10)
  return 0
end
function action_EVENT_TIMER_EVENT_6008(context, evt)
  ScriptLib.RemoveEntityByConfigId(context, 220132006, EntityType.MONSTER, 6001)
  if 0 ~= ScriptLib.AddQuestProgress(context, "300314") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_DUNGEON_ALL_AVATAR_DIE_6010(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "BossSheild") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_DUNGEON_ALL_AVATAR_DIE_6010(context, evt)
  if 0 ~= ScriptLib.CancelGroupTimerEvent(context, 220132006, "1") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : cancel_timerevent_by_group")
    return -1
  end
  ScriptLib.RemoveEntityByConfigId(context, 220132006, EntityType.MONSTER, 6001)
  if 0 ~= ScriptLib.AddQuestProgress(context, "300314") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
