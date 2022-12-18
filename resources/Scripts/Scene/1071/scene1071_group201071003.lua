local base_info = {group_id = 201071003}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 3001,
    gadget_id = 70900201,
    pos = {
      x = 5.404,
      y = -14.729,
      z = -19.635
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3002,
    gadget_id = 70900201,
    pos = {
      x = 77.114,
      y = -12.999,
      z = -19.843
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3003,
    gadget_id = 70900201,
    pos = {
      x = 148.574,
      y = -7.266,
      z = -19.869
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3004,
    gadget_id = 70900201,
    pos = {
      x = 134.669,
      y = -7.219,
      z = -18.268
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3005,
    gadget_id = 70900201,
    pos = {
      x = 144.171,
      y = -7.059,
      z = -19.957
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
    config_id = 3006,
    shape = RegionShape.SPHERE,
    radius = 12,
    pos = {
      x = 4.315,
      y = -13.144,
      z = -19.76
    }
  },
  {
    config_id = 3008,
    shape = RegionShape.SPHERE,
    radius = 12,
    pos = {
      x = 77.18,
      y = -12.946,
      z = -19.944
    }
  },
  {
    config_id = 3010,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 148.342,
      y = -9.19,
      z = -20.375
    }
  }
}
triggers = {
  {
    config_id = 1003006,
    name = "ENTER_REGION_3006",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3006",
    action = "action_EVENT_ENTER_REGION_3006"
  },
  {
    config_id = 1003007,
    name = "QUEST_FINISH_3007",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_3007",
    action = "action_EVENT_QUEST_FINISH_3007"
  },
  {
    config_id = 1003008,
    name = "ENTER_REGION_3008",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3008",
    action = "action_EVENT_ENTER_REGION_3008"
  },
  {
    config_id = 1003009,
    name = "QUEST_FINISH_3009",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_3009",
    action = "action_EVENT_QUEST_FINISH_3009"
  },
  {
    config_id = 1003010,
    name = "ENTER_REGION_3010",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3010",
    action = "action_EVENT_ENTER_REGION_3010"
  },
  {
    config_id = 1003011,
    name = "QUEST_FINISH_3011",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_3011",
    action = "action_EVENT_QUEST_FINISH_3011"
  },
  {
    config_id = 1003012,
    name = "QUEST_FINISH_3012",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_3012",
    action = "action_EVENT_QUEST_FINISH_3012"
  },
  {
    config_id = 1003013,
    name = "QUEST_FINISH_3013",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_3013",
    action = "action_EVENT_QUEST_FINISH_3013"
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
    gadgets = {3001},
    regions = {3006},
    triggers = {
      "ENTER_REGION_3006",
      "QUEST_FINISH_3007"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {3002},
    regions = {3008},
    triggers = {
      "ENTER_REGION_3008",
      "QUEST_FINISH_3009"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {3003},
    regions = {3010},
    triggers = {
      "ENTER_REGION_3010",
      "QUEST_FINISH_3011"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {3004},
    regions = {},
    triggers = {
      "QUEST_FINISH_3012"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {3005},
    regions = {},
    triggers = {
      "QUEST_FINISH_3013"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_3006(context, evt)
  if evt.param1 ~= 3006 then
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
function action_EVENT_ENTER_REGION_3006(context, evt)
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 201071003, EntityType.GADGET, 3001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_FINISH_3007(context, evt)
  if 1203906 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_3007(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 201071003, 2)
  return 0
end
function condition_EVENT_ENTER_REGION_3008(context, evt)
  if evt.param1 ~= 3008 then
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
function action_EVENT_ENTER_REGION_3008(context, evt)
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 201071003, EntityType.GADGET, 3002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_FINISH_3009(context, evt)
  if 1203908 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_3009(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 201071003, 3)
  return 0
end
function condition_EVENT_ENTER_REGION_3010(context, evt)
  if evt.param1 ~= 3010 then
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
function action_EVENT_ENTER_REGION_3010(context, evt)
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 201071003, EntityType.GADGET, 3003) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_FINISH_3011(context, evt)
  if 1203912 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_3011(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 201071003, 4)
  return 0
end
function condition_EVENT_QUEST_FINISH_3012(context, evt)
  if 1203913 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_3012(context, evt)
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 201071003, EntityType.GADGET, 3004) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 201071003, 5)
  return 0
end
function condition_EVENT_QUEST_FINISH_3013(context, evt)
  if 1203914 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_3013(context, evt)
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 201071003, EntityType.GADGET, 3005) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
