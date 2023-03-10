local base_info = {group_id = 220134052}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 52001,
    gadget_id = 70310342,
    pos = {
      x = 613.662,
      y = 621.188,
      z = -1685.934
    },
    rot = {
      x = 0.052,
      y = 31.057,
      z = 359.732
    },
    level = 1
  }
}
regions = {
  {
    config_id = 52002,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 614.227,
      y = 621.288,
      z = -1684.154
    }
  }
}
triggers = {
  {
    config_id = 1052002,
    name = "ENTER_REGION_52002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_52002",
    action = "action_EVENT_ENTER_REGION_52002",
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
    gadgets = {52001},
    regions = {52002},
    triggers = {
      "ENTER_REGION_52002"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_52002(context, evt)
  if evt.param1 ~= 52002 then
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
function action_EVENT_ENTER_REGION_52002(context, evt)
  if ScriptLib.GetHostQuestState(context, 4007503) == 3 then
    ScriptLib.ActivateDungeonCheckPoint(context, 4)
  end
  return 0
end
