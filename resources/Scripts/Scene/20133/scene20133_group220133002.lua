local base_info = {group_id = 220133002}
local defs = {
  selectID_horizon = 54,
  selectID_vertical = 55,
  horizon_steps = {},
  vertical_steps = {}
}
monsters = {}
npcs = {}
gadgets = {
  [2001] = {
    config_id = 2001,
    gadget_id = 70690001,
    pos = {
      x = 5035.966,
      y = 537.398,
      z = -1709.172
    },
    rot = {
      x = 345.359,
      y = 342.696,
      z = 358.323
    },
    level = 1
  },
  [2004] = {
    config_id = 2004,
    gadget_id = 70310169,
    pos = {
      x = 5039.584,
      y = 533.182,
      z = -1720.881
    },
    rot = {
      x = 23.971,
      y = 341.551,
      z = 358.225
    },
    level = 20,
    persistent = true
  },
  [2009] = {
    config_id = 2009,
    gadget_id = 70310341,
    pos = {
      x = 5039.653,
      y = 534.51,
      z = -1720.972
    },
    rot = {
      x = 345.359,
      y = 342.696,
      z = 358.323
    },
    level = 20
  }
}
regions = {}
triggers = {
  {
    config_id = 1002010,
    name = "VARIABLE_CHANGE_2010",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_2010",
    action = "action_EVENT_VARIABLE_CHANGE_2010",
    trigger_count = 0
  },
  {
    config_id = 1002012,
    name = "TIME_AXIS_PASS_2012",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_2012",
    action = "action_EVENT_TIME_AXIS_PASS_2012",
    trigger_count = 0
  }
}
variables = {}
garbages = {
  triggers = {
    {
      config_id = 1002011,
      name = "TIME_AXIS_PASS_2011",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "condition_EVENT_TIME_AXIS_PASS_2011",
      action = "action_EVENT_TIME_AXIS_PASS_2011",
      trigger_count = 0
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
    gadgets = {2004},
    regions = {},
    triggers = {
      "VARIABLE_CHANGE_2010",
      "TIME_AXIS_PASS_2012"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {2001, 2009},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_VARIABLE_CHANGE_2010(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "big_flower") ~= 1 then
    return false
  end
  if GadgetState.Default ~= ScriptLib.GetGadgetStateByConfigId(context, 220133002, 2004) then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_2010(context, evt)
  ScriptLib.InitTimeAxis(context, "WindTimeA", {15}, false)
  ScriptLib.AddExtraGroupSuite(context, 220133002, 2)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_2012(context, evt)
  if "WindTimeA" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_2012(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220133002, 2)
  ScriptLib.SetGroupVariableValue(context, "big_flower", 0)
  return 0
end
require("V2_8/TransferFlower")
