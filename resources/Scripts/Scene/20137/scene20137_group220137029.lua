local base_info = {group_id = 220137029}
local Check_Point_List = {
  [29001] = 9
}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 29001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 589.84,
      y = 73.959,
      z = -141.823
    }
  }
}
triggers = {
  {
    config_id = 1029001,
    name = "ENTER_REGION_29001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_29001",
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
    regions = {29001},
    triggers = {
      "ENTER_REGION_29001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_29001(context, evt)
  if evt.param1 ~= 29001 then
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
