local base_info = {group_id = 220133070}
local defs = {
  selectID_horizon = 54,
  selectID_vertical = 55,
  horizon_steps = {
    [70004] = {0, 104}
  },
  vertical_steps = {}
}
monsters = {}
npcs = {}
gadgets = {
  [70001] = {
    config_id = 70001,
    gadget_id = 70690001,
    pos = {
      x = 5030.495,
      y = 529.525,
      z = -1669.224
    },
    rot = {
      x = 349.934,
      y = 52.646,
      z = 359.937
    },
    level = 1
  },
  [70002] = {
    config_id = 70002,
    gadget_id = 70690001,
    pos = {
      x = 5041.013,
      y = 529.235,
      z = -1659.799
    },
    rot = {
      x = 351.386,
      y = 36.183,
      z = 359.889
    },
    level = 1
  },
  [70003] = {
    config_id = 70003,
    gadget_id = 70310170,
    pos = {
      x = 5018.709,
      y = 523.281,
      z = -1657.248
    },
    rot = {
      x = 345.825,
      y = 158.139,
      z = 359.115
    },
    level = 1,
    persistent = true
  },
  [70004] = {
    config_id = 70004,
    gadget_id = 70310166,
    pos = {
      x = 5019.285,
      y = 526.793,
      z = -1675.66
    },
    rot = {
      x = 347.947,
      y = 158.377,
      z = 11.205
    },
    level = 20,
    persistent = true,
    worktop_config = {
      init_options = {54}
    }
  },
  [70006] = {
    config_id = 70006,
    gadget_id = 70690001,
    pos = {
      x = 5023.593,
      y = 530.856,
      z = -1685.808
    },
    rot = {
      x = 345.902,
      y = 169.627,
      z = 0.0
    },
    level = 1
  },
  [70007] = {
    config_id = 70007,
    gadget_id = 70690001,
    pos = {
      x = 5026.307,
      y = 533.63,
      z = -1696.456
    },
    rot = {
      x = 346.832,
      y = 139.851,
      z = 3.635
    },
    level = 1
  },
  [70009] = {
    config_id = 70009,
    gadget_id = 70310170,
    pos = {
      x = 5021.024,
      y = 525.037,
      z = -1663.028
    },
    rot = {
      x = 358.001,
      y = 150.752,
      z = 13.861
    },
    level = 1,
    persistent = true
  },
  [70010] = {
    config_id = 70010,
    gadget_id = 70310170,
    pos = {
      x = 5024.499,
      y = 525.216,
      z = -1669.381
    },
    rot = {
      x = 347.645,
      y = 218.869,
      z = 354.689
    },
    level = 1,
    persistent = true
  },
  [70011] = {
    config_id = 70011,
    gadget_id = 70310341,
    pos = {
      x = 5018.857,
      y = 528.727,
      z = -1676.479
    },
    rot = {
      x = 339.119,
      y = 152.705,
      z = 353.977
    },
    level = 20
  },
  [70012] = {
    config_id = 70012,
    gadget_id = 70310341,
    pos = {
      x = 5019.348,
      y = 527.817,
      z = -1674.848
    },
    rot = {
      x = 341.847,
      y = 57.212,
      z = 352.298
    },
    level = 20
  }
}
regions = {}
triggers = {
  {
    config_id = 1070023,
    name = "GADGET_STATE_CHANGE_70023",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_70023",
    action = "action_EVENT_GADGET_STATE_CHANGE_70023",
    trigger_count = 0
  },
  {
    config_id = 1070024,
    name = "GADGET_STATE_CHANGE_70024",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_70024",
    action = "action_EVENT_GADGET_STATE_CHANGE_70024",
    trigger_count = 0
  },
  {
    config_id = 1070025,
    name = "VARIABLE_CHANGE_70025",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_70025",
    action = "action_EVENT_VARIABLE_CHANGE_70025",
    trigger_count = 0
  },
  {
    config_id = 1070027,
    name = "TIME_AXIS_PASS_70027",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_70027",
    action = "action_EVENT_TIME_AXIS_PASS_70027",
    trigger_count = 0
  },
  {
    config_id = 1070028,
    name = "VARIABLE_CHANGE_70028",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_70028",
    action = "action_EVENT_VARIABLE_CHANGE_70028",
    trigger_count = 0
  },
  {
    config_id = 1070030,
    name = "TIME_AXIS_PASS_70030",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_70030",
    action = "action_EVENT_TIME_AXIS_PASS_70030",
    trigger_count = 0
  }
}
variables = {}
garbages = {
  triggers = {
    {
      config_id = 1070026,
      name = "TIME_AXIS_PASS_70026",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "condition_EVENT_TIME_AXIS_PASS_70026",
      action = "action_EVENT_TIME_AXIS_PASS_70026",
      trigger_count = 0
    },
    {
      config_id = 1070029,
      name = "TIME_AXIS_PASS_70029",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "condition_EVENT_TIME_AXIS_PASS_70029",
      action = "action_EVENT_TIME_AXIS_PASS_70029",
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
      70003,
      70004,
      70009,
      70010
    },
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_70023",
      "GADGET_STATE_CHANGE_70024",
      "VARIABLE_CHANGE_70025",
      "TIME_AXIS_PASS_70027",
      "VARIABLE_CHANGE_70028",
      "TIME_AXIS_PASS_70030"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      70006,
      70007,
      70011
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      70001,
      70002,
      70012
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_70023(context, evt)
  if 70004 ~= evt.param2 or GadgetState.ChestTrap ~= evt.param1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "big_flower") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_70023(context, evt)
  ScriptLib.SetGroupVariableValue(context, "big_flower", 0)
  ScriptLib.RemoveExtraGroupSuite(context, 220133070, 2)
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_70024(context, evt)
  if 70004 ~= evt.param2 or GadgetState.Default ~= evt.param1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "big_flower") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_70024(context, evt)
  ScriptLib.SetGroupVariableValue(context, "big_flower", 0)
  ScriptLib.RemoveExtraGroupSuite(context, 220133070, 3)
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_70025(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "big_flower") ~= 1 then
    return false
  end
  if GadgetState.Default ~= ScriptLib.GetGadgetStateByConfigId(context, 220133070, 70004) then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_70025(context, evt)
  ScriptLib.InitTimeAxis(context, "WindTimeA", {15}, false)
  ScriptLib.AddExtraGroupSuite(context, 220133070, 2)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_70027(context, evt)
  if "WindTimeA" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_70027(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220133070, 2)
  ScriptLib.SetGroupVariableValue(context, "big_flower", 0)
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_70028(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "big_flower") ~= 1 then
    return false
  end
  if GadgetState.ChestBramble ~= ScriptLib.GetGadgetStateByConfigId(context, 220133070, 70004) then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_70028(context, evt)
  ScriptLib.InitTimeAxis(context, "WindTimeB", {15}, false)
  ScriptLib.AddExtraGroupSuite(context, 220133070, 3)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_70030(context, evt)
  if "WindTimeB" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_70030(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220133070, 3)
  ScriptLib.SetGroupVariableValue(context, "big_flower", 0)
  return 0
end
require("V2_8/TransferFlower")
