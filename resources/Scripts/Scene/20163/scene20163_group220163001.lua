local base_info = {group_id = 220163001}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 70220103,
    pos = {
      x = 22.04,
      y = 43.451,
      z = 75.707
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1002,
    gadget_id = 70220103,
    pos = {
      x = 6.847,
      y = 50.958,
      z = 87.695
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1005,
    gadget_id = 70220103,
    pos = {
      x = -55.353,
      y = 60.166,
      z = -7.595
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1019,
    gadget_id = 70211101,
    pos = {
      x = -63.334,
      y = 81.01,
      z = -67.229
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    drop_tag = "\232\167\163\232\176\156\228\184\173\231\186\167\233\161\187\229\188\165",
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 1028,
    gadget_id = 70220103,
    pos = {
      x = -35.281,
      y = 85.926,
      z = -53.737
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1029,
    gadget_id = 70900203,
    pos = {
      x = 2.731,
      y = 53.315,
      z = 86.44
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
    config_id = 1027,
    shape = RegionShape.SPHERE,
    radius = 3,
    pos = {
      x = -63.439,
      y = 82.019,
      z = -67.974
    }
  },
  {
    config_id = 1030,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 12.0,
      z = 12.0
    },
    pos = {
      x = 4.371,
      y = 58.939,
      z = 82.749
    }
  },
  {
    config_id = 1031,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 10.0,
      z = 12.0
    },
    pos = {
      x = 25.006,
      y = 40.218,
      z = 66.805
    }
  }
}
triggers = {
  {
    config_id = 1001022,
    name = "VARIABLE_CHANGE_1022",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_1022",
    action = "action_EVENT_VARIABLE_CHANGE_1022"
  },
  {
    config_id = 1001027,
    name = "ENTER_REGION_1027",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_1027",
    action = "action_EVENT_ENTER_REGION_1027"
  },
  {
    config_id = 1001030,
    name = "ENTER_REGION_1030",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_1030",
    action = "action_EVENT_ENTER_REGION_1030",
    trigger_count = 0
  },
  {
    config_id = 1001031,
    name = "ENTER_REGION_1031",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_1031",
    action = "action_EVENT_ENTER_REGION_1031"
  }
}
variables = {
  {
    config_id = 1,
    name = "default",
    value = 0,
    no_refresh = false
  }
}
garbages = {
  gadgets = {
    {
      config_id = 1003,
      gadget_id = 70360002,
      pos = {
        x = 2.684,
        y = 59.51,
        z = 64.053
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1
    },
    {
      config_id = 1004,
      gadget_id = 70211111,
      pos = {
        x = 119.724,
        y = 81.425,
        z = -34.665
      },
      rot = {
        x = 0.0,
        y = 267.903,
        z = 0.0
      },
      level = 1,
      drop_tag = "\232\167\163\232\176\156\228\184\173\231\186\167\233\161\187\229\188\165",
      isOneoff = true,
      persistent = true
    },
    {
      config_id = 1006,
      gadget_id = 70220103,
      pos = {
        x = 34.865,
        y = 16.596,
        z = -64.143
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1
    },
    {
      config_id = 1007,
      gadget_id = 70220103,
      pos = {
        x = 39.26,
        y = 11.887,
        z = -76.758
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1
    },
    {
      config_id = 1008,
      gadget_id = 70360002,
      pos = {
        x = -23.924,
        y = 68.995,
        z = -10.623
      },
      rot = {
        x = 0.0,
        y = 263.132,
        z = 0.0
      },
      level = 1,
      state = GadgetState.GearStart
    },
    {
      config_id = 1010,
      gadget_id = 70220103,
      pos = {
        x = -43.086,
        y = 77.093,
        z = -28.015
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1
    },
    {
      config_id = 1011,
      gadget_id = 70220103,
      pos = {
        x = 74.17,
        y = 77.827,
        z = -84.146
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1
    },
    {
      config_id = 1012,
      gadget_id = 70220103,
      pos = {
        x = 94.908,
        y = 77.678,
        z = -75.538
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1
    },
    {
      config_id = 1013,
      gadget_id = 70220103,
      pos = {
        x = 109.887,
        y = 79.663,
        z = -59.16
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1
    },
    {
      config_id = 1014,
      gadget_id = 70220103,
      pos = {
        x = 63.194,
        y = 82.891,
        z = 3.548
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1
    },
    {
      config_id = 1015,
      gadget_id = 70360002,
      pos = {
        x = 27.005,
        y = 80.968,
        z = 2.921
      },
      rot = {
        x = 0.0,
        y = 89.614,
        z = 0.0
      },
      level = 1,
      state = GadgetState.GearStart
    },
    {
      config_id = 1016,
      gadget_id = 70360002,
      pos = {
        x = 108.575,
        y = 78.145,
        z = -54.448
      },
      rot = {
        x = 0.0,
        y = 90.514,
        z = 0.0
      },
      level = 1
    },
    {
      config_id = 1017,
      gadget_id = 70360002,
      pos = {
        x = 35.145,
        y = 73.643,
        z = -58.792
      },
      rot = {
        x = 0.0,
        y = 149.29,
        z = 0.0
      },
      level = 1,
      state = GadgetState.GearStart
    },
    {
      config_id = 1018,
      gadget_id = 70360002,
      pos = {
        x = -19.97,
        y = 83.53,
        z = -41.018
      },
      rot = {
        x = 0.0,
        y = 273.067,
        z = 0.0
      },
      level = 1,
      state = GadgetState.GearStart
    },
    {
      config_id = 1020,
      gadget_id = 70211112,
      pos = {
        x = 128.354,
        y = 88.908,
        z = -39.812
      },
      rot = {
        x = 0.0,
        y = 88.827,
        z = 0.0
      },
      level = 1,
      drop_tag = "\232\167\163\232\176\156\228\184\173\231\186\167\233\161\187\229\188\165",
      isOneoff = true,
      persistent = true
    },
    {
      config_id = 1021,
      gadget_id = 70360002,
      pos = {
        x = -25.587,
        y = 89.967,
        z = -75.625
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1
    },
    {
      config_id = 1023,
      gadget_id = 70710348,
      pos = {
        x = 2.575,
        y = 47.399,
        z = 85.86
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1
    },
    {
      config_id = 1024,
      gadget_id = 70220103,
      pos = {
        x = 88.671,
        y = 79.693,
        z = -63.854
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1
    },
    {
      config_id = 1025,
      gadget_id = 70220103,
      pos = {
        x = 98.752,
        y = 82.397,
        z = -38.839
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1
    },
    {
      config_id = 1026,
      gadget_id = 70710348,
      pos = {
        x = -49.031,
        y = 57.534,
        z = -10.569
      },
      rot = {
        x = 0.0,
        y = 267.133,
        z = 0.0
      },
      level = 1
    }
  },
  regions = {
    {
      config_id = 1009,
      shape = RegionShape.SPHERE,
      radius = 5,
      pos = {
        x = 62.823,
        y = 10.618,
        z = -83.196
      }
    }
  },
  triggers = {
    {
      config_id = 1001009,
      name = "ENTER_REGION_1009",
      event = EventType.EVENT_ENTER_REGION,
      source = "",
      condition = "condition_EVENT_ENTER_REGION_1009",
      action = "action_EVENT_ENTER_REGION_1009"
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
    gadgets = {1005, 1019},
    regions = {
      1027,
      1030,
      1031
    },
    triggers = {
      "VARIABLE_CHANGE_1022",
      "ENTER_REGION_1027",
      "ENTER_REGION_1030",
      "ENTER_REGION_1031"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_VARIABLE_CHANGE_1022(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "default") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_1022(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 1001}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 1002}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_1027(context, evt)
  if evt.param1 ~= 1027 then
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
function action_EVENT_ENTER_REGION_1027(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 1028}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_1030(context, evt)
  if evt.param1 ~= 1030 then
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
function action_EVENT_ENTER_REGION_1030(context, evt)
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220163001, EntityType.GADGET, 1029) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_1031(context, evt)
  if evt.param1 ~= 1031 then
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
function action_EVENT_ENTER_REGION_1031(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 1029}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  local pos = {
    x = 22.0402,
    y = 43.45054,
    z = 75.70689
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 2,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = 0,
    is_set_follow_pos = false,
    follow_pos = pos_follow,
    is_force_walk = false,
    is_change_play_mode = false,
    is_set_screen_XY = false,
    screen_x = 0,
    screen_y = 0
  }) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_cameraLook_Begin")
    return -1
  end
  return 0
end
