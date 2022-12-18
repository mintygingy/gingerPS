local base_info = {group_id = 220139005}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 5001,
    gadget_id = 70310451,
    pos = {
      x = 62.025,
      y = 102.273,
      z = 70.606
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    isOneoff = true
  },
  {
    config_id = 5005,
    gadget_id = 70690011,
    pos = {
      x = 44.079,
      y = 84.78,
      z = 52.391
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5006,
    gadget_id = 70690011,
    pos = {
      x = 27.861,
      y = 83.355,
      z = 40.529
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
    config_id = 5002,
    shape = RegionShape.CYLINDER,
    radius = 1,
    pos = {
      x = 62.025,
      y = 102.273,
      z = 70.606
    },
    height = 10.0
  },
  {
    config_id = 5004,
    shape = RegionShape.SPHERE,
    radius = 35,
    pos = {
      x = -32.175,
      y = 84.795,
      z = 20.759
    }
  }
}
triggers = {
  {
    config_id = 1005002,
    name = "ENTER_REGION_5002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_5002",
    action = "action_EVENT_ENTER_REGION_5002"
  },
  {
    config_id = 1005003,
    name = "ANY_GADGET_DIE_5003",
    event = EventType.EVENT_ANY_GADGET_DIE,
    source = "",
    condition = "condition_EVENT_ANY_GADGET_DIE_5003",
    action = "action_EVENT_ANY_GADGET_DIE_5003",
    trigger_count = 0
  },
  {
    config_id = 1005004,
    name = "ENTER_REGION_5004",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_5004",
    action = "action_EVENT_ENTER_REGION_5004",
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
    gadgets = {5001},
    regions = {5002},
    triggers = {
      "ENTER_REGION_5002",
      "ANY_GADGET_DIE_5003"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {5005, 5006},
    regions = {5004},
    triggers = {
      "ENTER_REGION_5004"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_5002(context, evt)
  if evt.param1 ~= 5002 then
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
function action_EVENT_ENTER_REGION_5002(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "CastleToyB", 1, 220139004) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 5001}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007307") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_GADGET_DIE_5003(context, evt)
  if 5001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_GADGET_DIE_5003(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220139005, 2)
  return 0
end
function condition_EVENT_ENTER_REGION_5004(context, evt)
  if evt.param1 ~= 5004 then
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
function action_EVENT_ENTER_REGION_5004(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220139005, 2)
  return 0
end
