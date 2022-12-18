local base_info = {group_id = 220133011}
local Check_Point_List = {
  [11001] = 13
}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 11001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 218.709,
      y = 131.767,
      z = 2082.107
    }
  }
}
triggers = {
  {
    config_id = 1011001,
    name = "ENTER_REGION_11001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_11001",
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
    regions = {11001},
    triggers = {
      "ENTER_REGION_11001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_11001(context, evt)
  if evt.param1 ~= 11001 then
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
