local base_info = {group_id = 220136010}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 10001,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 290.8,
      y = 71.845,
      z = 851.305
    }
  },
  {
    config_id = 10002,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 342.843,
      y = 71.66,
      z = 798.667
    }
  },
  {
    config_id = 10003,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 362.486,
      y = 72.382,
      z = 742.0
    }
  },
  {
    config_id = 10004,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 362.691,
      y = 71.018,
      z = 669.007
    }
  },
  {
    config_id = 10005,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 350.977,
      y = 72.12,
      z = 630.582
    }
  },
  {
    config_id = 10006,
    shape = RegionShape.SPHERE,
    radius = 20,
    pos = {
      x = 294.717,
      y = 64.71,
      z = 630.452
    }
  },
  {
    config_id = 10007,
    shape = RegionShape.SPHERE,
    radius = 20,
    pos = {
      x = 294.717,
      y = 10.673,
      z = 630.452
    }
  },
  {
    config_id = 10008,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 302.203,
      y = 71.66,
      z = 819.903
    }
  }
}
triggers = {
  {
    config_id = 1010001,
    name = "ENTER_REGION_10001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_10001",
    action = "action_EVENT_ENTER_REGION_10001",
    trigger_count = 0
  },
  {
    config_id = 1010002,
    name = "ENTER_REGION_10002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_10002",
    action = "action_EVENT_ENTER_REGION_10002",
    trigger_count = 0
  },
  {
    config_id = 1010003,
    name = "ENTER_REGION_10003",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_10003",
    action = "action_EVENT_ENTER_REGION_10003",
    trigger_count = 0
  },
  {
    config_id = 1010004,
    name = "ENTER_REGION_10004",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_10004",
    action = "action_EVENT_ENTER_REGION_10004",
    trigger_count = 0
  },
  {
    config_id = 1010005,
    name = "ENTER_REGION_10005",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_10005",
    action = "action_EVENT_ENTER_REGION_10005",
    trigger_count = 0
  },
  {
    config_id = 1010006,
    name = "ENTER_REGION_10006",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_10006",
    action = "action_EVENT_ENTER_REGION_10006",
    trigger_count = 0
  },
  {
    config_id = 1010007,
    name = "ENTER_REGION_10007",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_10007",
    action = "action_EVENT_ENTER_REGION_10007",
    trigger_count = 0
  },
  {
    config_id = 1010008,
    name = "ENTER_REGION_10008",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_10008",
    action = "action_EVENT_ENTER_REGION_10008",
    trigger_count = 0
  },
  {
    config_id = 1010009,
    name = "QUEST_START_10009",
    event = EventType.EVENT_QUEST_START,
    source = "4007611",
    condition = "",
    action = "action_EVENT_QUEST_START_10009",
    trigger_count = 0
  },
  {
    config_id = 1010010,
    name = "QUEST_FINISH_10010",
    event = EventType.EVENT_QUEST_FINISH,
    source = "4007611",
    condition = "condition_EVENT_QUEST_FINISH_10010",
    action = "action_EVENT_QUEST_FINISH_10010",
    trigger_count = 0
  },
  {
    config_id = 1010011,
    name = "GROUP_LOAD_10011",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_10011",
    action = "action_EVENT_GROUP_LOAD_10011",
    trigger_count = 0
  },
  {
    config_id = 1010012,
    name = "GROUP_LOAD_10012",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_10012"
  },
  {
    config_id = 1010013,
    name = "GROUP_LOAD_10013",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_10013",
    trigger_count = 0
  },
  {
    config_id = 1010014,
    name = "GROUP_REFRESH_10014",
    event = EventType.EVENT_GROUP_REFRESH,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_REFRESH_10014",
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
    name = "finishRmd7",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 8,
    name = "finishRmd8",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 9,
    name = "questFinishPart3",
    value = 0,
    no_refresh = true
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
    regions = {
      10001,
      10002,
      10003,
      10004,
      10005,
      10006,
      10007,
      10008
    },
    triggers = {
      "ENTER_REGION_10001",
      "ENTER_REGION_10002",
      "ENTER_REGION_10003",
      "ENTER_REGION_10004",
      "ENTER_REGION_10005",
      "ENTER_REGION_10006",
      "ENTER_REGION_10007",
      "ENTER_REGION_10008",
      "QUEST_START_10009",
      "QUEST_FINISH_10010",
      "GROUP_LOAD_10011",
      "GROUP_LOAD_10013",
      "GROUP_REFRESH_10014"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {
      "QUEST_START_10009",
      "GROUP_LOAD_10012"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_10001(context, evt)
  if evt.param1 ~= 10001 then
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
function action_EVENT_ENTER_REGION_10001(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 1110976) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd1", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_10002(context, evt)
  if evt.param1 ~= 10002 then
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
function action_EVENT_ENTER_REGION_10002(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 1110983) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd2", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_10003(context, evt)
  if evt.param1 ~= 10003 then
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
function action_EVENT_ENTER_REGION_10003(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 1110984) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd3", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_10004(context, evt)
  if evt.param1 ~= 10004 then
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
function action_EVENT_ENTER_REGION_10004(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 1110985) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd4", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_10005(context, evt)
  if evt.param1 ~= 10005 then
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
function action_EVENT_ENTER_REGION_10005(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 1110986) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd5", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_10006(context, evt)
  if evt.param1 ~= 10006 then
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
function action_EVENT_ENTER_REGION_10006(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 1110987) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd6", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_10007(context, evt)
  if evt.param1 ~= 10007 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "finishRmd7") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_10007(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 1110988) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd7", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_10008(context, evt)
  if evt.param1 ~= 10008 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "finishRmd8") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_10008(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 1110980) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd8", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function action_EVENT_QUEST_START_10009(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd1", 0) then
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
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd6", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd7", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd8", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "questFinishPart3", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220136010, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_FINISH_10010(context, evt)
  if 4007611 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_10010(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "questFinishPart3", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220136010, suite = 2}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_10011(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "questFinishPart3") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_10011(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220136010, suite = 2}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_LOAD_10012(context, evt)
  if ScriptLib.GetHostQuestState(context, 4007611) == 2 then
    ScriptLib.RefreshGroup(context, {group_id = 220136010, suite = 1})
  end
  return 0
end
function action_EVENT_GROUP_LOAD_10013(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd1", 0) then
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
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd6", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd7", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd8", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_REFRESH_10014(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd1", 0) then
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
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd6", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd7", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finishRmd8", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
