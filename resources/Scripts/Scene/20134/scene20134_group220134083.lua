local base_info = {group_id = 220134083}
local Check_Point_List = {
  [83001] = 7
}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 83001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 499.256,
      y = 609.303,
      z = -1654.742
    }
  }
}
triggers = {
  {
    config_id = 1083001,
    name = "ENTER_REGION_83001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_83001",
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
    regions = {83001},
    triggers = {
      "ENTER_REGION_83001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_83001(context, evt)
  if evt.param1 ~= 83001 then
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
