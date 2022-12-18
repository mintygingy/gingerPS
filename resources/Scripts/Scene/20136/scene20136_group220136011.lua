local base_info = {group_id = 220136011}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 11001,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 772.592,
      y = 7.704,
      z = 781.736
    }
  },
  {
    config_id = 11002,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 750.988,
      y = 0.0,
      z = 661.545
    }
  },
  {
    config_id = 11004,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 798.306,
      y = 0.0,
      z = 659.416
    }
  },
  {
    config_id = 11005,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 776.205,
      y = 0.0,
      z = 690.946
    }
  },
  {
    config_id = 11006,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 773.072,
      y = 0.0,
      z = 712.526
    }
  },
  {
    config_id = 11007,
    shape = RegionShape.CUBIC,
    size = {
      x = 50.0,
      y = 10.0,
      z = 10.0
    },
    pos = {
      x = 774.625,
      y = 3.073,
      z = 746.222
    }
  }
}
triggers = {
  {
    config_id = 1011001,
    name = "ENTER_REGION_11001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_11001",
    action = "action_EVENT_ENTER_REGION_11001",
    trigger_count = 0
  },
  {
    config_id = 1011002,
    name = "ENTER_REGION_11002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_11002",
    action = "action_EVENT_ENTER_REGION_11002",
    trigger_count = 0
  },
  {
    config_id = 1011003,
    name = "QUEST_START_11003",
    event = EventType.EVENT_QUEST_START,
    source = "4007506",
    condition = "",
    action = "action_EVENT_QUEST_START_11003",
    trigger_count = 0
  },
  {
    config_id = 1011004,
    name = "ENTER_REGION_11004",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_11004",
    action = "action_EVENT_ENTER_REGION_11004",
    trigger_count = 0
  },
  {
    config_id = 1011005,
    name = "ENTER_REGION_11005",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_11005",
    action = "action_EVENT_ENTER_REGION_11005",
    trigger_count = 0
  },
  {
    config_id = 1011006,
    name = "ENTER_REGION_11006",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_11006",
    action = "action_EVENT_ENTER_REGION_11006",
    trigger_count = 0
  },
  {
    config_id = 1011007,
    name = "ENTER_REGION_11007",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_11007",
    action = "action_EVENT_ENTER_REGION_11007",
    trigger_count = 0
  },
  {
    config_id = 1011008,
    name = "QUEST_FINISH_11008",
    event = EventType.EVENT_QUEST_FINISH,
    source = "4007506",
    condition = "condition_EVENT_QUEST_FINISH_11008",
    action = "action_EVENT_QUEST_FINISH_11008",
    trigger_count = 0
  },
  {
    config_id = 1011009,
    name = "GROUP_LOAD_11009",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_11009",
    action = "action_EVENT_GROUP_LOAD_11009",
    trigger_count = 0
  },
  {
    config_id = 1011010,
    name = "QUEST_START_11010",
    event = EventType.EVENT_QUEST_START,
    source = "4007507",
    condition = "",
    action = "action_EVENT_QUEST_START_11010",
    trigger_count = 0
  },
  {
    config_id = 1011011,
    name = "QUEST_FINISH_11011",
    event = EventType.EVENT_QUEST_FINISH,
    source = "4007507",
    condition = "condition_EVENT_QUEST_FINISH_11011",
    action = "action_EVENT_QUEST_FINISH_11011",
    trigger_count = 0
  },
  {
    config_id = 1011012,
    name = "GROUP_LOAD_11012",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_11012",
    trigger_count = 0
  },
  {
    config_id = 1011013,
    name = "GROUP_LOAD_11013",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_11013",
    trigger_count = 0
  },
  {
    config_id = 1011014,
    name = "GROUP_REFRESH_11014",
    event = EventType.EVENT_GROUP_REFRESH,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_REFRESH_11014",
    trigger_count = 0
  },
  {
    config_id = 1011015,
    name = "GROUP_REFRESH_11015",
    event = EventType.EVENT_GROUP_REFRESH,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_REFRESH_11015",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "finishRmd1",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 2,
    name = "finishRmd2",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 3,
    name = "finishRmd3",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 4,
    name = "finishRmd4",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 5,
    name = "finishRmd5",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 6,
    name = "finishRmd6",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 7,
    name = "questFinishPart2a",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 8,
    name = "questFinishPart2b",
    value = 0,
    no_refresh = true
  }
}
init_config = {
  suite = 3,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {},
    regions = {
      11002,
      11004,
      11005,
      11006,
      11007
    },
    triggers = {
      "ENTER_REGION_11002",
      "QUEST_START_11003",
      "ENTER_REGION_11004",
      "ENTER_REGION_11005",
      "ENTER_REGION_11006",
      "ENTER_REGION_11007",
      "QUEST_FINISH_11008",
      "GROUP_LOAD_11009",
      "GROUP_LOAD_11013",
      "GROUP_REFRESH_11015"
    },
    rand_weight = 100,
    ban_refresh = true
  },
  {
    monsters = {},
    gadgets = {},
    regions = {11001},
    triggers = {
      "ENTER_REGION_11001",
      "QUEST_START_11003",
      "QUEST_START_11010",
      "QUEST_FINISH_11011",
      "GROUP_REFRESH_11014"
    },
    rand_weight = 100,
    ban_refresh = true
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {
      "QUEST_START_11003",
      "GROUP_LOAD_11012"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_11001(context, evt)
  if evt.param1 ~= 11001 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "finishRmd1") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_11001(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 1110970) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd1", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_11002(context, evt)
  if evt.param1 ~= 11002 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "finishRmd2") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_11002(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 1110958) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd2", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function action_EVENT_QUEST_START_11003(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd6", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd2", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd3", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd4", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd5", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd1", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "questFinishPart2a", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220136011, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_11004(context, evt)
  if evt.param1 ~= 11004 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "finishRmd3") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_11004(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 1110962) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd3", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_11005(context, evt)
  if evt.param1 ~= 11005 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "finishRmd4") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_11005(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 1110965) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "finishRmd4", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_11006(context, evt)
  if evt.param1 ~= 11006 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "finishRmd5") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_11006(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 1110968) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd5", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_11007(context, evt)
  if evt.param1 ~= 11007 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "finishRmd6") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_11007(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 1110969) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd6", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_FINISH_11008(context, evt)
  if 4007506 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_11008(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "questFinishPart2a", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220136011, suite = 2}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_11009(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "questFinishPart2a") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_11009(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220136011, suite = 2}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function action_EVENT_QUEST_START_11010(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "questFinishPart2b", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd1", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_FINISH_11011(context, evt)
  if 4007507 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_11011(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220136011, suite = 3}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "questFinishPart2b", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_LOAD_11012(context, evt)
  if ScriptLib.GetHostQuestState(context, 4007506) == 2 then
    ScriptLib.RefreshGroup(context, {
      group_id = 0,
      refresh_level_revise = 0,
      exclude_prev = false,
      is_force_random_suite = false,
      suite = 1
    })
    ScriptLib.SetGroupVariableValue(context, "questFinishPart2a", 0)
  end
  return 0
end
function action_EVENT_GROUP_LOAD_11013(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd6", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd2", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd3", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd4", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd5", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd1", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_REFRESH_11014(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd1", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_REFRESH_11015(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd6", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd2", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd3", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd4", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd5", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd1", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
