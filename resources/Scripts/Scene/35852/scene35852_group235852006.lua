local base_info = {group_id = 235852006}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 6001,
    gadget_id = 70310448,
    pos = {
      x = 204.88,
      y = 640.13,
      z = -1794.254
    },
    rot = {
      x = 1.0,
      y = 3.229,
      z = 359.17
    },
    level = 1
  },
  {
    config_id = 6003,
    gadget_id = 70900201,
    pos = {
      x = 206.335,
      y = 634.439,
      z = -1778.534
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  {
    config_id = 6002,
    shape = RegionShape.SPHERE,
    radius = 8,
    pos = {
      x = 205.903,
      y = 634.444,
      z = -1776.893
    }
  }
}
triggers = {
  {
    config_id = 1006002,
    name = "ENTER_REGION_6002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_6002",
    action = "action_EVENT_ENTER_REGION_6002",
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
    regions = {6002},
    triggers = {
      "ENTER_REGION_6002"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {6003},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_6002(context, evt)
  if evt.param1 ~= 6002 then
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
function action_EVENT_ENTER_REGION_6002(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 6001}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 235852006, EntityType.GADGET, 6003) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 235852001, 4)
  return 0
end
