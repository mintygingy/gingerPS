local base_info = {group_id = 251008010}
local defs = {
  play_region = 10001,
  air_wall = {10005},
  rule = {
    [1] = {
      [0] = {
        toStart = {1}
      },
      [3] = {
        toStart = {2}
      }
    },
    [2] = {
      [0] = {
        toStart = {3, 4}
      },
      [4] = {
        toStart = {5, 6},
        toStop = {3, 4}
      }
    },
    [3] = {
      [0] = {
        toStart = {3, 4}
      },
      [6] = {
        toStart = {5, 6},
        toStop = {3, 4}
      }
    },
    [4] = {
      [0] = {
        toStart = {3, 4}
      },
      [6] = {
        toStart = {5, 6},
        toStop = {3, 4}
      }
    }
  },
  tide = {
    [1] = {10002, 10009},
    [2] = {10003, 10010},
    [3] = {10004, 10011},
    [4] = {10006, 10012},
    [5] = {10007, 10013},
    [6] = {10008, 10014}
  }
}
monsters = {
  [10002] = {
    config_id = 10002,
    monster_id = 24010101,
    pos = {
      x = 403.761,
      y = -1.109,
      z = 407.603
    },
    rot = {
      x = 0.0,
      y = 211.44,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4184},
    pose_id = 100
  },
  [10003] = {
    config_id = 10003,
    monster_id = 24010101,
    pos = {
      x = 395.47,
      y = -1.109,
      z = 407.796
    },
    rot = {
      x = 0.0,
      y = 133.49,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4184},
    pose_id = 100
  },
  [10004] = {
    config_id = 10004,
    monster_id = 24010101,
    pos = {
      x = 411.496,
      y = -1.11,
      z = 402.732
    },
    rot = {
      x = 0.0,
      y = 233.703,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4184},
    pose_id = 100
  },
  [10006] = {
    config_id = 10006,
    monster_id = 24010101,
    pos = {
      x = 388.852,
      y = -1.096,
      z = 402.904
    },
    rot = {
      x = 0.0,
      y = 111.42,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4184},
    pose_id = 100
  },
  [10007] = {
    config_id = 10007,
    monster_id = 24010301,
    pos = {
      x = 411.496,
      y = -1.11,
      z = 406.423
    },
    rot = {
      x = 0.0,
      y = 244.53,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4184},
    pose_id = 100
  },
  [10008] = {
    config_id = 10008,
    monster_id = 24010301,
    pos = {
      x = 388.852,
      y = -1.11,
      z = 406.594
    },
    rot = {
      x = 0.0,
      y = 85.761,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4184},
    pose_id = 100
  },
  [10009] = {
    config_id = 10009,
    monster_id = 24010101,
    pos = {
      x = 403.1,
      y = -1.103,
      z = 401.727
    },
    rot = {
      x = 0.0,
      y = 211.44,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4184},
    pose_id = 100
  },
  [10010] = {
    config_id = 10010,
    monster_id = 24010101,
    pos = {
      x = 396.094,
      y = -1.111,
      z = 402.19
    },
    rot = {
      x = 0.0,
      y = 133.49,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4184},
    pose_id = 100
  },
  [10011] = {
    config_id = 10011,
    monster_id = 24010101,
    pos = {
      x = 411.496,
      y = -1.111,
      z = 395.735
    },
    rot = {
      x = 0.0,
      y = 233.703,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4184},
    pose_id = 100
  },
  [10012] = {
    config_id = 10012,
    monster_id = 24010101,
    pos = {
      x = 388.854,
      y = -1.089,
      z = 395.905
    },
    rot = {
      x = 0.0,
      y = 111.42,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4184},
    pose_id = 100
  },
  [10013] = {
    config_id = 10013,
    monster_id = 24010301,
    pos = {
      x = 411.496,
      y = -1.11,
      z = 399.367
    },
    rot = {
      x = 0.0,
      y = 244.53,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4184},
    pose_id = 100
  },
  [10014] = {
    config_id = 10014,
    monster_id = 24010301,
    pos = {
      x = 388.855,
      y = -1.09,
      z = 399.537
    },
    rot = {
      x = 0.0,
      y = 85.761,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4184},
    pose_id = 100
  }
}
npcs = {}
gadgets = {
  [10005] = {
    config_id = 10005,
    gadget_id = 70380323,
    pos = {
      x = 400.0,
      y = -1.079,
      z = 400.0
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
  [10001] = {
    config_id = 10001,
    shape = RegionShape.CUBIC,
    size = {
      x = 70.0,
      y = 40.0,
      z = 70.0
    },
    pos = {
      x = 400.0,
      y = -1.079,
      z = 400.0
    }
  }
}
triggers = {
  {
    config_id = 1010001,
    name = "ENTER_REGION_10001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "",
    action = ""
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
    gadgets = {},
    regions = {10001},
    triggers = {
      "ENTER_REGION_10001"
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
require("V3_2/CharAmuse_Retrans")
require("V3_2/CharAmuse_BattleTide")
require("MonsterQuickDeath")
