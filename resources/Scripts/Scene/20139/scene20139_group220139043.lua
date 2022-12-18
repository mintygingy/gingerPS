local base_info = {group_id = 220139043}
local Check_Point_List = {
  [43001] = 16
}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 43001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 56.83,
      y = 100.472,
      z = 69.919
    }
  }
}
triggers = {
  {
    config_id = 1043001,
    name = "ENTER_REGION_43001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_43001",
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
    regions = {43001},
    triggers = {
      "ENTER_REGION_43001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_43001(context, evt)
  if evt.param1 ~= 43001 then
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
