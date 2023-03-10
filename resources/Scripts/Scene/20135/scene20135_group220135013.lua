local base_info = {group_id = 220135013}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 13001,
    gadget_id = 70310393,
    pos = {
      x = 112.764,
      y = -222.287,
      z = 543.838
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 13004,
    gadget_id = 70310395,
    pos = {
      x = 112.648,
      y = -217.381,
      z = 587.396
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 13007,
    gadget_id = 70310394,
    pos = {
      x = 111.842,
      y = -220.915,
      z = 638.679
    },
    rot = {
      x = 0.0,
      y = 94.321,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 13010,
    gadget_id = 70310333,
    pos = {
      x = 107.841,
      y = -217.173,
      z = 691.64
    },
    rot = {
      x = 0.0,
      y = 186.003,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  {
    config_id = 13002,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 112.543,
      y = -221.752,
      z = 544.458
    }
  },
  {
    config_id = 13003,
    shape = RegionShape.SPHERE,
    radius = 18,
    pos = {
      x = 113.06,
      y = -221.752,
      z = 543.724
    }
  },
  {
    config_id = 13005,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 113.832,
      y = -218.871,
      z = 587.259
    }
  },
  {
    config_id = 13006,
    shape = RegionShape.SPHERE,
    radius = 22,
    pos = {
      x = 114.164,
      y = -218.098,
      z = 588.931
    }
  },
  {
    config_id = 13008,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 112.036,
      y = -221.943,
      z = 637.961
    }
  },
  {
    config_id = 13009,
    shape = RegionShape.SPHERE,
    radius = 20,
    pos = {
      x = 114.164,
      y = -221.722,
      z = 638.489
    }
  },
  {
    config_id = 13011,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 108.181,
      y = -217.492,
      z = 691.493
    }
  },
  {
    config_id = 13012,
    shape = RegionShape.SPHERE,
    radius = 20,
    pos = {
      x = 108.908,
      y = -217.63,
      z = 692.538
    }
  }
}
triggers = {
  {
    config_id = 1013002,
    name = "ENTER_REGION_13002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_13002",
    action = "action_EVENT_ENTER_REGION_13002",
    trigger_count = 0
  },
  {
    config_id = 1013003,
    name = "ENTER_REGION_13003",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_13003",
    action = "action_EVENT_ENTER_REGION_13003",
    trigger_count = 0
  },
  {
    config_id = 1013005,
    name = "ENTER_REGION_13005",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_13005",
    action = "action_EVENT_ENTER_REGION_13005",
    trigger_count = 0
  },
  {
    config_id = 1013006,
    name = "ENTER_REGION_13006",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_13006",
    action = "action_EVENT_ENTER_REGION_13006",
    trigger_count = 0
  },
  {
    config_id = 1013008,
    name = "ENTER_REGION_13008",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_13008",
    action = "action_EVENT_ENTER_REGION_13008",
    trigger_count = 0
  },
  {
    config_id = 1013009,
    name = "ENTER_REGION_13009",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_13009",
    action = "action_EVENT_ENTER_REGION_13009",
    trigger_count = 0
  },
  {
    config_id = 1013011,
    name = "ENTER_REGION_13011",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_13011",
    action = "action_EVENT_ENTER_REGION_13011",
    trigger_count = 0
  },
  {
    config_id = 1013012,
    name = "ENTER_REGION_13012",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_13012",
    action = "action_EVENT_ENTER_REGION_13012",
    trigger_count = 0
  },
  {
    config_id = 1013013,
    name = "QUEST_START_13013",
    event = EventType.EVENT_QUEST_START,
    source = "7903602",
    condition = "",
    action = "action_EVENT_QUEST_START_13013",
    trigger_count = 0
  },
  {
    config_id = 1013014,
    name = "GROUP_LOAD_13014",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_13014",
    action = "action_EVENT_GROUP_LOAD_13014"
  },
  {
    config_id = 1013015,
    name = "TIME_AXIS_PASS_13015",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "quest",
    condition = "condition_EVENT_TIME_AXIS_PASS_13015",
    action = "action_EVENT_TIME_AXIS_PASS_13015",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 2,
    name = "temp",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 3,
    name = "temp2",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 4,
    name = "temp3",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 5,
    name = "temp4",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 1,
    name = "refresh",
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
      13001,
      13004,
      13007,
      13010
    },
    regions = {
      13002,
      13003,
      13005,
      13006,
      13008,
      13009,
      13011,
      13012
    },
    triggers = {
      "ENTER_REGION_13002",
      "ENTER_REGION_13003",
      "ENTER_REGION_13005",
      "ENTER_REGION_13006",
      "ENTER_REGION_13008",
      "ENTER_REGION_13009",
      "ENTER_REGION_13011",
      "ENTER_REGION_13012",
      "QUEST_START_13013",
      "GROUP_LOAD_13014",
      "TIME_AXIS_PASS_13015"
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
function condition_EVENT_ENTER_REGION_13002(context, evt)
  if evt.param1 ~= 13002 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "temp") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_13002(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "temp", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.ShowReminder(context, 201350101) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_13003(context, evt)
  if evt.param1 ~= 13003 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "temp") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_13003(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "temp", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_13005(context, evt)
  if evt.param1 ~= 13005 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "temp2") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_13005(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "temp2", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.ShowReminder(context, 201350102) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_13006(context, evt)
  if evt.param1 ~= 13006 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "temp2") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_13006(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "temp2", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_13008(context, evt)
  if evt.param1 ~= 13008 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "temp3") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_13008(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "temp3", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.ShowReminder(context, 201350103) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_13009(context, evt)
  if evt.param1 ~= 13009 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "temp3") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_13009(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "temp3", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_13011(context, evt)
  if evt.param1 ~= 13011 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "temp4") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_13011(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "temp4", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.ShowReminder(context, 201350104) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "quest", {8}, false)
  return 0
end
function condition_EVENT_ENTER_REGION_13012(context, evt)
  if evt.param1 ~= 13012 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "temp4") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_13012(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "temp4", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function action_EVENT_QUEST_START_13013(context, evt)
  if 0 ~= ScriptLib.GoToGroupSuite(context, 220135013, 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : goto_groupSuite")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "refresh", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_13014(context, evt)
  if ScriptLib.GetGroupVariableValueByGroup(context, "refresh", 220135013) ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_13014(context, evt)
  if 0 ~= ScriptLib.GoToGroupSuite(context, 220135013, 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : goto_groupSuite")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_13015(context, evt)
  if "quest" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_13015(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4006616") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
