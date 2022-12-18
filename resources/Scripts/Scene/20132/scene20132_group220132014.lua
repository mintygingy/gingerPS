local base_info = {group_id = 220132014}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 14001,
    gadget_id = 70360001,
    pos = {
      x = 449.272,
      y = 65.248,
      z = 385.045
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
    config_id = 14002,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 30.0,
      z = 10.0
    },
    pos = {
      x = 449.39,
      y = 67.648,
      z = 422.226
    }
  },
  {
    config_id = 14003,
    shape = RegionShape.CUBIC,
    size = {
      x = 30.0,
      y = 25.0,
      z = 15.0
    },
    pos = {
      x = 449.518,
      y = 75.056,
      z = 385.645
    }
  }
}
triggers = {
  {
    config_id = 1014002,
    name = "ENTER_REGION_14002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_14002",
    action = "action_EVENT_ENTER_REGION_14002",
    trigger_count = 0
  },
  {
    config_id = 1014003,
    name = "ENTER_REGION_14003",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_14003",
    action = "action_EVENT_ENTER_REGION_14003",
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
    gadgets = {14001},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {14002, 14003},
    triggers = {
      "ENTER_REGION_14002",
      "ENTER_REGION_14003"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_14002(context, evt)
  if evt.param1 ~= 14002 then
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
function action_EVENT_ENTER_REGION_14002(context, evt)
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220132001, 1003, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_14003(context, evt)
  if evt.param1 ~= 14003 then
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
function action_EVENT_ENTER_REGION_14003(context, evt)
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220132001, 1003, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
