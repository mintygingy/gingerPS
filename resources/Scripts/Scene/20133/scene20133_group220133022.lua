local base_info = {group_id = 220133022}
local defs = {
  selectID_horizon = 759,
  selectID_vertical = 760,
  horizon_steps = {
    [22001] = {0, 103}
  },
  vertical_steps = {}
}
init_state = {
  [22006] = 303
}
monsters = {}
npcs = {}
gadgets = {
  [22001] = {
    config_id = 22001,
    gadget_id = 70310167,
    pos = {
      x = 2165.313,
      y = 539.978,
      z = 508.754
    },
    rot = {
      x = 19.393,
      y = 182.08,
      z = 2.342
    },
    level = 1,
    persistent = true,
    worktop_config = {
      init_options = {759}
    }
  },
  [22003] = {
    config_id = 22003,
    gadget_id = 70310341,
    pos = {
      x = 2158.482,
      y = 545.892,
      z = 522.912
    },
    rot = {
      x = 328.735,
      y = 19.731,
      z = 346.344
    },
    level = 1
  },
  [22004] = {
    config_id = 22004,
    gadget_id = 70310169,
    pos = {
      x = 2158.514,
      y = 544.372,
      z = 522.924
    },
    rot = {
      x = 2.224,
      y = 16.511,
      z = 0.115
    },
    level = 1,
    persistent = true
  },
  [22006] = {
    config_id = 22006,
    gadget_id = 70310170,
    pos = {
      x = 2158.073,
      y = 541.099,
      z = 509.984
    },
    rot = {
      x = 6.97,
      y = 101.169,
      z = 343.688
    },
    level = 1,
    persistent = true
  },
  [22008] = {
    config_id = 22008,
    gadget_id = 70690001,
    pos = {
      x = 2160.45,
      y = 549.278,
      z = 532.254
    },
    rot = {
      x = 331.55,
      y = 18.954,
      z = 346.731
    },
    level = 1
  },
  [22009] = {
    config_id = 22009,
    gadget_id = 70690001,
    pos = {
      x = 2163.392,
      y = 554.185,
      z = 540.82
    },
    rot = {
      x = 331.55,
      y = 18.954,
      z = 346.731
    },
    level = 1
  },
  [22010] = {
    config_id = 22010,
    gadget_id = 70690001,
    pos = {
      x = 2166.04,
      y = 558.603,
      z = 548.531
    },
    rot = {
      x = 331.55,
      y = 18.954,
      z = 346.731
    },
    level = 1
  },
  [22011] = {
    config_id = 22011,
    gadget_id = 70211165,
    pos = {
      x = 2165.138,
      y = 538.11,
      z = 502.9
    },
    rot = {
      x = 343.327,
      y = 6.008,
      z = 346.739
    },
    level = 16,
    chest_drop_id = 1050211,
    drop_count = 1,
    state = GadgetState.ChestLocked,
    isOneoff = true,
    persistent = true
  },
  [22012] = {
    config_id = 22012,
    gadget_id = 70310170,
    pos = {
      x = 2165.688,
      y = 543.812,
      z = 519.68
    },
    rot = {
      x = 351.438,
      y = 295.262,
      z = 17.131
    },
    level = 1,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1022002,
    name = "VARIABLE_CHANGE_22002",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_22002",
    action = "action_EVENT_VARIABLE_CHANGE_22002",
    trigger_count = 0
  },
  {
    config_id = 1022007,
    name = "TIME_AXIS_PASS_22007",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_22007",
    action = "action_EVENT_TIME_AXIS_PASS_22007",
    trigger_count = 0
  },
  {
    config_id = 1022014,
    name = "GROUP_LOAD_22014",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_22014",
    trigger_count = 0
  }
}
variables = {}
garbages = {
  triggers = {
    {
      config_id = 1022005,
      name = "TIME_AXIS_PASS_22005",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "condition_EVENT_TIME_AXIS_PASS_22005",
      action = "action_EVENT_TIME_AXIS_PASS_22005",
      trigger_count = 0
    },
    {
      config_id = 1022013,
      name = "GADGET_STATE_CHANGE_22013",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_22013",
      action = "action_EVENT_GADGET_STATE_CHANGE_22013",
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
      22001,
      22004,
      22006,
      22011,
      22012
    },
    regions = {},
    triggers = {
      "VARIABLE_CHANGE_22002",
      "TIME_AXIS_PASS_22007",
      "GROUP_LOAD_22014"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      22003,
      22008,
      22009,
      22010
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_VARIABLE_CHANGE_22002(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "big_flower") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_22002(context, evt)
  ScriptLib.InitTimeAxis(context, "WindTimeA", {15}, false)
  ScriptLib.AddExtraGroupSuite(context, 220133022, 2)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_22007(context, evt)
  if "WindTimeA" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_22007(context, evt)
  ScriptLib.KillExtraGroupSuite(context, 220133022, 2)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "big_flower", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_LOAD_22014(context, evt)
  ScriptLib.SetGroupVariableValue(context, "big_flower", 0)
  return 0
end
require("V2_8/TransferFlower")
