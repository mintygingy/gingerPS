local base_info = {group_id = 220133015}
local Check_Point_List = {
  [15001] = 23
}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 15001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 4369.813,
      y = 536.372,
      z = 226.472
    }
  }
}
triggers = {
  {
    config_id = 1015001,
    name = "ENTER_REGION_15001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_15001",
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
    regions = {15001},
    triggers = {
      "ENTER_REGION_15001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_15001(context, evt)
  if evt.param1 ~= 15001 then
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
