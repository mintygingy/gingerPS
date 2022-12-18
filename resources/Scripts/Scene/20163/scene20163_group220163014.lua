local base_info = {group_id = 220163014}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 14001,
    gadget_id = 70320080,
    pos = {
      x = -24.715,
      y = 69.213,
      z = -10.527
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 14004,
    gadget_id = 70320080,
    pos = {
      x = -19.736,
      y = 83.643,
      z = -40.865
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 14007,
    gadget_id = 70290731,
    pos = {
      x = 35.92,
      y = 73.763,
      z = -59.873
    },
    rot = {
      x = 0.0,
      y = 145.597,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 14010,
    gadget_id = 70320080,
    pos = {
      x = 25.792,
      y = 82.354,
      z = 3.062
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 14021,
    gadget_id = 70900203,
    pos = {
      x = -47.378,
      y = 83.617,
      z = -38.297
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 14022,
    gadget_id = 70900203,
    pos = {
      x = -33.352,
      y = 83.781,
      z = -54.744
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 14023,
    gadget_id = 70900203,
    pos = {
      x = 61.484,
      y = 73.362,
      z = -64.109
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
    config_id = 14002,
    shape = RegionShape.SPHERE,
    radius = 3,
    pos = {
      x = -24.727,
      y = 69.116,
      z = -10.878
    }
  },
  {
    config_id = 14003,
    shape = RegionShape.SPHERE,
    radius = 4,
    pos = {
      x = -24.727,
      y = 69.116,
      z = -10.878
    }
  },
  {
    config_id = 14005,
    shape = RegionShape.SPHERE,
    radius = 3,
    pos = {
      x = -19.783,
      y = 83.93,
      z = -40.21
    }
  },
  {
    config_id = 14006,
    shape = RegionShape.SPHERE,
    radius = 4,
    pos = {
      x = -19.783,
      y = 83.93,
      z = -40.21
    }
  },
  {
    config_id = 14008,
    shape = RegionShape.SPHERE,
    radius = 2.5,
    pos = {
      x = 35.298,
      y = 73.763,
      z = -59.159
    }
  },
  {
    config_id = 14009,
    shape = RegionShape.SPHERE,
    radius = 2.5,
    pos = {
      x = 35.298,
      y = 73.763,
      z = -59.159
    }
  },
  {
    config_id = 14011,
    shape = RegionShape.SPHERE,
    radius = 3,
    pos = {
      x = 25.58,
      y = 82.354,
      z = 3.062
    }
  },
  {
    config_id = 14012,
    shape = RegionShape.SPHERE,
    radius = 4,
    pos = {
      x = 25.58,
      y = 82.354,
      z = 3.062
    }
  },
  {
    config_id = 14025,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = -47.371,
      y = 83.621,
      z = -41.196
    }
  },
  {
    config_id = 14026,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = -32.685,
      y = 83.785,
      z = -55.251
    }
  },
  {
    config_id = 14027,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 60.345,
      y = 73.362,
      z = -64.661
    }
  }
}
triggers = {
  {
    config_id = 1014002,
    name = "ENTER_REGION_14002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_14002",
    action = "action_EVENT_ENTER_REGION_14002",
    trigger_count = 0
  },
  {
    config_id = 1014003,
    name = "LEAVE_REGION_14003",
    event = EventType.EVENT_LEAVE_REGION,
    source = "",
    condition = "condition_EVENT_LEAVE_REGION_14003",
    action = "action_EVENT_LEAVE_REGION_14003",
    trigger_count = 0
  },
  {
    config_id = 1014005,
    name = "ENTER_REGION_14005",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_14005",
    action = "action_EVENT_ENTER_REGION_14005",
    trigger_count = 0
  },
  {
    config_id = 1014006,
    name = "LEAVE_REGION_14006",
    event = EventType.EVENT_LEAVE_REGION,
    source = "",
    condition = "condition_EVENT_LEAVE_REGION_14006",
    action = "action_EVENT_LEAVE_REGION_14006",
    trigger_count = 0
  },
  {
    config_id = 1014008,
    name = "ENTER_REGION_14008",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_14008",
    action = "action_EVENT_ENTER_REGION_14008",
    trigger_count = 0
  },
  {
    config_id = 1014009,
    name = "LEAVE_REGION_14009",
    event = EventType.EVENT_LEAVE_REGION,
    source = "",
    condition = "condition_EVENT_LEAVE_REGION_14009",
    action = "action_EVENT_LEAVE_REGION_14009",
    trigger_count = 0
  },
  {
    config_id = 1014011,
    name = "ENTER_REGION_14011",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_14011",
    action = "action_EVENT_ENTER_REGION_14011",
    trigger_count = 0
  },
  {
    config_id = 1014012,
    name = "LEAVE_REGION_14012",
    event = EventType.EVENT_LEAVE_REGION,
    source = "",
    condition = "condition_EVENT_LEAVE_REGION_14012",
    action = "action_EVENT_LEAVE_REGION_14012",
    trigger_count = 0
  },
  {
    config_id = 1014013,
    name = "VARIABLE_CHANGE_14013",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_14013",
    action = "action_EVENT_VARIABLE_CHANGE_14013"
  },
  {
    config_id = 1014014,
    name = "VARIABLE_CHANGE_14014",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_14014",
    action = "action_EVENT_VARIABLE_CHANGE_14014"
  },
  {
    config_id = 1014015,
    name = "VARIABLE_CHANGE_14015",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_14015",
    action = "action_EVENT_VARIABLE_CHANGE_14015"
  },
  {
    config_id = 1014016,
    name = "VARIABLE_CHANGE_14016",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_14016",
    action = "action_EVENT_VARIABLE_CHANGE_14016"
  },
  {
    config_id = 1014017,
    name = "TIME_AXIS_PASS_14017",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_14017",
    action = "action_EVENT_TIME_AXIS_PASS_14017"
  },
  {
    config_id = 1014018,
    name = "TIME_AXIS_PASS_14018",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_14018",
    action = "action_EVENT_TIME_AXIS_PASS_14018"
  },
  {
    config_id = 1014019,
    name = "TIME_AXIS_PASS_14019",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_14019",
    action = "action_EVENT_TIME_AXIS_PASS_14019"
  },
  {
    config_id = 1014020,
    name = "TIME_AXIS_PASS_14020",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_14020",
    action = "action_EVENT_TIME_AXIS_PASS_14020"
  },
  {
    config_id = 1014025,
    name = "ENTER_REGION_14025",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_14025",
    action = "action_EVENT_ENTER_REGION_14025"
  },
  {
    config_id = 1014026,
    name = "ENTER_REGION_14026",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_14026",
    action = "action_EVENT_ENTER_REGION_14026"
  },
  {
    config_id = 1014027,
    name = "ENTER_REGION_14027",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_14027",
    action = "action_EVENT_ENTER_REGION_14027"
  }
}
variables = {
  {
    config_id = 1,
    name = "eleFinish1",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 2,
    name = "eleFinish2",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 3,
    name = "eleFinish3",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 4,
    name = "eleFinish4",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 5,
    name = "fightFinish1",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 6,
    name = "fightFinish2",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 7,
    name = "fightFinish3",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 8,
    name = "fightFinish4",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 9,
    name = "cam1",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 10,
    name = "cam2",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 11,
    name = "cam3",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 12,
    name = "cam4",
    value = 0,
    no_refresh = true
  }
}
garbages = {
  gadgets = {
    {
      config_id = 14024,
      gadget_id = 70900203,
      pos = {
        x = 2.622,
        y = 58.349,
        z = -10.229
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1
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
    gadgets = {},
    regions = {
      14002,
      14003,
      14005,
      14006,
      14008,
      14009,
      14011,
      14012,
      14025,
      14026,
      14027
    },
    triggers = {
      "ENTER_REGION_14002",
      "LEAVE_REGION_14003",
      "ENTER_REGION_14005",
      "LEAVE_REGION_14006",
      "ENTER_REGION_14008",
      "LEAVE_REGION_14009",
      "ENTER_REGION_14011",
      "LEAVE_REGION_14012",
      "VARIABLE_CHANGE_14013",
      "VARIABLE_CHANGE_14014",
      "VARIABLE_CHANGE_14015",
      "VARIABLE_CHANGE_14016",
      "TIME_AXIS_PASS_14017",
      "TIME_AXIS_PASS_14018",
      "TIME_AXIS_PASS_14019",
      "TIME_AXIS_PASS_14020",
      "ENTER_REGION_14025",
      "ENTER_REGION_14026",
      "ENTER_REGION_14027"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {14001},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {14004},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {14007},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {14010},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_14002(context, evt)
  if evt.param1 ~= 14002 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "fightFinish1") ~= 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "cam1") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_14002(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220163014, 2)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "cam1", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_LEAVE_REGION_14003(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "fightFinish1") ~= 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "cam1") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_LEAVE_REGION_14003(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220163014, 2)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "cam1", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_14005(context, evt)
  if evt.param1 ~= 14005 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "fightFinish2") ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "cam2") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_14005(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220163014, 3)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "cam2", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_LEAVE_REGION_14006(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "fightFinish2") ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "cam2") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_LEAVE_REGION_14006(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220163014, 3)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "cam2", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_14008(context, evt)
  if evt.param1 ~= 14008 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "fightFinish3") ~= 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "cam3") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_14008(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220163014, 4)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "cam3", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_LEAVE_REGION_14009(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "cam3") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_LEAVE_REGION_14009(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220163014, 4)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "cam3", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_14011(context, evt)
  if evt.param1 ~= 14011 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "fightFinish4") ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "cam4") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_14011(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220163014, 5)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "cam4", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_LEAVE_REGION_14012(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "fightFinish4") ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "cam4") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_LEAVE_REGION_14012(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220163014, 5)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "cam4", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_14013(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "eleFinish1") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_14013(context, evt)
  ScriptLib.InitTimeAxis(context, "f1", {2}, false)
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_14014(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "eleFinish2") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_14014(context, evt)
  ScriptLib.InitTimeAxis(context, "f2", {2}, false)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "fightFinish2", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_14015(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "eleFinish3") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_14015(context, evt)
  ScriptLib.InitTimeAxis(context, "f3", {2}, false)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "fightFinish3", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_14016(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "eleFinish4") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_14016(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "fightFinish4", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "f4", {2}, false)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_14017(context, evt)
  if "f1" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_14017(context, evt)
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220163014, EntityType.GADGET, 14001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 14021}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "fightFinish1", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_14018(context, evt)
  if "f2" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_14018(context, evt)
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220163014, EntityType.GADGET, 14004) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 14022}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_14019(context, evt)
  if "f3" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_14019(context, evt)
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220163014, EntityType.GADGET, 14007) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 14023}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_14020(context, evt)
  if "f4" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_14020(context, evt)
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220163014, EntityType.GADGET, 14010) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_14025(context, evt)
  if evt.param1 ~= 14025 then
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
function action_EVENT_ENTER_REGION_14025(context, evt)
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220163014, EntityType.GADGET, 14021) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_14026(context, evt)
  if evt.param1 ~= 14026 then
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
function action_EVENT_ENTER_REGION_14026(context, evt)
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220163014, EntityType.GADGET, 14022) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_14027(context, evt)
  if evt.param1 ~= 14027 then
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
function action_EVENT_ENTER_REGION_14027(context, evt)
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220163014, EntityType.GADGET, 14023) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
