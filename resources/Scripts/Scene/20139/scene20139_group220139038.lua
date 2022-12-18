local base_info = {group_id = 220139038}
local Check_Point_List = {
  [38001] = 21
}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 38001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 102.949,
      y = 109.85,
      z = 22.763
    }
  }
}
triggers = {
  {
    config_id = 1038001,
    name = "ENTER_REGION_38001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_38001",
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
    regions = {38001},
    triggers = {
      "ENTER_REGION_38001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_38001(context, evt)
  if evt.param1 ~= 38001 then
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
