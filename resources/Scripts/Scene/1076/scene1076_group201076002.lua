local base_info = {group_id = 201076002}
monsters = {
  {
    config_id = 2001,
    monster_id = 28020511,
    pos = {
      x = -4.974,
      y = 0.288,
      z = 6.038
    },
    rot = {
      x = 0.0,
      y = 57.828,
      z = 0.0
    },
    level = 1,
    pose_id = 1,
    room = 1
  },
  {
    config_id = 2002,
    monster_id = 28020511,
    pos = {
      x = 0.186,
      y = 0.036,
      z = 6.875
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    pose_id = 1,
    room = 1
  },
  {
    config_id = 2003,
    monster_id = 28020511,
    pos = {
      x = -0.981,
      y = 0.036,
      z = 8.199
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    pose_id = 1,
    room = 1
  },
  {
    config_id = 2004,
    monster_id = 28020512,
    pos = {
      x = 1.262,
      y = 0.036,
      z = 6.553
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    pose_id = 1,
    room = 1
  },
  {
    config_id = 2005,
    monster_id = 28020512,
    pos = {
      x = 0.386,
      y = 0.036,
      z = 8.157
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    pose_id = 1,
    room = 1
  },
  {
    config_id = 2006,
    monster_id = 28020512,
    pos = {
      x = 1.072,
      y = 0.036,
      z = 7.952
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    pose_id = 1,
    room = 1
  },
  {
    config_id = 2007,
    monster_id = 28020513,
    pos = {
      x = -5.636,
      y = 0.0,
      z = 11.891
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    pose_id = 1,
    room = 1
  },
  {
    config_id = 2008,
    monster_id = 28020513,
    pos = {
      x = -4.861,
      y = 0.0,
      z = 12.0
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    pose_id = 1,
    room = 1
  },
  {
    config_id = 2009,
    monster_id = 28020513,
    pos = {
      x = -4.241,
      y = 0.0,
      z = 12.26
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    pose_id = 1,
    room = 1
  },
  {
    config_id = 2013,
    monster_id = 28020506,
    pos = {
      x = -3.22,
      y = 0.02,
      z = 7.251
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    pose_id = 1,
    room = 1
  },
  {
    config_id = 2014,
    monster_id = 28020506,
    pos = {
      x = -2.917,
      y = 0.02,
      z = 9.409
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    pose_id = 1,
    room = 1
  },
  {
    config_id = 2015,
    monster_id = 28020506,
    pos = {
      x = -2.135,
      y = 0.036,
      z = 8.335
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    pose_id = 1,
    room = 1
  },
  {
    config_id = 2016,
    monster_id = 28020501,
    pos = {
      x = -9.786,
      y = 0.0,
      z = 9.585
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    pose_id = 1,
    room = 1
  },
  {
    config_id = 2017,
    monster_id = 28020501,
    pos = {
      x = -8.707,
      y = 0.0,
      z = 9.838
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    pose_id = 1,
    room = 1
  },
  {
    config_id = 2018,
    monster_id = 28020501,
    pos = {
      x = -9.371,
      y = 0.0,
      z = 10.559
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    pose_id = 1,
    room = 1
  }
}
npcs = {}
gadgets = {}
regions = {}
triggers = {}
variables = {}
init_config = {
  suite = 1,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {
      2001,
      2006,
      2009,
      2015,
      2018
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {
      2002,
      2004,
      2007,
      2013,
      2016
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {
      2003,
      2005,
      2008,
      2014,
      2017
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
require("V3_2/PubAnimal")
