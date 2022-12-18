local base_info = {group_id = 220137034}
local Check_Point_List = {
  [34001] = 10
}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 34001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 695.352,
      y = 78.55,
      z = -126.719
    }
  }
}
triggers = {
  {
    config_id = 1034001,
    name = "ENTER_REGION_34001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_34001",
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
    regions = {34001},
    triggers = {
      "ENTER_REGION_34001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_34001(context, evt)
  if evt.param1 ~= 34001 then
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
