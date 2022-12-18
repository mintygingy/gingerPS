local base_info = {group_id = 220133024}
local defs = {
  guide_region = 24015,
  selectID_horizon = 759,
  selectID_vertical = 760,
  horizon_steps = {
    [24003] = {0, 102}
  },
  vertical_steps = {}
}
monsters = {}
npcs = {}
gadgets = {
  [24001] = {
    config_id = 24001,
    gadget_id = 70310170,
    pos = {
      x = 2267.676,
      y = 537.236,
      z = 527.419
    },
    rot = {
      x = 354.531,
      y = 288.71,
      z = 21.895
    },
    level = 1,
    persistent = true
  },
  [24002] = {
    config_id = 24002,
    gadget_id = 70310170,
    pos = {
      x = 2264.185,
      y = 539.788,
      z = 534.942
    },
    rot = {
      x = 19.232,
      y = 158.263,
      z = 357.09
    },
    level = 1,
    persistent = true
  },
  [24003] = {
    config_id = 24003,
    gadget_id = 70310167,
    pos = {
      x = 2258.299,
      y = 538.106,
      z = 530.707
    },
    rot = {
      x = 355.519,
      y = 283.253,
      z = 21.927
    },
    level = 1,
    persistent = true,
    worktop_config = {
      init_options = {759}
    }
  },
  [24004] = {
    config_id = 24004,
    gadget_id = 70310169,
    pos = {
      x = 2260.327,
      y = 540.037,
      z = 536.511
    },
    rot = {
      x = 357.213,
      y = 310.263,
      z = 11.336
    },
    level = 1,
    persistent = true
  },
  [24005] = {
    config_id = 24005,
    gadget_id = 70310171,
    pos = {
      x = 2267.474,
      y = 539.745,
      z = 535.65
    },
    rot = {
      x = 0.53,
      y = 208.697,
      z = 2.802
    },
    level = 1,
    persistent = true,
    interact_id = 64
  },
  [24009] = {
    config_id = 24009,
    gadget_id = 70310341,
    pos = {
      x = 2259.564,
      y = 541.481,
      z = 536.073
    },
    rot = {
      x = 332.157,
      y = 300.588,
      z = 0.0
    },
    level = 1
  },
  [24010] = {
    config_id = 24010,
    gadget_id = 70690001,
    pos = {
      x = 2251.823,
      y = 544.179,
      z = 539.928
    },
    rot = {
      x = 338.23,
      y = 299.79,
      z = 2.011
    },
    level = 1
  },
  [24011] = {
    config_id = 24011,
    gadget_id = 70690001,
    pos = {
      x = 2241.048,
      y = 548.266,
      z = 546.626
    },
    rot = {
      x = 328.215,
      y = 299.925,
      z = 357.874
    },
    level = 1
  },
  [24012] = {
    config_id = 24012,
    gadget_id = 70690001,
    pos = {
      x = 2231.93,
      y = 553.118,
      z = 551.927
    },
    rot = {
      x = 335.341,
      y = 299.504,
      z = 2.044
    },
    level = 1
  },
  [24013] = {
    config_id = 24013,
    gadget_id = 70690001,
    pos = {
      x = 2222.202,
      y = 558.369,
      z = 559.159
    },
    rot = {
      x = 340.878,
      y = 315.71,
      z = 2.827
    },
    level = 1
  },
  [24014] = {
    config_id = 24014,
    gadget_id = 70690001,
    pos = {
      x = 2212.945,
      y = 561.517,
      z = 570.351
    },
    rot = {
      x = 342.55,
      y = 323.024,
      z = 3.114
    },
    level = 1
  }
}
regions = {
  [24015] = {
    config_id = 24015,
    shape = RegionShape.SPHERE,
    radius = 8,
    pos = {
      x = 2265.604,
      y = 537.646,
      z = 534.251
    }
  }
}
triggers = {
  {
    config_id = 1024006,
    name = "VARIABLE_CHANGE_24006",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_24006",
    action = "action_EVENT_VARIABLE_CHANGE_24006",
    trigger_count = 0
  },
  {
    config_id = 1024008,
    name = "TIME_AXIS_PASS_24008",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_24008",
    action = "action_EVENT_TIME_AXIS_PASS_24008",
    trigger_count = 0
  },
  {
    config_id = 1024016,
    name = "GROUP_LOAD_24016",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_24016",
    trigger_count = 0
  }
}
variables = {}
garbages = {
  triggers = {
    {
      config_id = 1024007,
      name = "TIME_AXIS_PASS_24007",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "condition_EVENT_TIME_AXIS_PASS_24007",
      action = "action_EVENT_TIME_AXIS_PASS_24007",
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
      24001,
      24002,
      24003,
      24004,
      24005
    },
    regions = {24015},
    triggers = {
      "VARIABLE_CHANGE_24006",
      "TIME_AXIS_PASS_24008",
      "GROUP_LOAD_24016"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      24009,
      24010,
      24011,
      24012,
      24013,
      24014
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_VARIABLE_CHANGE_24006(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "big_flower") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_24006(context, evt)
  ScriptLib.InitTimeAxis(context, "WindTimeA", {15}, false)
  ScriptLib.AddExtraGroupSuite(context, 220133024, 2)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_24008(context, evt)
  if "WindTimeA" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_24008(context, evt)
  ScriptLib.KillExtraGroupSuite(context, 220133024, 2)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "big_flower", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_LOAD_24016(context, evt)
  ScriptLib.SetGroupVariableValue(context, "big_flower", 0)
  return 0
end
require("V2_8/TransferFlower")
