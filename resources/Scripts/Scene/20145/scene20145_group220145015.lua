local base_info = {group_id = 220145015}
local defs = {gadget_LookHookCid = 15003}
local RequireSuite = {1}
local HookLookPlay = {
  HookPoint = defs.gadget_LookHookCid,
  Duration = 3
}
monsters = {}
npcs = {}
gadgets = {
  [15001] = {
    config_id = 15001,
    gadget_id = 70330229,
    pos = {
      x = 482.146,
      y = 98.282,
      z = 522.783
    },
    rot = {
      x = 0.0,
      y = 278.927,
      z = 0.0
    },
    level = 30,
    mark_flag = 3
  },
  [15002] = {
    config_id = 15002,
    gadget_id = 70330251,
    pos = {
      x = 470.345,
      y = 104.134,
      z = 525.932
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 30,
    mark_flag = 3
  },
  [15003] = {
    config_id = 15003,
    gadget_id = 70220103,
    pos = {
      x = 470.345,
      y = 104.134,
      z = 525.932
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 30
  }
}
regions = {}
triggers = {
  {
    config_id = 1015005,
    name = "GADGET_STATE_CHANGE_15005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_15005",
    action = "action_EVENT_GADGET_STATE_CHANGE_15005"
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
    gadgets = {15001, 15002},
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_15005"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {15003},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_15005(context, evt)
  if 15001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_15005(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220145015, 2)
  return 0
end
require("V3_0/HookLook")
