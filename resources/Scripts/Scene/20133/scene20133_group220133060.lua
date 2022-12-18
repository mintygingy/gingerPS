local base_info = {group_id = 220133060}
local defs = {
  selectID_horizon = 54,
  selectID_vertical = 55,
  horizon_steps = {},
  vertical_steps = {}
}
monsters = {}
npcs = {}
gadgets = {
  [60001] = {
    config_id = 60001,
    gadget_id = 70690001,
    pos = {
      x = 2638.865,
      y = 587.65,
      z = -1732.336
    },
    rot = {
      x = 356.1,
      y = 314.911,
      z = 0.0
    },
    level = 1
  },
  [60002] = {
    config_id = 60002,
    gadget_id = 70690001,
    pos = {
      x = 2626.147,
      y = 588.874,
      z = -1719.658
    },
    rot = {
      x = 356.283,
      y = 312.866,
      z = 0.0
    },
    level = 1
  },
  [60003] = {
    config_id = 60003,
    gadget_id = 70310171,
    pos = {
      x = 2644.169,
      y = 583.978,
      z = -1740.864
    },
    rot = {
      x = 0.0,
      y = 223.612,
      z = 0.0
    },
    level = 1,
    persistent = true,
    interact_id = 64
  },
  [60004] = {
    config_id = 60004,
    gadget_id = 70310169,
    pos = {
      x = 2642.705,
      y = 583.847,
      z = -1739.606
    },
    rot = {
      x = 6.691,
      y = 339.129,
      z = 3.526
    },
    level = 20,
    persistent = true
  },
  [60005] = {
    config_id = 60005,
    gadget_id = 70690001,
    pos = {
      x = 2612.983,
      y = 590.041,
      z = -1707.439
    },
    rot = {
      x = 356.509,
      y = 310.41,
      z = 0.0
    },
    level = 1
  },
  [60006] = {
    config_id = 60006,
    gadget_id = 70690001,
    pos = {
      x = 2599.304,
      y = 591.137,
      z = -1695.794
    },
    rot = {
      x = 356.873,
      y = 306.606,
      z = 0.0
    },
    level = 1
  },
  [60007] = {
    config_id = 60007,
    gadget_id = 70690011,
    pos = {
      x = 2584.264,
      y = 568.735,
      z = -1684.744
    },
    rot = {
      x = 357.686,
      y = 298.563,
      z = 0.0
    },
    level = 1
  },
  [60008] = {
    config_id = 60008,
    gadget_id = 70690001,
    pos = {
      x = 2569.119,
      y = 592.843,
      z = -1676.499
    },
    rot = {
      x = 1.179,
      y = 276.063,
      z = 0.0
    },
    level = 1
  },
  [60009] = {
    config_id = 60009,
    gadget_id = 70690001,
    pos = {
      x = 2551.371,
      y = 592.476,
      z = -1674.614
    },
    rot = {
      x = 6.287,
      y = 265.702,
      z = 0.0
    },
    level = 1
  },
  [60010] = {
    config_id = 60010,
    gadget_id = 70690001,
    pos = {
      x = 2533.537,
      y = 590.506,
      z = -1675.954
    },
    rot = {
      x = 9.504,
      y = 262.584,
      z = 0.0
    },
    level = 1
  },
  [60011] = {
    config_id = 60011,
    gadget_id = 70310341,
    pos = {
      x = 2642.761,
      y = 585.161,
      z = -1739.972
    },
    rot = {
      x = 337.529,
      y = 337.267,
      z = 3.79
    },
    level = 20
  },
  [60012] = {
    config_id = 60012,
    gadget_id = 70690001,
    pos = {
      x = 2515.936,
      y = 587.535,
      z = -1678.245
    },
    rot = {
      x = 12.487,
      y = 261.31,
      z = 0.0
    },
    level = 1
  },
  [60013] = {
    config_id = 60013,
    gadget_id = 70690001,
    pos = {
      x = 2498.566,
      y = 583.643,
      z = -1680.9
    },
    rot = {
      x = 17.046,
      y = 262.035,
      z = 0.0
    },
    level = 1
  },
  [60014] = {
    config_id = 60014,
    gadget_id = 70690011,
    pos = {
      x = 2482.693,
      y = 550.343,
      z = -1682.791
    },
    rot = {
      x = 3.273,
      y = 246.97,
      z = 0.0
    },
    level = 1
  },
  [60015] = {
    config_id = 60015,
    gadget_id = 70690001,
    pos = {
      x = 2466.033,
      y = 572.278,
      z = -1689.873
    },
    rot = {
      x = 18.469,
      y = 238.182,
      z = 0.0
    },
    level = 1
  },
  [60016] = {
    config_id = 60016,
    gadget_id = 70690001,
    pos = {
      x = 2451.528,
      y = 566.577,
      z = -1698.872
    },
    rot = {
      x = 17.978,
      y = 235.656,
      z = 0.0
    },
    level = 1
  },
  [60017] = {
    config_id = 60017,
    gadget_id = 70690001,
    pos = {
      x = 2437.393,
      y = 561.021,
      z = -1708.531
    },
    rot = {
      x = 17.694,
      y = 234.267,
      z = 0.0
    },
    level = 1
  },
  [60018] = {
    config_id = 60018,
    gadget_id = 70690001,
    pos = {
      x = 2423.473,
      y = 555.551,
      z = -1718.546
    },
    rot = {
      x = 17.495,
      y = 233.328,
      z = 0.0
    },
    level = 1
  },
  [60019] = {
    config_id = 60019,
    gadget_id = 70690001,
    pos = {
      x = 2409.703,
      y = 550.139,
      z = -1728.799
    },
    rot = {
      x = 17.337,
      y = 232.599,
      z = 0.0
    },
    level = 1
  },
  [60020] = {
    config_id = 60020,
    gadget_id = 70690001,
    pos = {
      x = 2396.054,
      y = 544.776,
      z = -1739.235
    },
    rot = {
      x = 17.188,
      y = 231.917,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1060024,
    name = "VARIABLE_CHANGE_60024",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_60024",
    action = "action_EVENT_VARIABLE_CHANGE_60024",
    trigger_count = 0
  },
  {
    config_id = 1060026,
    name = "TIME_AXIS_PASS_60026",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_60026",
    action = "action_EVENT_TIME_AXIS_PASS_60026",
    trigger_count = 0
  }
}
variables = {}
garbages = {
  triggers = {
    {
      config_id = 1060022,
      name = "GADGET_STATE_CHANGE_60022",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_60022",
      action = "action_EVENT_GADGET_STATE_CHANGE_60022",
      trigger_count = 0
    },
    {
      config_id = 1060023,
      name = "GADGET_STATE_CHANGE_60023",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_60023",
      action = "action_EVENT_GADGET_STATE_CHANGE_60023",
      trigger_count = 0
    },
    {
      config_id = 1060025,
      name = "TIME_AXIS_PASS_60025",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "condition_EVENT_TIME_AXIS_PASS_60025",
      action = "action_EVENT_TIME_AXIS_PASS_60025",
      trigger_count = 0
    },
    {
      config_id = 1060027,
      name = "VARIABLE_CHANGE_60027",
      event = EventType.EVENT_VARIABLE_CHANGE,
      source = "",
      condition = "condition_EVENT_VARIABLE_CHANGE_60027",
      action = "action_EVENT_VARIABLE_CHANGE_60027",
      trigger_count = 0
    },
    {
      config_id = 1060028,
      name = "TIME_AXIS_PASS_60028",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "condition_EVENT_TIME_AXIS_PASS_60028",
      action = "action_EVENT_TIME_AXIS_PASS_60028",
      trigger_count = 0
    },
    {
      config_id = 1060029,
      name = "TIME_AXIS_PASS_60029",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "condition_EVENT_TIME_AXIS_PASS_60029",
      action = "action_EVENT_TIME_AXIS_PASS_60029",
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
    gadgets = {60003, 60004},
    regions = {},
    triggers = {
      "VARIABLE_CHANGE_60024",
      "TIME_AXIS_PASS_60026"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      60001,
      60002,
      60005,
      60006,
      60007,
      60008,
      60009,
      60010,
      60011,
      60012,
      60013,
      60014,
      60015,
      60016,
      60017,
      60018,
      60019,
      60020
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
function condition_EVENT_VARIABLE_CHANGE_60024(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "big_flower") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_60024(context, evt)
  ScriptLib.InitTimeAxis(context, "WindTimeA", {35}, false)
  ScriptLib.AddExtraGroupSuite(context, 220133060, 2)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_60026(context, evt)
  if "WindTimeA" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_60026(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220133060, 2)
  ScriptLib.SetGroupVariableValue(context, "big_flower", 0)
  return 0
end
require("V2_8/TransferFlower")
