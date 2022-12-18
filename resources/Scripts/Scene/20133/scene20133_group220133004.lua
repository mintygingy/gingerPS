local base_info = {group_id = 220133004}
local defs = {
  selectID_horizon = 54,
  selectID_vertical = 55,
  horizon_steps = {},
  vertical_steps = {}
}
monsters = {}
npcs = {}
gadgets = {
  [4001] = {
    config_id = 4001,
    gadget_id = 70690001,
    pos = {
      x = 2531.791,
      y = 556.698,
      z = -1733.271
    },
    rot = {
      x = 342.098,
      y = 171.215,
      z = 1.339
    },
    level = 1
  },
  [4002] = {
    config_id = 4002,
    gadget_id = 70690001,
    pos = {
      x = 2536.736,
      y = 560.182,
      z = -1744.803
    },
    rot = {
      x = 341.602,
      y = 127.249,
      z = 1.766
    },
    level = 1
  },
  [4003] = {
    config_id = 4003,
    gadget_id = 70310170,
    pos = {
      x = 2515.384,
      y = 552.383,
      z = -1715.091
    },
    rot = {
      x = 1.975,
      y = 163.74,
      z = 357.379
    },
    level = 1,
    persistent = true
  },
  [4004] = {
    config_id = 4004,
    gadget_id = 70310169,
    pos = {
      x = 2529.0,
      y = 552.65,
      z = -1723.946
    },
    rot = {
      x = 1.885,
      y = 186.883,
      z = 355.169
    },
    level = 20,
    persistent = true
  },
  [4005] = {
    config_id = 4005,
    gadget_id = 70690001,
    pos = {
      x = 2550.541,
      y = 562.86,
      z = -1751.779
    },
    rot = {
      x = 349.115,
      y = 90.728,
      z = 1.331
    },
    level = 1
  },
  [4006] = {
    config_id = 4006,
    gadget_id = 70690001,
    pos = {
      x = 2562.108,
      y = 564.432,
      z = -1753.509
    },
    rot = {
      x = 349.094,
      y = 103.621,
      z = 3.608
    },
    level = 1
  },
  [4007] = {
    config_id = 4007,
    gadget_id = 70310170,
    pos = {
      x = 2523.223,
      y = 552.663,
      z = -1715.326
    },
    rot = {
      x = 1.793,
      y = 273.677,
      z = 2.749
    },
    level = 1,
    persistent = true
  },
  [4008] = {
    config_id = 4008,
    gadget_id = 70690011,
    pos = {
      x = 2578.822,
      y = 561.595,
      z = -1759.07
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [4009] = {
    config_id = 4009,
    gadget_id = 70310341,
    pos = {
      x = 2529.363,
      y = 554.457,
      z = -1724.229
    },
    rot = {
      x = 340.657,
      y = 167.502,
      z = 0.262
    },
    level = 20
  },
  [4013] = {
    config_id = 4013,
    gadget_id = 70211164,
    pos = {
      x = 2516.334,
      y = 552.672,
      z = -1719.842
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 16,
    drop_tag = "\232\167\163\232\176\156\228\189\142\231\186\167\231\190\164\229\178\155",
    state = GadgetState.ChestLocked,
    isOneoff = true,
    persistent = true
  },
  [4014] = {
    config_id = 4014,
    gadget_id = 70310170,
    pos = {
      x = 2518.861,
      y = 552.574,
      z = -1724.459
    },
    rot = {
      x = 357.846,
      y = 85.788,
      z = 357.523
    },
    level = 1,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1004010,
    name = "VARIABLE_CHANGE_4010",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_4010",
    action = "action_EVENT_VARIABLE_CHANGE_4010",
    trigger_count = 0
  },
  {
    config_id = 1004012,
    name = "TIME_AXIS_PASS_4012",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_4012",
    action = "action_EVENT_TIME_AXIS_PASS_4012",
    trigger_count = 0
  }
}
variables = {}
garbages = {
  triggers = {
    {
      config_id = 1004011,
      name = "TIME_AXIS_PASS_4011",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "condition_EVENT_TIME_AXIS_PASS_4011",
      action = "action_EVENT_TIME_AXIS_PASS_4011",
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
      4003,
      4004,
      4007,
      4013,
      4014
    },
    regions = {},
    triggers = {
      "VARIABLE_CHANGE_4010",
      "TIME_AXIS_PASS_4012"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      4001,
      4002,
      4005,
      4006,
      4008,
      4009
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_VARIABLE_CHANGE_4010(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "big_flower") ~= 1 then
    return false
  end
  if GadgetState.Default ~= ScriptLib.GetGadgetStateByConfigId(context, 220133004, 4004) then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_4010(context, evt)
  ScriptLib.InitTimeAxis(context, "WindTimeA", {15}, false)
  ScriptLib.AddExtraGroupSuite(context, 220133004, 2)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_4012(context, evt)
  if "WindTimeA" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_4012(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220133004, 2)
  ScriptLib.SetGroupVariableValue(context, "big_flower", 0)
  return 0
end
require("V2_8/TransferFlower")
