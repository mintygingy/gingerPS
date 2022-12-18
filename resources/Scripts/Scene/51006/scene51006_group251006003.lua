local base_info = {group_id = 251006003}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 3001,
    gadget_id = 70900007,
    pos = {
      x = 53.456,
      y = 6.988,
      z = 81.103
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3002,
    gadget_id = 70900007,
    pos = {
      x = 35.257,
      y = 6.97,
      z = 69.249
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3003,
    gadget_id = 70900008,
    pos = {
      x = 35.479,
      y = 6.981,
      z = 81.152
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3004,
    gadget_id = 70900008,
    pos = {
      x = 52.551,
      y = 6.923,
      z = 69.998
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3010,
    gadget_id = 70211001,
    pos = {
      x = 33.234,
      y = 6.767,
      z = 75.324
    },
    rot = {
      x = 0.0,
      y = 92.411,
      z = 0.0
    },
    level = 1,
    drop_tag = "\230\136\152\230\150\151\228\189\142\231\186\167\231\168\187\229\166\187",
    isOneoff = true,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1003005,
    name = "GADGET_STATE_CHANGE_3005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_3005",
    action = "action_EVENT_GADGET_STATE_CHANGE_3005"
  },
  {
    config_id = 1003006,
    name = "GADGET_STATE_CHANGE_3006",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_3006",
    action = "action_EVENT_GADGET_STATE_CHANGE_3006"
  },
  {
    config_id = 1003007,
    name = "GADGET_STATE_CHANGE_3007",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_3007",
    action = "action_EVENT_GADGET_STATE_CHANGE_3007"
  },
  {
    config_id = 1003008,
    name = "GADGET_STATE_CHANGE_3008",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_3008",
    action = "action_EVENT_GADGET_STATE_CHANGE_3008"
  },
  {
    config_id = 1003009,
    name = "VARIABLE_CHANGE_3009",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_3009",
    action = "action_EVENT_VARIABLE_CHANGE_3009"
  }
}
variables = {
  {
    config_id = 1,
    name = "Count",
    value = 0,
    no_refresh = true
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
      3001,
      3002,
      3003,
      3004
    },
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_3005",
      "GADGET_STATE_CHANGE_3006",
      "GADGET_STATE_CHANGE_3007",
      "GADGET_STATE_CHANGE_3008",
      "VARIABLE_CHANGE_3009"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {3010},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_3005(context, evt)
  if 3001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_3005(context, evt)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "Count", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_3006(context, evt)
  if 3002 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_3006(context, evt)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "Count", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_3007(context, evt)
  if 3003 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_3007(context, evt)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "Count", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_3008(context, evt)
  if 3004 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_3008(context, evt)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "Count", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_3009(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "Count") ~= 4 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_3009(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 251006003, 2)
  return 0
end
