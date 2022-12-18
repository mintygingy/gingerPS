local base_info = {group_id = 220134084}
local Check_Point_List = {
  [84001] = 6
}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 84001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 369.746,
      y = 632.156,
      z = -1506.443
    }
  }
}
triggers = {
  {
    config_id = 1084001,
    name = "ENTER_REGION_84001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_84001",
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
    regions = {84001},
    triggers = {
      "ENTER_REGION_84001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_84001(context, evt)
  if evt.param1 ~= 84001 then
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
