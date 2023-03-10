local base_info = {group_id = 220136006}
local defs = {
  patterns = {
    [1] = {
      [6001] = 6002,
      [6002] = 6003,
      [6003] = 6004,
      [6004] = 6005,
      [6005] = 6025,
      [6006] = 6005,
      [6007] = 6008,
      [6008] = 6026,
      [6009] = 6027,
      [6010] = 6031,
      [6011] = 6012,
      [6012] = 6013,
      [6013] = 6027,
      [6014] = 6011,
      [6015] = 6014,
      [6016] = 6015,
      [6017] = 6015,
      [6018] = 6017,
      [6019] = 6018,
      [6020] = 6019,
      [6021] = 6020,
      [6022] = 6021,
      [6023] = 6022,
      [6024] = 6008,
      [6025] = 6005,
      [6025] = 6005,
      [6026] = 0,
      [6027] = 6013,
      [6028] = 6027,
      [6029] = 6028,
      [6030] = 6029,
      [6031] = 6030
    },
    [2] = {
      [35001] = 35003,
      [35002] = 35004,
      [35003] = 35004,
      [35004] = 35006,
      [35005] = 35001,
      [35006] = 35001
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
      x = 773.586,
      y = 14.036,
      z = 759.38
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6002] = {
    config_id = 6002,
    gadget_id = 70310179,
    pos = {
      x = 773.507,
      y = 24.296,
      z = 751.43
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6003] = {
    config_id = 6003,
    gadget_id = 70310179,
    pos = {
      x = 765.08,
      y = 24.352,
      z = 751.386
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6004] = {
    config_id = 6004,
    gadget_id = 70310179,
    pos = {
      x = 764.821,
      y = 34.298,
      z = 743.68
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6005] = {
    config_id = 6005,
    gadget_id = 70310179,
    pos = {
      x = 769.372,
      y = 34.213,
      z = 743.746
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6006] = {
    config_id = 6006,
    gadget_id = 70310179,
    pos = {
      x = 769.453,
      y = 44.002,
      z = 736.163
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6007] = {
    config_id = 6007,
    gadget_id = 70310179,
    pos = {
      x = 765.129,
      y = 27.933,
      z = 748.613
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6008] = {
    config_id = 6008,
    gadget_id = 70310179,
    pos = {
      x = 773.546,
      y = 28.207,
      z = 748.4
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6009] = {
    config_id = 6009,
    gadget_id = 70310179,
    pos = {
      x = 787.339,
      y = 27.933,
      z = 748.613
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6010] = {
    config_id = 6010,
    gadget_id = 70310179,
    pos = {
      x = 773.511,
      y = 37.783,
      z = 740.981
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6011] = {
    config_id = 6011,
    gadget_id = 70310179,
    pos = {
      x = 778.736,
      y = 20.17,
      z = 754.627
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6012] = {
    config_id = 6012,
    gadget_id = 70310179,
    pos = {
      x = 778.736,
      y = 23.933,
      z = 751.712
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6013] = {
    config_id = 6013,
    gadget_id = 70310179,
    pos = {
      x = 782.652,
      y = 23.933,
      z = 751.712
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6014] = {
    config_id = 6014,
    gadget_id = 70310179,
    pos = {
      x = 791.823,
      y = 20.17,
      z = 754.627
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6015] = {
    config_id = 6015,
    gadget_id = 70310179,
    pos = {
      x = 791.823,
      y = 23.899,
      z = 751.737
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6016] = {
    config_id = 6016,
    gadget_id = 70310179,
    pos = {
      x = 787.495,
      y = 23.899,
      z = 751.737
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6017] = {
    config_id = 6017,
    gadget_id = 70310179,
    pos = {
      x = 791.823,
      y = 31.069,
      z = 746.183
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6018] = {
    config_id = 6018,
    gadget_id = 70310179,
    pos = {
      x = 799.341,
      y = 31.069,
      z = 746.183
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6019] = {
    config_id = 6019,
    gadget_id = 70310179,
    pos = {
      x = 799.341,
      y = 34.371,
      z = 743.624
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6020] = {
    config_id = 6020,
    gadget_id = 70310179,
    pos = {
      x = 782.76,
      y = 34.656,
      z = 743.403
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6021] = {
    config_id = 6021,
    gadget_id = 70310179,
    pos = {
      x = 782.782,
      y = 40.923,
      z = 738.548
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6022] = {
    config_id = 6022,
    gadget_id = 70310179,
    pos = {
      x = 773.718,
      y = 40.923,
      z = 738.548
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6023] = {
    config_id = 6023,
    gadget_id = 70310179,
    pos = {
      x = 773.718,
      y = 44.41,
      z = 735.845
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6024] = {
    config_id = 6024,
    gadget_id = 70310179,
    pos = {
      x = 773.718,
      y = 31.482,
      z = 745.862
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6025] = {
    config_id = 6025,
    gadget_id = 70310179,
    pos = {
      x = 769.372,
      y = 31.547,
      z = 745.812
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6026] = {
    config_id = 6026,
    gadget_id = 70310179,
    pos = {
      x = 778.683,
      y = 28.207,
      z = 748.4
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6027] = {
    config_id = 6027,
    gadget_id = 70310179,
    pos = {
      x = 782.616,
      y = 28.207,
      z = 748.4
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6028] = {
    config_id = 6028,
    gadget_id = 70310179,
    pos = {
      x = 782.616,
      y = 31.608,
      z = 745.765
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6029] = {
    config_id = 6029,
    gadget_id = 70310179,
    pos = {
      x = 778.482,
      y = 31.608,
      z = 745.765
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6030] = {
    config_id = 6030,
    gadget_id = 70310179,
    pos = {
      x = 778.366,
      y = 34.752,
      z = 743.329
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  },
  [6031] = {
    config_id = 6031,
    gadget_id = 70310179,
    pos = {
      x = 773.603,
      y = 34.752,
      z = 743.329
    },
    rot = {
      x = 307.768,
      y = 180.0,
      z = 180.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1006032,
    name = "GROUP_LOAD_6032",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_6032",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "finish",
    value = 0,
    no_refresh = true
  }
}
init_config = {
  suite = 2,
  end_suite = 3,
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
      6005,
      6006,
      6007,
      6008,
      6009,
      6010,
      6011,
      6012,
      6013,
      6014,
      6015,
      6016,
      6017,
      6018,
      6019,
      6020,
      6021,
      6022,
      6023,
      6024,
      6025,
      6026,
      6027,
      6028,
      6029,
      6030,
      6031
    },
    regions = {},
    triggers = {
      "GROUP_LOAD_6032"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {
      "GROUP_LOAD_6032"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {
      "GROUP_LOAD_6032"
    },
    rand_weight = 100
  }
}
function action_EVENT_GROUP_LOAD_6032(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220136006, suite = 3}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
require("V2_8/ConstellationPattern")
