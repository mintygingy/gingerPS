local base_info = {group_id = 220133050}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 50001,
    gadget_id = 70310242,
    pos = {
      x = 2256.604,
      y = 521.29,
      z = 479.627
    },
    rot = {
      x = 6.658,
      y = 57.486,
      z = 348.845
    },
    level = 1,
    interact_id = 64
  },
  {
    config_id = 50004,
    gadget_id = 70310242,
    pos = {
      x = 2268.672,
      y = 533.289,
      z = 520.602
    },
    rot = {
      x = 11.525,
      y = 146.292,
      z = 351.642
    },
    level = 1,
    interact_id = 64
  },
  {
    config_id = 50012,
    gadget_id = 70380320,
    pos = {
      x = 2270.846,
      y = 525.892,
      z = 501.388
    },
    rot = {
      x = 350.118,
      y = 277.789,
      z = 8.025
    },
    level = 1,
    route_id = 15,
    start_route = false
  },
  {
    config_id = 50013,
    gadget_id = 70380320,
    pos = {
      x = 2252.569,
      y = 528.61,
      z = 503.68
    },
    rot = {
      x = 350.118,
      y = 277.789,
      z = 8.025
    },
    level = 1,
    route_id = 7,
    start_route = false
  }
}
regions = {}
triggers = {
  {
    config_id = 1050002,
    name = "GADGET_STATE_CHANGE_50002",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_50002",
    action = "action_EVENT_GADGET_STATE_CHANGE_50002",
    trigger_count = 0
  },
  {
    config_id = 1050003,
    name = "GADGET_STATE_CHANGE_50003",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_50003",
    action = "action_EVENT_GADGET_STATE_CHANGE_50003"
  },
  {
    config_id = 1050005,
    name = "GADGET_STATE_CHANGE_50005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_50005",
    action = "action_EVENT_GADGET_STATE_CHANGE_50005",
    trigger_count = 0
  },
  {
    config_id = 1050016,
    name = "GROUP_LOAD_50016",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_50016",
    trigger_count = 0
  },
  {
    config_id = 1050017,
    name = "GADGET_STATE_CHANGE_50017",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_50017",
    action = "action_EVENT_GADGET_STATE_CHANGE_50017",
    trigger_count = 0
  },
  {
    config_id = 1050018,
    name = "GADGET_STATE_CHANGE_50018",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_50018",
    action = "action_EVENT_GADGET_STATE_CHANGE_50018",
    trigger_count = 0
  },
  {
    config_id = 1050019,
    name = "PLATFORM_ARRIVAL_50019",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_50019",
    action = "action_EVENT_PLATFORM_ARRIVAL_50019",
    trigger_count = 0
  },
  {
    config_id = 1050020,
    name = "PLATFORM_ARRIVAL_50020",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_50020",
    action = "action_EVENT_PLATFORM_ARRIVAL_50020",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "StoneReadyA",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 2,
    name = "StoneReadyB",
    value = 0,
    no_refresh = false
  }
}
garbages = {
  gadgets = {
    {
      config_id = 50014,
      gadget_id = 70380320,
      pos = {
        x = 2263.496,
        y = 533.253,
        z = 516.34
      },
      rot = {
        x = 350.118,
        y = 277.789,
        z = 8.025
      },
      level = 1
    },
    {
      config_id = 50015,
      gadget_id = 70380320,
      pos = {
        x = 2257.032,
        y = 521.345,
        z = 488.792
      },
      rot = {
        x = 350.118,
        y = 277.789,
        z = 8.025
      },
      level = 1
    }
  },
  triggers = {
    {
      config_id = 1050006,
      name = "GADGET_STATE_CHANGE_50006",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_50006",
      action = "action_EVENT_GADGET_STATE_CHANGE_50006",
      trigger_count = 0
    },
    {
      config_id = 1050007,
      name = "GADGET_STATE_CHANGE_50007",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_50007",
      action = "action_EVENT_GADGET_STATE_CHANGE_50007",
      trigger_count = 0
    },
    {
      config_id = 1050008,
      name = "PLATFORM_REACH_POINT_50008",
      event = EventType.EVENT_PLATFORM_REACH_POINT,
      source = "",
      condition = "condition_EVENT_PLATFORM_REACH_POINT_50008",
      action = "action_EVENT_PLATFORM_REACH_POINT_50008",
      trigger_count = 0
    },
    {
      config_id = 1050009,
      name = "PLATFORM_REACH_POINT_50009",
      event = EventType.EVENT_PLATFORM_REACH_POINT,
      source = "",
      condition = "condition_EVENT_PLATFORM_REACH_POINT_50009",
      action = "action_EVENT_PLATFORM_REACH_POINT_50009",
      trigger_count = 0
    },
    {
      config_id = 1050010,
      name = "GADGET_STATE_CHANGE_50010",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_50010",
      action = "action_EVENT_GADGET_STATE_CHANGE_50010",
      trigger_count = 0
    },
    {
      config_id = 1050011,
      name = "GADGET_STATE_CHANGE_50011",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_50011",
      action = "action_EVENT_GADGET_STATE_CHANGE_50011",
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
    gadgets = {
      50001,
      50004,
      50012,
      50013
    },
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_50002",
      "GADGET_STATE_CHANGE_50003",
      "GADGET_STATE_CHANGE_50005",
      "GROUP_LOAD_50016",
      "GADGET_STATE_CHANGE_50017",
      "GADGET_STATE_CHANGE_50018",
      "PLATFORM_ARRIVAL_50019",
      "PLATFORM_ARRIVAL_50020"
    },
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
function condition_EVENT_GADGET_STATE_CHANGE_50002(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133050, 50001) then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "StoneReadyA") ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "StoneReadyB") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_50002(context, evt)
  if 0 ~= ScriptLib.StartPlatform(context, 50012) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 50013) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "StoneReadyA", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "StoneReadyB", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_50003(context, evt)
  if 50001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_50003(context, evt)
  local pos = {
    x = 2258,
    y = 526,
    z = 502
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 1.5,
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
function condition_EVENT_GADGET_STATE_CHANGE_50005(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133050, 50004) then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "StoneReadyA") ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "StoneReadyB") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_50005(context, evt)
  if 0 ~= ScriptLib.StartPlatform(context, 50012) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 50013) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "StoneReadyA", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "StoneReadyB", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_LOAD_50016(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "StoneReadyA", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "StoneReadyB", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_50017(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133050, 50001) then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "StoneReadyA") ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "StoneReadyB") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_50017(context, evt)
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2801, 2, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_50018(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133050, 50004) then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "StoneReadyA") ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "StoneReadyB") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_50018(context, evt)
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2801, 2, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_50019(context, evt)
  if 50013 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  if 3 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_50019(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "StoneReadyA", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "StoneReadyB", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 50001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 50004, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_50020(context, evt)
  if 50012 ~= evt.param1 then
    return false
  end
  if 15 ~= evt.param2 then
    return false
  end
  if 3 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_50020(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "StoneReadyA", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "StoneReadyB", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 50001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 50004, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
