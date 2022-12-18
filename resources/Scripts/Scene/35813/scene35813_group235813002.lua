local base_info = {group_id = 235813002}
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
  10108,
  10109,
  10110,
  10111
}
local monster_tide = {
  [1] = {
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
    2033,
    2034,
    2035,
    2036,
    2037,
    2048,
    2049,
    2050,
    2117,
    2118
  },
  [2] = {
    2011,
    2012,
    2013,
    2014,
    2015,
    2016,
    2017,
    2018,
    2019,
    2020,
    2038,
    2039,
    2040,
    2041,
    2042,
    2043,
    2044,
    2045,
    2119,
    2120
  },
  [3] = {
    2046,
    2047,
    2052,
    2053,
    2054,
    2055,
    2056,
    2057,
    2058,
    2059,
    2080,
    2081,
    2082,
    2083,
    2094,
    2095,
    2096,
    2097,
    2121,
    2122
  },
  [4] = {
    2098,
    2099,
    2100,
    2101,
    2102,
    2103,
    2104,
    2105,
    2106,
    2107,
    2108,
    2109,
    2110,
    2111,
    2112,
    2113,
    2114,
    2115,
    2123,
    2124
  }
}
local tide_suite_config = {
  [1] = {min = 5, max = 5},
  [2] = {min = 5, max = 5},
  [3] = {min = 5, max = 5},
  [4] = {min = 5, max = 5}
}
local elite = {
  [1] = {2030},
  [2] = {2031},
  [3] = {2032},
  [4] = {2030, 2031}
}
local elite_born_points = {
  2022,
  2023,
  2024,
  2025,
  2026,
  2027,
  2028,
  2029
}
local defs = {
  group_id = 235813002,
  worktop_id = 2021,
  game_time = 240,
  minion_tide_interval = 60,
  elite_interval = 15,
  environment_suite = 3,
  elite_tide_interval = 60,
  gallery_id = 15007,
  noswitch_punishment_interval = 25,
  switch_team_fever = 30,
  air_wall = 2093,
  punish_inAdvance_reminder_time = 4
}
monsters = {
  [2001] = {
    config_id = 2001,
    monster_id = 21010201,
    pos = {
      x = 27.5,
      y = 3.15,
      z = 110.277
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2002] = {
    config_id = 2002,
    monster_id = 21010201,
    pos = {
      x = 29.995,
      y = 3.15,
      z = 110.277
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2003] = {
    config_id = 2003,
    monster_id = 21030101,
    pos = {
      x = 32.166,
      y = 3.15,
      z = 110.277
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2004] = {
    config_id = 2004,
    monster_id = 21010201,
    pos = {
      x = 34.5,
      y = 3.15,
      z = 110.277
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2005] = {
    config_id = 2005,
    monster_id = 21010201,
    pos = {
      x = 36.908,
      y = 3.15,
      z = 110.277
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2006] = {
    config_id = 2006,
    monster_id = 21010201,
    pos = {
      x = 25.073,
      y = 3.15,
      z = 100.386
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2007] = {
    config_id = 2007,
    monster_id = 21010501,
    pos = {
      x = 25.067,
      y = 3.15,
      z = 98.165
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2008] = {
    config_id = 2008,
    monster_id = 21010501,
    pos = {
      x = 25.21,
      y = 3.15,
      z = 106.892
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2009] = {
    config_id = 2009,
    monster_id = 21010201,
    pos = {
      x = 25.057,
      y = 3.15,
      z = 102.82
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2010] = {
    config_id = 2010,
    monster_id = 21010201,
    pos = {
      x = 25.157,
      y = 3.15,
      z = 104.786
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2011] = {
    config_id = 2011,
    monster_id = 21010701,
    pos = {
      x = 27.5,
      y = 3.15,
      z = 110.277
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2012] = {
    config_id = 2012,
    monster_id = 21010201,
    pos = {
      x = 29.995,
      y = 3.15,
      z = 110.277
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2013] = {
    config_id = 2013,
    monster_id = 21010601,
    pos = {
      x = 32.166,
      y = 3.15,
      z = 110.277
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2014] = {
    config_id = 2014,
    monster_id = 21010201,
    pos = {
      x = 34.5,
      y = 3.15,
      z = 110.277
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2015] = {
    config_id = 2015,
    monster_id = 21010701,
    pos = {
      x = 36.908,
      y = 3.15,
      z = 110.277
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2016] = {
    config_id = 2016,
    monster_id = 21010701,
    pos = {
      x = 25.073,
      y = 3.15,
      z = 100.386
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2017] = {
    config_id = 2017,
    monster_id = 21010201,
    pos = {
      x = 25.067,
      y = 3.15,
      z = 98.165
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2018] = {
    config_id = 2018,
    monster_id = 21010201,
    pos = {
      x = 25.21,
      y = 3.15,
      z = 106.892
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2019] = {
    config_id = 2019,
    monster_id = 21030201,
    pos = {
      x = 25.057,
      y = 3.15,
      z = 102.82
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2020] = {
    config_id = 2020,
    monster_id = 21010701,
    pos = {
      x = 25.157,
      y = 3.15,
      z = 104.786
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2030] = {
    config_id = 2030,
    monster_id = 21020201,
    pos = {
      x = 27.851,
      y = 3.15,
      z = 117.097
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 18,
    is_light_config = true
  },
  [2031] = {
    config_id = 2031,
    monster_id = 21020701,
    pos = {
      x = 34.488,
      y = 3.15,
      z = 117.031
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 18,
    is_light_config = true
  },
  [2032] = {
    config_id = 2032,
    monster_id = 21020101,
    pos = {
      x = 31.197,
      y = 3.15,
      z = 117.031
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 18,
    is_light_config = true
  },
  [2033] = {
    config_id = 2033,
    monster_id = 21010201,
    pos = {
      x = 30.151,
      y = 3.15,
      z = 95.679
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2034] = {
    config_id = 2034,
    monster_id = 21010901,
    pos = {
      x = 27.685,
      y = 3.15,
      z = 95.679
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2035] = {
    config_id = 2035,
    monster_id = 21010201,
    pos = {
      x = 32.444,
      y = 3.15,
      z = 95.679
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2036] = {
    config_id = 2036,
    monster_id = 21010201,
    pos = {
      x = 34.777,
      y = 3.15,
      z = 95.679
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2037] = {
    config_id = 2037,
    monster_id = 21010901,
    pos = {
      x = 37.185,
      y = 3.15,
      z = 95.679
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2038] = {
    config_id = 2038,
    monster_id = 21010201,
    pos = {
      x = 30.151,
      y = 3.15,
      z = 95.679
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2039] = {
    config_id = 2039,
    monster_id = 21010701,
    pos = {
      x = 27.685,
      y = 3.15,
      z = 95.679
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2040] = {
    config_id = 2040,
    monster_id = 21030601,
    pos = {
      x = 32.444,
      y = 3.15,
      z = 95.679
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2041] = {
    config_id = 2041,
    monster_id = 21010201,
    pos = {
      x = 34.777,
      y = 3.15,
      z = 95.679
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2042] = {
    config_id = 2042,
    monster_id = 21010701,
    pos = {
      x = 37.185,
      y = 3.15,
      z = 95.679
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2043] = {
    config_id = 2043,
    monster_id = 21010201,
    pos = {
      x = 39.663,
      y = 3.15,
      z = 100.686
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2044] = {
    config_id = 2044,
    monster_id = 21011601,
    pos = {
      x = 39.657,
      y = 3.15,
      z = 98.465
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2045] = {
    config_id = 2045,
    monster_id = 21010601,
    pos = {
      x = 39.8,
      y = 3.15,
      z = 107.192
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2046] = {
    config_id = 2046,
    monster_id = 21010401,
    pos = {
      x = 27.5,
      y = 3.15,
      z = 110.277
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2047] = {
    config_id = 2047,
    monster_id = 21010201,
    pos = {
      x = 29.995,
      y = 3.15,
      z = 110.277
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2048] = {
    config_id = 2048,
    monster_id = 21010201,
    pos = {
      x = 39.663,
      y = 3.15,
      z = 100.686
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2049] = {
    config_id = 2049,
    monster_id = 21010901,
    pos = {
      x = 39.657,
      y = 3.15,
      z = 98.465
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2050] = {
    config_id = 2050,
    monster_id = 21010501,
    pos = {
      x = 39.8,
      y = 3.15,
      z = 107.192
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2052] = {
    config_id = 2052,
    monster_id = 21010601,
    pos = {
      x = 32.166,
      y = 3.15,
      z = 110.277
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2053] = {
    config_id = 2053,
    monster_id = 21010201,
    pos = {
      x = 34.5,
      y = 3.15,
      z = 110.277
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2054] = {
    config_id = 2054,
    monster_id = 21010401,
    pos = {
      x = 36.908,
      y = 3.15,
      z = 110.277
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2055] = {
    config_id = 2055,
    monster_id = 21010301,
    pos = {
      x = 25.073,
      y = 3.15,
      z = 100.386
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2056] = {
    config_id = 2056,
    monster_id = 21010201,
    pos = {
      x = 25.067,
      y = 3.15,
      z = 98.165
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2057] = {
    config_id = 2057,
    monster_id = 21010201,
    pos = {
      x = 25.21,
      y = 3.15,
      z = 106.892
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2058] = {
    config_id = 2058,
    monster_id = 21030101,
    pos = {
      x = 25.057,
      y = 3.15,
      z = 102.82
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2059] = {
    config_id = 2059,
    monster_id = 21010301,
    pos = {
      x = 25.157,
      y = 3.15,
      z = 104.786
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2080] = {
    config_id = 2080,
    monster_id = 21010601,
    pos = {
      x = 30.151,
      y = 3.15,
      z = 95.679
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2081] = {
    config_id = 2081,
    monster_id = 21010701,
    pos = {
      x = 27.685,
      y = 3.15,
      z = 95.679
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2082] = {
    config_id = 2082,
    monster_id = 21030201,
    pos = {
      x = 32.444,
      y = 3.15,
      z = 95.679
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2083] = {
    config_id = 2083,
    monster_id = 21011601,
    pos = {
      x = 34.777,
      y = 3.15,
      z = 95.679
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2094] = {
    config_id = 2094,
    monster_id = 21010701,
    pos = {
      x = 37.185,
      y = 3.15,
      z = 95.679
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2095] = {
    config_id = 2095,
    monster_id = 21010701,
    pos = {
      x = 39.663,
      y = 3.15,
      z = 100.686
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2096] = {
    config_id = 2096,
    monster_id = 21011601,
    pos = {
      x = 39.657,
      y = 3.15,
      z = 98.465
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2097] = {
    config_id = 2097,
    monster_id = 21010601,
    pos = {
      x = 39.8,
      y = 3.15,
      z = 107.192
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2098] = {
    config_id = 2098,
    monster_id = 21011301,
    pos = {
      x = 27.5,
      y = 3.15,
      z = 110.277
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2099] = {
    config_id = 2099,
    monster_id = 21010701,
    pos = {
      x = 29.995,
      y = 3.15,
      z = 110.277
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2100] = {
    config_id = 2100,
    monster_id = 21030601,
    pos = {
      x = 32.166,
      y = 3.15,
      z = 110.277
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2101] = {
    config_id = 2101,
    monster_id = 21010701,
    pos = {
      x = 34.5,
      y = 3.15,
      z = 110.277
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2102] = {
    config_id = 2102,
    monster_id = 21010601,
    pos = {
      x = 36.908,
      y = 3.15,
      z = 110.277
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2103] = {
    config_id = 2103,
    monster_id = 21011001,
    pos = {
      x = 25.073,
      y = 3.15,
      z = 100.386
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2104] = {
    config_id = 2104,
    monster_id = 21011301,
    pos = {
      x = 25.067,
      y = 3.15,
      z = 98.165
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2105] = {
    config_id = 2105,
    monster_id = 21010601,
    pos = {
      x = 25.21,
      y = 3.15,
      z = 106.892
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2106] = {
    config_id = 2106,
    monster_id = 21010501,
    pos = {
      x = 25.057,
      y = 3.15,
      z = 102.82
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2107] = {
    config_id = 2107,
    monster_id = 21010901,
    pos = {
      x = 25.157,
      y = 3.15,
      z = 104.786
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2108] = {
    config_id = 2108,
    monster_id = 21010601,
    pos = {
      x = 30.151,
      y = 3.15,
      z = 95.679
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2109] = {
    config_id = 2109,
    monster_id = 21010301,
    pos = {
      x = 27.685,
      y = 3.15,
      z = 95.679
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2110] = {
    config_id = 2110,
    monster_id = 21030101,
    pos = {
      x = 32.444,
      y = 3.15,
      z = 95.679
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2111] = {
    config_id = 2111,
    monster_id = 21011601,
    pos = {
      x = 34.777,
      y = 3.15,
      z = 95.679
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2112] = {
    config_id = 2112,
    monster_id = 21010301,
    pos = {
      x = 37.185,
      y = 3.15,
      z = 95.679
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2113] = {
    config_id = 2113,
    monster_id = 21010301,
    pos = {
      x = 39.663,
      y = 3.15,
      z = 100.686
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2114] = {
    config_id = 2114,
    monster_id = 21011001,
    pos = {
      x = 39.657,
      y = 3.15,
      z = 98.465
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2115] = {
    config_id = 2115,
    monster_id = 21010501,
    pos = {
      x = 39.8,
      y = 3.15,
      z = 107.192
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2117] = {
    config_id = 2117,
    monster_id = 21030301,
    pos = {
      x = 39.647,
      y = 3.15,
      z = 103.12
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2118] = {
    config_id = 2118,
    monster_id = 21010201,
    pos = {
      x = 39.747,
      y = 3.15,
      z = 105.086
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2119] = {
    config_id = 2119,
    monster_id = 21030201,
    pos = {
      x = 39.647,
      y = 3.15,
      z = 103.12
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2120] = {
    config_id = 2120,
    monster_id = 21010201,
    pos = {
      x = 39.747,
      y = 3.15,
      z = 105.086
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2121] = {
    config_id = 2121,
    monster_id = 21030301,
    pos = {
      x = 39.647,
      y = 3.15,
      z = 103.12
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2122] = {
    config_id = 2122,
    monster_id = 21010701,
    pos = {
      x = 39.747,
      y = 3.15,
      z = 105.086
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2123] = {
    config_id = 2123,
    monster_id = 21030201,
    pos = {
      x = 39.647,
      y = 3.15,
      z = 103.12
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
  },
  [2124] = {
    config_id = 2124,
    monster_id = 21010301,
    pos = {
      x = 39.747,
      y = 3.15,
      z = 105.086
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {5194},
    kill_score = 6,
    is_light_config = true
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
  [2060] = {
    config_id = 2060,
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
  [2061] = {
    config_id = 2061,
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
  [2062] = {
    config_id = 2062,
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
  [2063] = {
    config_id = 2063,
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
  [2064] = {
    config_id = 2064,
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
  [2065] = {
    config_id = 2065,
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
  [2066] = {
    config_id = 2066,
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
  [2067] = {
    config_id = 2067,
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
  [2068] = {
    config_id = 2068,
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
  [2069] = {
    config_id = 2069,
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
  [2070] = {
    config_id = 2070,
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
  [2071] = {
    config_id = 2071,
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
  [2072] = {
    config_id = 2072,
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
  [2073] = {
    config_id = 2073,
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
  [2074] = {
    config_id = 2074,
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
  [2075] = {
    config_id = 2075,
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
  [2076] = {
    config_id = 2076,
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
  [2077] = {
    config_id = 2077,
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
  [2078] = {
    config_id = 2078,
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
  [2079] = {
    config_id = 2079,
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
  [2084] = {
    config_id = 2084,
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
  [2085] = {
    config_id = 2085,
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
  [2086] = {
    config_id = 2086,
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
  [2087] = {
    config_id = 2087,
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
  [2088] = {
    config_id = 2088,
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
  [2089] = {
    config_id = 2089,
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
  [2090] = {
    config_id = 2090,
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
  [2091] = {
    config_id = 2091,
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
  [2092] = {
    config_id = 2092,
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
  [2093] = {
    config_id = 2093,
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
  [2116] = {
    config_id = 2116,
    shape = RegionShape.CUBIC,
    size = {
      x = 20.0,
      y = 10.0,
      z = 20.0
    },
    pos = {
      x = 32.355,
      y = 3.15,
      z = 102.913
    }
  }
}
triggers = {}
points = {
  {
    config_id = 2022,
    pos = {
      x = 32.38,
      y = 3.17,
      z = 112.908
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    }
  },
  {
    config_id = 2023,
    pos = {
      x = 42.421,
      y = 3.17,
      z = 112.983
    },
    rot = {
      x = 0.0,
      y = 212.479,
      z = 0.0
    }
  },
  {
    config_id = 2024,
    pos = {
      x = 42.34,
      y = 3.17,
      z = 92.985
    },
    rot = {
      x = 0.0,
      y = 312.946,
      z = 0.0
    }
  },
  {
    config_id = 2025,
    pos = {
      x = 32.325,
      y = 3.17,
      z = 93.024
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    }
  },
  {
    config_id = 2026,
    pos = {
      x = 22.331,
      y = 3.17,
      z = 92.994
    },
    rot = {
      x = 0.0,
      y = 45.669,
      z = 0.0
    }
  },
  {
    config_id = 2027,
    pos = {
      x = 22.316,
      y = 3.17,
      z = 112.955
    },
    rot = {
      x = 0.0,
      y = 137.061,
      z = 0.0
    }
  },
  {
    config_id = 2028,
    pos = {
      x = 22.422,
      y = 3.16,
      z = 102.981
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    }
  },
  {
    config_id = 2029,
    pos = {
      x = 42.079,
      y = 3.16,
      z = 102.974
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    }
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
    gadgets = {2021},
    regions = {2116},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {
      2030,
      2031,
      2032
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      2060,
      2061,
      2062,
      2063,
      2064,
      2065,
      2066,
      2067,
      2068,
      2069,
      2070,
      2071,
      2072,
      2073,
      2074,
      2075,
      2076,
      2077,
      2078,
      2079,
      2084,
      2085,
      2086,
      2087,
      2088,
      2089,
      2090,
      2091,
      2092
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
      2006,
      2007,
      2008,
      2009,
      2010,
      2033,
      2034,
      2035,
      2036,
      2037,
      2048,
      2049,
      2050,
      2117,
      2118
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {
      2011,
      2012,
      2013,
      2014,
      2015,
      2016,
      2017,
      2018,
      2019,
      2020,
      2038,
      2039,
      2040,
      2041,
      2042,
      2043,
      2044,
      2045,
      2119,
      2120
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {
      2046,
      2047,
      2052,
      2053,
      2054,
      2055,
      2056,
      2057,
      2058,
      2059,
      2080,
      2081,
      2082,
      2083,
      2094,
      2095,
      2096,
      2097,
      2121,
      2122
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {
      2098,
      2099,
      2100,
      2101,
      2102,
      2103,
      2104,
      2105,
      2106,
      2107,
      2108,
      2109,
      2110,
      2111,
      2112,
      2113,
      2114,
      2115,
      2123,
      2124
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
require("V3_1/FightingStage_ByTime")
