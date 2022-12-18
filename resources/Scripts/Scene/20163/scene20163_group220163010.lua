local base_info = {group_id = 220163010}
local defs = {
  option_turn = 613,
  option_start = 7,
  option_stop = 920,
  play_region = 10021,
  turn_queue = {
    203,
    202,
    201,
    0
  },
  point_array = 4,
  station_region = 10019,
  recover_points = {5, 6},
  carrier_list = {
    10001,
    10004,
    10005,
    10006,
    10010,
    10011,
    10012,
    10013,
    10014,
    10016,
    10017,
    10018
  },
  switcher_control = {
    [10003] = {10002}
  },
  end_point = {12, 13},
  turn_point = {4, 11},
  way_info = {
    [1] = {
      point_list = {
        1,
        2,
        3
      },
      spawn_point = 2,
      gear_id = 10002,
      dir = {
        [0] = 0,
        [201] = 0,
        [202] = 3,
        [203] = 2
      }
    },
    [2] = {
      point_list = {
        14,
        4,
        6,
        11,
        7,
        12
      },
      spawn_point = 0,
      gear_id = 0,
      dir = {
        [0] = 0,
        [201] = 0,
        [202] = 0,
        [203] = 0
      }
    },
    [3] = {
      point_list = {
        14,
        4,
        5,
        8,
        9,
        10,
        13
      },
      spawn_point = 0,
      gear_id = 0,
      dir = {
        [0] = 0,
        [201] = 0,
        [202] = 0,
        [203] = 0
      }
    }
  },
  stop_points = {4},
  leave_points = {9, 11}
}
monsters = {}
npcs = {}
gadgets = {
  [10001] = {
    config_id = 10001,
    gadget_id = 70320028,
    pos = {
      x = -87.322,
      y = 88.771,
      z = -100.187
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [10002] = {
    config_id = 10002,
    gadget_id = 70320027,
    pos = {
      x = -31.853,
      y = 90.038,
      z = -61.14
    },
    rot = {
      x = 0.019,
      y = 180.389,
      z = 359.83
    },
    level = 1
  },
  [10003] = {
    config_id = 10003,
    gadget_id = 70350439,
    pos = {
      x = -33.268,
      y = 83.779,
      z = -53.951
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true,
    worktop_config = {
      init_options = {613}
    },
    server_global_value_config = {SGV_MACHINE_ENERGY_LEVEL = 1}
  },
  [10004] = {
    config_id = 10004,
    gadget_id = 70320028,
    pos = {
      x = -87.322,
      y = 88.771,
      z = -100.187
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true,
    vision_level = VisionLevelType.VISION_LEVEL_REMOTE
  },
  [10005] = {
    config_id = 10005,
    gadget_id = 70320028,
    pos = {
      x = -87.322,
      y = 88.771,
      z = -100.187
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true,
    vision_level = VisionLevelType.VISION_LEVEL_REMOTE
  },
  [10006] = {
    config_id = 10006,
    gadget_id = 70320028,
    pos = {
      x = -87.322,
      y = 88.771,
      z = -100.187
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true,
    vision_level = VisionLevelType.VISION_LEVEL_REMOTE
  },
  [10007] = {
    config_id = 10007,
    gadget_id = 70300118,
    pos = {
      x = -33.26,
      y = 83.804,
      z = -58.2
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [10010] = {
    config_id = 10010,
    gadget_id = 70320028,
    pos = {
      x = -87.322,
      y = 88.771,
      z = -100.187
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true,
    vision_level = VisionLevelType.VISION_LEVEL_REMOTE
  },
  [10011] = {
    config_id = 10011,
    gadget_id = 70320028,
    pos = {
      x = -87.322,
      y = 88.771,
      z = -100.187
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true,
    vision_level = VisionLevelType.VISION_LEVEL_REMOTE
  },
  [10012] = {
    config_id = 10012,
    gadget_id = 70320028,
    pos = {
      x = -87.322,
      y = 88.771,
      z = -100.187
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true,
    vision_level = VisionLevelType.VISION_LEVEL_REMOTE
  },
  [10013] = {
    config_id = 10013,
    gadget_id = 70320028,
    pos = {
      x = -87.322,
      y = 88.771,
      z = -100.187
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true,
    vision_level = VisionLevelType.VISION_LEVEL_REMOTE
  },
  [10014] = {
    config_id = 10014,
    gadget_id = 70320028,
    pos = {
      x = -87.322,
      y = 88.771,
      z = -100.187
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true,
    vision_level = VisionLevelType.VISION_LEVEL_REMOTE
  },
  [10016] = {
    config_id = 10016,
    gadget_id = 70320028,
    pos = {
      x = -87.322,
      y = 88.771,
      z = -100.187
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true,
    vision_level = VisionLevelType.VISION_LEVEL_REMOTE
  },
  [10017] = {
    config_id = 10017,
    gadget_id = 70320028,
    pos = {
      x = -87.322,
      y = 88.771,
      z = -100.187
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true,
    vision_level = VisionLevelType.VISION_LEVEL_REMOTE
  },
  [10018] = {
    config_id = 10018,
    gadget_id = 70320028,
    pos = {
      x = -87.322,
      y = 88.771,
      z = -100.187
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true,
    vision_level = VisionLevelType.VISION_LEVEL_REMOTE
  }
}
regions = {
  [10019] = {
    config_id = 10019,
    shape = RegionShape.SPHERE,
    radius = 4,
    pos = {
      x = -33.308,
      y = 84.522,
      z = -59.91
    }
  },
  [10020] = {
    config_id = 10020,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = -34.455,
      y = 83.743,
      z = -54.574
    }
  },
  [10021] = {
    config_id = 10021,
    shape = RegionShape.SPHERE,
    radius = 100,
    pos = {
      x = -32.239,
      y = 91.104,
      z = -96.334
    }
  }
}
triggers = {
  {
    config_id = 1010009,
    name = "SELECT_OPTION_10009",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_10009",
    action = "action_EVENT_SELECT_OPTION_10009",
    trigger_count = 0
  },
  {
    config_id = 1010020,
    name = "ENTER_REGION_10020",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_10020",
    action = "action_EVENT_ENTER_REGION_10020"
  },
  {
    config_id = 1010021,
    name = "ENTER_REGION_10021",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "",
    action = ""
  }
}
variables = {}
garbages = {
  gadgets = {
    {
      config_id = 10015,
      gadget_id = 70360002,
      pos = {
        x = -32.639,
        y = 92.647,
        z = -50.49
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1,
      worktop_config = {
        init_options = {7, 613}
      }
    }
  },
  triggers = {
    {
      config_id = 1010008,
      name = "GADGET_CREATE_10008",
      event = EventType.EVENT_GADGET_CREATE,
      source = "",
      condition = "condition_EVENT_GADGET_CREATE_10008",
      action = "action_EVENT_GADGET_CREATE_10008",
      trigger_count = 0
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
      10001,
      10002,
      10003,
      10007
    },
    regions = {
      10019,
      10020,
      10021
    },
    triggers = {
      "SELECT_OPTION_10009",
      "ENTER_REGION_10020",
      "ENTER_REGION_10021"
    },
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_10009(context, evt)
  if 10003 ~= evt.param1 then
    return false
  end
  if 613 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_10009(context, evt)
  local pos = {
    x = -31.85361,
    y = 90.16656,
    z = -61.13972
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
function condition_EVENT_ENTER_REGION_10020(context, evt)
  if evt.param1 ~= 10020 then
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
function action_EVENT_ENTER_REGION_10020(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 10003, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
require("V3_2/MachineCarrier")
