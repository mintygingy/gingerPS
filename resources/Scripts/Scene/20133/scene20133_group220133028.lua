local base_info = {group_id = 220133028}
local defs = {
  selectID_horizon = 54,
  selectID_vertical = 55,
  horizon_steps = {},
  vertical_steps = {}
}
monsters = {}
npcs = {}
gadgets = {
  [28001] = {
    config_id = 28001,
    gadget_id = 70690001,
    pos = {
      x = -0.681,
      y = 150.403,
      z = 610.592
    },
    rot = {
      x = 305.081,
      y = 0.254,
      z = 342.911
    },
    level = 1
  },
  [28002] = {
    config_id = 28002,
    gadget_id = 70690001,
    pos = {
      x = -1.088,
      y = 156.843,
      z = 615.489
    },
    rot = {
      x = 311.391,
      y = 345.438,
      z = 355.132
    },
    level = 1
  },
  [28004] = {
    config_id = 28004,
    gadget_id = 70310169,
    pos = {
      x = -0.994,
      y = 142.913,
      z = 606.902
    },
    rot = {
      x = 339.852,
      y = 349.737,
      z = 349.636
    },
    level = 1,
    persistent = true
  },
  [28005] = {
    config_id = 28005,
    gadget_id = 70310171,
    pos = {
      x = -11.459,
      y = 143.988,
      z = 604.648
    },
    rot = {
      x = 350.494,
      y = 28.716,
      z = 357.315
    },
    level = 1,
    state = GadgetState.GearStop,
    persistent = true,
    interact_id = 64
  },
  [28006] = {
    config_id = 28006,
    gadget_id = 70310341,
    pos = {
      x = -0.702,
      y = 143.796,
      z = 605.952
    },
    rot = {
      x = 305.081,
      y = 0.254,
      z = 342.911
    },
    level = 1
  },
  [28007] = {
    config_id = 28007,
    gadget_id = 70310170,
    pos = {
      x = -9.386,
      y = 144.026,
      z = 604.493
    },
    rot = {
      x = 4.54,
      y = 77.935,
      z = 351.678
    },
    level = 1,
    persistent = true
  },
  [28010] = {
    config_id = 28010,
    gadget_id = 70690029,
    pos = {
      x = -6.354,
      y = 162.223,
      z = 627.518
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1028011,
    name = "QUEST_FINISH_28011",
    event = EventType.EVENT_QUEST_FINISH,
    source = "4007004",
    condition = "",
    action = "action_EVENT_QUEST_FINISH_28011",
    trigger_count = 0
  },
  {
    config_id = 1028012,
    name = "VARIABLE_CHANGE_28012",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_28012",
    action = "action_EVENT_VARIABLE_CHANGE_28012",
    trigger_count = 0
  },
  {
    config_id = 1028014,
    name = "TIME_AXIS_PASS_28014",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_28014",
    action = "action_EVENT_TIME_AXIS_PASS_28014",
    trigger_count = 0
  }
}
variables = {}
garbages = {
  gadgets = {
    {
      config_id = 28003,
      gadget_id = 70690001,
      pos = {
        x = -21.687,
        y = 160.747,
        z = 610.516
      },
      rot = {
        x = 320.861,
        y = 344.403,
        z = 355.851
      },
      level = 1
    },
    {
      config_id = 28008,
      gadget_id = 70690001,
      pos = {
        x = -0.702,
        y = 143.796,
        z = 605.952
      },
      rot = {
        x = 305.081,
        y = 0.254,
        z = 342.911
      },
      level = 1
    },
    {
      config_id = 28009,
      gadget_id = 70690001,
      pos = {
        x = -0.702,
        y = 143.796,
        z = 605.952
      },
      rot = {
        x = 305.081,
        y = 0.254,
        z = 342.911
      },
      level = 1
    }
  },
  triggers = {
    {
      config_id = 1028013,
      name = "TIME_AXIS_PASS_28013",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "condition_EVENT_TIME_AXIS_PASS_28013",
      action = "action_EVENT_TIME_AXIS_PASS_28013",
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
      28004,
      28005,
      28007
    },
    regions = {},
    triggers = {
      "QUEST_FINISH_28011",
      "VARIABLE_CHANGE_28012",
      "TIME_AXIS_PASS_28014"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      28001,
      28002,
      28006,
      28010
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function action_EVENT_QUEST_FINISH_28011(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 28005, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_28012(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "big_flower") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_28012(context, evt)
  ScriptLib.InitTimeAxis(context, "WindTimeA", {25}, false)
  ScriptLib.AddExtraGroupSuite(context, 220133028, 2)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_28014(context, evt)
  if "WindTimeA" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_28014(context, evt)
  ScriptLib.KillExtraGroupSuite(context, 220133028, 2)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "big_flower", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
require("V2_8/TransferFlower")
