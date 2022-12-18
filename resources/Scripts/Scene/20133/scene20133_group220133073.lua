local base_info = {group_id = 220133073}
local defs = {
  selectID_horizon = 54,
  selectID_vertical = 55,
  horizon_steps = {
    [73010] = {0, 102}
  },
  vertical_steps = {}
}
monsters = {}
npcs = {}
gadgets = {
  [73001] = {
    config_id = 73001,
    gadget_id = 70690001,
    pos = {
      x = 5062.76,
      y = 540.984,
      z = -1741.59
    },
    rot = {
      x = 332.101,
      y = 133.735,
      z = 0.0
    },
    level = 1
  },
  [73002] = {
    config_id = 73002,
    gadget_id = 70690001,
    pos = {
      x = 5068.108,
      y = 544.903,
      z = -1746.708
    },
    rot = {
      x = 334.381,
      y = 149.071,
      z = 0.0
    },
    level = 1
  },
  [73003] = {
    config_id = 73003,
    gadget_id = 70211164,
    pos = {
      x = 5056.885,
      y = 536.257,
      z = -1732.106
    },
    rot = {
      x = 10.948,
      y = 29.717,
      z = 6.187
    },
    level = 16,
    drop_tag = "\232\167\163\232\176\156\228\189\142\231\186\167\231\190\164\229\178\155",
    state = GadgetState.ChestLocked,
    isOneoff = true,
    persistent = true
  },
  [73004] = {
    config_id = 73004,
    gadget_id = 70310169,
    pos = {
      x = 5055.698,
      y = 536.621,
      z = -1733.853
    },
    rot = {
      x = 7.469,
      y = 138.624,
      z = 1.215
    },
    level = 20,
    persistent = true
  },
  [73005] = {
    config_id = 73005,
    gadget_id = 70690001,
    pos = {
      x = 5071.977,
      y = 548.512,
      z = -1753.164
    },
    rot = {
      x = 334.381,
      y = 149.071,
      z = 0.0
    },
    level = 1
  },
  [73009] = {
    config_id = 73009,
    gadget_id = 70310170,
    pos = {
      x = 5051.625,
      y = 534.161,
      z = -1720.52
    },
    rot = {
      x = 359.445,
      y = 120.155,
      z = 3.567
    },
    level = 1,
    persistent = true
  },
  [73010] = {
    config_id = 73010,
    gadget_id = 70310167,
    pos = {
      x = 5048.518,
      y = 532.924,
      z = -1718.28
    },
    rot = {
      x = 350.686,
      y = 129.124,
      z = 8.456
    },
    level = 1,
    persistent = true
  },
  [73011] = {
    config_id = 73011,
    gadget_id = 70310341,
    pos = {
      x = 5055.482,
      y = 538.242,
      z = -1733.781
    },
    rot = {
      x = 342.489,
      y = 136.916,
      z = 0.274
    },
    level = 20
  },
  [73013] = {
    config_id = 73013,
    gadget_id = 70310170,
    pos = {
      x = 5046.196,
      y = 533.777,
      z = -1721.453
    },
    rot = {
      x = 7.061,
      y = 278.914,
      z = 348.139
    },
    level = 1,
    persistent = true
  },
  [73031] = {
    config_id = 73031,
    gadget_id = 70310170,
    pos = {
      x = 5059.972,
      y = 534.646,
      z = -1725.533
    },
    rot = {
      x = 349.641,
      y = 203.466,
      z = 357.627
    },
    level = 1,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1073023,
    name = "GADGET_STATE_CHANGE_73023",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_73023",
    action = "action_EVENT_GADGET_STATE_CHANGE_73023",
    trigger_count = 0
  },
  {
    config_id = 1073024,
    name = "GADGET_STATE_CHANGE_73024",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_73024",
    action = "action_EVENT_GADGET_STATE_CHANGE_73024",
    trigger_count = 0
  },
  {
    config_id = 1073025,
    name = "VARIABLE_CHANGE_73025",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_73025",
    action = "action_EVENT_VARIABLE_CHANGE_73025",
    trigger_count = 0
  },
  {
    config_id = 1073027,
    name = "TIME_AXIS_PASS_73027",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_73027",
    action = "action_EVENT_TIME_AXIS_PASS_73027",
    trigger_count = 0
  }
}
variables = {}
garbages = {
  gadgets = {
    {
      config_id = 73006,
      gadget_id = 70690001,
      pos = {
        x = 5049.759,
        y = 539.211,
        z = -1726.478
      },
      rot = {
        x = 0.588,
        y = 309.122,
        z = 0.0
      },
      level = 1
    },
    {
      config_id = 73007,
      gadget_id = 70690001,
      pos = {
        x = 5050.318,
        y = 538.88,
        z = -1718.046
      },
      rot = {
        x = 1.523,
        y = 339.831,
        z = 0.0
      },
      level = 1
    },
    {
      config_id = 73008,
      gadget_id = 70690001,
      pos = {
        x = 5044.983,
        y = 535.312,
        z = -1728.409
      },
      rot = {
        x = 1.523,
        y = 339.831,
        z = 0.0
      },
      level = 1
    },
    {
      config_id = 73012,
      gadget_id = 70310341,
      pos = {
        x = 5055.029,
        y = 538.398,
        z = -1733.071
      },
      rot = {
        x = 353.151,
        y = 323.287,
        z = 356.496
      },
      level = 20
    }
  },
  triggers = {
    {
      config_id = 1073026,
      name = "TIME_AXIS_PASS_73026",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "condition_EVENT_TIME_AXIS_PASS_73026",
      action = "action_EVENT_TIME_AXIS_PASS_73026",
      trigger_count = 0
    },
    {
      config_id = 1073028,
      name = "VARIABLE_CHANGE_73028",
      event = EventType.EVENT_VARIABLE_CHANGE,
      source = "",
      condition = "condition_EVENT_VARIABLE_CHANGE_73028",
      action = "action_EVENT_VARIABLE_CHANGE_73028",
      trigger_count = 0
    },
    {
      config_id = 1073029,
      name = "TIME_AXIS_PASS_73029",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "condition_EVENT_TIME_AXIS_PASS_73029",
      action = "action_EVENT_TIME_AXIS_PASS_73029",
      trigger_count = 0
    },
    {
      config_id = 1073030,
      name = "TIME_AXIS_PASS_73030",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "condition_EVENT_TIME_AXIS_PASS_73030",
      action = "action_EVENT_TIME_AXIS_PASS_73030",
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
      73003,
      73004,
      73009,
      73010,
      73013,
      73031
    },
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_73023",
      "GADGET_STATE_CHANGE_73024",
      "VARIABLE_CHANGE_73025",
      "TIME_AXIS_PASS_73027"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      73001,
      73002,
      73005,
      73011
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
function condition_EVENT_GADGET_STATE_CHANGE_73023(context, evt)
  if 73004 ~= evt.param2 or GadgetState.ChestTrap ~= evt.param1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "big_flower") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_73023(context, evt)
  ScriptLib.SetGroupVariableValue(context, "big_flower", 0)
  ScriptLib.RemoveExtraGroupSuite(context, 220133073, 2)
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_73024(context, evt)
  if 73004 ~= evt.param2 or GadgetState.Default ~= evt.param1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "big_flower") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_73024(context, evt)
  ScriptLib.SetGroupVariableValue(context, "big_flower", 0)
  ScriptLib.RemoveExtraGroupSuite(context, 220133073, 3)
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_73025(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "big_flower") ~= 1 then
    return false
  end
  if GadgetState.Default ~= ScriptLib.GetGadgetStateByConfigId(context, 220133073, 73004) then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_73025(context, evt)
  ScriptLib.InitTimeAxis(context, "WindTimeA", {15}, false)
  ScriptLib.AddExtraGroupSuite(context, 220133073, 2)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_73027(context, evt)
  if "WindTimeA" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_73027(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220133073, 2)
  ScriptLib.SetGroupVariableValue(context, "big_flower", 0)
  return 0
end
require("V2_8/TransferFlower")
