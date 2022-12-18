local base_info = {group_id = 220137032}
local Check_Point_List = {
  [32001] = 12
}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 32001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 697.68,
      y = 73.81,
      z = -158.076
    }
  }
}
triggers = {
  {
    config_id = 1032001,
    name = "ENTER_REGION_32001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_32001",
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
    regions = {32001},
    triggers = {
      "ENTER_REGION_32001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_32001(context, evt)
  if evt.param1 ~= 32001 then
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
