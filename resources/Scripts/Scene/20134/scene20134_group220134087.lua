local base_info = {group_id = 220134087}
local Check_Point_List = {}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 87001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 315.614,
      y = 625.36,
      z = -1656.789
    }
  }
}
triggers = {
  {
    config_id = 1087001,
    name = "ENTER_REGION_87001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_87001",
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
    regions = {87001},
    triggers = {
      "ENTER_REGION_87001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_87001(context, evt)
  if evt.param1 ~= 87001 then
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
