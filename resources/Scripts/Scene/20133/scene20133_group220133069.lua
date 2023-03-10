local base_info = {group_id = 220133069}
local defs = {
  selectID_horizon = 54,
  selectID_vertical = 55,
  horizon_steps = {},
  vertical_steps = {}
}
monsters = {}
npcs = {}
gadgets = {
  [69001] = {
    config_id = 69001,
    gadget_id = 70690001,
    pos = {
      x = 5065.692,
      y = 523.192,
      z = -1615.809
    },
    rot = {
      x = 342.141,
      y = 274.393,
      z = 1.84
    },
    level = 1
  },
  [69002] = {
    config_id = 69002,
    gadget_id = 70690001,
    pos = {
      x = 5048.702,
      y = 527.478,
      z = -1618.654
    },
    rot = {
      x = 343.224,
      y = 241.738,
      z = 358.7
    },
    level = 1
  },
  [69003] = {
    config_id = 69003,
    gadget_id = 70310171,
    pos = {
      x = 5061.225,
      y = 520.823,
      z = -1622.94
    },
    rot = {
      x = 8.911,
      y = 89.287,
      z = 7.457
    },
    level = 20,
    persistent = true,
    interact_id = 64
  },
  [69004] = {
    config_id = 69004,
    gadget_id = 70310169,
    pos = {
      x = 5075.229,
      y = 518.902,
      z = -1616.645
    },
    rot = {
      x = 3.023,
      y = 306.019,
      z = 355.785
    },
    level = 20,
    persistent = true
  },
  [69005] = {
    config_id = 69005,
    gadget_id = 70690001,
    pos = {
      x = 5032.926,
      y = 530.375,
      z = -1636.371
    },
    rot = {
      x = 349.115,
      y = 195.536,
      z = 1.331
    },
    level = 1
  },
  [69007] = {
    config_id = 69007,
    gadget_id = 70310170,
    pos = {
      x = 5062.767,
      y = 520.443,
      z = -1621.297
    },
    rot = {
      x = 4.594,
      y = 106.003,
      z = 9.62
    },
    level = 1,
    persistent = true
  },
  [69008] = {
    config_id = 69008,
    gadget_id = 70310170,
    pos = {
      x = 5071.639,
      y = 520.014,
      z = -1624.031
    },
    rot = {
      x = 10.175,
      y = 23.917,
      z = 356.836
    },
    level = 1,
    persistent = true
  },
  [69011] = {
    config_id = 69011,
    gadget_id = 70310341,
    pos = {
      x = 5074.941,
      y = 520.473,
      z = -1615.377
    },
    rot = {
      x = 340.657,
      y = 272.31,
      z = 0.262
    },
    level = 20
  }
}
regions = {}
triggers = {
  {
    config_id = 1069025,
    name = "VARIABLE_CHANGE_69025",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_69025",
    action = "action_EVENT_VARIABLE_CHANGE_69025",
    trigger_count = 0
  },
  {
    config_id = 1069027,
    name = "TIME_AXIS_PASS_69027",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_69027",
    action = "action_EVENT_TIME_AXIS_PASS_69027",
    trigger_count = 0
  }
}
variables = {}
garbages = {
  triggers = {
    {
      config_id = 1069026,
      name = "TIME_AXIS_PASS_69026",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "condition_EVENT_TIME_AXIS_PASS_69026",
      action = "action_EVENT_TIME_AXIS_PASS_69026",
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
      69003,
      69004,
      69007,
      69008
    },
    regions = {},
    triggers = {
      "VARIABLE_CHANGE_69025",
      "TIME_AXIS_PASS_69027"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      69001,
      69002,
      69005,
      69011
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_VARIABLE_CHANGE_69025(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "big_flower") ~= 1 then
    return false
  end
  if GadgetState.Default ~= ScriptLib.GetGadgetStateByConfigId(context, 220133069, 69004) then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_69025(context, evt)
  ScriptLib.InitTimeAxis(context, "WindTimeA", {15}, false)
  ScriptLib.AddExtraGroupSuite(context, 220133069, 2)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_69027(context, evt)
  if "WindTimeA" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_69027(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220133069, 2)
  ScriptLib.SetGroupVariableValue(context, "big_flower", 0)
  return 0
end
require("V2_8/TransferFlower")
