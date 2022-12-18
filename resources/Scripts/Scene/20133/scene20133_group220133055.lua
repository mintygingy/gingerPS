local base_info = {group_id = 220133055}
local defs = {
  selectID_horizon = 54,
  selectID_vertical = 55,
  horizon_steps = {},
  vertical_steps = {}
}
monsters = {}
npcs = {}
gadgets = {
  [55001] = {
    config_id = 55001,
    gadget_id = 70310341,
    pos = {
      x = 2380.821,
      y = 541.131,
      z = -1758.232
    },
    rot = {
      x = 330.528,
      y = 142.682,
      z = 358.826
    },
    level = 1
  },
  [55003] = {
    config_id = 55003,
    gadget_id = 70310171,
    pos = {
      x = 2379.908,
      y = 540.007,
      z = -1756.429
    },
    rot = {
      x = 359.644,
      y = 261.565,
      z = 358.57
    },
    level = 20,
    persistent = true,
    interact_id = 64
  },
  [55004] = {
    config_id = 55004,
    gadget_id = 70310169,
    pos = {
      x = 2381.108,
      y = 539.85,
      z = -1758.563
    },
    rot = {
      x = 10.507,
      y = 141.915,
      z = 358.961
    },
    level = 20,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1055025,
    name = "VARIABLE_CHANGE_55025",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_55025",
    action = "action_EVENT_VARIABLE_CHANGE_55025",
    trigger_count = 0
  },
  {
    config_id = 1055027,
    name = "TIME_AXIS_PASS_55027",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_55027",
    action = "action_EVENT_TIME_AXIS_PASS_55027",
    trigger_count = 0
  }
}
variables = {}
garbages = {
  triggers = {
    {
      config_id = 1055023,
      name = "GADGET_STATE_CHANGE_55023",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_55023",
      action = "action_EVENT_GADGET_STATE_CHANGE_55023",
      trigger_count = 0
    },
    {
      config_id = 1055024,
      name = "GADGET_STATE_CHANGE_55024",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_55024",
      action = "action_EVENT_GADGET_STATE_CHANGE_55024",
      trigger_count = 0
    },
    {
      config_id = 1055026,
      name = "TIME_AXIS_PASS_55026",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "condition_EVENT_TIME_AXIS_PASS_55026",
      action = "action_EVENT_TIME_AXIS_PASS_55026",
      trigger_count = 0
    },
    {
      config_id = 1055028,
      name = "VARIABLE_CHANGE_55028",
      event = EventType.EVENT_VARIABLE_CHANGE,
      source = "",
      condition = "condition_EVENT_VARIABLE_CHANGE_55028",
      action = "action_EVENT_VARIABLE_CHANGE_55028",
      trigger_count = 0
    },
    {
      config_id = 1055029,
      name = "TIME_AXIS_PASS_55029",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "condition_EVENT_TIME_AXIS_PASS_55029",
      action = "action_EVENT_TIME_AXIS_PASS_55029",
      trigger_count = 0
    },
    {
      config_id = 1055030,
      name = "TIME_AXIS_PASS_55030",
      event = EventType.EVENT_TIME_AXIS_PASS,
      source = "",
      condition = "condition_EVENT_TIME_AXIS_PASS_55030",
      action = "action_EVENT_TIME_AXIS_PASS_55030",
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
    gadgets = {55003, 55004},
    regions = {},
    triggers = {
      "VARIABLE_CHANGE_55025",
      "TIME_AXIS_PASS_55027"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {55001},
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
function condition_EVENT_VARIABLE_CHANGE_55025(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "big_flower") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_55025(context, evt)
  ScriptLib.InitTimeAxis(context, "WindTimeA", {16}, false)
  ScriptLib.AddExtraGroupSuite(context, 220133055, 2)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_55027(context, evt)
  if "WindTimeA" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_55027(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220133055, 2)
  ScriptLib.SetGroupVariableValue(context, "big_flower", 0)
  return 0
end
require("V2_8/TransferFlower")
