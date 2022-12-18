local base_info = {group_id = 220133021}
local defs = {
  selectID_horizon = 54,
  selectID_vertical = 55,
  horizon_steps = {
    [21013] = {
      0,
      104,
      103
    }
  },
  vertical_steps = {}
}
monsters = {}
npcs = {}
gadgets = {
  [21001] = {
    config_id = 21001,
    gadget_id = 70310341,
    pos = {
      x = 4164.53,
      y = 589.1,
      z = 232.569
    },
    rot = {
      x = 321.733,
      y = 181.6,
      z = 358.977
    },
    level = 1
  },
  [21002] = {
    config_id = 21002,
    gadget_id = 70310169,
    pos = {
      x = 4164.535,
      y = 587.976,
      z = 231.911
    },
    rot = {
      x = 1.922,
      y = 180.94,
      z = 359.197
    },
    level = 20,
    persistent = true
  },
  [21003] = {
    config_id = 21003,
    gadget_id = 70690001,
    pos = {
      x = 4164.323,
      y = 594.95,
      z = 225.156
    },
    rot = {
      x = 321.733,
      y = 181.6,
      z = 358.977
    },
    level = 1
  },
  [21004] = {
    config_id = 21004,
    gadget_id = 70310170,
    pos = {
      x = 4173.305,
      y = 588.124,
      z = 223.048
    },
    rot = {
      x = 0.0,
      y = 104.551,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  [21013] = {
    config_id = 21013,
    gadget_id = 70310167,
    pos = {
      x = 4164.599,
      y = 588.061,
      z = 222.981
    },
    rot = {
      x = 0.0,
      y = 181.707,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  [21014] = {
    config_id = 21014,
    gadget_id = 70310170,
    pos = {
      x = 4178.841,
      y = 588.085,
      z = 221.593
    },
    rot = {
      x = 22.573,
      y = 62.672,
      z = 0.729
    },
    level = 1,
    persistent = true
  },
  [21015] = {
    config_id = 21015,
    gadget_id = 70310170,
    pos = {
      x = 4187.338,
      y = 584.406,
      z = 226.409
    },
    rot = {
      x = 21.642,
      y = 119.273,
      z = -0.003
    },
    level = 1,
    persistent = true
  },
  [21016] = {
    config_id = 21016,
    gadget_id = 70310171,
    pos = {
      x = 4155.373,
      y = 588.117,
      z = 221.208
    },
    rot = {
      x = 0.0,
      y = 91.893,
      z = 0.0
    },
    level = 1,
    persistent = true,
    interact_id = 64
  },
  [21017] = {
    config_id = 21017,
    gadget_id = 70310170,
    pos = {
      x = 4155.992,
      y = 588.045,
      z = 222.996
    },
    rot = {
      x = 0.0,
      y = 89.975,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  [21018] = {
    config_id = 21018,
    gadget_id = 70211165,
    pos = {
      x = 4164.717,
      y = 588.076,
      z = 214.099
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 16,
    drop_tag = "\232\167\163\232\176\156\228\184\173\231\186\167\231\190\164\229\178\155",
    state = GadgetState.ChestLocked,
    isOneoff = true,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1021007,
    name = "VARIABLE_CHANGE_21007",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_21007",
    action = "action_EVENT_VARIABLE_CHANGE_21007",
    trigger_count = 0
  },
  {
    config_id = 1021009,
    name = "TIME_AXIS_PASS_21009",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_21009",
    action = "action_EVENT_TIME_AXIS_PASS_21009",
    trigger_count = 0
  }
}
variables = {}
garbages = {
  triggers = {
    {
      config_id = 1021005,
      name = "GADGET_STATE_CHANGE_21005",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_21005",
      action = "action_EVENT_GADGET_STATE_CHANGE_21005",
      trigger_count = 0
    },
    {
      config_id = 1021006,
      name = "GADGET_STATE_CHANGE_21006",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_21006",
      action = "action_EVENT_GADGET_STATE_CHANGE_21006",
      trigger_count = 0
    },
    {
      config_id = 1021008,
      name = "TIME_AXIS_PASS_21008",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "condition_EVENT_TIME_AXIS_PASS_21008",
      action = "action_EVENT_TIME_AXIS_PASS_21008",
      trigger_count = 0
    },
    {
      config_id = 1021010,
      name = "VARIABLE_CHANGE_21010",
      event = EventType.EVENT_VARIABLE_CHANGE,
      source = "",
      condition = "condition_EVENT_VARIABLE_CHANGE_21010",
      action = "action_EVENT_VARIABLE_CHANGE_21010",
      trigger_count = 0
    },
    {
      config_id = 1021011,
      name = "TIME_AXIS_PASS_21011",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "condition_EVENT_TIME_AXIS_PASS_21011",
      action = "action_EVENT_TIME_AXIS_PASS_21011",
      trigger_count = 0
    },
    {
      config_id = 1021012,
      name = "TIME_AXIS_PASS_21012",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "condition_EVENT_TIME_AXIS_PASS_21012",
      action = "action_EVENT_TIME_AXIS_PASS_21012",
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
    gadgets = {
      21002,
      21004,
      21013,
      21014,
      21015,
      21016,
      21017,
      21018
    },
    regions = {},
    triggers = {
      "VARIABLE_CHANGE_21007",
      "TIME_AXIS_PASS_21009"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {21001, 21003},
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
function condition_EVENT_VARIABLE_CHANGE_21007(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "big_flower") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_21007(context, evt)
  ScriptLib.InitTimeAxis(context, "WindTimeA", {16}, false)
  ScriptLib.AddExtraGroupSuite(context, 220133021, 2)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_21009(context, evt)
  if "WindTimeA" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_21009(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220133021, 2)
  ScriptLib.SetGroupVariableValue(context, "big_flower", 0)
  return 0
end
require("V2_8/TransferFlower")
