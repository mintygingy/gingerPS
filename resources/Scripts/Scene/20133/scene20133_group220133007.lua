local base_info = {group_id = 220133007}
local defs = {
  selectID_horizon = 54,
  selectID_vertical = 55,
  horizon_steps = {},
  vertical_steps = {}
}
monsters = {}
npcs = {}
gadgets = {
  [7001] = {
    config_id = 7001,
    gadget_id = 70310341,
    pos = {
      x = 4325.82,
      y = 551.065,
      z = 175.264
    },
    rot = {
      x = 330.528,
      y = 245.126,
      z = 358.826
    },
    level = 1
  },
  [7002] = {
    config_id = 7002,
    gadget_id = 70310171,
    pos = {
      x = 4327.55,
      y = 549.458,
      z = 175.707
    },
    rot = {
      x = 1.577,
      y = 344.426,
      z = 340.926
    },
    level = 1,
    persistent = true,
    interact_id = 64
  },
  [7003] = {
    config_id = 7003,
    gadget_id = 70310169,
    pos = {
      x = 4325.435,
      y = 549.784,
      z = 175.057
    },
    rot = {
      x = 10.507,
      y = 244.359,
      z = 358.961
    },
    level = 20,
    persistent = true
  },
  [7012] = {
    config_id = 7012,
    gadget_id = 70690001,
    pos = {
      x = 4317.633,
      y = 555.654,
      z = 171.458
    },
    rot = {
      x = 330.528,
      y = 245.126,
      z = 358.826
    },
    level = 1
  },
  [7013] = {
    config_id = 7013,
    gadget_id = 70690001,
    pos = {
      x = 4307.169,
      y = 560.35,
      z = 166.389
    },
    rot = {
      x = 330.528,
      y = 245.126,
      z = 353.622
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1007006,
    name = "VARIABLE_CHANGE_7006",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_7006",
    action = "action_EVENT_VARIABLE_CHANGE_7006",
    trigger_count = 0
  },
  {
    config_id = 1007008,
    name = "TIME_AXIS_PASS_7008",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_7008",
    action = "action_EVENT_TIME_AXIS_PASS_7008",
    trigger_count = 0
  }
}
variables = {}
garbages = {
  triggers = {
    {
      config_id = 1007004,
      name = "GADGET_STATE_CHANGE_7004",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_7004",
      action = "action_EVENT_GADGET_STATE_CHANGE_7004",
      trigger_count = 0
    },
    {
      config_id = 1007005,
      name = "GADGET_STATE_CHANGE_7005",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_7005",
      action = "action_EVENT_GADGET_STATE_CHANGE_7005",
      trigger_count = 0
    },
    {
      config_id = 1007007,
      name = "TIME_AXIS_PASS_7007",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "condition_EVENT_TIME_AXIS_PASS_7007",
      action = "action_EVENT_TIME_AXIS_PASS_7007",
      trigger_count = 0
    },
    {
      config_id = 1007009,
      name = "VARIABLE_CHANGE_7009",
      event = EventType.EVENT_VARIABLE_CHANGE,
      source = "",
      condition = "condition_EVENT_VARIABLE_CHANGE_7009",
      action = "action_EVENT_VARIABLE_CHANGE_7009",
      trigger_count = 0
    },
    {
      config_id = 1007010,
      name = "TIME_AXIS_PASS_7010",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "condition_EVENT_TIME_AXIS_PASS_7010",
      action = "action_EVENT_TIME_AXIS_PASS_7010",
      trigger_count = 0
    },
    {
      config_id = 1007011,
      name = "TIME_AXIS_PASS_7011",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "condition_EVENT_TIME_AXIS_PASS_7011",
      action = "action_EVENT_TIME_AXIS_PASS_7011",
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
    gadgets = {7002, 7003},
    regions = {},
    triggers = {
      "VARIABLE_CHANGE_7006",
      "TIME_AXIS_PASS_7008"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      7001,
      7012,
      7013
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
function condition_EVENT_VARIABLE_CHANGE_7006(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "big_flower") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_7006(context, evt)
  ScriptLib.InitTimeAxis(context, "WindTimeA", {16}, false)
  ScriptLib.AddExtraGroupSuite(context, 220133007, 2)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_7008(context, evt)
  if "WindTimeA" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_7008(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220133007, 2)
  ScriptLib.SetGroupVariableValue(context, "big_flower", 0)
  return 0
end
require("V2_8/TransferFlower")
