local base_info = {group_id = 220159006}
local defs = {gadget_LookHookCid = 6003}
local RequireSuite = {1}
local HookLookPlay = {
  HookPoint = defs.gadget_LookHookCid,
  Duration = 3
}
monsters = {}
npcs = {}
gadgets = {
  [6001] = {
    config_id = 6001,
    gadget_id = 70330229,
    pos = {
      x = 451.977,
      y = 85.095,
      z = 481.868
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 30,
    persistent = true,
    mark_flag = 3
  },
  [6002] = {
    config_id = 6002,
    gadget_id = 70330251,
    pos = {
      x = 452.106,
      y = 92.021,
      z = 494.618
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 30,
    mark_flag = 3
  },
  [6003] = {
    config_id = 6003,
    gadget_id = 70220103,
    pos = {
      x = 444.477,
      y = 93.648,
      z = 496.977
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 30,
    persistent = true
  },
  [6004] = {
    config_id = 6004,
    gadget_id = 70220103,
    pos = {
      x = 436.086,
      y = 100.897,
      z = 519.622
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 30,
    persistent = true
  },
  [6006] = {
    config_id = 6006,
    gadget_id = 70220103,
    pos = {
      x = 453.05,
      y = 100.858,
      z = 532.275
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 30,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1006005,
    name = "GADGET_STATE_CHANGE_6005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_6005",
    action = "action_EVENT_GADGET_STATE_CHANGE_6005"
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
    gadgets = {6001, 6002},
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_6005"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      6003,
      6004,
      6006
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_6005(context, evt)
  if 6001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_6005(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220159006, 2)
  return 0
end
require("V3_0/HookLook")
