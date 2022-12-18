local base_info = {group_id = 220133016}
local Check_Point_List = {
  [16001] = 28
}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 16001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 5029.74,
      y = 540.684,
      z = -1826.172
    }
  }
}
triggers = {
  {
    config_id = 1016001,
    name = "ENTER_REGION_16001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_16001",
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
    regions = {16001},
    triggers = {
      "ENTER_REGION_16001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_16001(context, evt)
  if evt.param1 ~= 16001 then
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
