local base_info = {group_id = 250067002}
local defs = {
  option_turn = 613,
  option_startstop = 7,
  point_array = 1,
  carrier_list = {2001},
  switcher_control = {
    [2015] = {2002, 2013},
    [2016] = {2004, 2010}
  },
  way_info = {
    [1] = {
      point_list = {18, 1},
      spawn_point = 0,
      gear_id = 2004,
      dir = {
        [0] = 0,
        [201] = 0,
        [202] = 0,
        [203] = 4
      }
    },
    [3] = {
      point_list = {
        12,
        16,
        17
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
    [4] = {
      point_list = {
        2,
        15,
        14,
        13
      },
      spawn_point = 0,
      gear_id = 2002,
      dir = {
        [0] = 5,
        [201] = 3,
        [202] = 0,
        [203] = 0
      }
    },
    [5] = {
      point_list = {
        12,
        11,
        10
      },
      spawn_point = 0,
      gear_id = 2013,
      dir = {
        [0] = 6,
        [201] = 0,
        [202] = 0,
        [203] = 0
      }
    },
    [6] = {
      point_list = {
        9,
        8,
        7,
        6
      },
      spawn_point = 0,
      gear_id = 2010,
      dir = {
        [0] = 7,
        [201] = 0,
        [202] = 0,
        [203] = 0
      }
    },
    [7] = {
      point_list = {
        5,
        4,
        3
      },
      spawn_point = 0,
      gear_id = 2004,
      dir = {
        [0] = 4,
        [201] = 0,
        [202] = 0,
        [203] = 0
      }
    }
  },
  stop_points = {7, 14}
}
monsters = {}
npcs = {}
gadgets = {
  [2001] = {
    config_id = 2001,
    gadget_id = 70320028,
    pos = {
      x = -63.705,
      y = 4.107,
      z = -33.472
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [2002] = {
    config_id = 2002,
    gadget_id = 70320027,
    pos = {
      x = -47.291,
      y = 0.494,
      z = -22.006
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [2003] = {
    config_id = 2003,
    gadget_id = 70310313,
    pos = {
      x = -47.18,
      y = 0.5,
      z = -28.497
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2004] = {
    config_id = 2004,
    gadget_id = 70320027,
    pos = {
      x = -47.238,
      y = 0.499,
      z = -33.816
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [2005] = {
    config_id = 2005,
    gadget_id = 70320027,
    pos = {
      x = -54.898,
      y = 0.499,
      z = -22.037
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [2006] = {
    config_id = 2006,
    gadget_id = 70310313,
    pos = {
      x = -54.981,
      y = 0.5,
      z = -18.285
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2007] = {
    config_id = 2007,
    gadget_id = 70310313,
    pos = {
      x = -51.048,
      y = 0.5,
      z = -21.999
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  [2008] = {
    config_id = 2008,
    gadget_id = 70310313,
    pos = {
      x = -50.997,
      y = 0.5,
      z = -33.904
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  [2009] = {
    config_id = 2009,
    gadget_id = 70310313,
    pos = {
      x = -31.909,
      y = 0.5,
      z = -30.055
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2010] = {
    config_id = 2010,
    gadget_id = 70320027,
    pos = {
      x = -31.959,
      y = 0.499,
      z = -33.816
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [2011] = {
    config_id = 2011,
    gadget_id = 70310313,
    pos = {
      x = -39.566,
      y = 0.5,
      z = -22.036
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  [2012] = {
    config_id = 2012,
    gadget_id = 70310313,
    pos = {
      x = -35.718,
      y = 0.5,
      z = -33.904
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  [2013] = {
    config_id = 2013,
    gadget_id = 70320027,
    pos = {
      x = -32.027,
      y = 0.494,
      z = -22.014
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2014] = {
    config_id = 2014,
    gadget_id = 70310313,
    pos = {
      x = -42.51,
      y = 0.5,
      z = -33.904
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  [2015] = {
    config_id = 2015,
    gadget_id = 70360002,
    pos = {
      x = -39.466,
      y = 0.5,
      z = -25.505
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
  },
  [2016] = {
    config_id = 2016,
    gadget_id = 70360002,
    pos = {
      x = -39.451,
      y = 0.5,
      z = -30.795
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {613, 7}
    }
  },
  [2019] = {
    config_id = 2019,
    gadget_id = 70310001,
    pos = {
      x = -25.391,
      y = 0.5,
      z = -16.167
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1002017,
    name = "PLATFORM_ARRIVAL_2017",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_2017",
    action = "action_EVENT_PLATFORM_ARRIVAL_2017",
    trigger_count = 0
  },
  {
    config_id = 1002018,
    name = "GADGET_CREATE_2018",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_2018",
    action = "action_EVENT_GADGET_CREATE_2018",
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
    gadgets = {
      2001,
      2002,
      2003,
      2004,
      2005,
      2006,
      2007,
      2008,
      2009,
      2010,
      2011,
      2012,
      2013,
      2014,
      2015,
      2016,
      2019
    },
    regions = {},
    triggers = {
      "PLATFORM_ARRIVAL_2017",
      "GADGET_CREATE_2018"
    },
    rand_weight = 100
  }
}
function condition_EVENT_PLATFORM_ARRIVAL_2017(context, evt)
  if 2001 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  if 17 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_2017(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 2001}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 2001}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_2018(context, evt)
  if 2001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_2018(context, evt)
  if 0 ~= ScriptLib.StartPlatform(context, 2001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  return 0
end
require("V3_2/MachineCarrier")
