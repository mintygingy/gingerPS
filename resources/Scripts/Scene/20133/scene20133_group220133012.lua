local base_info = {group_id = 220133012}
local Check_Point_List = {
  [12001] = 14
}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 12001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = -4.033,
      y = 144.164,
      z = 608.689
    }
  }
}
triggers = {
  {
    config_id = 1012001,
    name = "ENTER_REGION_12001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_12001",
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
    regions = {12001},
    triggers = {
      "ENTER_REGION_12001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_12001(context, evt)
  if evt.param1 ~= 12001 then
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
