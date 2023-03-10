local base_info = {group_id = 220134037}
local defs = {
  control = {
    group_id = 220134042,
    config_id = 42001,
    light_index = 6,
    giving_gadget = 37001
  }
}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 37001,
    gadget_id = 70310270,
    pos = {
      x = 508.152,
      y = 612.254,
      z = -1583.945
    },
    rot = {
      x = 0.0,
      y = 53.721,
      z = 0.0
    },
    level = 1,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1037002,
    name = "GROUP_LOAD_37002",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_37002",
    trigger_count = 0
  },
  {
    config_id = 1037003,
    name = "VARIABLE_CHANGE_37003",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_37003",
    action = "action_EVENT_VARIABLE_CHANGE_37003",
    trigger_count = 0
  },
  {
    config_id = 1037004,
    name = "VARIABLE_CHANGE_37004",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_37004",
    action = "action_EVENT_VARIABLE_CHANGE_37004",
    trigger_count = 0
  },
  {
    config_id = 1037005,
    name = "VARIABLE_CHANGE_37005",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_37005",
    action = "action_EVENT_VARIABLE_CHANGE_37005",
    trigger_count = 0
  },
  {
    config_id = 1037006,
    name = "VARIABLE_CHANGE_37006",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_37006",
    action = "action_EVENT_VARIABLE_CHANGE_37006",
    trigger_count = 0
  },
  {
    config_id = 1037007,
    name = "VARIABLE_CHANGE_37007",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_37007",
    action = "action_EVENT_VARIABLE_CHANGE_37007",
    trigger_count = 0
  },
  {
    config_id = 1037008,
    name = "VARIABLE_CHANGE_37008",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_37008",
    action = "action_EVENT_VARIABLE_CHANGE_37008",
    trigger_count = 0
  },
  {
    config_id = 1037009,
    name = "VARIABLE_CHANGE_37009",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_37009",
    action = "action_EVENT_VARIABLE_CHANGE_37009",
    trigger_count = 0
  },
  {
    config_id = 1037010,
    name = "VARIABLE_CHANGE_37010",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_37010",
    action = "action_EVENT_VARIABLE_CHANGE_37010",
    trigger_count = 0
  },
  {
    config_id = 1037011,
    name = "VARIABLE_CHANGE_37011",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_37011",
    action = "action_EVENT_VARIABLE_CHANGE_37011",
    trigger_count = 0
  },
  {
    config_id = 1037012,
    name = "VARIABLE_CHANGE_37012",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_37012",
    action = "action_EVENT_VARIABLE_CHANGE_37012",
    trigger_count = 0
  },
  {
    config_id = 1037013,
    name = "VARIABLE_CHANGE_37013",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_37013",
    action = "action_EVENT_VARIABLE_CHANGE_37013",
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
    gadgets = {37001},
    regions = {},
    triggers = {
      "GROUP_LOAD_37002",
      "VARIABLE_CHANGE_37003",
      "VARIABLE_CHANGE_37004",
      "VARIABLE_CHANGE_37005",
      "VARIABLE_CHANGE_37006",
      "VARIABLE_CHANGE_37007",
      "VARIABLE_CHANGE_37008",
      "VARIABLE_CHANGE_37009",
      "VARIABLE_CHANGE_37010",
      "VARIABLE_CHANGE_37011",
      "VARIABLE_CHANGE_37012",
      "VARIABLE_CHANGE_37013"
    },
    rand_weight = 100
  }
}
function action_EVENT_GROUP_LOAD_37002(context, evt)
  ScriptLib.ActiveGadgetItemGiving(context, 10000106, 220134037, 37001)
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_37003(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101801 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_37003(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134028, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_37004(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101802 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_37004(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134028, suite = 2}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_37005(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101803 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_37005(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134028, suite = 3}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_37006(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101804 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_37006(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134028, suite = 4}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_37007(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101805 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_37007(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134028, suite = 5}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_37008(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101806 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_37008(context, evt)
  ScriptLib.RefreshGroup(context, {group_id = 220134028, suite = 6})
  if ScriptLib.GetGroupVariableValueByGroup(context, "given_item", 220134036) == 101805 then
    ScriptLib.RefreshGroup(context, {group_id = 220134020, suite = 2})
    ScriptLib.AddQuestProgress(context, "door3complete")
    ScriptLib.SetGroupVariableValueByGroup(context, "door3", 1, 220134033)
  else
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_37009(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101807 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_37009(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134028, suite = 7}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_37010(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101808 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_37010(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134028, suite = 8}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_37011(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_37011(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134028, suite = 10}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134020, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "door3", 0, 220134033) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_37012(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "given_item") ~= 101834 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_37012(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220134028, suite = 9}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_37013(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "camera") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_37013(context, evt)
  local pos = {
    x = 533.5,
    y = 636.7,
    z = -1575.7
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
