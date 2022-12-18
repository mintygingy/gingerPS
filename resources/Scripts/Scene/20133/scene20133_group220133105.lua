local base_info = {group_id = 220133105}
local Check_Point_List = {
  [105001] = 37
}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 105001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 459.422,
      y = 164.541,
      z = 1883.352
    }
  }
}
triggers = {
  {
    config_id = 1105001,
    name = "ENTER_REGION_105001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_105001",
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
    regions = {105001},
    triggers = {
      "ENTER_REGION_105001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_105001(context, evt)
  if evt.param1 ~= 105001 then
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
