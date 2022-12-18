local base_info = {group_id = 420050007}
local defs = {challengeTime = 2, delayTime = 5}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 7001,
    gadget_id = 77307017,
    pos = {
      x = 554.524,
      y = 383.6,
      z = 223.562
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 7002,
    gadget_id = 77307016,
    pos = {
      x = 548.976,
      y = 383.6,
      z = 219.659
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 7003,
    gadget_id = 77307016,
    pos = {
      x = 554.387,
      y = 383.6,
      z = 219.796
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 7004,
    gadget_id = 77307016,
    pos = {
      x = 560.292,
      y = 383.6,
      z = 219.535
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 7005,
    gadget_id = 77307016,
    pos = {
      x = 549.677,
      y = 383.6,
      z = 214.372
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 7006,
    gadget_id = 77307016,
    pos = {
      x = 554.425,
      y = 383.6,
      z = 214.543
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 7007,
    gadget_id = 77307016,
    pos = {
      x = 559.858,
      y = 383.6,
      z = 214.593
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
    gadgets = {
      7001,
      7002,
      7003,
      7004,
      7005,
      7006,
      7007
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
require("V2_6/HM_WoodenStakeChallenge")
