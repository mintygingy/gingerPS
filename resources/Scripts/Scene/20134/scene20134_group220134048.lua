local base_info = {group_id = 220134048}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 48001,
    gadget_id = 70310233,
    pos = {
      x = 672.4,
      y = 602.121,
      z = -1483.905
    },
    rot = {
      x = 0.0,
      y = 99.768,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 48002,
    gadget_id = 70310374,
    pos = {
      x = 674.516,
      y = 614.489,
      z = -1484.117
    },
    rot = {
      x = 306.241,
      y = 354.845,
      z = 199.737
    },
    level = 1,
    persistent = true
  }
}
regions = {
  {
    config_id = 48003,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 670.527,
      y = 610.838,
      z = -1485.658
    }
  }
}
triggers = {
  {
    config_id = 1048003,
    name = "ENTER_REGION_48003",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_48003",
    action = "action_EVENT_ENTER_REGION_48003",
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
    gadgets = {48001, 48002},
    regions = {48003},
    triggers = {
      "ENTER_REGION_48003"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_48003(context, evt)
  if evt.param1 ~= 48003 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220134048, 48002) then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_48003(context, evt)
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220134048, EntityType.GADGET, 48002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
