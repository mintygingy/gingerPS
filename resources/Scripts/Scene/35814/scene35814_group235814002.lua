local base_info = {group_id = 235814002}
local fever_progress_table = {
  0,
  40,
  120,
  270,
  570,
  800
}
local fever_attenuation = {
  -1,
  -1,
  -2,
  -2,
  -3
}
local DungeonWeather = {
  10112,
  10113,
  10114,
  10115
}
local monster_tide = {
  [1] = {
    2001,
    2002,
    2003,
    2004,
    2005,
    2006
  },
  [2] = {
    2007,
    2008,
    2009
  },
  [3] = {
    2010,
    2011,
    2012
  },
  [4] = {
    2013,
    2014,
    2015,
    2016
  },
  [5] = {
    2017,
    2018,
    2019,
    2020,
    2023,
    2024,
    2025,
    2026,
    2027,
    2028,
    2029,
    2030
  }
}
local tide_suite_config = {
  [1] = {min = 2, max = 2},
  [2] = {min = 1, max = 3},
  [3] = {min = 1, max = 3},
  [4] = {min = 1, max = 1},
  [5] = {min = 1, max = 3}
}
local defs = {
  group_id = 235814002,
  worktop_id = 2021,
  game_time = 240,
  environment_suite = 3,
  gallery_id = 15008,
  noswitch_punishment_interval = 30,
  switch_team_fever = 30,
  num_killed_per_tide = {
    6,
    3,
    3,
    4,
    0
  },
  air_wall = 2081,
  punish_inAdvance_reminder_time = 4
}
monsters = {
  [2001] = {
    config_id = 2001,
    monster_id = 24020201,
    pos = {
      x = 29.266,
      y = 3.15,
      z = 110.193
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 100,
    kill_score = 24
  },
  [2002] = {
    config_id = 2002,
    monster_id = 24020201,
    pos = {
      x = 35.19,
      y = 3.15,
      z = 110.111
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 100,
    kill_score = 24
  },
  [2003] = {
    config_id = 2003,
    monster_id = 24020301,
    pos = {
      x = 40.457,
      y = 3.15,
      z = 105.968
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 100,
    kill_score = 36
  },
  [2004] = {
    config_id = 2004,
    monster_id = 24020201,
    pos = {
      x = 40.457,
      y = 3.15,
      z = 99.812
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 100,
    kill_score = 24
  },
  [2005] = {
    config_id = 2005,
    monster_id = 24020201,
    pos = {
      x = 29.266,
      y = 3.15,
      z = 95.491
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 100,
    kill_score = 24
  },
  [2006] = {
    config_id = 2006,
    monster_id = 24020401,
    pos = {
      x = 35.19,
      y = 3.15,
      z = 95.409
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 100,
    kill_score = 36
  },
  [2007] = {
    config_id = 2007,
    monster_id = 24020201,
    pos = {
      x = 25.006,
      y = 3.15,
      z = 107.079
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 100,
    kill_score = 24
  },
  [2008] = {
    config_id = 2008,
    monster_id = 24020201,
    pos = {
      x = 24.943,
      y = 3.15,
      z = 99.56
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 100,
    kill_score = 24
  },
  [2009] = {
    config_id = 2009,
    monster_id = 24010101,
    pos = {
      x = 24.922,
      y = 3.15,
      z = 102.984
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 100,
    kill_score = 39
  },
  [2010] = {
    config_id = 2010,
    monster_id = 24020301,
    pos = {
      x = 26.319,
      y = 3.15,
      z = 109.688
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 100,
    kill_score = 36
  },
  [2011] = {
    config_id = 2011,
    monster_id = 24020301,
    pos = {
      x = 38.497,
      y = 3.15,
      z = 109.454
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 100,
    kill_score = 36
  },
  [2012] = {
    config_id = 2012,
    monster_id = 24010301,
    pos = {
      x = 32.348,
      y = 3.15,
      z = 109.797
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 100,
    kill_score = 54
  },
  [2013] = {
    config_id = 2013,
    monster_id = 24030201,
    pos = {
      x = 39.744,
      y = 3.15,
      z = 102.804
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 101,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE,
    kill_score = 66
  },
  [2014] = {
    config_id = 2014,
    monster_id = 24010301,
    pos = {
      x = 31.804,
      y = 3.15,
      z = 96.133
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 100,
    kill_score = 54
  },
  [2015] = {
    config_id = 2015,
    monster_id = 24030201,
    pos = {
      x = 24.951,
      y = 3.15,
      z = 103.358
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 101,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE,
    kill_score = 66
  },
  [2016] = {
    config_id = 2016,
    monster_id = 24010301,
    pos = {
      x = 32.855,
      y = 3.15,
      z = 109.763
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 100,
    kill_score = 54
  },
  [2017] = {
    config_id = 2017,
    monster_id = 24020201,
    pos = {
      x = 39.749,
      y = 3.15,
      z = 108.597
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 100,
    kill_score = 24
  },
  [2018] = {
    config_id = 2018,
    monster_id = 24020201,
    pos = {
      x = 39.686,
      y = 3.15,
      z = 97.253
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 100,
    kill_score = 24
  },
  [2019] = {
    config_id = 2019,
    monster_id = 24030201,
    pos = {
      x = 39.665,
      y = 3.15,
      z = 102.984
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 101,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE,
    kill_score = 66
  },
  [2020] = {
    config_id = 2020,
    monster_id = 24020201,
    pos = {
      x = 26.066,
      y = 3.15,
      z = 96.088
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 100,
    kill_score = 24
  },
  [2023] = {
    config_id = 2023,
    monster_id = 24010301,
    pos = {
      x = 31.835,
      y = 3.15,
      z = 96.078
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 100,
    kill_score = 54
  },
  [2024] = {
    config_id = 2024,
    monster_id = 24020201,
    pos = {
      x = 37.545,
      y = 3.15,
      z = 96.128
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 100,
    kill_score = 24
  },
  [2025] = {
    config_id = 2025,
    monster_id = 24030201,
    pos = {
      x = 24.971,
      y = 3.15,
      z = 103.167
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 101,
    vision_level = VisionLevelType.VISION_LEVEL_LITTLE_REMOTE,
    kill_score = 66
  },
  [2026] = {
    config_id = 2026,
    monster_id = 24020401,
    pos = {
      x = 24.992,
      y = 3.15,
      z = 97.435
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 100,
    kill_score = 36
  },
  [2027] = {
    config_id = 2027,
    monster_id = 24020301,
    pos = {
      x = 25.056,
      y = 3.15,
      z = 108.779
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 100,
    kill_score = 36
  },
  [2028] = {
    config_id = 2028,
    monster_id = 24020301,
    pos = {
      x = 27.201,
      y = 3.15,
      z = 109.765
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 100,
    kill_score = 36
  },
  [2029] = {
    config_id = 2029,
    monster_id = 24010301,
    pos = {
      x = 32.97,
      y = 3.15,
      z = 109.754
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 100,
    kill_score = 54
  },
  [2030] = {
    config_id = 2030,
    monster_id = 24020301,
    pos = {
      x = 38.68,
      y = 3.15,
      z = 109.804
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5195},
    pose_id = 100,
    kill_score = 36
  }
}
npcs = {}
gadgets = {
  [2021] = {
    config_id = 2021,
    gadget_id = 70360010,
    pos = {
      x = 32.33,
      y = 2.738,
      z = 102.94
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2048] = {
    config_id = 2048,
    gadget_id = 70350306,
    pos = {
      x = 52.126,
      y = 5.575,
      z = 83.326
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2049] = {
    config_id = 2049,
    gadget_id = 70350306,
    pos = {
      x = 12.676,
      y = 5.526,
      z = 83.403
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2050] = {
    config_id = 2050,
    gadget_id = 70350306,
    pos = {
      x = 52.076,
      y = 5.471,
      z = 122.762
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2051] = {
    config_id = 2051,
    gadget_id = 70350306,
    pos = {
      x = 12.694,
      y = 5.606,
      z = 122.658
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2052] = {
    config_id = 2052,
    gadget_id = 70350307,
    pos = {
      x = 72.5,
      y = 3.88,
      z = 128.613
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2053] = {
    config_id = 2053,
    gadget_id = 70350307,
    pos = {
      x = 72.5,
      y = 3.88,
      z = 120.362
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2054] = {
    config_id = 2054,
    gadget_id = 70350307,
    pos = {
      x = 72.5,
      y = 3.88,
      z = 112.1
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2055] = {
    config_id = 2055,
    gadget_id = 70350307,
    pos = {
      x = 72.5,
      y = 3.88,
      z = 103.452
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2056] = {
    config_id = 2056,
    gadget_id = 70350307,
    pos = {
      x = 72.5,
      y = 3.88,
      z = 95.008
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2057] = {
    config_id = 2057,
    gadget_id = 70350307,
    pos = {
      x = 72.5,
      y = 3.88,
      z = 86.675
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2058] = {
    config_id = 2058,
    gadget_id = 70350307,
    pos = {
      x = -8.822,
      y = 3.88,
      z = 128.635
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2059] = {
    config_id = 2059,
    gadget_id = 70350307,
    pos = {
      x = -8.19,
      y = 3.88,
      z = 120.665
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2060] = {
    config_id = 2060,
    gadget_id = 70350307,
    pos = {
      x = -8.19,
      y = 3.88,
      z = 112.1
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2061] = {
    config_id = 2061,
    gadget_id = 70350307,
    pos = {
      x = -8.219,
      y = 3.88,
      z = 103.701
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2062] = {
    config_id = 2062,
    gadget_id = 70350307,
    pos = {
      x = -8.048,
      y = 3.88,
      z = 95.018
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2063] = {
    config_id = 2063,
    gadget_id = 70350307,
    pos = {
      x = -8.262,
      y = 3.88,
      z = 86.753
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2064] = {
    config_id = 2064,
    gadget_id = 70350306,
    pos = {
      x = 24.65,
      y = 10.805,
      z = 141.543
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2065] = {
    config_id = 2065,
    gadget_id = 70350306,
    pos = {
      x = 40.05,
      y = 10.799,
      z = 141.513
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2066] = {
    config_id = 2066,
    gadget_id = 70350306,
    pos = {
      x = 27.317,
      y = 8.059,
      z = 75.224
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2067] = {
    config_id = 2067,
    gadget_id = 70350306,
    pos = {
      x = 37.346,
      y = 8.064,
      z = 75.197
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2072] = {
    config_id = 2072,
    gadget_id = 70350308,
    pos = {
      x = 38.094,
      y = 18.788,
      z = 141.013
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2073] = {
    config_id = 2073,
    gadget_id = 70350308,
    pos = {
      x = 26.571,
      y = 18.756,
      z = 141.058
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2074] = {
    config_id = 2074,
    gadget_id = 70350308,
    pos = {
      x = -10.671,
      y = 26.712,
      z = 147.351
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2075] = {
    config_id = 2075,
    gadget_id = 70350308,
    pos = {
      x = 77.8,
      y = 26.831,
      z = 147.602
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2076] = {
    config_id = 2076,
    gadget_id = 70350308,
    pos = {
      x = 85.879,
      y = 26.886,
      z = 139.648
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2077] = {
    config_id = 2077,
    gadget_id = 70350308,
    pos = {
      x = -18.976,
      y = 26.894,
      z = 139.46
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2078] = {
    config_id = 2078,
    gadget_id = 70350309,
    pos = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2079] = {
    config_id = 2079,
    gadget_id = 70350307,
    pos = {
      x = 72.5,
      y = 3.88,
      z = 77.711
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2080] = {
    config_id = 2080,
    gadget_id = 70350307,
    pos = {
      x = -8.25,
      y = 3.88,
      z = 77.76
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [2081] = {
    config_id = 2081,
    gadget_id = 70950010,
    pos = {
      x = 32.433,
      y = 3.32,
      z = 83.429
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
  [2022] = {
    config_id = 2022,
    shape = RegionShape.CUBIC,
    size = {
      x = 20.0,
      y = 10.0,
      z = 20.0
    },
    pos = {
      x = 32.383,
      y = 3.15,
      z = 102.86
    }
  }
}
triggers = {}
variables = {}
init_config = {
  suite = 1,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {2021},
    regions = {2022},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      2048,
      2049,
      2050,
      2051,
      2052,
      2053,
      2054,
      2055,
      2056,
      2057,
      2058,
      2059,
      2060,
      2061,
      2062,
      2063,
      2064,
      2065,
      2066,
      2067,
      2072,
      2073,
      2074,
      2075,
      2076,
      2077,
      2078,
      2079,
      2080
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {
      2001,
      2002,
      2003,
      2004,
      2005,
      2006
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {
      2007,
      2008,
      2009
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {
      2010,
      2011,
      2012
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {
      2013,
      2014,
      2015,
      2016
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {
      2017,
      2018,
      2019,
      2020,
      2023,
      2024,
      2025,
      2026,
      2027,
      2028,
      2029,
      2030
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
require("V3_1/FightingStage_ByNum")
