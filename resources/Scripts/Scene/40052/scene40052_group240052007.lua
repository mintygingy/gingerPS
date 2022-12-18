local base_info = {group_id = 240052007}
local defs = {gadget_LookHookCid = 7002}
local RequireSuite = {1}
local HookLookPlay = {
  HookPoint = defs.gadget_LookHookCid,
  Duration = 3
}
monsters = {}
npcs = {}
gadgets = {
  [7001] = {
    config_id = 7001,
    gadget_id = 70330229,
    pos = {
      x = 745.295,
      y = 57.678,
      z = 369.885
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 30,
    mark_flag = 3
  },
  [7002] = {
    config_id = 7002,
    gadget_id = 70330251,
    pos = {
      x = 760.72,
      y = 79.21,
      z = 380.861
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 30,
    mark_flag = 3
  },
  [7003] = {
    config_id = 7003,
    gadget_id = 70220103,
    pos = {
      x = 760.72,
      y = 79.21,
      z = 380.861
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
    config_id = 1007005,
    name = "GADGET_STATE_CHANGE_7005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_7005",
    action = "action_EVENT_GADGET_STATE_CHANGE_7005"
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
    gadgets = {7001, 7002},
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_7005"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {7003},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_7005(context, evt)
  if 7001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_7005(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 240052007, 2)
  return 0
end
require("V3_0/HookLook")
