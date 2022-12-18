local base_info = {group_id = 250079006}
local defs = {
  patterns = {
    [1] = {
      [6001] = 6002,
      [6002] = 6003,
      [6003] = 0,
      [6004] = 6001,
      [6005] = 0,
      [6006] = 0,
      [6007] = 0,
      [6008] = 0
    },
    [2] = {
      [6001] = 6002,
      [6002] = 6003,
      [6003] = 0,
      [6004] = 6001,
      [6005] = 6007,
      [6006] = 6005,
      [6007] = 0,
      [6008] = 6006
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
      x = 680.784,
      y = 624.767,
      z = -1590.317
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6002] = {
    config_id = 6002,
    gadget_id = 70310179,
    pos = {
      x = 678.86,
      y = 623.421,
      z = -1590.159
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6003] = {
    config_id = 6003,
    gadget_id = 70310179,
    pos = {
      x = 678.701,
      y = 620.094,
      z = -1590.198
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6004] = {
    config_id = 6004,
    gadget_id = 70310179,
    pos = {
      x = 680.248,
      y = 620.179,
      z = -1590.33
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6005] = {
    config_id = 6005,
    gadget_id = 70310179,
    pos = {
      x = 682.608,
      y = 619.827,
      z = -1586.141
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6006] = {
    config_id = 6006,
    gadget_id = 70310179,
    pos = {
      x = 680.108,
      y = 619.617,
      z = -1586.778
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6007] = {
    config_id = 6007,
    gadget_id = 70310179,
    pos = {
      x = 680.248,
      y = 620.179,
      z = -1590.33
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6008] = {
    config_id = 6008,
    gadget_id = 70310179,
    pos = {
      x = 678.701,
      y = 620.094,
      z = -1590.198
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6009] = {
    config_id = 6009,
    gadget_id = 70220021,
    pos = {
      x = 646.427,
      y = 618.679,
      z = -1605.46
    },
    rot = {
      x = 0.0,
      y = 117.504,
      z = 0.0
    },
    level = 1
  },
  [6010] = {
    config_id = 6010,
    gadget_id = 70380306,
    pos = {
      x = 657.997,
      y = 619.547,
      z = -1584.845
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
triggers = {
  {
    config_id = 1006011,
    name = "ANY_GADGET_DIE_6011",
    event = EventType.EVENT_ANY_GADGET_DIE,
    source = "",
    condition = "condition_EVENT_ANY_GADGET_DIE_6011",
    action = "action_EVENT_ANY_GADGET_DIE_6011"
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
      6001,
      6002,
      6003,
      6004,
      6005,
      6006,
      6007,
      6008,
      6009
    },
    regions = {},
    triggers = {
      "ANY_GADGET_DIE_6011"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ANY_GADGET_DIE_6011(context, evt)
  if 6009 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_GADGET_DIE_6011(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 6010}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "pattern", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
require("V2_8/ConstellationPattern")
