local base_info = {group_id = 220139045}
local Check_Point_List = {
  [45001] = 14
}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 45001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = -29.879,
      y = 84.829,
      z = 22.534
    }
  }
}
triggers = {
  {
    config_id = 1045001,
    name = "ENTER_REGION_45001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_45001",
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
    regions = {45001},
    triggers = {
      "ENTER_REGION_45001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_45001(context, evt)
  if evt.param1 ~= 45001 then
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
