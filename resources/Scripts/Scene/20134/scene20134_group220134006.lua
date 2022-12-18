local base_info = {group_id = 220134006}
local defs = {
  patterns = {
    [1] = {
      [6001] = 6002,
      [6002] = 6003,
      [6003] = 6004,
      [6004] = 0
    },
    [2] = {
      [6001] = 6002,
      [6002] = 6003,
      [6003] = 6004,
      [6004] = 0,
      [6005] = 6006,
      [6006] = 6007,
      [6007] = 6008,
      [6008] = 0
    }
  }
}
monsters = {}
npcs = {}
gadgets = {
  [6001] = {
    config_id = 6001,
    gadget_id = 70310179,
    pos = {
      x = 669.706,
      y = 621.212,
      z = -1587.628
    },
    rot = {
      x = 0.0,
      y = 30.497,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [6002] = {
    config_id = 6002,
    gadget_id = 70310179,
    pos = {
      x = 671.528,
      y = 623.421,
      z = -1588.525
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [6003] = {
    config_id = 6003,
    gadget_id = 70310179,
    pos = {
      x = 668.786,
      y = 625.232,
      z = -1586.742
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [6004] = {
    config_id = 6004,
    gadget_id = 70310179,
    pos = {
      x = 665.38,
      y = 621.161,
      z = -1584.298
    },
    rot = {
      x = 0.0,
      y = 29.689,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [6005] = {
    config_id = 6005,
    gadget_id = 70310179,
    pos = {
      x = 670.651,
      y = 619.67,
      z = -1586.213
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [6006] = {
    config_id = 6006,
    gadget_id = 70310179,
    pos = {
      x = 674.138,
      y = 619.67,
      z = -1584.25
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [6007] = {
    config_id = 6007,
    gadget_id = 70310179,
    pos = {
      x = 671.626,
      y = 619.67,
      z = -1581.71
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [6008] = {
    config_id = 6008,
    gadget_id = 70310179,
    pos = {
      x = 666.171,
      y = 619.67,
      z = -1583.399
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  [6010] = {
    config_id = 6010,
    gadget_id = 70380306,
    pos = {
      x = 681.599,
      y = 619.244,
      z = -1566.939
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  [6012] = {
    config_id = 6012,
    gadget_id = 70380012,
    pos = {
      x = 644.44,
      y = 618.15,
      z = -1602.053
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true,
    is_use_point_array = true
  },
  [6013] = {
    config_id = 6013,
    gadget_id = 70310374,
    pos = {
      x = 704.56,
      y = 627.261,
      z = -1558.99
    },
    rot = {
      x = 28.18,
      y = 136.295,
      z = 171.17
    },
    level = 1,
    persistent = true
  },
  [6016] = {
    config_id = 6016,
    gadget_id = 70220010,
    pos = {
      x = 682.495,
      y = 619.858,
      z = -1556.737
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    isOneoff = true,
    persistent = true
  }
}
regions = {
  [6014] = {
    config_id = 6014,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 705.863,
      y = 620.007,
      z = -1556.037
    }
  }
}
triggers = {
  {
    config_id = 1006011,
    name = "ANY_GADGET_DIE_6011",
    event = EventType.EVENT_ANY_GADGET_DIE,
    source = "",
    condition = "condition_EVENT_ANY_GADGET_DIE_6011",
    action = "action_EVENT_ANY_GADGET_DIE_6011",
    trigger_count = 0
  },
  {
    config_id = 1006014,
    name = "ENTER_REGION_6014",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_6014",
    action = "action_EVENT_ENTER_REGION_6014",
    trigger_count = 0
  },
  {
    config_id = 1006015,
    name = "GROUP_LOAD_6015",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_6015",
    action = "action_EVENT_GROUP_LOAD_6015",
    trigger_count = 0
  },
  {
    config_id = 1006017,
    name = "GROUP_LOAD_6017",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_6017",
    action = "action_EVENT_GROUP_LOAD_6017",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "water",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 2,
    name = "kill",
    value = 0,
    no_refresh = true
  }
}
garbages = {
  gadgets = {
    {
      config_id = 6009,
      gadget_id = 70220038,
      pos = {
        x = 663.93,
        y = 618.941,
        z = -1598.686
      },
      rot = {
        x = 0.0,
        y = 139.462,
        z = 0.0
      },
      level = 1,
      isOneoff = true,
      persistent = true
    }
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
      6001,
      6002,
      6003,
      6004,
      6012,
      6013,
      6016
    },
    regions = {},
    triggers = {
      "ANY_GADGET_DIE_6011",
      "GROUP_LOAD_6015",
      "GROUP_LOAD_6017"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      6001,
      6002,
      6003,
      6004,
      6005,
      6006,
      6007,
      6008,
      6010,
      6012,
      6013
    },
    regions = {6014},
    triggers = {
      "ANY_GADGET_DIE_6011",
      "ENTER_REGION_6014",
      "GROUP_LOAD_6015"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ANY_GADGET_DIE_6011(context, evt)
  if 6016 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_GADGET_DIE_6011(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "pattern", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "water", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 6013, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220134006, 2)
  return 0
end
function condition_EVENT_ENTER_REGION_6014(context, evt)
  if evt.param1 ~= 6014 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220134006, 6013) then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_6014(context, evt)
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220134006, EntityType.GADGET, 6013) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_6015(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "water") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_6015(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220134006, 2)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 6013, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_6017(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "kill") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_6017(context, evt)
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220134006, EntityType.GADGET, 6012) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
require("V2_8/ConstellationPattern")
