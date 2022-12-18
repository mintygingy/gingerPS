local base_info = {group_id = 220133057}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 57001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 38.483,
      y = 157.831,
      z = 536.958
    }
  }
}
triggers = {
  {
    config_id = 1057001,
    name = "ENTER_REGION_57001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_57001",
    action = "action_EVENT_ENTER_REGION_57001",
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
    regions = {57001},
    triggers = {
      "ENTER_REGION_57001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_57001(context, evt)
  if evt.param1 ~= 57001 then
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
function action_EVENT_ENTER_REGION_57001(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4006807") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
