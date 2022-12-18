local base_info = {group_id = 220134046}
local defs = {
  gear_info = {
    [1] = {
      config_id = 46001,
      connect = {
        46002,
        46004,
        46007,
        46005,
        46003
      },
      point_array_id = 46
    },
    [2] = {
      config_id = 46002,
      connect = {
        46001,
        46003,
        46005,
        46004,
        46006
      },
      point_array_id = 47
    },
    [3] = {
      config_id = 46003,
      connect = {
        46001,
        46002,
        46004,
        46005,
        46008
      },
      point_array_id = 48
    },
    [4] = {
      config_id = 46004,
      connect = {
        46002,
        46001,
        46005,
        46007,
        46006
      },
      point_array_id = 49
    },
    [5] = {
      config_id = 46005,
      connect = {
        46003,
        46001,
        46004,
        46007,
        46008
      },
      point_array_id = 50
    },
    [6] = {
      config_id = 46006,
      connect = {
        46002,
        46004,
        46005,
        46007
      },
      point_array_id = 51
    },
    [7] = {
      config_id = 46007,
      connect = {
        46006,
        46004,
        46003,
        46005,
        46008
      },
      point_array_id = 52
    },
    [8] = {
      config_id = 46008,
      connect = {
        46003,
        46005,
        46004,
        46007
      },
      point_array_id = 53
    }
  },
  solutions = {
    [1] = {
      connection = {
        4,
        1,
        0,
        0,
        4,
        3,
        4,
        0
      },
      ends = {46007}
    },
    [2] = {
      connection = {
        1,
        0,
        0,
        0,
        2,
        3,
        4,
        0
      },
      ends = {46002}
    },
    [3] = {
      connection = {
        0,
        4,
        5,
        5,
        0,
        4,
        3,
        0
      },
      ends = {46008}
    },
    [4] = {
      connection = {
        1,
        5,
        1,
        3,
        3,
        4,
        5,
        2
      },
      ends = {46004}
    },
    [5] = {
      connection = {
        5,
        1,
        1,
        3,
        5,
        1,
        1,
        4
      },
      ends = {46003}
    },
    [6] = {
      connection = {
        4,
        1,
        0,
        0,
        0,
        3,
        4,
        0
      },
      ends = {}
    },
    [7] = {
      connection = {
        0,
        4,
        0,
        5,
        0,
        4,
        3,
        1
      },
      ends = {46003}
    },
    [8] = {
      connection = {
        1,
        5,
        1,
        3,
        3,
        4,
        5,
        2
      },
      ends = {46005}
    },
    [9] = {
      connection = {
        1,
        5,
        1,
        3,
        5,
        4,
        5,
        2
      },
      ends = {46008}
    },
    [10] = {
      connection = {
        1,
        5,
        1,
        3,
        5,
        4,
        5,
        4
      },
      ends = {46007}
    },
    [11] = {
      connection = {
        1,
        5,
        1,
        3,
        5,
        4,
        1,
        4
      },
      ends = {46006}
    },
    [12] = {
      connection = {
        1,
        5,
        1,
        3,
        5,
        1,
        1,
        4
      },
      ends = {46002}
    },
    [13] = {
      connection = {
        1,
        1,
        1,
        3,
        5,
        1,
        1,
        4
      },
      ends = {46001}
    }
  },
  turn_option = 31
}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 46001,
    gadget_id = 70310178,
    pos = {
      x = 198.323,
      y = 634.126,
      z = -1740.713
    },
    rot = {
      x = 0.0,
      y = 255.501,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 46002,
    gadget_id = 70310178,
    pos = {
      x = 206.288,
      y = 634.126,
      z = -1733.476
    },
    rot = {
      x = 0.0,
      y = 330.755,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 46003,
    gadget_id = 70310178,
    pos = {
      x = 187.88,
      y = 634.126,
      z = -1743.3
    },
    rot = {
      x = 0.0,
      y = 332.25,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 46004,
    gadget_id = 70310178,
    pos = {
      x = 197.843,
      y = 634.126,
      z = -1729.133
    },
    rot = {
      x = 0.0,
      y = 239.464,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 46005,
    gadget_id = 70310178,
    pos = {
      x = 186.55,
      y = 634.126,
      z = -1735.493
    },
    rot = {
      x = 0.0,
      y = 65.024,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 46006,
    gadget_id = 70310178,
    pos = {
      x = 198.196,
      y = 634.126,
      z = -1719.926
    },
    rot = {
      x = 0.0,
      y = 148.64,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 46007,
    gadget_id = 70310178,
    pos = {
      x = 189.288,
      y = 634.126,
      z = -1724.763
    },
    rot = {
      x = 2.345,
      y = 178.984,
      z = 352.786
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 46008,
    gadget_id = 70310178,
    pos = {
      x = 180.583,
      y = 634.126,
      z = -1729.913
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 46009,
    gadget_id = 70380301,
    pos = {
      x = 200.998,
      y = 645.055,
      z = -1770.307
    },
    rot = {
      x = 0.0,
      y = 330.777,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 46010,
    gadget_id = 70360001,
    pos = {
      x = 197.586,
      y = 635.688,
      z = -1764.311
    },
    rot = {
      x = 0.0,
      y = 328.022,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 46011,
    gadget_id = 70211111,
    pos = {
      x = 208.792,
      y = 635.663,
      z = -1751.413
    },
    rot = {
      x = 0.0,
      y = 331.33,
      z = 0.0
    },
    level = 16,
    drop_tag = "\232\167\163\232\176\156\228\184\173\231\186\167\231\190\164\229\178\155",
    isOneoff = true,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1046012,
    name = "VARIABLE_CHANGE_46012",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_46012",
    action = "action_EVENT_VARIABLE_CHANGE_46012"
  },
  {
    config_id = 1046013,
    name = "SELECT_OPTION_46013",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_46013",
    action = "action_EVENT_SELECT_OPTION_46013",
    trigger_count = 0
  },
  {
    config_id = 1046014,
    name = "VARIABLE_CHANGE_46014",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_46014",
    action = "action_EVENT_VARIABLE_CHANGE_46014"
  },
  {
    config_id = 1046015,
    name = "VARIABLE_CHANGE_46015",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_46015",
    action = "action_EVENT_VARIABLE_CHANGE_46015"
  },
  {
    config_id = 1046016,
    name = "GROUP_LOAD_46016",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_46016",
    action = "action_EVENT_GROUP_LOAD_46016",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "finish",
    value = 0,
    no_refresh = true
  }
}
init_config = {
  suite = 1,
  end_suite = 2,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {
      46001,
      46002,
      46003,
      46004,
      46005,
      46006,
      46007,
      46008,
      46009,
      46010
    },
    regions = {},
    triggers = {
      "VARIABLE_CHANGE_46012",
      "SELECT_OPTION_46013",
      "VARIABLE_CHANGE_46014",
      "VARIABLE_CHANGE_46015",
      "GROUP_LOAD_46016"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      46009,
      46010,
      46011
    },
    regions = {},
    triggers = {
      "SELECT_OPTION_46013",
      "GROUP_LOAD_46016"
    },
    rand_weight = 100
  }
}
function condition_EVENT_VARIABLE_CHANGE_46012(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "solution") == 1 or ScriptLib.GetGroupVariableValue(context, "solution") == 2 or ScriptLib.GetGroupVariableValue(context, "solution") == 6 then
    return true
  end
  return false
end
function action_EVENT_VARIABLE_CHANGE_46012(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "pattern", 2, 220134056) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  local pos = {
    x = 212,
    y = 647,
    z = -1757
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = true,
    duration = 3,
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
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "form", 2, 220134056) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_46013(context, evt)
  if 46010 ~= evt.param1 then
    return false
  end
  if 411 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_46013(context, evt)
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 46009, 10) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 46009) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220134046, 46010, 411) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_46014(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "form", 220134056) ~= 2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "solution") == 3 or ScriptLib.GetGroupVariableValue(context, "solution") == 7 then
    return true
  end
  return false
end
function action_EVENT_VARIABLE_CHANGE_46014(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "pattern", 3, 220134056) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  local pos = {
    x = 212,
    y = 647,
    z = -1757
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = true,
    duration = 3,
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
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "form", 3, 220134056) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_46015(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "form", 220134056) ~= 3 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "solution") == 4 or ScriptLib.GetGroupVariableValue(context, "solution") == 5 or ScriptLib.GetGroupVariableValue(context, "solution") >= 8 then
    return true
  end
  return false
end
function action_EVENT_VARIABLE_CHANGE_46015(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "pattern", 4, 220134056) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "form", 4, 220134056) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "finish", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220134046, 46010, {411}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220134046, 2)
  local pos = {
    x = 212,
    y = 647,
    z = -1757
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = true,
    duration = 3,
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
  if 0 ~= ScriptLib.GoToGroupSuite(context, 220134046, 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : goto_groupSuite")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_46016(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "finish") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_46016(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220134046, 46010, {411}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.GoToGroupSuite(context, 220134046, 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : goto_groupSuite")
    return -1
  end
  return 0
end
require("V2_8/ConstellationMachine")
