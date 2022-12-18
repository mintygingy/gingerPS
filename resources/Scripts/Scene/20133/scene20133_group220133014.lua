local base_info = {group_id = 220133014}
local Check_Point_List = {
  [14001] = 19
}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 14001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 2374.616,
      y = 540.286,
      z = -1754.213
    }
  }
}
triggers = {
  {
    config_id = 1014001,
    name = "ENTER_REGION_14001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_14001",
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
    regions = {14001},
    triggers = {
      "ENTER_REGION_14001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_14001(context, evt)
  if evt.param1 ~= 14001 then
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
