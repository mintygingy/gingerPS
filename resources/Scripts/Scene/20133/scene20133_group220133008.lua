local base_info = {group_id = 220133008}
local Check_Point_List = {
  [8001] = 7
}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 8001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 10.735,
      y = 161.492,
      z = 571.767
    }
  }
}
triggers = {
  {
    config_id = 1008001,
    name = "ENTER_REGION_8001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_8001",
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
    regions = {8001},
    triggers = {
      "ENTER_REGION_8001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_8001(context, evt)
  if evt.param1 ~= 8001 then
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
