local base_info = {group_id = 220151003}
local defs = {
  option_id = 494,
  pointarray_ID = 2,
  elevatorOptionID = 24,
  gadget_elevatorID = 3005
}
defs.gadget_1 = 3001
defs.gadget_2 = 3002
defs.gadget_3 = 3003
defs.rotation_1 = 120
defs.rotation_2 = 0
defs.rotation_3 = 240
defs.gadget_connect1 = {3002, 3003}
defs.gadget_connect2 = {3003}
defs.gadget_connect3 = {}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 3001,
    gadget_id = 70330302,
    pos = {
      x = -15.479,
      y = 0.6,
      z = 50.018
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 3002,
    gadget_id = 70330302,
    pos = {
      x = -29.778,
      y = 0.615,
      z = 50.017
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 3003,
    gadget_id = 70330302,
    pos = {
      x = -44.552,
      y = 0.615,
      z = 50.017
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 3007,
    gadget_id = 70330303,
    pos = {
      x = -15.479,
      y = 0.6,
      z = 50.018
    },
    rot = {
      x = 0.0,
      y = 120.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 3008,
    gadget_id = 70330303,
    pos = {
      x = -29.778,
      y = 0.615,
      z = 50.017
    },
    rot = {
      x = 0.0,
      y = 120.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 3009,
    gadget_id = 70330303,
    pos = {
      x = -44.552,
      y = 0.615,
      z = 50.017
    },
    rot = {
      x = 0.0,
      y = 120.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1003004,
    name = "VARIABLE_CHANGE_3004",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_3004",
    action = "action_EVENT_VARIABLE_CHANGE_3004"
  }
}
variables = {}
garbages = {
  gadgets = {
    {
      config_id = 3005,
      gadget_id = 70330316,
      pos = {
        x = -30.294,
        y = -11.0,
        z = 72.51
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1
    },
    {
      config_id = 3006,
      gadget_id = 70330341,
      pos = {
        x = -35.662,
        y = -19.64,
        z = 77.57
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1,
      worktop_config = {
        init_options = {24}
      }
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
    gadgets = {
      3001,
      3002,
      3003,
      3007,
      3008,
      3009
    },
    regions = {},
    triggers = {
      "VARIABLE_CHANGE_3004"
    },
    rand_weight = 100
  }
}
function condition_EVENT_VARIABLE_CHANGE_3004(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "success", 220151003) ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_3004(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "success1", 1, 220151004) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  return 0
end
require("V3_1/DesertRotObelisk_Select")
