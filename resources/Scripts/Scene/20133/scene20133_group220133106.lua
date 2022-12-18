local base_info = {group_id = 220133106}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 106001,
    gadget_id = 70310242,
    pos = {
      x = 4352.727,
      y = 538.512,
      z = 213.492
    },
    rot = {
      x = 353.397,
      y = 241.496,
      z = 357.565
    },
    level = 1,
    interact_id = 64
  },
  {
    config_id = 106002,
    gadget_id = 70310242,
    pos = {
      x = 4338.532,
      y = 544.012,
      z = 183.73
    },
    rot = {
      x = 23.759,
      y = 79.241,
      z = 25.122
    },
    level = 1,
    interact_id = 64
  },
  {
    config_id = 106003,
    gadget_id = 70380320,
    pos = {
      x = 4343.767,
      y = 533.646,
      z = 199.947
    },
    rot = {
      x = 0.03,
      y = 302.036,
      z = 355.426
    },
    level = 1,
    route_id = 28,
    start_route = false
  },
  {
    config_id = 106004,
    gadget_id = 70380320,
    pos = {
      x = 4349.694,
      y = 547.33,
      z = 207.504
    },
    rot = {
      x = 4.764,
      y = 358.917,
      z = 356.935
    },
    level = 1,
    route_id = 29,
    start_route = false
  },
  {
    config_id = 106007,
    gadget_id = 70380320,
    pos = {
      x = 4353.75,
      y = 541.893,
      z = 188.299
    },
    rot = {
      x = 351.533,
      y = 114.726,
      z = 6.032
    },
    level = 1,
    route_id = 32,
    start_route = false
  },
  {
    config_id = 106009,
    gadget_id = 70380320,
    pos = {
      x = 4323.869,
      y = 541.822,
      z = 198.006
    },
    rot = {
      x = 357.542,
      y = 118.062,
      z = 12.299
    },
    level = 1,
    route_id = 33,
    start_route = false
  }
}
regions = {}
triggers = {
  {
    config_id = 1106019,
    name = "GROUP_LOAD_106019",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_106019",
    trigger_count = 0
  },
  {
    config_id = 1106020,
    name = "GADGET_STATE_CHANGE_106020",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_106020",
    action = "action_EVENT_GADGET_STATE_CHANGE_106020",
    trigger_count = 0
  },
  {
    config_id = 1106021,
    name = "GADGET_STATE_CHANGE_106021",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_106021",
    action = "action_EVENT_GADGET_STATE_CHANGE_106021",
    trigger_count = 0
  },
  {
    config_id = 1106022,
    name = "PLATFORM_ARRIVAL_106022",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_106022",
    action = "action_EVENT_PLATFORM_ARRIVAL_106022",
    trigger_count = 0
  },
  {
    config_id = 1106023,
    name = "PLATFORM_ARRIVAL_106023",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_106023",
    action = "action_EVENT_PLATFORM_ARRIVAL_106023",
    trigger_count = 0
  },
  {
    config_id = 1106024,
    name = "PLATFORM_ARRIVAL_106024",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_106024",
    action = "action_EVENT_PLATFORM_ARRIVAL_106024",
    trigger_count = 0
  },
  {
    config_id = 1106025,
    name = "PLATFORM_ARRIVAL_106025",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_106025",
    action = "action_EVENT_PLATFORM_ARRIVAL_106025",
    trigger_count = 0
  },
  {
    config_id = 1106027,
    name = "GADGET_STATE_CHANGE_106027",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "",
    action = "action_EVENT_GADGET_STATE_CHANGE_106027",
    trigger_count = 0
  },
  {
    config_id = 1106028,
    name = "PLATFORM_ARRIVAL_106028",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_106028",
    action = "action_EVENT_PLATFORM_ARRIVAL_106028",
    trigger_count = 0
  },
  {
    config_id = 1106029,
    name = "PLATFORM_ARRIVAL_106029",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_106029",
    action = "action_EVENT_PLATFORM_ARRIVAL_106029",
    trigger_count = 0
  },
  {
    config_id = 1106030,
    name = "PLATFORM_ARRIVAL_106030",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_106030",
    action = "action_EVENT_PLATFORM_ARRIVAL_106030",
    trigger_count = 0
  },
  {
    config_id = 1106031,
    name = "PLATFORM_ARRIVAL_106031",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_106031",
    action = "action_EVENT_PLATFORM_ARRIVAL_106031",
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
  },
  {
    config_id = 3,
    name = "StoneReadyC",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 4,
    name = "StoneReadyD",
    value = 0,
    no_refresh = false
  }
}
garbages = {
  gadgets = {
    {
      config_id = 106005,
      gadget_id = 70380320,
      pos = {
        x = 4349.247,
        y = 538.739,
        z = 206.78
      },
      rot = {
        x = 4.764,
        y = 358.917,
        z = 356.935
      },
      level = 1,
      route_id = 30,
      start_route = false
    },
    {
      config_id = 106006,
      gadget_id = 70380320,
      pos = {
        x = 4344.021,
        y = 539.683,
        z = 200.358
      },
      rot = {
        x = 0.03,
        y = 302.036,
        z = 355.426
      },
      level = 1,
      route_id = 31,
      start_route = false
    },
    {
      config_id = 106008,
      gadget_id = 70380320,
      pos = {
        x = 4344.023,
        y = 540.965,
        z = 192.855
      },
      rot = {
        x = 351.533,
        y = 114.726,
        z = 6.032
      },
      level = 1,
      route_id = 30,
      start_route = false
    },
    {
      config_id = 106010,
      gadget_id = 70380320,
      pos = {
        x = 4336.637,
        y = 542.278,
        z = 191.973
      },
      rot = {
        x = 357.542,
        y = 118.062,
        z = 12.299
      },
      level = 1,
      route_id = 30,
      start_route = false
    }
  },
  triggers = {
    {
      config_id = 1106011,
      name = "GADGET_STATE_CHANGE_106011",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "",
      action = "action_EVENT_GADGET_STATE_CHANGE_106011",
      trigger_count = 0
    },
    {
      config_id = 1106012,
      name = "GADGET_STATE_CHANGE_106012",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_106012",
      action = "action_EVENT_GADGET_STATE_CHANGE_106012",
      trigger_count = 0
    },
    {
      config_id = 1106013,
      name = "GADGET_STATE_CHANGE_106013",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_106013",
      action = "action_EVENT_GADGET_STATE_CHANGE_106013",
      trigger_count = 0
    },
    {
      config_id = 1106014,
      name = "GADGET_STATE_CHANGE_106014",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_106014",
      action = "action_EVENT_GADGET_STATE_CHANGE_106014",
      trigger_count = 0
    },
    {
      config_id = 1106015,
      name = "PLATFORM_REACH_POINT_106015",
      event = EventType.EVENT_PLATFORM_REACH_POINT,
      source = "",
      condition = "condition_EVENT_PLATFORM_REACH_POINT_106015",
      action = "action_EVENT_PLATFORM_REACH_POINT_106015",
      trigger_count = 0
    },
    {
      config_id = 1106016,
      name = "PLATFORM_REACH_POINT_106016",
      event = EventType.EVENT_PLATFORM_REACH_POINT,
      source = "",
      condition = "condition_EVENT_PLATFORM_REACH_POINT_106016",
      action = "action_EVENT_PLATFORM_REACH_POINT_106016",
      trigger_count = 0
    },
    {
      config_id = 1106017,
      name = "GADGET_STATE_CHANGE_106017",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_106017",
      action = "action_EVENT_GADGET_STATE_CHANGE_106017",
      trigger_count = 0
    },
    {
      config_id = 1106018,
      name = "GADGET_STATE_CHANGE_106018",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_106018",
      action = "action_EVENT_GADGET_STATE_CHANGE_106018",
      trigger_count = 0
    },
    {
      config_id = 1106026,
      name = "GADGET_STATE_CHANGE_106026",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "",
      action = "action_EVENT_GADGET_STATE_CHANGE_106026",
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
      106001,
      106002,
      106003,
      106004,
      106007,
      106009
    },
    regions = {},
    triggers = {
      "GROUP_LOAD_106019",
      "GADGET_STATE_CHANGE_106020",
      "GADGET_STATE_CHANGE_106021",
      "PLATFORM_ARRIVAL_106022",
      "PLATFORM_ARRIVAL_106023",
      "PLATFORM_ARRIVAL_106024",
      "PLATFORM_ARRIVAL_106025",
      "GADGET_STATE_CHANGE_106027",
      "PLATFORM_ARRIVAL_106028",
      "PLATFORM_ARRIVAL_106029",
      "PLATFORM_ARRIVAL_106030",
      "PLATFORM_ARRIVAL_106031"
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
function action_EVENT_GROUP_LOAD_106019(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "StoneReadyA", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "StoneReadyB", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "StoneReadyC", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "StoneReadyD", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_106020(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133106, 106001) then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_106020(context, evt)
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2801, 2, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_106021(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133106, 106002) then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_106021(context, evt)
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2801, 2, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_106022(context, evt)
  if 106004 ~= evt.param1 then
    return false
  end
  if 29 ~= evt.param2 then
    return false
  end
  if 0 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_106022(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "StoneReadyA", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_106023(context, evt)
  if 106003 ~= evt.param1 then
    return false
  end
  if 28 ~= evt.param2 then
    return false
  end
  if 0 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_106023(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "StoneReadyB", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_106024(context, evt)
  if 106007 ~= evt.param1 then
    return false
  end
  if 32 ~= evt.param2 then
    return false
  end
  if 0 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_106024(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "StoneReadyC", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_106025(context, evt)
  if 106009 ~= evt.param1 then
    return false
  end
  if 33 ~= evt.param2 then
    return false
  end
  if 0 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_106025(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "StoneReadyD", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function action_EVENT_GADGET_STATE_CHANGE_106027(context, evt)
  if ScriptLib.GetGadgetStateByConfigId(context, 220133106, 106001) == 201 or ScriptLib.GetGadgetStateByConfigId(context, 220133106, 106002) == 201 then
    if ScriptLib.GetGroupVariableValue(context, "StoneReadyA") == 0 and ScriptLib.GetGroupVariableValue(context, "StoneReadyB") == 0 and ScriptLib.GetGroupVariableValue(context, "StoneReadyC") == 0 and ScriptLib.GetGroupVariableValue(context, "StoneReadyD") == 0 then
      ScriptLib.SetGroupVariableValue(context, "StoneReadyA", 1)
      ScriptLib.SetGroupVariableValue(context, "StoneReadyB", 1)
      ScriptLib.SetGroupVariableValue(context, "StoneReadyC", 1)
      ScriptLib.SetGroupVariableValue(context, "StoneReadyD", 1)
      ScriptLib.SetPlatformRouteId(context, 106004, 29)
      ScriptLib.SetPlatformRouteId(context, 106003, 28)
      ScriptLib.SetPlatformRouteId(context, 106007, 32)
      ScriptLib.SetPlatformRouteId(context, 106009, 33)
      ScriptLib.StartPlatform(context, 106004)
      ScriptLib.StartPlatform(context, 106003)
      ScriptLib.StartPlatform(context, 106007)
      ScriptLib.StartPlatform(context, 106009)
    elseif ScriptLib.GetGroupVariableValue(context, "StoneReadyA") == 2 and ScriptLib.GetGroupVariableValue(context, "StoneReadyB") == 2 and ScriptLib.GetGroupVariableValue(context, "StoneReadyC") == 2 and ScriptLib.GetGroupVariableValue(context, "StoneReadyD") == 2 then
      ScriptLib.SetGroupVariableValue(context, "StoneReadyA", 1)
      ScriptLib.SetGroupVariableValue(context, "StoneReadyB", 1)
      ScriptLib.SetGroupVariableValue(context, "StoneReadyC", 1)
      ScriptLib.SetGroupVariableValue(context, "StoneReadyD", 1)
      ScriptLib.SetPlatformRouteId(context, 106004, 34)
      ScriptLib.SetPlatformRouteId(context, 106003, 35)
      ScriptLib.SetPlatformRouteId(context, 106007, 36)
      ScriptLib.SetPlatformRouteId(context, 106009, 37)
      ScriptLib.StartPlatform(context, 106004)
      ScriptLib.StartPlatform(context, 106003)
      ScriptLib.StartPlatform(context, 106007)
      ScriptLib.StartPlatform(context, 106009)
    end
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_106028(context, evt)
  if 106004 ~= evt.param1 then
    return false
  end
  if 34 ~= evt.param2 then
    return false
  end
  if 0 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_106028(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "StoneReadyA", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_106029(context, evt)
  if 106003 ~= evt.param1 then
    return false
  end
  if 35 ~= evt.param2 then
    return false
  end
  if 0 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_106029(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "StoneReadyB", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_106030(context, evt)
  if 106007 ~= evt.param1 then
    return false
  end
  if 36 ~= evt.param2 then
    return false
  end
  if 0 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_106030(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "StoneReadyC", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_106031(context, evt)
  if 106009 ~= evt.param1 then
    return false
  end
  if 37 ~= evt.param2 then
    return false
  end
  if 0 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_106031(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "StoneReadyD", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
