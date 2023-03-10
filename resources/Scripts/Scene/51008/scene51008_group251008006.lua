local base_info = {group_id = 251008006}
local defs = {
  play_region = 6010,
  enter_suites = {
    5,
    4,
    3,
    2
  },
  play_suites = {},
  limit_time = 300,
  target = 100,
  diff_from = 0,
  high_from = 3,
  high_reminder = 470310103,
  multi_shoot = {
    [21] = {
      {x = -2, z = 0},
      {x = -3, z = 0},
      {x = -4, z = 0}
    },
    [22] = {
      {x = 2, z = 0},
      {x = 3, z = 0},
      {x = 4, z = 0}
    },
    [23] = {
      {x = 2, z = -2},
      {x = 1, z = -1},
      {x = 0, z = 0},
      {x = -1, z = -1},
      {x = -2, z = -2}
    },
    [24] = {
      {x = -4, z = 2},
      {x = -2.8, z = 0.8},
      {x = -2.1, z = -0.2},
      {x = -1, z = -2}
    },
    [25] = {
      {x = 4, z = 2},
      {x = 2.8, z = 0.8},
      {x = 2.1, z = -0.2},
      {x = 1, z = -2}
    },
    [26] = {
      {x = -3, z = -1.7},
      {x = -1.8, z = 0},
      {x = -0.6, z = 1.7},
      {x = 3, z = -1.7},
      {x = 1.8, z = 0},
      {x = 0.6, z = 1.7}
    },
    [27] = {
      {x = -2, z = 2},
      {x = -3, z = 0.7},
      {x = -3, z = -0.7},
      {x = -2, z = -2},
      {x = 2, z = 2},
      {x = 3, z = 0.7},
      {x = 3, z = -0.7},
      {x = 2, z = -2}
    },
    [28] = {
      {x = -2, z = 0},
      {x = -3, z = 0},
      {x = -4, z = 0},
      {x = -4.5, z = -2},
      {x = -4.5, z = -4}
    },
    [29] = {
      {x = 2, z = 0},
      {x = 3, z = 0},
      {x = 4, z = 0},
      {x = 4.5, z = -2},
      {x = 4.5, z = -4}
    }
  },
  order_yunjin = {
    "new_easy2_yunjin",
    "new_normal1_yunjin",
    "new_hard1_yunjin",
    "new_hard2_yunjin",
    "new_hard1_yunjin",
    "new_hard2_yunjin",
    "new_normal2_yunjin",
    "new_hard1_yunjin",
    "new_hard2_yunjin",
    "new_hard1_yunjin",
    "new_hard2_yunjin",
    "new_normal2_yunjin",
    "new_hard1_yunjin",
    "new_hard2_yunjin",
    "new_hard1_yunjin",
    "new_hard2_yunjin",
    "new_normal2_yunjin",
    "new_hard2_yunjin"
  },
  order = {
    "new_easy2",
    "new_normal1",
    "new_hard1",
    "new_hard2",
    "new_hard1",
    "new_hard2",
    "new_normal2",
    "new_hard1",
    "new_hard2",
    "new_hard1",
    "new_hard2",
    "new_normal2",
    "new_hard1",
    "new_hard2",
    "new_hard1",
    "new_hard2",
    "new_normal2",
    "new_hard2"
  },
  seq = {
    new_easy1 = {
      {
        {
          1,
          10,
          8,
          8,
          10,
          7
        },
        {
          3.2,
          2,
          2,
          2,
          2.4,
          5
        }
      },
      {
        {
          1,
          8,
          10,
          8,
          10,
          7
        },
        {
          3.2,
          2,
          2,
          2,
          2.4,
          5
        }
      }
    },
    new_easy2 = {
      {
        {
          1,
          10,
          8,
          10,
          1,
          10,
          8,
          1,
          7
        },
        {
          3.5,
          2,
          2,
          1.4,
          1.3,
          2,
          1.6,
          1.2,
          5
        }
      },
      {
        {
          1,
          8,
          10,
          8,
          1,
          10,
          8,
          1,
          7
        },
        {
          3.5,
          2,
          2,
          1.4,
          1.3,
          2,
          1.6,
          1.2,
          5
        }
      }
    },
    new_easy2_yunjin = {
      {
        {
          1,
          10,
          8,
          10,
          1,
          10,
          8,
          1,
          7
        },
        {
          3.8,
          2.3,
          2.3,
          1.8,
          1.3,
          2.3,
          1.8,
          1.2,
          5
        }
      },
      {
        {
          1,
          8,
          10,
          8,
          1,
          10,
          8,
          1,
          7
        },
        {
          3.8,
          2.3,
          2.3,
          1.8,
          1.3,
          2.3,
          1.8,
          1.2,
          5
        }
      }
    },
    new_normal1 = {
      {
        {
          21,
          22,
          22,
          21,
          10,
          3,
          22,
          8,
          3,
          7
        },
        {
          2.2,
          2.2,
          2.2,
          1.2,
          1,
          1.8,
          1.2,
          1,
          1.2,
          5
        }
      },
      {
        {
          22,
          21,
          21,
          22,
          8,
          3,
          21,
          10,
          3,
          7
        },
        {
          2.2,
          2.2,
          2.2,
          1.2,
          1,
          1.8,
          1.2,
          1,
          1.2,
          5
        }
      }
    },
    new_normal1_yunjin = {
      {
        {
          21,
          22,
          22,
          21,
          10,
          3,
          22,
          8,
          3,
          7
        },
        {
          2.5,
          2.5,
          2.5,
          1.2,
          1.3,
          2.1,
          1.2,
          1.3,
          1.2,
          5
        }
      },
      {
        {
          22,
          21,
          21,
          22,
          8,
          3,
          21,
          10,
          3,
          7
        },
        {
          2.5,
          2.5,
          2.5,
          1.2,
          1.3,
          2.1,
          1.2,
          1.3,
          1.2,
          5
        }
      }
    },
    new_normal2 = {
      {
        {
          24,
          25,
          26,
          25,
          24,
          3,
          22,
          8,
          21,
          10,
          3,
          7
        },
        {
          2.2,
          2.2,
          2,
          2,
          2,
          2,
          1.2,
          1.6,
          1.2,
          1.4,
          1.2,
          5
        }
      },
      {
        {
          25,
          24,
          26,
          25,
          24,
          3,
          21,
          10,
          22,
          8,
          3,
          7
        },
        {
          2.2,
          2.2,
          2,
          2,
          2,
          2,
          1.2,
          1.6,
          1.2,
          1.4,
          1.2,
          5
        }
      }
    },
    new_normal2_yunjin = {
      {
        {
          24,
          25,
          26,
          25,
          24,
          3,
          22,
          8,
          21,
          10,
          3,
          7
        },
        {
          2.5,
          2.5,
          2.3,
          2.3,
          2.3,
          2.3,
          1.2,
          1.9,
          1.2,
          1.7,
          1.2,
          5
        }
      },
      {
        {
          25,
          24,
          26,
          25,
          24,
          3,
          21,
          10,
          22,
          8,
          3,
          7
        },
        {
          2.5,
          2.5,
          2.3,
          2.3,
          2.3,
          2.3,
          1.2,
          1.9,
          1.2,
          1.7,
          1.2,
          5
        }
      }
    },
    new_hard1 = {
      {
        {
          27,
          21,
          22,
          25,
          24,
          27,
          22,
          8,
          26,
          21,
          10,
          27,
          7
        },
        {
          2.2,
          2.2,
          2.2,
          2,
          2,
          2,
          1.2,
          2,
          2,
          1.2,
          1.4,
          1.3,
          5
        }
      },
      {
        {
          27,
          22,
          21,
          25,
          24,
          27,
          21,
          10,
          26,
          22,
          8,
          27,
          7
        },
        {
          2.2,
          2.2,
          2.2,
          2,
          2,
          2,
          1.2,
          2,
          2,
          1.2,
          1.4,
          1.3,
          5
        }
      }
    },
    new_hard1_yunjin = {
      {
        {
          27,
          21,
          22,
          25,
          24,
          27,
          22,
          8,
          26,
          21,
          10,
          27,
          7
        },
        {
          2.5,
          2.5,
          2.5,
          2.3,
          2.3,
          2.3,
          1.2,
          2.3,
          2.3,
          1.2,
          1.6,
          1.3,
          5
        }
      },
      {
        {
          27,
          22,
          21,
          25,
          24,
          27,
          21,
          10,
          26,
          22,
          8,
          27,
          7
        },
        {
          2.5,
          2.5,
          2.5,
          2.3,
          2.3,
          2.3,
          1.2,
          2.3,
          2.3,
          1.2,
          1.6,
          1.3,
          5
        }
      }
    },
    new_hard2 = {
      {
        {
          28,
          25,
          21,
          10,
          29,
          27,
          28,
          10,
          26,
          29,
          8,
          27,
          7
        },
        {
          2.2,
          2.2,
          1.2,
          2,
          2,
          2,
          1.2,
          2,
          2,
          1.2,
          1.4,
          1.3,
          5
        }
      },
      {
        {
          29,
          24,
          22,
          8,
          28,
          27,
          29,
          8,
          26,
          28,
          10,
          27,
          7
        },
        {
          2.2,
          2.2,
          1.2,
          2,
          2,
          2,
          1.2,
          2,
          2,
          1.2,
          1.4,
          1.3,
          5
        }
      }
    },
    new_hard2_yunjin = {
      {
        {
          28,
          25,
          21,
          10,
          29,
          27,
          28,
          10,
          26,
          29,
          8,
          27,
          7
        },
        {
          2.5,
          2.5,
          1.2,
          2.3,
          2.3,
          2.3,
          1.2,
          2.3,
          2.3,
          1.2,
          1.6,
          1.3,
          5
        }
      },
      {
        {
          29,
          24,
          22,
          8,
          28,
          27,
          29,
          8,
          26,
          28,
          10,
          27,
          7
        },
        {
          2.5,
          2.5,
          1.2,
          2.3,
          2.3,
          2.3,
          1.2,
          2.3,
          2.3,
          1.2,
          1.6,
          1.3,
          5
        }
      }
    },
    test = {
      {
        {
          1,
          8,
          8,
          8,
          8,
          8,
          3,
          8,
          8,
          8,
          8,
          8,
          5,
          8,
          8,
          8,
          8,
          8
        },
        {
          1.5,
          0.5,
          0.5,
          0.5,
          0.5,
          0.5,
          1.3,
          0.5,
          0.5,
          0.5,
          0.5,
          0.5,
          0.5,
          0.5,
          0.5,
          0.5,
          0.5,
          5
        }
      }
    },
    test1 = {
      {
        {
          21,
          22,
          21,
          22,
          8,
          22,
          21,
          10,
          26,
          24,
          25,
          27,
          24,
          25,
          27
        },
        {
          1.8,
          1.8,
          1.8,
          1.4,
          1.8,
          1.8,
          1.4,
          1.8,
          1.8,
          1.8,
          1.8,
          1.8,
          1.8,
          1.8,
          1.8
        }
      }
    },
    easy1 = {
      {
        {
          1,
          3,
          1,
          1,
          3,
          3
        },
        {
          2,
          1.8,
          2,
          2,
          1.4,
          4
        }
      }
    },
    easy2 = {
      {
        {
          1,
          1,
          3,
          5,
          10,
          8,
          8,
          10,
          7
        },
        {
          1.8,
          1.8,
          2,
          1.8,
          2,
          1.4,
          1.8,
          2.4,
          5
        }
      }
    },
    normal1 = {
      {
        {
          10,
          10,
          8,
          8,
          10,
          7
        },
        {
          2,
          2,
          1.4,
          1.8,
          2.4,
          5
        }
      }
    },
    normal2 = {
      {
        {
          1,
          10,
          10,
          1,
          3,
          10,
          3,
          10
        },
        {
          1.4,
          1.8,
          0.4,
          1.8,
          1.2,
          0.6,
          1.6,
          5
        }
      }
    },
    hard1 = {
      {
        {
          8,
          10,
          1,
          10,
          8,
          1,
          7,
          1,
          7
        },
        {
          1.6,
          1,
          1.4,
          1.4,
          0.8,
          1.2,
          0.8,
          1.2,
          5
        }
      }
    },
    hard2 = {
      {
        {
          7,
          8,
          10,
          3,
          8,
          3,
          7,
          10,
          10,
          3,
          7
        },
        {
          1.8,
          1.6,
          0.8,
          1.2,
          0.6,
          1.2,
          1.8,
          1.8,
          0.4,
          1.2,
          5
        }
      },
      {
        {
          8,
          10,
          7,
          3,
          8,
          10,
          3,
          7,
          10,
          3,
          7
        },
        {
          1.6,
          1.8,
          0.8,
          1.2,
          1.6,
          0.6,
          1.2,
          1.8,
          0.4,
          1.2,
          5
        }
      }
    },
    hard3 = {
      {
        {
          10,
          8,
          10,
          5,
          8,
          10,
          5,
          8,
          10,
          10
        },
        {
          0.2,
          1.8,
          1.5,
          0.2,
          1.8,
          0.2,
          1.8,
          1.8,
          1.8,
          5
        }
      }
    }
  },
  ball_pool = {
    [2] = {
      6006,
      6007,
      6008,
      6009,
      6031,
      6032,
      6033,
      6034,
      6040,
      6041,
      6042,
      6043,
      6044,
      6045,
      6046,
      6047,
      6048,
      6049,
      6060,
      6061,
      6062,
      6063,
      6064,
      6111,
      6112,
      6113,
      6114,
      6115,
      6116,
      6117,
      6118,
      6119,
      6120,
      6121,
      6122,
      6123,
      6124,
      6125,
      6126,
      6127,
      6128,
      6129,
      6130,
      6131,
      6132,
      6133,
      6134,
      6135,
      6136,
      6137,
      6138,
      6139,
      6140
    },
    [1] = {
      6023,
      6024,
      6025,
      6026,
      6035,
      6036,
      6037,
      6038,
      6050,
      6051,
      6052,
      6053,
      6054,
      6055,
      6056,
      6057,
      6058,
      6059,
      6065,
      6066,
      6067,
      6068,
      6069
    },
    [4] = {
      6070,
      6071,
      6072,
      6073,
      6074,
      6075,
      6076,
      6077,
      6078,
      6079,
      6080,
      6081,
      6082,
      6083,
      6084,
      6085,
      6086,
      6087,
      6088,
      6089
    },
    [3] = {
      6090,
      6091,
      6092,
      6093,
      6094,
      6095,
      6096,
      6097,
      6098,
      6099,
      6100,
      6101,
      6102,
      6103,
      6104,
      6105,
      6106,
      6107,
      6108,
      6109
    }
  },
  shoot_points = {
    [1] = {6016},
    [2] = {6002, 6004},
    [3] = {
      6011,
      6013,
      6017
    },
    [4] = {
      6019,
      6021,
      6027,
      6029
    }
  },
  multishoot_distance = 1.1
}
monsters = {}
npcs = {}
gadgets = {
  [6001] = {
    config_id = 6001,
    gadget_id = 70320011,
    pos = {
      x = 595.0,
      y = 1.6,
      z = 620.0
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
  },
  [6002] = {
    config_id = 6002,
    gadget_id = 70350085,
    pos = {
      x = 595.0,
      y = 1.45,
      z = 619.5
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1
  },
  [6003] = {
    config_id = 6003,
    gadget_id = 70320011,
    pos = {
      x = 605.0,
      y = 1.6,
      z = 620.0
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
  },
  [6004] = {
    config_id = 6004,
    gadget_id = 70350085,
    pos = {
      x = 605.0,
      y = 1.45,
      z = 619.5
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1
  },
  [6005] = {
    config_id = 6005,
    gadget_id = 70320063,
    pos = {
      x = 600.0,
      y = 0.502,
      z = 585.204
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_REMOTE
  },
  [6006] = {
    config_id = 6006,
    gadget_id = 70320012,
    pos = {
      x = 581.782,
      y = 1.2,
      z = 623.284
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6007] = {
    config_id = 6007,
    gadget_id = 70320012,
    pos = {
      x = 589.157,
      y = 1.2,
      z = 623.327
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6008] = {
    config_id = 6008,
    gadget_id = 70320012,
    pos = {
      x = 596.148,
      y = 1.2,
      z = 623.098
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6009] = {
    config_id = 6009,
    gadget_id = 70320012,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6011] = {
    config_id = 6011,
    gadget_id = 70350085,
    pos = {
      x = 585.0,
      y = 1.45,
      z = 619.5
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1
  },
  [6012] = {
    config_id = 6012,
    gadget_id = 70320011,
    pos = {
      x = 585.0,
      y = 1.6,
      z = 620.0
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
  },
  [6013] = {
    config_id = 6013,
    gadget_id = 70350085,
    pos = {
      x = 595.0,
      y = 1.45,
      z = 619.5
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1
  },
  [6014] = {
    config_id = 6014,
    gadget_id = 70320011,
    pos = {
      x = 595.0,
      y = 1.6,
      z = 620.0
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
  },
  [6015] = {
    config_id = 6015,
    gadget_id = 70320011,
    pos = {
      x = 595.0,
      y = 1.6,
      z = 620.0
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
  },
  [6016] = {
    config_id = 6016,
    gadget_id = 70350085,
    pos = {
      x = 595.0,
      y = 1.45,
      z = 619.5
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1
  },
  [6017] = {
    config_id = 6017,
    gadget_id = 70350085,
    pos = {
      x = 605.0,
      y = 1.45,
      z = 619.5
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1
  },
  [6018] = {
    config_id = 6018,
    gadget_id = 70320011,
    pos = {
      x = 605.0,
      y = 1.6,
      z = 620.0
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
  },
  [6019] = {
    config_id = 6019,
    gadget_id = 70350085,
    pos = {
      x = 585.0,
      y = 1.45,
      z = 619.5
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1
  },
  [6020] = {
    config_id = 6020,
    gadget_id = 70320011,
    pos = {
      x = 585.0,
      y = 1.6,
      z = 620.0
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
  },
  [6021] = {
    config_id = 6021,
    gadget_id = 70350085,
    pos = {
      x = 595.0,
      y = 1.45,
      z = 619.5
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1
  },
  [6022] = {
    config_id = 6022,
    gadget_id = 70320011,
    pos = {
      x = 595.0,
      y = 1.6,
      z = 620.0
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
  },
  [6023] = {
    config_id = 6023,
    gadget_id = 70320013,
    pos = {
      x = 581.782,
      y = 1.2,
      z = 623.284
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6024] = {
    config_id = 6024,
    gadget_id = 70320013,
    pos = {
      x = 589.157,
      y = 1.2,
      z = 623.327
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6025] = {
    config_id = 6025,
    gadget_id = 70320013,
    pos = {
      x = 596.148,
      y = 1.2,
      z = 623.098
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6026] = {
    config_id = 6026,
    gadget_id = 70320013,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6027] = {
    config_id = 6027,
    gadget_id = 70350085,
    pos = {
      x = 605.0,
      y = 1.45,
      z = 619.5
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1
  },
  [6028] = {
    config_id = 6028,
    gadget_id = 70320011,
    pos = {
      x = 605.0,
      y = 1.6,
      z = 620.0
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
  },
  [6029] = {
    config_id = 6029,
    gadget_id = 70350085,
    pos = {
      x = 615.0,
      y = 1.45,
      z = 619.5
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1
  },
  [6030] = {
    config_id = 6030,
    gadget_id = 70320011,
    pos = {
      x = 615.0,
      y = 1.6,
      z = 620.0
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE
  },
  [6031] = {
    config_id = 6031,
    gadget_id = 70320012,
    pos = {
      x = 581.782,
      y = 1.2,
      z = 623.284
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6032] = {
    config_id = 6032,
    gadget_id = 70320012,
    pos = {
      x = 589.157,
      y = 1.2,
      z = 623.327
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6033] = {
    config_id = 6033,
    gadget_id = 70320012,
    pos = {
      x = 596.148,
      y = 1.2,
      z = 623.098
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6034] = {
    config_id = 6034,
    gadget_id = 70320012,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6035] = {
    config_id = 6035,
    gadget_id = 70320013,
    pos = {
      x = 581.782,
      y = 1.2,
      z = 623.284
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6036] = {
    config_id = 6036,
    gadget_id = 70320013,
    pos = {
      x = 589.157,
      y = 1.2,
      z = 623.327
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6037] = {
    config_id = 6037,
    gadget_id = 70320013,
    pos = {
      x = 596.148,
      y = 1.2,
      z = 623.098
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6038] = {
    config_id = 6038,
    gadget_id = 70320013,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6039] = {
    config_id = 6039,
    gadget_id = 70320039,
    pos = {
      x = 600.0,
      y = 0.0,
      z = 580.0
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6040] = {
    config_id = 6040,
    gadget_id = 70320012,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6041] = {
    config_id = 6041,
    gadget_id = 70320012,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6042] = {
    config_id = 6042,
    gadget_id = 70320012,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6043] = {
    config_id = 6043,
    gadget_id = 70320012,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6044] = {
    config_id = 6044,
    gadget_id = 70320012,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6045] = {
    config_id = 6045,
    gadget_id = 70320012,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6046] = {
    config_id = 6046,
    gadget_id = 70320012,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6047] = {
    config_id = 6047,
    gadget_id = 70320012,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6048] = {
    config_id = 6048,
    gadget_id = 70320012,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6049] = {
    config_id = 6049,
    gadget_id = 70320012,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6050] = {
    config_id = 6050,
    gadget_id = 70320013,
    pos = {
      x = 581.782,
      y = 1.2,
      z = 623.284
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6051] = {
    config_id = 6051,
    gadget_id = 70320013,
    pos = {
      x = 589.157,
      y = 1.2,
      z = 623.327
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6052] = {
    config_id = 6052,
    gadget_id = 70320013,
    pos = {
      x = 596.148,
      y = 1.2,
      z = 623.098
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6053] = {
    config_id = 6053,
    gadget_id = 70320013,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6054] = {
    config_id = 6054,
    gadget_id = 70320013,
    pos = {
      x = 581.782,
      y = 1.2,
      z = 623.284
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6055] = {
    config_id = 6055,
    gadget_id = 70320013,
    pos = {
      x = 589.157,
      y = 1.2,
      z = 623.327
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6056] = {
    config_id = 6056,
    gadget_id = 70320013,
    pos = {
      x = 596.148,
      y = 1.2,
      z = 623.098
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6057] = {
    config_id = 6057,
    gadget_id = 70320013,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6058] = {
    config_id = 6058,
    gadget_id = 70320013,
    pos = {
      x = 596.148,
      y = 1.2,
      z = 623.098
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6059] = {
    config_id = 6059,
    gadget_id = 70320013,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6060] = {
    config_id = 6060,
    gadget_id = 70320012,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6061] = {
    config_id = 6061,
    gadget_id = 70320012,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6062] = {
    config_id = 6062,
    gadget_id = 70320012,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6063] = {
    config_id = 6063,
    gadget_id = 70320012,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6064] = {
    config_id = 6064,
    gadget_id = 70320012,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6065] = {
    config_id = 6065,
    gadget_id = 70320013,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6066] = {
    config_id = 6066,
    gadget_id = 70320013,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6067] = {
    config_id = 6067,
    gadget_id = 70320013,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6068] = {
    config_id = 6068,
    gadget_id = 70320013,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6069] = {
    config_id = 6069,
    gadget_id = 70320013,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6070] = {
    config_id = 6070,
    gadget_id = 70320050,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6071] = {
    config_id = 6071,
    gadget_id = 70320050,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6072] = {
    config_id = 6072,
    gadget_id = 70320050,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6073] = {
    config_id = 6073,
    gadget_id = 70320050,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6074] = {
    config_id = 6074,
    gadget_id = 70320050,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6075] = {
    config_id = 6075,
    gadget_id = 70320050,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6076] = {
    config_id = 6076,
    gadget_id = 70320050,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6077] = {
    config_id = 6077,
    gadget_id = 70320050,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6078] = {
    config_id = 6078,
    gadget_id = 70320050,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6079] = {
    config_id = 6079,
    gadget_id = 70320050,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6080] = {
    config_id = 6080,
    gadget_id = 70320050,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6081] = {
    config_id = 6081,
    gadget_id = 70320050,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6082] = {
    config_id = 6082,
    gadget_id = 70320050,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6083] = {
    config_id = 6083,
    gadget_id = 70320050,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6084] = {
    config_id = 6084,
    gadget_id = 70320050,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6085] = {
    config_id = 6085,
    gadget_id = 70320050,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6086] = {
    config_id = 6086,
    gadget_id = 70320050,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6087] = {
    config_id = 6087,
    gadget_id = 70320050,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6088] = {
    config_id = 6088,
    gadget_id = 70320050,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6089] = {
    config_id = 6089,
    gadget_id = 70320050,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6090] = {
    config_id = 6090,
    gadget_id = 70320051,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6091] = {
    config_id = 6091,
    gadget_id = 70320051,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6092] = {
    config_id = 6092,
    gadget_id = 70320051,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6093] = {
    config_id = 6093,
    gadget_id = 70320051,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6094] = {
    config_id = 6094,
    gadget_id = 70320051,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6095] = {
    config_id = 6095,
    gadget_id = 70320051,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6096] = {
    config_id = 6096,
    gadget_id = 70320051,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6097] = {
    config_id = 6097,
    gadget_id = 70320051,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6098] = {
    config_id = 6098,
    gadget_id = 70320051,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6099] = {
    config_id = 6099,
    gadget_id = 70320051,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6100] = {
    config_id = 6100,
    gadget_id = 70320051,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6101] = {
    config_id = 6101,
    gadget_id = 70320051,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6102] = {
    config_id = 6102,
    gadget_id = 70320051,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6103] = {
    config_id = 6103,
    gadget_id = 70320051,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6104] = {
    config_id = 6104,
    gadget_id = 70320051,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6105] = {
    config_id = 6105,
    gadget_id = 70320051,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6106] = {
    config_id = 6106,
    gadget_id = 70320051,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6107] = {
    config_id = 6107,
    gadget_id = 70320051,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6108] = {
    config_id = 6108,
    gadget_id = 70320051,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6109] = {
    config_id = 6109,
    gadget_id = 70320051,
    pos = {
      x = 596.668,
      y = 0.0,
      z = 617.256
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6111] = {
    config_id = 6111,
    gadget_id = 70320012,
    pos = {
      x = 581.782,
      y = 1.2,
      z = 623.284
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6112] = {
    config_id = 6112,
    gadget_id = 70320012,
    pos = {
      x = 589.157,
      y = 1.2,
      z = 623.327
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6113] = {
    config_id = 6113,
    gadget_id = 70320012,
    pos = {
      x = 596.148,
      y = 1.2,
      z = 623.098
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6114] = {
    config_id = 6114,
    gadget_id = 70320012,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6115] = {
    config_id = 6115,
    gadget_id = 70320012,
    pos = {
      x = 581.782,
      y = 1.2,
      z = 623.284
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6116] = {
    config_id = 6116,
    gadget_id = 70320012,
    pos = {
      x = 589.157,
      y = 1.2,
      z = 623.327
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6117] = {
    config_id = 6117,
    gadget_id = 70320012,
    pos = {
      x = 596.148,
      y = 1.2,
      z = 623.098
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6118] = {
    config_id = 6118,
    gadget_id = 70320012,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6119] = {
    config_id = 6119,
    gadget_id = 70320012,
    pos = {
      x = 581.782,
      y = 1.2,
      z = 623.284
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6120] = {
    config_id = 6120,
    gadget_id = 70320012,
    pos = {
      x = 589.157,
      y = 1.2,
      z = 623.327
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6121] = {
    config_id = 6121,
    gadget_id = 70320012,
    pos = {
      x = 596.148,
      y = 1.2,
      z = 623.098
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6122] = {
    config_id = 6122,
    gadget_id = 70320012,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6123] = {
    config_id = 6123,
    gadget_id = 70320012,
    pos = {
      x = 581.782,
      y = 1.2,
      z = 623.284
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6124] = {
    config_id = 6124,
    gadget_id = 70320012,
    pos = {
      x = 589.157,
      y = 1.2,
      z = 623.327
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6125] = {
    config_id = 6125,
    gadget_id = 70320012,
    pos = {
      x = 596.148,
      y = 1.2,
      z = 623.098
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6126] = {
    config_id = 6126,
    gadget_id = 70320012,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6127] = {
    config_id = 6127,
    gadget_id = 70320012,
    pos = {
      x = 581.782,
      y = 1.2,
      z = 623.284
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6128] = {
    config_id = 6128,
    gadget_id = 70320012,
    pos = {
      x = 589.157,
      y = 1.2,
      z = 623.327
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6129] = {
    config_id = 6129,
    gadget_id = 70320012,
    pos = {
      x = 596.148,
      y = 1.2,
      z = 623.098
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6130] = {
    config_id = 6130,
    gadget_id = 70320012,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6131] = {
    config_id = 6131,
    gadget_id = 70320012,
    pos = {
      x = 581.782,
      y = 1.2,
      z = 623.284
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6132] = {
    config_id = 6132,
    gadget_id = 70320012,
    pos = {
      x = 589.157,
      y = 1.2,
      z = 623.327
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6133] = {
    config_id = 6133,
    gadget_id = 70320012,
    pos = {
      x = 596.148,
      y = 1.2,
      z = 623.098
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6134] = {
    config_id = 6134,
    gadget_id = 70320012,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6135] = {
    config_id = 6135,
    gadget_id = 70320012,
    pos = {
      x = 581.782,
      y = 1.2,
      z = 623.284
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6136] = {
    config_id = 6136,
    gadget_id = 70320012,
    pos = {
      x = 589.157,
      y = 1.2,
      z = 623.327
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6137] = {
    config_id = 6137,
    gadget_id = 70320012,
    pos = {
      x = 596.148,
      y = 1.2,
      z = 623.098
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6138] = {
    config_id = 6138,
    gadget_id = 70320012,
    pos = {
      x = 602.953,
      y = 1.2,
      z = 623.028
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6139] = {
    config_id = 6139,
    gadget_id = 70320012,
    pos = {
      x = 581.782,
      y = 1.2,
      z = 623.284
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  [6140] = {
    config_id = 6140,
    gadget_id = 70320012,
    pos = {
      x = 589.157,
      y = 1.2,
      z = 623.327
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  }
}
regions = {
  [6010] = {
    config_id = 6010,
    shape = RegionShape.CUBIC,
    size = {
      x = 60.0,
      y = 20.0,
      z = 60.0
    },
    pos = {
      x = 600.0,
      y = 0.0,
      z = 600.0
    }
  }
}
triggers = {}
variables = {}
garbages = {
  gadgets = {
    {
      config_id = 6110,
      gadget_id = 70950011,
      pos = {
        x = 609.0,
        y = 0.0,
        z = 585.0
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1
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
    gadgets = {6039},
    regions = {6010},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      6005,
      6019,
      6020,
      6021,
      6022,
      6027,
      6028,
      6029,
      6030
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      6005,
      6011,
      6012,
      6013,
      6014,
      6017,
      6018
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      6001,
      6002,
      6003,
      6004,
      6005
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      6005,
      6015,
      6016
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
require("V3_2/CharAmuse_BaseBall")
require("V3_2/CharAmuse_Retrans")
