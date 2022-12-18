local base_info = {group_id = 220149019}
local defs = {gadget_LookHookCid = 19003}
local RequireSuite = {1}
local HookLookPlay = {
  HookPoint = defs.gadget_LookHookCid,
  Duration = 3
}
monsters = {}
npcs = {}
gadgets = {
  [19001] = {
    config_id = 19001,
    gadget_id = 70330229,
    pos = {
      x = 468.464,
      y = 132.467,
      z = 378.597
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
  [19002] = {
    config_id = 19002,
    gadget_id = 70330251,
    pos = {
      x = 438.828,
      y = 148.647,
      z = 370.556
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 30,
    mark_flag = 3
  },
  [19003] = {
    config_id = 19003,
    gadget_id = 70220103,
    pos = {
      x = 438.828,
      y = 148.647,
      z = 370.556
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
    config_id = 1019005,
    name = "GADGET_STATE_CHANGE_19005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_19005",
    action = "action_EVENT_GADGET_STATE_CHANGE_19005"
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
    gadgets = {19001, 19002},
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_19005"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {19003},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_19005(context, evt)
  if 19001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_19005(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220149019, 2)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "RaioState", 1, 220149017) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  return 0
end
require("V3_0/HookLook")
