local base_info = {group_id = 220138037}
local Check_Point_List = {
  [37001] = 13
}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 37001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 85.556,
      y = 30.347,
      z = -25.426
    }
  }
}
triggers = {
  {
    config_id = 1037001,
    name = "ENTER_REGION_37001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_37001",
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
    regions = {37001},
    triggers = {
      "ENTER_REGION_37001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_37001(context, evt)
  if evt.param1 ~= 37001 then
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
