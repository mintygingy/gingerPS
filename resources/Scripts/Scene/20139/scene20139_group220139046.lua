local base_info = {group_id = 220139046}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 46002,
    gadget_id = 70360001,
    pos = {
      x = 68.063,
      y = 76.272,
      z = 59.963
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  {
    config_id = 46001,
    shape = RegionShape.CUBIC,
    size = {
      x = 110.0,
      y = 150.0,
      z = 110.0
    },
    pos = {
      x = 137.219,
      y = 119.58,
      z = 23.918
    },
    vision_type_list = {201390001}
  }
}
triggers = {
  {
    config_id = 1046001,
    name = "ENTER_REGION_46001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "",
    action = ""
  },
  {
    config_id = 1046003,
    name = "VARIABLE_CHANGE_46003",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_46003",
    action = "action_EVENT_VARIABLE_CHANGE_46003",
    trigger_count = 0
  },
  {
    config_id = 1046004,
    name = "GROUP_LOAD_46004",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_46004",
    action = "action_EVENT_GROUP_LOAD_46004",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "castle",
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
    gadgets = {46002},
    regions = {},
    triggers = {
      "VARIABLE_CHANGE_46003",
      "GROUP_LOAD_46004"
    },
    rand_weight = 100,
    ban_refresh = true
  },
  {
    monsters = {},
    gadgets = {},
    regions = {46001},
    triggers = {
      "ENTER_REGION_46001"
    },
    rand_weight = 100,
    ban_refresh = true
  }
}
function condition_EVENT_VARIABLE_CHANGE_46003(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "castle") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_46003(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220139046, 2)
  return 0
end
function condition_EVENT_GROUP_LOAD_46004(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "castle") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_46004(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220139046, 2)
  return 0
end
