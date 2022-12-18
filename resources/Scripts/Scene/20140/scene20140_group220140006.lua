local base_info = {group_id = 220140006}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 6001,
    shape = RegionShape.CUBIC,
    size = {
      x = 25.0,
      y = 25.0,
      z = 25.0
    },
    pos = {
      x = -68.358,
      y = 10.266,
      z = 124.561
    }
  }
}
triggers = {
  {
    config_id = 1006001,
    name = "ENTER_REGION_6001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_6001",
    action = "action_EVENT_ENTER_REGION_6001"
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
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {6001},
    triggers = {
      "ENTER_REGION_6001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_6001(context, evt)
  if evt.param1 ~= 6001 then
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
function action_EVENT_ENTER_REGION_6001(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4006706") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
