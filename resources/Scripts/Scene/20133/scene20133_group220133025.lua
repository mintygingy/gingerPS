local base_info = {group_id = 220133025}
local defs = {
  selectID_horizon = 54,
  selectID_vertical = 55,
  horizon_steps = {},
  vertical_steps = {}
}
monsters = {}
npcs = {}
gadgets = {
  [25001] = {
    config_id = 25001,
    gadget_id = 70310341,
    pos = {
      x = 4196.588,
      y = 580.639,
      z = 219.136
    },
    rot = {
      x = 347.6,
      y = 27.963,
      z = 355.964
    },
    level = 1
  },
  [25002] = {
    config_id = 25002,
    gadget_id = 70310169,
    pos = {
      x = 4196.661,
      y = 579.378,
      z = 219.463
    },
    rot = {
      x = 16.639,
      y = 25.915,
      z = 355.886
    },
    level = 20,
    persistent = true
  },
  [25003] = {
    config_id = 25003,
    gadget_id = 70690001,
    pos = {
      x = 4202.204,
      y = 583.2,
      z = 231.211
    },
    rot = {
      x = 351.681,
      y = 27.672,
      z = 356.016
    },
    level = 1
  },
  [25004] = {
    config_id = 25004,
    gadget_id = 70690001,
    pos = {
      x = 4212.55,
      y = 578.789,
      z = 251.268
    },
    rot = {
      x = 2.827,
      y = 39.262,
      z = 356.581
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1025007,
    name = "VARIABLE_CHANGE_25007",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_25007",
    action = "action_EVENT_VARIABLE_CHANGE_25007",
    trigger_count = 0
  },
  {
    config_id = 1025009,
    name = "TIME_AXIS_PASS_25009",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_25009",
    action = "action_EVENT_TIME_AXIS_PASS_25009",
    trigger_count = 0
  }
}
variables = {}
garbages = {
  triggers = {
    {
      config_id = 1025005,
      name = "GADGET_STATE_CHANGE_25005",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_25005",
      action = "action_EVENT_GADGET_STATE_CHANGE_25005",
      trigger_count = 0
    },
    {
      config_id = 1025006,
      name = "GADGET_STATE_CHANGE_25006",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_25006",
      action = "action_EVENT_GADGET_STATE_CHANGE_25006",
      trigger_count = 0
    },
    {
      config_id = 1025008,
      name = "TIME_AXIS_PASS_25008",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "condition_EVENT_TIME_AXIS_PASS_25008",
      action = "action_EVENT_TIME_AXIS_PASS_25008",
      trigger_count = 0
    },
    {
      config_id = 1025010,
      name = "VARIABLE_CHANGE_25010",
      event = EventType.EVENT_VARIABLE_CHANGE,
      source = "",
      condition = "condition_EVENT_VARIABLE_CHANGE_25010",
      action = "action_EVENT_VARIABLE_CHANGE_25010",
      trigger_count = 0
    },
    {
      config_id = 1025011,
      name = "TIME_AXIS_PASS_25011",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "condition_EVENT_TIME_AXIS_PASS_25011",
      action = "action_EVENT_TIME_AXIS_PASS_25011",
      trigger_count = 0
    },
    {
      config_id = 1025012,
      name = "TIME_AXIS_PASS_25012",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "condition_EVENT_TIME_AXIS_PASS_25012",
      action = "action_EVENT_TIME_AXIS_PASS_25012",
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
    gadgets = {25002},
    regions = {},
    triggers = {
      "VARIABLE_CHANGE_25007",
      "TIME_AXIS_PASS_25009"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      25001,
      25003,
      25004
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_VARIABLE_CHANGE_25007(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "big_flower") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_25007(context, evt)
  ScriptLib.InitTimeAxis(context, "WindTimeA", {16}, false)
  ScriptLib.AddExtraGroupSuite(context, 220133025, 2)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_25009(context, evt)
  if "WindTimeA" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_25009(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220133025, 2)
  ScriptLib.SetGroupVariableValue(context, "big_flower", 0)
  return 0
end
require("V2_8/TransferFlower")
