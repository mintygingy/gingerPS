local base_info = {group_id = 220134061}
local defs = {
  gear_info = {
    [1] = {
      config_id = 61001,
      connect = {
        61008,
        61003,
        61002
      },
      point_array_id = 70
    },
    [2] = {
      config_id = 61002,
      connect = {
        61001,
        61008,
        61003
      },
      point_array_id = 71
    },
    [3] = {
      config_id = 61003,
      connect = {
        61002,
        61008,
        61007,
        61004
      },
      point_array_id = 72
    },
    [4] = {
      config_id = 61004,
      connect = {
        61006,
        61005,
        61003,
        61007
      },
      point_array_id = 73
    },
    [5] = {
      config_id = 61005,
      connect = {61004, 61006},
      point_array_id = 74
    },
    [6] = {
      config_id = 61006,
      connect = {
        61007,
        61004,
        61005
      },
      point_array_id = 75
    },
    [7] = {
      config_id = 61007,
      connect = {
        61008,
        61003,
        61006
      },
      point_array_id = 76
    },
    [8] = {
      config_id = 61008,
      connect = {
        61007,
        61001,
        61003
      },
      point_array_id = 77
    }
  },
  solutions = {
    [1] = {
      connection = {
        3,
        3,
        4,
        2,
        2,
        1,
        1,
        2
      },
      ends = {}
    },
    [2] = {
      connection = {
        1,
        1,
        1,
        3,
        1,
        3,
        3,
        1
      },
      ends = {}
    }
  },
  turn_option = 31
}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 61001,
    gadget_id = 70310178,
    pos = {
      x = 665.244,
      y = 623.38,
      z = -1702.316
    },
    rot = {
      x = 0.0,
      y = 180.862,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 61002,
    gadget_id = 70310178,
    pos = {
      x = 665.069,
      y = 623.38,
      z = -1706.248
    },
    rot = {
      x = 0.0,
      y = 226.961,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 61003,
    gadget_id = 70310178,
    pos = {
      x = 659.874,
      y = 623.38,
      z = -1710.808
    },
    rot = {
      x = 0.0,
      y = 178.751,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 61004,
    gadget_id = 70310178,
    pos = {
      x = 659.808,
      y = 623.247,
      z = -1714.203
    },
    rot = {
      x = 0.0,
      y = 8.704,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 61005,
    gadget_id = 70310178,
    pos = {
      x = 658.709,
      y = 623.38,
      z = -1722.086
    },
    rot = {
      x = 0.0,
      y = 321.009,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 61006,
    gadget_id = 70310178,
    pos = {
      x = 653.908,
      y = 623.38,
      z = -1715.951
    },
    rot = {
      x = 0.0,
      y = 140.11,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 61007,
    gadget_id = 70310178,
    pos = {
      x = 654.367,
      y = 623.38,
      z = -1710.46
    },
    rot = {
      x = 0.0,
      y = 179.255,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 61008,
    gadget_id = 70310178,
    pos = {
      x = 656.888,
      y = 623.38,
      z = -1706.317
    },
    rot = {
      x = 0.0,
      y = 140.916,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 61011,
    gadget_id = 70211111,
    pos = {
      x = 666.337,
      y = 623.38,
      z = -1715.615
    },
    rot = {
      x = 0.0,
      y = 301.325,
      z = 0.0
    },
    level = 16,
    drop_tag = "\232\167\163\232\176\156\228\184\173\231\186\167\231\190\164\229\178\155",
    isOneoff = true,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1061012,
    name = "VARIABLE_CHANGE_61012",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_61012",
    action = "action_EVENT_VARIABLE_CHANGE_61012",
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
      61001,
      61002,
      61003,
      61004,
      61005,
      61006,
      61007,
      61008
    },
    regions = {},
    triggers = {
      "VARIABLE_CHANGE_61012"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {61011},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_VARIABLE_CHANGE_61012(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "solution") < 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_61012(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220134061, 2)
  return 0
end
require("V2_8/ConstellationMachine")
