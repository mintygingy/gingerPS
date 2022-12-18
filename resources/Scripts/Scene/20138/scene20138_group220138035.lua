local base_info = {group_id = 220138035}
local Check_Point_List = {
  [35001] = 9
}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 35001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = -49.013,
      y = -21.729,
      z = 52.854
    }
  }
}
triggers = {
  {
    config_id = 1035001,
    name = "ENTER_REGION_35001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_35001",
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
    regions = {35001},
    triggers = {
      "ENTER_REGION_35001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_35001(context, evt)
  if evt.param1 ~= 35001 then
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
