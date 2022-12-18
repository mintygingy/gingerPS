local base_info = {group_id = 220169007}
local EnterConfigID = 7009
local thunderFloorTimer = {7}
local floorList = {
  7001,
  7002,
  7003,
  7004,
  7005,
  7006,
  7007,
  7008
}
local randomNumMin = 8
local randomNumMax = 8
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 7001,
    gadget_id = 70360285,
    pos = {
      x = 25.37,
      y = 65.152,
      z = -73.803
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
    gadget_id = 70360285,
    pos = {
      x = 25.37,
      y = 65.152,
      z = -68.558
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
    gadget_id = 70360285,
    pos = {
      x = 22.708,
      y = 65.152,
      z = -68.558
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
    gadget_id = 70360285,
    pos = {
      x = 22.708,
      y = 65.152,
      z = -73.804
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
    gadget_id = 70360285,
    pos = {
      x = 20.056,
      y = 65.152,
      z = -68.565
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
    gadget_id = 70360285,
    pos = {
      x = 20.056,
      y = 65.152,
      z = -73.814
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
    gadget_id = 70360285,
    pos = {
      x = 17.407,
      y = 65.152,
      z = -73.814
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 7008,
    gadget_id = 70360285,
    pos = {
      x = 17.407,
      y = 65.152,
      z = -68.565
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
  {
    config_id = 7009,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 10.0,
      z = 20.0
    },
    pos = {
      x = 21.18,
      y = 68.436,
      z = -68.145
    }
  }
}
triggers = {
  {
    config_id = 1007009,
    name = "ENTER_REGION_7009",
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
    gadgets = {
      7001,
      7002,
      7003,
      7004,
      7005,
      7006,
      7007,
      7008
    },
    regions = {7009},
    triggers = {
      "ENTER_REGION_7009"
    },
    rand_weight = 100
  }
}
require("V2_0/ThunderFloor")
