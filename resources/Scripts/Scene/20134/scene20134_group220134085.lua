local base_info = {group_id = 220134085}
local Check_Point_List = {}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 85001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 646.824,
      y = 605.851,
      z = -1488.724
    }
  }
}
triggers = {
  {
    config_id = 1085001,
    name = "ENTER_REGION_85001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_85001",
    action = "",
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
    regions = {85001},
    triggers = {
      "ENTER_REGION_85001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_85001(context, evt)
  if evt.param1 ~= 85001 then
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
require("CheckPoint_Handler")
