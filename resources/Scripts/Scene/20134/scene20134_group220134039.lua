local base_info = {group_id = 220134039}
local defs = {
  control = {
    group_id = 220134042,
    config_id = 42001,
    light_index = 8,
    giving_gadget = 39001
  }
}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 39001,
    gadget_id = 70310272,
    pos = {
      x = 492.615,
      y = 612.254,
      z = -1583.78
    },
    rot = {
      x = 0.0,
      y = 312.779,
      z = 0.0
    },
    level = 1,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1039002,
    name = "GROUP_LOAD_39002",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_39002",
    trigger_count = 0
  },
  {
    config_id = 1039003,
    name = "VARIABLE_CHANGE_39003",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_39003",
    action = "action_EVENT_VARIABLE_CHANGE_39003",
    trigger_count = 0
  },
  {
    config_id = 1039004,
    name = "VARIABLE_CHANGE_39004",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_39004",
    action = "action_EVENT_VARIABLE_CHANGE_39004",
    trigger_count = 0
  },
  {
    config_id = 1039005,
    name = "VARIABLE_CHANGE_39005",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_39005",
    action = "action_EVENT_VARIABLE_CHANGE_39005",
    trigger_count = 0
  },
  {
    config_id = 1039006,
    name = "VARIABLE_CHANGE_39006",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_39006",
    action = "action_EVENT_VARIABLE_CHANGE_39006",
    trigger_count = 0
  },
  {
    config_id = 1039007,
    name = "VARIABLE_CHANGE_39007",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_39007",
    action = "action_EVENT_VARIABLE_CHANGE_39007",
    trigger_count = 0
  },
  {
    config_id = 1039008,
    name = "VARIABLE_CHANGE_39008",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_39008",
    action = "action_EVENT_VARIABLE_CHANGE_39008",
    trigger_count = 0
  },
  {
    config_id = 1039009,
    name = "VARIABLE_CHANGE_39009",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_39009",
    action = "action_EVENT_VARIABLE_CHANGE_39009",
    trigger_count = 0
  },
  {
    config_id = 1039010,
    name = "VARIABLE_CHANGE_39010",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_39010",
    action = "action_EVENT_VARIABLE_CHANGE_39010",
    trigger_count = 0
  },
  {
    config_id = 1039011,
    name = "VARIABLE_CHANGE_39011",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_39011",
    action = "action_EVENT_VARIABLE_CHANGE_39011",
    trigger_count = 0
  },
  {
    config_id = 1039012,
    name = "VARIABLE_CHANGE_39012",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_39012",
    action = "action_EVENT_VARIABLE_CHANGE_39012",
    trigger_count = 0
  },
  {
    config_id = 1039013,
    name = "VARIABLE_CHANGE_39013",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_39013",
    action = "action_EVENT_VARIABLE_CHANGE_39013",
    trigger_count = 0
  },
  {
    config_id = 1039014,
    name = "QUEST_START_39014",
    event = EventType.EVENT_QUEST_START,
    source = "4007605",
    condition = "condition_EVENT_QUEST_START_39014",
    action = "action_EVENT_QUEST_START_39014",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "camera",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 2,
    name = "finish",
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
    gadgets = {39001},
    regions = {},
    triggers = {
      "GROUP_LOAD_39002",
      "VARIABLE_CHANGE_39003",
      "VARIABLE_CHANGE_39004",
      "VARIABLE_CHANGE_39005",
      "VARIABLE_CHANGE_39006",
      "VARIABLE_CHANGE_39007",
      "VARIABLE_CHANGE_39008",
      "VARIABLE_CHANGE_39009",
      "VARIABLE_CHANGE_39010",
      "VARIABLE_CHANGE_39011",
      "VARIABLE_CHANGE_39012",
      "VARIABLE_CHANGE_39013",
      "QUEST_START_39014"
    },
    rand_weight = 100
  }
}
function action_EVENT_GROUP_LOAD_39002(context, evt)
  ScriptLib.ActiveGadgetItemGiving(context, 10000108, 220134039, 39001)
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_39003(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101801 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_39003(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134029, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_39004(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101802 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_39004(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134029, suite = 2}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_39005(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101803 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_39005(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134029, suite = 3}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_39006(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101804 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_39006(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134029, suite = 4}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_39007(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101805 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_39007(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134029, suite = 5}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_39008(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101806 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_39008(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134029, suite = 6}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_39009(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101807 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_39009(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134029, suite = 7}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_39010(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101808 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_39010(context, evt)
  ScriptLib.RefreshGroup(context, {group_id = 220134029, suite = 8})
  if ScriptLib.GetGroupVariableValueByGroup(context, "given_item", 220134038) == 101807 or ScriptLib.GetGroupVariableValueByGroup(context, "given_item", 220134038) == 101804 then
    ScriptLib.RefreshGroup(context, {group_id = 220134021, suite = 2})
    ScriptLib.AddQuestProgress(context, "door4complete")
    ScriptLib.SetGroupVariableValueByGroup(context, "door4", 1, 220134033)
    ScriptLib.SetGroupVariableValue(context, "finish", 1)
  else
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_39011(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_39011(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134029, suite = 10}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134021, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "door4", 0, 220134033) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_39012(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101834 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_39012(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134029, suite = 9}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_39013(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "camera") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_39013(context, evt)
  local pos = {
    x = 466,
    y = 633,
    z = -1576.7
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
function condition_EVENT_QUEST_START_39014(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "finish") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_QUEST_START_39014(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "door4complete") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
require("V2_8/HandleGivingResult")
