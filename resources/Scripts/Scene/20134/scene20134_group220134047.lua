local base_info = {group_id = 220134047}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 47001,
    gadget_id = 70380301,
    pos = {
      x = 647.373,
      y = 633.841,
      z = -1703.42
    },
    rot = {
      x = 0.0,
      y = 32.227,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 47006,
    gadget_id = 70360002,
    pos = {
      x = 658.443,
      y = 623.38,
      z = -1685.488
    },
    rot = {
      x = 0.0,
      y = 215.214,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {214}
    }
  },
  {
    config_id = 47007,
    gadget_id = 70360002,
    pos = {
      x = 634.792,
      y = 623.38,
      z = -1723.132
    },
    rot = {
      x = 0.0,
      y = 26.408,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {214}
    }
  }
}
regions = {
  {
    config_id = 47005,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 639.316,
      y = 623.38,
      z = -1698.005
    }
  }
}
triggers = {
  {
    config_id = 1047002,
    name = "SELECT_OPTION_47002",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_47002",
    action = "action_EVENT_SELECT_OPTION_47002",
    trigger_count = 0
  },
  {
    config_id = 1047003,
    name = "SELECT_OPTION_47003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_47003",
    action = "action_EVENT_SELECT_OPTION_47003",
    trigger_count = 0
  },
  {
    config_id = 1047004,
    name = "SELECT_OPTION_47004",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_47004",
    action = "action_EVENT_SELECT_OPTION_47004",
    trigger_count = 0
  },
  {
    config_id = 1047005,
    name = "ENTER_REGION_47005",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_47005",
    action = "action_EVENT_ENTER_REGION_47005",
    trigger_count = 0
  },
  {
    config_id = 1047008,
    name = "SELECT_OPTION_47008",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_47008",
    action = "action_EVENT_SELECT_OPTION_47008",
    trigger_count = 0
  },
  {
    config_id = 1047009,
    name = "SELECT_OPTION_47009",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_47009",
    action = "action_EVENT_SELECT_OPTION_47009",
    trigger_count = 0
  },
  {
    config_id = 1047010,
    name = "SELECT_OPTION_47010",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_47010",
    action = "action_EVENT_SELECT_OPTION_47010",
    trigger_count = 0
  },
  {
    config_id = 1047011,
    name = "SELECT_OPTION_47011",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_47011",
    action = "action_EVENT_SELECT_OPTION_47011",
    trigger_count = 0
  },
  {
    config_id = 1047012,
    name = "SELECT_OPTION_47012",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_47012",
    action = "action_EVENT_SELECT_OPTION_47012",
    trigger_count = 0
  },
  {
    config_id = 1047013,
    name = "VARIABLE_CHANGE_47013",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_47013",
    action = "action_EVENT_VARIABLE_CHANGE_47013",
    trigger_count = 0
  },
  {
    config_id = 1047014,
    name = "VARIABLE_CHANGE_47014",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_47014",
    action = "action_EVENT_VARIABLE_CHANGE_47014",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "position",
    value = 1,
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
      47001,
      47006,
      47007
    },
    regions = {47005},
    triggers = {
      "SELECT_OPTION_47002",
      "SELECT_OPTION_47003",
      "SELECT_OPTION_47004",
      "ENTER_REGION_47005",
      "SELECT_OPTION_47008",
      "SELECT_OPTION_47009",
      "SELECT_OPTION_47010",
      "SELECT_OPTION_47011",
      "SELECT_OPTION_47012",
      "VARIABLE_CHANGE_47013",
      "VARIABLE_CHANGE_47014"
    },
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_47002(context, evt)
  if 47006 ~= evt.param1 then
    return false
  end
  if 214 ~= evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "position") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_47002(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 47001, 54, {2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "position", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_47003(context, evt)
  if 47006 ~= evt.param1 then
    return false
  end
  if 214 ~= evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "position") ~= 2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_47003(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 47001, 54, {3}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "position", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_47004(context, evt)
  if 47006 ~= evt.param1 then
    return false
  end
  if 214 ~= evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "position") ~= 3 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_47004(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 47001, 54, {4}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "position", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_47005(context, evt)
  if evt.param1 ~= 47005 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_47005(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 47001, 54, {1}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "position", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_47008(context, evt)
  if 47006 ~= evt.param1 then
    return false
  end
  if 214 ~= evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "position") ~= 4 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_47008(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 47001, 54, {1}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "position", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_47009(context, evt)
  if 47007 ~= evt.param1 then
    return false
  end
  if 214 ~= evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "position") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_47009(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 47001, 54, {2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "position", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_47010(context, evt)
  if 47007 ~= evt.param1 then
    return false
  end
  if 214 ~= evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "position") ~= 2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_47010(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 47001, 54, {3}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "position", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_47011(context, evt)
  if 47007 ~= evt.param1 then
    return false
  end
  if 214 ~= evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "position") ~= 3 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_47011(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 47001, 54, {4}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "position", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_47012(context, evt)
  if 47007 ~= evt.param1 then
    return false
  end
  if 214 ~= evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "position") ~= 4 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_47012(context, evt)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 47001, 54, {1}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "position", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_47013(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "position") ~= 5 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_47013(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "position", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134060, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_47014(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "position") ~= 2 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_47014(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134060, suite = 2}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
