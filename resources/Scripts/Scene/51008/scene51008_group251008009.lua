local base_info = {group_id = 251008009}
local defs = {
  play_region = 9001,
  air_wall = {9011},
  rule = {
    [1] = {
      [0] = {
        toStart = {
          1,
          2,
          4
        }
      },
      [4] = {
        toStart = {
          3,
          5,
          6
        },
        toStop = 0
      }
    },
    [2] = {
      [0] = {
        toStart = {
          7,
          8,
          9,
          10,
          11,
          12
        }
      },
      [8] = {
        toStart = {13, 14},
        toStop = 0
      }
    },
    [3] = {
      [0] = {
        toStart = {
          7,
          8,
          9,
          10,
          11,
          12
        }
      },
      [10] = {
        toStart = {13, 14},
        toStop = 0
      }
    },
    [4] = {
      [0] = {
        toStart = {
          7,
          8,
          9,
          10,
          11,
          12
        }
      },
      [12] = {
        toStart = {13, 14},
        toStop = 0
      }
    }
  },
  tide = {
    [1] = {9002, 9017},
    [2] = {9003, 9018},
    [3] = {9004, 9019},
    [4] = {9005, 9020},
    [5] = {9006, 9021},
    [6] = {9007, 9022},
    [7] = {9008, 9023},
    [8] = {9009, 9024},
    [9] = {9010, 9025},
    [10] = {9012, 9026},
    [11] = {9013, 9027},
    [12] = {9014, 9028},
    [13] = {9015, 9029},
    [14] = {9016, 9030}
  }
}
monsters = {
  [9002] = {
    config_id = 9002,
    monster_id = 21010101,
    pos = {
      x = 400.0,
      y = -1.11,
      z = 407.122
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9003] = {
    config_id = 9003,
    monster_id = 21010401,
    pos = {
      x = 402.559,
      y = -1.11,
      z = 409.118
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9004] = {
    config_id = 9004,
    monster_id = 21010101,
    pos = {
      x = 406.744,
      y = -1.077,
      z = 401.917
    },
    rot = {
      x = 0.0,
      y = 268.215,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9005] = {
    config_id = 9005,
    monster_id = 21010101,
    pos = {
      x = 397.848,
      y = -1.095,
      z = 409.222
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9006] = {
    config_id = 9006,
    monster_id = 21020201,
    pos = {
      x = 403.157,
      y = -1.109,
      z = 403.388
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9007] = {
    config_id = 9007,
    monster_id = 21010401,
    pos = {
      x = 405.654,
      y = -1.11,
      z = 405.43
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9008] = {
    config_id = 9008,
    monster_id = 21010401,
    pos = {
      x = 389.313,
      y = -1.11,
      z = 403.95
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9009] = {
    config_id = 9009,
    monster_id = 21010101,
    pos = {
      x = 391.66,
      y = -1.104,
      z = 400.977
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9010] = {
    config_id = 9010,
    monster_id = 21010401,
    pos = {
      x = 389.0,
      y = -1.108,
      z = 398.164
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9012] = {
    config_id = 9012,
    monster_id = 21010401,
    pos = {
      x = 411.571,
      y = -1.109,
      z = 403.112
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9013] = {
    config_id = 9013,
    monster_id = 21010101,
    pos = {
      x = 408.98,
      y = -1.11,
      z = 400.3
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9014] = {
    config_id = 9014,
    monster_id = 21010401,
    pos = {
      x = 411.475,
      y = -1.109,
      z = 396.707
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9015] = {
    config_id = 9015,
    monster_id = 21020201,
    pos = {
      x = 387.676,
      y = -1.109,
      z = 400.157
    },
    rot = {
      x = 0.0,
      y = 91.881,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9016] = {
    config_id = 9016,
    monster_id = 21020201,
    pos = {
      x = 413.128,
      y = -1.111,
      z = 400.381
    },
    rot = {
      x = 0.0,
      y = 269.1,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9017] = {
    config_id = 9017,
    monster_id = 21010101,
    pos = {
      x = 400.0,
      y = -1.11,
      z = 405.493
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9018] = {
    config_id = 9018,
    monster_id = 21010401,
    pos = {
      x = 402.559,
      y = -1.11,
      z = 407.489
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9019] = {
    config_id = 9019,
    monster_id = 21010101,
    pos = {
      x = 406.318,
      y = -1.089,
      z = 402.155
    },
    rot = {
      x = 0.0,
      y = 268.215,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9020] = {
    config_id = 9020,
    monster_id = 21010101,
    pos = {
      x = 397.848,
      y = -1.11,
      z = 407.593
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9021] = {
    config_id = 9021,
    monster_id = 21020201,
    pos = {
      x = 404.067,
      y = -1.083,
      z = 402.186
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9022] = {
    config_id = 9022,
    monster_id = 21010401,
    pos = {
      x = 406.564,
      y = -1.111,
      z = 404.228
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9023] = {
    config_id = 9023,
    monster_id = 21010401,
    pos = {
      x = 389.313,
      y = -1.084,
      z = 401.193
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9024] = {
    config_id = 9024,
    monster_id = 21010101,
    pos = {
      x = 391.665,
      y = -1.11,
      z = 398.218
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9025] = {
    config_id = 9025,
    monster_id = 21010401,
    pos = {
      x = 389.001,
      y = -1.096,
      z = 395.406
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9026] = {
    config_id = 9026,
    monster_id = 21010401,
    pos = {
      x = 411.571,
      y = -1.11,
      z = 406.644
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9027] = {
    config_id = 9027,
    monster_id = 21010101,
    pos = {
      x = 408.98,
      y = -1.111,
      z = 403.833
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9028] = {
    config_id = 9028,
    monster_id = 21010401,
    pos = {
      x = 411.475,
      y = -1.11,
      z = 400.24
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9029] = {
    config_id = 9029,
    monster_id = 21020201,
    pos = {
      x = 387.595,
      y = -1.11,
      z = 397.662
    },
    rot = {
      x = 0.0,
      y = 91.881,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  },
  [9030] = {
    config_id = 9030,
    monster_id = 21020201,
    pos = {
      x = 413.128,
      y = -1.094,
      z = 403.914
    },
    rot = {
      x = 0.0,
      y = 269.1,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {4183}
  }
}
npcs = {}
gadgets = {
  [9011] = {
    config_id = 9011,
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
  [9001] = {
    config_id = 9001,
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
    config_id = 1009001,
    name = "ENTER_REGION_9001",
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
    regions = {9001},
    triggers = {
      "ENTER_REGION_9001"
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
