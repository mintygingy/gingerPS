local base_info = {group_id = 220134001}
local defs = {
  control = {
    group_id = 220134042,
    config_id = 42001,
    light_index = 1,
    giving_gadget = 1001
  }
}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 70310243,
    pos = {
      x = 492.203,
      y = 612.254,
      z = -1598.556
    },
    rot = {
      x = 0.0,
      y = 225.969,
      z = 0.0
    },
    level = 1,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1001002,
    name = "GROUP_LOAD_1002",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_1002",
    trigger_count = 0
  },
  {
    config_id = 1001003,
    name = "VARIABLE_CHANGE_1003",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_1003",
    action = "action_EVENT_VARIABLE_CHANGE_1003",
    trigger_count = 0
  },
  {
    config_id = 1001004,
    name = "VARIABLE_CHANGE_1004",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_1004",
    action = "action_EVENT_VARIABLE_CHANGE_1004",
    trigger_count = 0
  },
  {
    config_id = 1001005,
    name = "VARIABLE_CHANGE_1005",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_1005",
    action = "action_EVENT_VARIABLE_CHANGE_1005",
    trigger_count = 0
  },
  {
    config_id = 1001006,
    name = "VARIABLE_CHANGE_1006",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_1006",
    action = "action_EVENT_VARIABLE_CHANGE_1006",
    trigger_count = 0
  },
  {
    config_id = 1001007,
    name = "VARIABLE_CHANGE_1007",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_1007",
    action = "action_EVENT_VARIABLE_CHANGE_1007",
    trigger_count = 0
  },
  {
    config_id = 1001008,
    name = "VARIABLE_CHANGE_1008",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_1008",
    action = "action_EVENT_VARIABLE_CHANGE_1008",
    trigger_count = 0
  },
  {
    config_id = 1001009,
    name = "VARIABLE_CHANGE_1009",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_1009",
    action = "action_EVENT_VARIABLE_CHANGE_1009",
    trigger_count = 0
  },
  {
    config_id = 1001010,
    name = "VARIABLE_CHANGE_1010",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_1010",
    action = "action_EVENT_VARIABLE_CHANGE_1010",
    trigger_count = 0
  },
  {
    config_id = 1001011,
    name = "VARIABLE_CHANGE_1011",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_1011",
    action = "action_EVENT_VARIABLE_CHANGE_1011",
    trigger_count = 0
  },
  {
    config_id = 1001012,
    name = "VARIABLE_CHANGE_1012",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_1012",
    action = "action_EVENT_VARIABLE_CHANGE_1012",
    trigger_count = 0
  },
  {
    config_id = 1001013,
    name = "VARIABLE_CHANGE_1013",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_1013",
    action = "action_EVENT_VARIABLE_CHANGE_1013",
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
    gadgets = {1001},
    regions = {},
    triggers = {
      "GROUP_LOAD_1002",
      "VARIABLE_CHANGE_1003",
      "VARIABLE_CHANGE_1004",
      "VARIABLE_CHANGE_1005",
      "VARIABLE_CHANGE_1006",
      "VARIABLE_CHANGE_1007",
      "VARIABLE_CHANGE_1008",
      "VARIABLE_CHANGE_1009",
      "VARIABLE_CHANGE_1010",
      "VARIABLE_CHANGE_1011",
      "VARIABLE_CHANGE_1012",
      "VARIABLE_CHANGE_1013"
    },
    rand_weight = 100
  }
}
function action_EVENT_GROUP_LOAD_1002(context, evt)
  ScriptLib.ActiveGadgetItemGiving(context, 10000101, 220134001, 1001)
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_1003(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101801 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_1003(context, evt)
  ScriptLib.RefreshGroup(context, {group_id = 220134004, suite = 1})
  if ScriptLib.GetGroupVariableValueByGroup(context, "given_item", 220134008) == 101802 then
    ScriptLib.RefreshGroup(context, {group_id = 220134005, suite = 2})
    if 0 ~= ScriptLib.AddQuestProgress(context, "door1complete") then
      ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
      return -1
    end
    if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "door1", 1, 220134033) then
      ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
      return -1
    else
    end
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_1004(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101802 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_1004(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134004, suite = 2}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_1005(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101803 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_1005(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134004, suite = 3}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_1006(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101804 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_1006(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134004, suite = 4}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_1007(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101805 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_1007(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134004, suite = 5}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_1008(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101806 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_1008(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134004, suite = 6}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_1009(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101807 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_1009(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134004, suite = 7}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_1010(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101808 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_1010(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134004, suite = 8}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_1011(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_1011(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134004, suite = 10}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134005, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "door1", 0, 220134033) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_1012(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101834 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_1012(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134004, suite = 9}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_1013(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "camera") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_1013(context, evt)
  local pos = {
    x = 469,
    y = 637,
    z = -1607
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
