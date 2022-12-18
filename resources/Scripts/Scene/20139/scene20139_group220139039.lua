local base_info = {group_id = 220139039}
local Check_Point_List = {
  [39001] = 20
}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 39001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = -11.191,
      y = 32.034,
      z = -0.695
    }
  }
}
triggers = {
  {
    config_id = 1039001,
    name = "ENTER_REGION_39001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_39001",
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
    regions = {39001},
    triggers = {
      "ENTER_REGION_39001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_39001(context, evt)
  if evt.param1 ~= 39001 then
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
