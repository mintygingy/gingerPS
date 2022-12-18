local base_info = {group_id = 220139040}
local Check_Point_List = {
  [40001] = 19
}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 40001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 49.97,
      y = 35.093,
      z = -46.131
    }
  }
}
triggers = {
  {
    config_id = 1040001,
    name = "ENTER_REGION_40001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_40001",
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
    regions = {40001},
    triggers = {
      "ENTER_REGION_40001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_40001(context, evt)
  if evt.param1 ~= 40001 then
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
