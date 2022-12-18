local base_info = {group_id = 220133013}
local Check_Point_List = {
  [13001] = 17
}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 13001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = -81.186,
      y = 209.886,
      z = 588.342
    }
  }
}
triggers = {
  {
    config_id = 1013001,
    name = "ENTER_REGION_13001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_13001",
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
    regions = {13001},
    triggers = {
      "ENTER_REGION_13001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_13001(context, evt)
  if evt.param1 ~= 13001 then
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
