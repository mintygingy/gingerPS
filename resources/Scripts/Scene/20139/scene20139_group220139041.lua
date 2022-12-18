local base_info = {group_id = 220139041}
local Check_Point_List = {
  [41001] = 18
}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 41001,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 5.692,
      y = 97.706,
      z = -128.873
    }
  }
}
triggers = {
  {
    config_id = 1041001,
    name = "ENTER_REGION_41001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_41001",
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
    regions = {41001},
    triggers = {
      "ENTER_REGION_41001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_41001(context, evt)
  if evt.param1 ~= 41001 then
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
