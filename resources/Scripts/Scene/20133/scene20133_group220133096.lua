local base_info = {group_id = 220133096}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 96001,
    shape = RegionShape.POLYGON,
    pos = {
      x = 3754.25,
      y = 100.0,
      z = -684.583
    },
    height = 1400.0,
    point_array = {
      {x = 1286.766, y = 938.412},
      {x = 4943.04, y = 1483.597},
      {x = 6221.733, y = -1990.906},
      {x = 1948.328, y = -2852.763}
    }
  },
  {
    config_id = 96002,
    shape = RegionShape.SPHERE,
    radius = 350,
    pos = {
      x = 11.981,
      y = 276.589,
      z = 587.509
    }
  }
}
triggers = {
  {
    config_id = 1096001,
    name = "ENTER_REGION_96001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_96001",
    action = "action_EVENT_ENTER_REGION_96001",
    trigger_count = 0
  },
  {
    config_id = 1096002,
    name = "ENTER_REGION_96002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_96002",
    action = "action_EVENT_ENTER_REGION_96002",
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
    regions = {96001, 96002},
    triggers = {
      "ENTER_REGION_96001",
      "ENTER_REGION_96002"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_96001(context, evt)
  if evt.param1 ~= 96001 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_96001(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "PlayerEnterTransmitDoor") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_96002(context, evt)
  if evt.param1 ~= 96002 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_96002(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "PlayerBackToCave") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
