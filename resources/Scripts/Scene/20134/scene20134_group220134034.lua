local base_info = {group_id = 220134034}
local defs = {
  control = {
    group_id = 220134042,
    config_id = 42001,
    light_index = 3,
    giving_gadget = 34001
  }
}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 34001,
    gadget_id = 70310267,
    pos = {
      x = 507.873,
      y = 612.254,
      z = -1598.523
    },
    rot = {
      x = 0.0,
      y = 131.844,
      z = 0.0
    },
    level = 1,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1034002,
    name = "GROUP_LOAD_34002",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_34002",
    trigger_count = 0
  },
  {
    config_id = 1034003,
    name = "VARIABLE_CHANGE_34003",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_34003",
    action = "action_EVENT_VARIABLE_CHANGE_34003",
    trigger_count = 0
  },
  {
    config_id = 1034004,
    name = "VARIABLE_CHANGE_34004",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_34004",
    action = "action_EVENT_VARIABLE_CHANGE_34004",
    trigger_count = 0
  },
  {
    config_id = 1034005,
    name = "VARIABLE_CHANGE_34005",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_34005",
    action = "action_EVENT_VARIABLE_CHANGE_34005",
    trigger_count = 0
  },
  {
    config_id = 1034006,
    name = "VARIABLE_CHANGE_34006",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_34006",
    action = "action_EVENT_VARIABLE_CHANGE_34006",
    trigger_count = 0
  },
  {
    config_id = 1034007,
    name = "VARIABLE_CHANGE_34007",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_34007",
    action = "action_EVENT_VARIABLE_CHANGE_34007",
    trigger_count = 0
  },
  {
    config_id = 1034008,
    name = "VARIABLE_CHANGE_34008",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_34008",
    action = "action_EVENT_VARIABLE_CHANGE_34008",
    trigger_count = 0
  },
  {
    config_id = 1034009,
    name = "VARIABLE_CHANGE_34009",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_34009",
    action = "action_EVENT_VARIABLE_CHANGE_34009",
    trigger_count = 0
  },
  {
    config_id = 1034010,
    name = "VARIABLE_CHANGE_34010",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_34010",
    action = "action_EVENT_VARIABLE_CHANGE_34010",
    trigger_count = 0
  },
  {
    config_id = 1034011,
    name = "VARIABLE_CHANGE_34011",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_34011",
    action = "action_EVENT_VARIABLE_CHANGE_34011",
    trigger_count = 0
  },
  {
    config_id = 1034012,
    name = "VARIABLE_CHANGE_34012",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_34012",
    action = "action_EVENT_VARIABLE_CHANGE_34012",
    trigger_count = 0
  },
  {
    config_id = 1034013,
    name = "VARIABLE_CHANGE_34013",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_34013",
    action = "action_EVENT_VARIABLE_CHANGE_34013",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "camera",
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
    gadgets = {34001},
    regions = {},
    triggers = {
      "GROUP_LOAD_34002",
      "VARIABLE_CHANGE_34003",
      "VARIABLE_CHANGE_34004",
      "VARIABLE_CHANGE_34005",
      "VARIABLE_CHANGE_34006",
      "VARIABLE_CHANGE_34007",
      "VARIABLE_CHANGE_34008",
      "VARIABLE_CHANGE_34009",
      "VARIABLE_CHANGE_34010",
      "VARIABLE_CHANGE_34011",
      "VARIABLE_CHANGE_34012",
      "VARIABLE_CHANGE_34013"
    },
    rand_weight = 100
  }
}
function action_EVENT_GROUP_LOAD_34002(context, evt)
  ScriptLib.ActiveGadgetItemGiving(context, 10000103, 220134034, 34001)
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_34003(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101801 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_34003(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134023, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_34004(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101802 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_34004(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134023, suite = 2}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_34005(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101803 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_34005(context, evt)
  ScriptLib.RefreshGroup(context, {group_id = 220134023, suite = 3})
  if ScriptLib.GetGroupVariableValueByGroup(context, "given_item", 220134035) == 101804 or ScriptLib.GetGroupVariableValueByGroup(context, "given_item", 220134035) == 101807 then
    ScriptLib.RefreshGroup(context, {group_id = 220134019, suite = 2})
    ScriptLib.AddQuestProgress(context, "door2complete")
    ScriptLib.SetGroupVariableValueByGroup(context, "door2", 1, 220134033)
  else
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_34006(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101804 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_34006(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134023, suite = 4}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_34007(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101805 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_34007(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134023, suite = 5}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_34008(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101806 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_34008(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134023, suite = 6}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_34009(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101807 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_34009(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134023, suite = 7}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_34010(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101808 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_34010(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134023, suite = 8}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_34011(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_34011(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134023, suite = 10}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134019, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "door2", 0, 220134033) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_34012(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101834 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_34012(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134023, suite = 9}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_34013(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "camera") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_34013(context, evt)
  local pos = {
    x = 531,
    y = 635,
    z = -1606
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 2,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = 0,
    is_set_follow_pos = false,
    follow_pos = pos_follow,
    is_force_walk = false,
    is_change_play_mode = false,
    is_set_screen_XY = false,
    screen_x = 0,
    screen_y = 0
  }) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_cameraLook_Begin")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "camera", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
require("V2_8/HandleGivingResult")
