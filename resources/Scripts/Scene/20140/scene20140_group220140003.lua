local base_info = {group_id = 220140003}
local defs = {
  fireMachineList = {3011},
  initConfig = {
    [3011] = 5
  },
  controlRelation = {},
  selectID_horizon = 613,
  selectID_vertical = 612,
  horizon_steps = {
    [3018] = {
      0,
      102,
      103,
      104
    },
    [3020] = {
      0,
      102,
      103,
      104
    },
    [3024] = {
      0,
      102,
      103,
      104
    },
    [3025] = {
      0,
      102,
      103,
      104
    },
    [3004] = {
      0,
      102,
      103,
      104
    }
  },
  vertical_steps = {
    [3018] = {
      0,
      302,
      303,
      304
    },
    [3020] = {
      0,
      302,
      303,
      304
    },
    [3024] = {
      0,
      302,
      303,
      304
    },
    [3025] = {
      0,
      302,
      303,
      304
    },
    [3004] = {
      0,
      302,
      303,
      304
    }
  },
  serve_items = {3039}
}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 3001,
    gadget_id = 70380300,
    pos = {
      x = -80.0,
      y = 41.0,
      z = 115.0
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop,
    persistent = true,
    is_use_point_array = true
  },
  {
    config_id = 3003,
    gadget_id = 70360170,
    pos = {
      x = -91.081,
      y = -0.418,
      z = 20.122
    },
    rot = {
      x = 0.0,
      y = 9.12,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 3007,
    gadget_id = 70380300,
    pos = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 15.0
    },
    level = 1,
    persistent = true,
    is_use_point_array = true
  },
  {
    config_id = 3009,
    gadget_id = 70690027,
    pos = {
      x = -87.323,
      y = -1.722,
      z = 19.429
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
    gadget_id = 70690001,
    pos = {
      x = -57.822,
      y = 17.279,
      z = 132.132
    },
    rot = {
      x = 340.048,
      y = 43.451,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 3012,
    gadget_id = 70690001,
    pos = {
      x = -47.914,
      y = 21.458,
      z = 142.591
    },
    rot = {
      x = 335.144,
      y = 43.451,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 3014,
    gadget_id = 70690001,
    pos = {
      x = -38.007,
      y = 25.636,
      z = 153.049
    },
    rot = {
      x = 333.025,
      y = 43.451,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 3015,
    gadget_id = 70690027,
    pos = {
      x = -34.528,
      y = -6.535,
      z = -29.295
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3016,
    gadget_id = 70690001,
    pos = {
      x = -28.099,
      y = 29.814,
      z = 163.508
    },
    rot = {
      x = 335.166,
      y = 43.451,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 3017,
    gadget_id = 70690001,
    pos = {
      x = -18.191,
      y = 33.993,
      z = 173.966
    },
    rot = {
      x = 334.804,
      y = 43.451,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 3019,
    gadget_id = 70690001,
    pos = {
      x = -8.283,
      y = 38.171,
      z = 184.424
    },
    rot = {
      x = 347.259,
      y = 17.275,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 3021,
    gadget_id = 70690001,
    pos = {
      x = -4.441,
      y = 39.486,
      z = 196.779
    },
    rot = {
      x = 354.199,
      y = 17.275,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 3022,
    gadget_id = 70310386,
    pos = {
      x = -90.897,
      y = -0.65,
      z = 20.091
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    isOneoff = true
  },
  {
    config_id = 3026,
    gadget_id = 70690001,
    pos = {
      x = -40.004,
      y = -2.202,
      z = -19.486
    },
    rot = {
      x = 337.462,
      y = 319.779,
      z = 347.218
    },
    level = 1
  },
  {
    config_id = 3027,
    gadget_id = 70690001,
    pos = {
      x = -49.903,
      y = 1.228,
      z = -8.231
    },
    rot = {
      x = 0.0,
      y = 318.667,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3028,
    gadget_id = 70290373,
    pos = {
      x = -69.635,
      y = 10.437,
      z = 130.424
    },
    rot = {
      x = 0.143,
      y = 146.963,
      z = 350.666
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 3029,
    gadget_id = 70690001,
    pos = {
      x = -58.869,
      y = 1.228,
      z = 1.963
    },
    rot = {
      x = 0.0,
      y = 318.667,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3030,
    gadget_id = 70690027,
    pos = {
      x = -63.987,
      y = 10.177,
      z = 125.143
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 3033,
    gadget_id = 70211111,
    pos = {
      x = -70.476,
      y = 9.348,
      z = 117.419
    },
    rot = {
      x = 9.05,
      y = 235.987,
      z = 1.506
    },
    level = 16,
    drop_tag = "\232\167\163\232\176\156\228\184\173\231\186\167\231\190\164\229\178\155",
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 3037,
    gadget_id = 70290373,
    pos = {
      x = -84.237,
      y = 18.3,
      z = 106.996
    },
    rot = {
      x = 351.53,
      y = 56.095,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  {
    config_id = 3038,
    gadget_id = 70300118,
    pos = {
      x = -91.059,
      y = -0.631,
      z = 20.08
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3039,
    gadget_id = 70290374,
    pos = {
      x = -92.944,
      y = 19.073,
      z = 128.75
    },
    rot = {
      x = 0.0,
      y = 239.686,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart,
    isOneoff = true
  },
  {
    config_id = 3040,
    gadget_id = 70690001,
    pos = {
      x = -85.893,
      y = 6.74,
      z = 28.405
    },
    rot = {
      x = 329.003,
      y = 1.001,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3041,
    gadget_id = 70690001,
    pos = {
      x = -85.732,
      y = 10.512,
      z = 37.665
    },
    rot = {
      x = 330.086,
      y = 1.001,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3042,
    gadget_id = 70690001,
    pos = {
      x = -85.57,
      y = 14.284,
      z = 46.925
    },
    rot = {
      x = 331.316,
      y = 357.188,
      z = 359.936
    },
    level = 1
  },
  {
    config_id = 3043,
    gadget_id = 70690001,
    pos = {
      x = -85.408,
      y = 18.057,
      z = 56.185
    },
    rot = {
      x = 332.545,
      y = 357.33,
      z = 359.78
    },
    level = 1
  },
  {
    config_id = 3044,
    gadget_id = 70690001,
    pos = {
      x = -85.004,
      y = 21.215,
      z = 65.563
    },
    rot = {
      x = 356.886,
      y = 8.271,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3045,
    gadget_id = 70690001,
    pos = {
      x = -83.567,
      y = 21.758,
      z = 75.444
    },
    rot = {
      x = 356.886,
      y = 8.271,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3049,
    gadget_id = 70690029,
    pos = {
      x = -1.248,
      y = 22.134,
      z = 210.636
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
    config_id = 3050,
    shape = RegionShape.CUBIC,
    size = {
      x = 30.0,
      y = 15.0,
      z = 30.0
    },
    pos = {
      x = -0.241,
      y = 35.906,
      z = 224.273
    }
  }
}
triggers = {
  {
    config_id = 1003002,
    name = "TIME_AXIS_PASS_3002",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "test",
    condition = "condition_EVENT_TIME_AXIS_PASS_3002",
    action = "action_EVENT_TIME_AXIS_PASS_3002",
    trigger_count = 0
  },
  {
    config_id = 1003005,
    name = "TIME_AXIS_PASS_3005",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "test",
    condition = "",
    action = "action_EVENT_TIME_AXIS_PASS_3005",
    trigger_count = 0
  },
  {
    config_id = 1003006,
    name = "GADGET_STATE_CHANGE_3006",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_3006",
    action = "action_EVENT_GADGET_STATE_CHANGE_3006",
    trigger_count = 0
  },
  {
    config_id = 1003008,
    name = "TIME_AXIS_PASS_3008",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "test",
    condition = "condition_EVENT_TIME_AXIS_PASS_3008",
    action = "action_EVENT_TIME_AXIS_PASS_3008",
    trigger_count = 0
  },
  {
    config_id = 1003013,
    name = "SELECT_OPTION_3013",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_3013",
    action = "action_EVENT_SELECT_OPTION_3013",
    trigger_count = 0
  },
  {
    config_id = 1003023,
    name = "VARIABLE_CHANGE_3023",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "",
    action = "action_EVENT_VARIABLE_CHANGE_3023",
    trigger_count = 0
  },
  {
    config_id = 1003034,
    name = "QUEST_START_3034",
    event = EventType.EVENT_QUEST_START,
    source = "4006706",
    condition = "condition_EVENT_QUEST_START_3034",
    action = "action_EVENT_QUEST_START_3034",
    trigger_count = 0
  },
  {
    config_id = 1003035,
    name = "GROUP_LOAD_3035",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_3035",
    action = "action_EVENT_GROUP_LOAD_3035",
    trigger_count = 0
  },
  {
    config_id = 1003036,
    name = "GROUP_LOAD_3036",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_3036",
    trigger_count = 0
  },
  {
    config_id = 1003046,
    name = "QUEST_START_3046",
    event = EventType.EVENT_QUEST_START,
    source = "4006705",
    condition = "condition_EVENT_QUEST_START_3046",
    action = "action_EVENT_QUEST_START_3046",
    trigger_count = 0
  },
  {
    config_id = 1003047,
    name = "GROUP_LOAD_3047",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_3047",
    action = "action_EVENT_GROUP_LOAD_3047",
    trigger_count = 0
  },
  {
    config_id = 1003048,
    name = "GROUP_LOAD_3048",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_3048",
    action = "action_EVENT_GROUP_LOAD_3048",
    trigger_count = 0
  },
  {
    config_id = 1003050,
    name = "ENTER_REGION_3050",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3050",
    action = "action_EVENT_ENTER_REGION_3050",
    trigger_count = 0
  },
  {
    config_id = 1003051,
    name = "SELECT_OPTION_3051",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_3051",
    action = "action_EVENT_SELECT_OPTION_3051",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 2,
    name = "load",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 3,
    name = "option1",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 5,
    name = "option2",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 8,
    name = "wind",
    value = 0,
    no_refresh = true
  }
}
garbages = {
  gadgets = {
    {
      config_id = 3004,
      gadget_id = 70310159,
      pos = {
        x = -87.485,
        y = 19.845,
        z = 129.52
      },
      rot = {
        x = 0.0,
        y = 235.0,
        z = 0.0
      },
      level = 1,
      worktop_config = {
        init_options = {613}
      }
    },
    {
      config_id = 3011,
      gadget_id = 70310158,
      pos = {
        x = -79.278,
        y = 19.38,
        z = 115.084
      },
      rot = {
        x = 358.4,
        y = 330.874,
        z = 7.363
      },
      level = 1,
      state = GadgetState.GearAction2
    },
    {
      config_id = 3018,
      gadget_id = 70310159,
      pos = {
        x = -92.264,
        y = 19.845,
        z = 125.65
      },
      rot = {
        x = 0.0,
        y = 231.0,
        z = 0.0
      },
      level = 1,
      worktop_config = {
        init_options = {612}
      }
    },
    {
      config_id = 3020,
      gadget_id = 70310159,
      pos = {
        x = -101.509,
        y = 12.536,
        z = 118.351
      },
      rot = {
        x = 19.0,
        y = 140.032,
        z = 356.934
      },
      level = 1,
      worktop_config = {
        init_options = {613}
      }
    },
    {
      config_id = 3024,
      gadget_id = 70310159,
      pos = {
        x = -91.202,
        y = 7.125,
        z = 106.09
      },
      rot = {
        x = 352.0,
        y = 45.775,
        z = 0.0
      },
      level = 1,
      worktop_config = {
        init_options = {613}
      }
    },
    {
      config_id = 3025,
      gadget_id = 70310159,
      pos = {
        x = -79.978,
        y = 9.209,
        z = 117.199
      },
      rot = {
        x = 355.0,
        y = 73.5,
        z = 355.862
      },
      level = 1,
      worktop_config = {
        init_options = {613}
      }
    },
    {
      config_id = 3031,
      gadget_id = 70310188,
      pos = {
        x = -67.053,
        y = 10.531,
        z = 120.577
      },
      rot = {
        x = 353.489,
        y = 359.052,
        z = 7.44
      },
      level = 1,
      state = GadgetState.GearStop,
      isOneoff = true
    }
  },
  triggers = {
    {
      config_id = 1003032,
      name = "ANY_GADGET_DIE_3032",
      event = EventType.EVENT_ANY_GADGET_DIE,
      source = "",
      condition = "condition_EVENT_ANY_GADGET_DIE_3032",
      action = "action_EVENT_ANY_GADGET_DIE_3032"
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
    gadgets = {
      3001,
      3003,
      3007,
      3022,
      3028,
      3033,
      3038
    },
    regions = {3050},
    triggers = {
      "TIME_AXIS_PASS_3002",
      "TIME_AXIS_PASS_3005",
      "TIME_AXIS_PASS_3008",
      "SELECT_OPTION_3013",
      "VARIABLE_CHANGE_3023",
      "QUEST_START_3034",
      "GROUP_LOAD_3035",
      "GROUP_LOAD_3036",
      "QUEST_START_3046",
      "GROUP_LOAD_3047",
      "GROUP_LOAD_3048",
      "ENTER_REGION_3050",
      "SELECT_OPTION_3051"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      3009,
      3015,
      3026,
      3027,
      3029,
      3037,
      3039,
      3040,
      3041,
      3042,
      3043,
      3044,
      3045
    },
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_3006"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      3010,
      3012,
      3014,
      3016,
      3017,
      3019,
      3021,
      3030,
      3049
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_TIME_AXIS_PASS_3002(context, evt)
  if "test" ~= evt.source_name or 2 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_3002(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220140003, 2)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4006705") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function action_EVENT_TIME_AXIS_PASS_3005(context, evt)
  if evt.source_name == "test" and evt.param1 == 1 then
    ScriptLib.SetGadgetStateByConfigId(context, 3001, GadgetState.Default)
    ScriptLib.SetPlatformPointArray(context, 3001, 1, {2}, {
      route_type = RouteType.OneWay,
      turn_mode = false,
      record_mode = RouteRecordMode.Reach,
      speed_level = 0,
      arrive_range = 0
    })
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_3006(context, evt)
  if 3028 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_3006(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "wind", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220140003, 3)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4006706") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_3008(context, evt)
  if "test" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_3008(context, evt)
  local pos = {
    x = -80,
    y = 41,
    z = 115
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 2.5,
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
  return 0
end
function condition_EVENT_SELECT_OPTION_3013(context, evt)
  if 3003 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_3013(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "load", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "test", {4, 9}, false)
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220140003, 3007, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  ScriptLib.RemoveExtraGroupSuite(context, 220140017, 1)
  ScriptLib.RemoveExtraGroupSuite(context, 220140017, 2)
  local tempParam = {route_type = 0, turn_mode = false}
  if 0 ~= ScriptLib.SetPlatformPointArray(context, 3007, 2, {2}, tempParam) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_pointArray")
    return -1
  end
  local pos = {
    x = 0,
    y = 0,
    z = 0
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 2.5,
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
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220140003, EntityType.GADGET, 3038) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220140003, 3003, 7) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  ScriptLib.RemoveExtraGroupSuite(context, 220140016, 2)
  return 0
end
function action_EVENT_VARIABLE_CHANGE_3023(context, evt)
  if evt.param1 == evt.param2 then
    return -1
  end
  if ScriptLib.GetGroupVariableValue(context, "load") == 0 and ScriptLib.GetGroupVariableValue(context, "option1") == 1 and ScriptLib.GetGroupVariableValue(context, "option2") == 1 then
    ScriptLib.SetGroupVariableValue(context, "option1", 2)
    ScriptLib.SetWorktopOptionsByGroupId(context, 0, 3003, {7})
    ScriptLib.KillEntityByConfigId(context, {
      group_id = 220140003,
      config_id = 3022,
      entity_type = EntityType.GADGET
    })
  end
  return 0
end
function condition_EVENT_QUEST_START_3034(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220140003, 3028) then
    return false
  end
  return true
end
function action_EVENT_QUEST_START_3034(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4006706") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_3035(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220140003, 3028) then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_3035(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4006706") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_LOAD_3036(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "load") == 1 then
    ScriptLib.AddExtraGroupSuite(context, 0, 2)
    ScriptLib.SetPlatformPointArray(context, 3001, 3, {1}, {
      route_type = RouteType.OneWay,
      turn_mode = false,
      record_mode = RouteRecordMode.Reach,
      speed_level = 0,
      arrive_range = 0
    })
    ScriptLib.KillEntityByConfigId(context, {
      group_id = 220140003,
      config_id = 3038,
      entity_type = EntityType.GADGET
    })
  end
  if ScriptLib.GetGroupVariableValue(context, "load") == 0 and ScriptLib.GetGroupVariableValue(context, "option1") == 2 then
    ScriptLib.SetWorktopOptionsByGroupId(context, 0, 3003, {7})
    ScriptLib.KillEntityByConfigId(context, {
      group_id = 220140003,
      config_id = 3022,
      entity_type = EntityType.GADGET
    })
  end
  return 0
end
function condition_EVENT_QUEST_START_3046(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "load") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_QUEST_START_3046(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4006705") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_3047(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "load") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_3047(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4006705") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_3048(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "wind") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_3048(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220140003, 3)
  return 0
end
function condition_EVENT_ENTER_REGION_3050(context, evt)
  if evt.param1 ~= 3050 then
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
function action_EVENT_ENTER_REGION_3050(context, evt)
  ScriptLib.ActivateDungeonCheckPoint(context, 6)
  return 0
end
function condition_EVENT_SELECT_OPTION_3051(context, evt)
  if 3003 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_3051(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3003, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
require("V2_8/FireMachineColorHandle")
require("V2_8/KazuhaServeItem")
