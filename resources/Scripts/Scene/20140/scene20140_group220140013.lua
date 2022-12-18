local base_info = {group_id = 220140013}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 13004,
    gadget_id = 70690001,
    pos = {
      x = 100.084,
      y = 94.557,
      z = 786.746
    },
    rot = {
      x = 331.405,
      y = 339.667,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 13005,
    gadget_id = 70690001,
    pos = {
      x = 96.835,
      y = 98.106,
      z = 795.512
    },
    rot = {
      x = 333.395,
      y = 339.667,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 13006,
    gadget_id = 70310297,
    pos = {
      x = 25.5,
      y = 80.6,
      z = 667.0
    },
    rot = {
      x = 332.8,
      y = 330.0,
      z = 304.0
    },
    level = 1,
    isOneoff = true,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
  },
  {
    config_id = 13007,
    gadget_id = 70690001,
    pos = {
      x = 93.586,
      y = 101.656,
      z = 804.279
    },
    rot = {
      x = 333.979,
      y = 336.09,
      z = 0.887
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 13008,
    gadget_id = 70310297,
    pos = {
      x = 116.15,
      y = 93.352,
      z = 700.72
    },
    rot = {
      x = 319.836,
      y = 56.101,
      z = 328.138
    },
    level = 1,
    isOneoff = true,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
  },
  {
    config_id = 13009,
    gadget_id = 70310296,
    pos = {
      x = 107.61,
      y = 68.913,
      z = 700.179
    },
    rot = {
      x = 0.27,
      y = 30.516,
      z = 1.388
    },
    level = 1,
    persistent = true,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
  },
  {
    config_id = 13010,
    gadget_id = 70310296,
    pos = {
      x = 12.49,
      y = 67.43,
      z = 647.95
    },
    rot = {
      x = 357.919,
      y = 289.065,
      z = 357.131
    },
    level = 1,
    persistent = true,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
  },
  {
    config_id = 13012,
    gadget_id = 70380298,
    pos = {
      x = 44.27,
      y = 85.0,
      z = 605.72
    },
    rot = {
      x = 0.0,
      y = 292.846,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 13013,
    gadget_id = 70690001,
    pos = {
      x = 90.338,
      y = 105.205,
      z = 813.045
    },
    rot = {
      x = 333.767,
      y = 339.667,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 13014,
    gadget_id = 70310297,
    pos = {
      x = 92.7,
      y = 75.7,
      z = 733.19
    },
    rot = {
      x = 343.36,
      y = 282.736,
      z = 283.73
    },
    level = 1,
    isOneoff = true,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
  },
  {
    config_id = 13015,
    gadget_id = 70310296,
    pos = {
      x = 102.422,
      y = 68.531,
      z = 743.746
    },
    rot = {
      x = 0.879,
      y = 283.192,
      z = 0.836
    },
    level = 1,
    persistent = true,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
  },
  {
    config_id = 13016,
    gadget_id = 70690001,
    pos = {
      x = 87.089,
      y = 108.754,
      z = 821.811
    },
    rot = {
      x = 333.685,
      y = 335.433,
      z = 1.971
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 13017,
    gadget_id = 70690001,
    pos = {
      x = 83.841,
      y = 112.303,
      z = 830.578
    },
    rot = {
      x = 358.459,
      y = 353.899,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 13018,
    gadget_id = 70690029,
    pos = {
      x = 99.988,
      y = 76.835,
      z = 779.546
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 13019,
    gadget_id = 70690001,
    pos = {
      x = 82.794,
      y = 112.568,
      z = 840.372
    },
    rot = {
      x = 358.459,
      y = 353.899,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 13020,
    gadget_id = 70690029,
    pos = {
      x = 83.714,
      y = 94.823,
      z = 851.402
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 13029,
    gadget_id = 70310296,
    pos = {
      x = 52.22,
      y = 98.795,
      z = 977.082
    },
    rot = {
      x = 353.671,
      y = 304.964,
      z = 5.137
    },
    level = 1,
    persistent = true,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
  },
  {
    config_id = 13030,
    gadget_id = 70310296,
    pos = {
      x = 89.39,
      y = 96.82,
      z = 978.089
    },
    rot = {
      x = 18.777,
      y = 128.7,
      z = 345.032
    },
    level = 1,
    persistent = true,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
  }
}
regions = {
  {
    config_id = 13002,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 44.679,
      y = 84.59,
      z = 598.078
    }
  }
}
triggers = {
  {
    config_id = 1013001,
    name = "QUEST_FINISH_13001",
    event = EventType.EVENT_QUEST_FINISH,
    source = "4006716",
    condition = "",
    action = "action_EVENT_QUEST_FINISH_13001",
    trigger_count = 0
  },
  {
    config_id = 1013002,
    name = "ENTER_REGION_13002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_13002",
    action = "action_EVENT_ENTER_REGION_13002",
    trigger_count = 0
  },
  {
    config_id = 1013003,
    name = "QUEST_FINISH_13003",
    event = EventType.EVENT_QUEST_FINISH,
    source = "4006710",
    condition = "",
    action = "action_EVENT_QUEST_FINISH_13003",
    trigger_count = 0
  },
  {
    config_id = 1013011,
    name = "GROUP_LOAD_13011",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_13011",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "temp",
    value = 0,
    no_refresh = true
  }
}
init_config = {
  suite = 1,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {
      13006,
      13008,
      13012,
      13014
    },
    regions = {13002},
    triggers = {
      "QUEST_FINISH_13001",
      "ENTER_REGION_13002",
      "QUEST_FINISH_13003",
      "GROUP_LOAD_13011"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {13009},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {13015},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      13004,
      13005,
      13007,
      13013,
      13016,
      13017,
      13018,
      13019,
      13020
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {13029, 13030},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {13010},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function action_EVENT_QUEST_FINISH_13001(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "temp", 4) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220140013, 5)
  return 0
end
function condition_EVENT_ENTER_REGION_13002(context, evt)
  if evt.param1 ~= 13002 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "plat", 220140004) ~= 8 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_13002(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "plat", 9, 220140004) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "temp", 6) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 13006}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 13010}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
function action_EVENT_QUEST_FINISH_13003(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "temp", 3) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220140013, 4)
  return 0
end
function action_EVENT_GROUP_LOAD_13011(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "temp") == 1 then
    ScriptLib.AddExtraGroupSuite(context, 0, 2)
  end
  if ScriptLib.GetGroupVariableValue(context, "temp") == 2 then
    ScriptLib.AddExtraGroupSuite(context, 0, 2)
    ScriptLib.AddExtraGroupSuite(context, 0, 3)
  end
  if ScriptLib.GetGroupVariableValue(context, "temp") == 3 then
    ScriptLib.AddExtraGroupSuite(context, 0, 2)
    ScriptLib.AddExtraGroupSuite(context, 0, 3)
    ScriptLib.AddExtraGroupSuite(context, 0, 4)
  end
  if ScriptLib.GetGroupVariableValue(context, "temp") == 4 then
    ScriptLib.AddExtraGroupSuite(context, 0, 2)
    ScriptLib.AddExtraGroupSuite(context, 0, 3)
    ScriptLib.AddExtraGroupSuite(context, 0, 4)
    ScriptLib.AddExtraGroupSuite(context, 0, 5)
  end
  if ScriptLib.GetGroupVariableValue(context, "temp") == 6 then
    ScriptLib.AddExtraGroupSuite(context, 0, 6)
  end
  return 0
end
