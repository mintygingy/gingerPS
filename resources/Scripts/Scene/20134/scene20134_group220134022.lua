local base_info = {group_id = 220134022}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 22001,
    shape = RegionShape.CYLINDER,
    radius = 5.5,
    pos = {
      x = 499.987,
      y = 611.553,
      z = -1591.199
    },
    height = 4.0
  },
  {
    config_id = 22002,
    shape = RegionShape.CYLINDER,
    radius = 5.5,
    pos = {
      x = 499.987,
      y = 611.553,
      z = -1591.199
    },
    height = 4.0
  }
}
triggers = {
  {
    config_id = 1022001,
    name = "ENTER_REGION_22001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_22001",
    action = "action_EVENT_ENTER_REGION_22001",
    trigger_count = 0
  },
  {
    config_id = 1022002,
    name = "ENTER_REGION_22002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_22002",
    action = "action_EVENT_ENTER_REGION_22002",
    trigger_count = 0
  },
  {
    config_id = 1022003,
    name = "GROUP_LOAD_22003",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_22003",
    trigger_count = 0
  },
  {
    config_id = 1022004,
    name = "GROUP_LOAD_22004",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_22004",
    trigger_count = 0
  }
}
variables = {}
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
    triggers = {
      "GROUP_LOAD_22003",
      "GROUP_LOAD_22004"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {22001},
    triggers = {
      "ENTER_REGION_22001"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {22002},
    triggers = {
      "ENTER_REGION_22002"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_22001(context, evt)
  if evt.param1 ~= 22001 then
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
function action_EVENT_ENTER_REGION_22001(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007407") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_22002(context, evt)
  if evt.param1 ~= 22002 then
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
function action_EVENT_ENTER_REGION_22002(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007505") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_LOAD_22003(context, evt)
  if ScriptLib.GetHostQuestState(context, 4007407) == 2 then
    ScriptLib.RefreshGroup(context, {group_id = 220134022, suite = 2})
  end
  return 0
end
function action_EVENT_GROUP_LOAD_22004(context, evt)
  if ScriptLib.GetHostQuestState(context, 4007505) == 2 then
    ScriptLib.RefreshGroup(context, {group_id = 220134022, suite = 3})
  end
  return 0
end
