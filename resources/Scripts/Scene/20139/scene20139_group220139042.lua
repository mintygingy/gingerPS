local base_info = {group_id = 220139042}
local Check_Point_List = {
  [42001] = 17
}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 42001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = -35.126,
      y = 87.275,
      z = -86.041
    }
  }
}
triggers = {
  {
    config_id = 1042001,
    name = "ENTER_REGION_42001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_42001",
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
    regions = {42001},
    triggers = {
      "ENTER_REGION_42001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_42001(context, evt)
  if evt.param1 ~= 42001 then
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
