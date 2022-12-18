local base_info = {group_id = 220133010}
local Check_Point_List = {
  [10001] = 11
}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 10001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 36.352,
      y = 157.107,
      z = 537.241
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
    regions = {10001},
    triggers = {
      "ENTER_REGION_10001"
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
  return true
end
require("CheckPoint_Handler")
