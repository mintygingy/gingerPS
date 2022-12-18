local base_info = {group_id = 220133017}
local Check_Point_List = {
  [17001] = 31
}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 17001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 5048.692,
      y = 536.64,
      z = -1734.443
    }
  }
}
triggers = {
  {
    config_id = 1017001,
    name = "ENTER_REGION_17001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_17001",
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
    regions = {17001},
    triggers = {
      "ENTER_REGION_17001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_17001(context, evt)
  if evt.param1 ~= 17001 then
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
