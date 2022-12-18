local base_info = {group_id = 220137033}
local Check_Point_List = {
  [33001] = 11
}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 33001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 739.418,
      y = 139.286,
      z = -33.06
    }
  }
}
triggers = {
  {
    config_id = 1033001,
    name = "ENTER_REGION_33001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_33001",
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
    regions = {33001},
    triggers = {
      "ENTER_REGION_33001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_33001(context, evt)
  if evt.param1 ~= 33001 then
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
