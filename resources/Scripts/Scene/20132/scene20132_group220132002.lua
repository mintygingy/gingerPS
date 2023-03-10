local base_info = {group_id = 220132002}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 2001,
    gadget_id = 70900201,
    pos = {
      x = 460.697,
      y = 14.914,
      z = 489.634
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2002,
    gadget_id = 70900201,
    pos = {
      x = 440.191,
      y = 34.689,
      z = 513.761
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2004,
    gadget_id = 70900201,
    pos = {
      x = 463.48,
      y = 15.05,
      z = 513.787
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2006,
    gadget_id = 70900201,
    pos = {
      x = 484.638,
      y = 15.659,
      z = 561.044
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2008,
    gadget_id = 70900201,
    pos = {
      x = 445.5,
      y = 29.284,
      z = 489.078
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2010,
    gadget_id = 70900201,
    pos = {
      x = 488.079,
      y = 19.12,
      z = 482.74
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2012,
    gadget_id = 70900201,
    pos = {
      x = 432.182,
      y = 28.509,
      z = 548.435
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2013,
    gadget_id = 70900201,
    pos = {
      x = 446.978,
      y = 22.929,
      z = 570.134
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2018,
    gadget_id = 70360001,
    pos = {
      x = 443.552,
      y = 27.703,
      z = 488.562
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2019,
    gadget_id = 70900201,
    pos = {
      x = 471.996,
      y = 36.374,
      z = 477.217
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2021,
    gadget_id = 70900201,
    pos = {
      x = 492.478,
      y = 36.464,
      z = 450.172
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2022,
    gadget_id = 70900201,
    pos = {
      x = 515.189,
      y = 15.622,
      z = 558.859
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
    config_id = 2005,
    shape = RegionShape.SPHERE,
    radius = 6,
    pos = {
      x = 441.133,
      y = 36.897,
      z = 512.766
    }
  },
  {
    config_id = 2007,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 484.638,
      y = 17.713,
      z = 561.044
    }
  },
  {
    config_id = 2009,
    shape = RegionShape.SPHERE,
    radius = 3,
    pos = {
      x = 460.733,
      y = 14.914,
      z = 489.634
    }
  },
  {
    config_id = 2011,
    shape = RegionShape.CYLINDER,
    radius = 8,
    pos = {
      x = 513.284,
      y = 23.266,
      z = 559.441
    },
    height = 20.0
  },
  {
    config_id = 2014,
    shape = RegionShape.CYLINDER,
    radius = 8,
    pos = {
      x = 434.053,
      y = 32.812,
      z = 549.205
    },
    height = 15.0
  },
  {
    config_id = 2015,
    shape = RegionShape.SPHERE,
    radius = 6,
    pos = {
      x = 446.291,
      y = 22.929,
      z = 572.871
    }
  },
  {
    config_id = 2016,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 445.5,
      y = 29.284,
      z = 489.078
    }
  },
  {
    config_id = 2017,
    shape = RegionShape.SPHERE,
    radius = 8,
    pos = {
      x = 474.418,
      y = 36.374,
      z = 473.589
    }
  }
}
triggers = {
  {
    config_id = 1002003,
    name = "QUEST_FINISH_2003",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_2003",
    action = "action_EVENT_QUEST_FINISH_2003"
  },
  {
    config_id = 1002005,
    name = "ENTER_REGION_2005",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_2005",
    action = "action_EVENT_ENTER_REGION_2005"
  },
  {
    config_id = 1002007,
    name = "ENTER_REGION_2007",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_2007",
    action = "action_EVENT_ENTER_REGION_2007"
  },
  {
    config_id = 1002009,
    name = "ENTER_REGION_2009",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_2009",
    action = "action_EVENT_ENTER_REGION_2009"
  },
  {
    config_id = 1002011,
    name = "ENTER_REGION_2011",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_2011",
    action = "action_EVENT_ENTER_REGION_2011"
  },
  {
    config_id = 1002014,
    name = "ENTER_REGION_2014",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_2014",
    action = "action_EVENT_ENTER_REGION_2014"
  },
  {
    config_id = 1002015,
    name = "ENTER_REGION_2015",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_2015",
    action = "action_EVENT_ENTER_REGION_2015"
  },
  {
    config_id = 1002016,
    name = "ENTER_REGION_2016",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_2016",
    action = "action_EVENT_ENTER_REGION_2016"
  },
  {
    config_id = 1002017,
    name = "ENTER_REGION_2017",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_2017",
    action = "action_EVENT_ENTER_REGION_2017"
  },
  {
    config_id = 1002023,
    name = "QUEST_FINISH_2023",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_2023",
    action = "action_EVENT_QUEST_FINISH_2023"
  }
}
variables = {}
init_config = {
  suite = 1,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {2018},
    regions = {},
    triggers = {
      "QUEST_FINISH_2023"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {2006},
    regions = {2007},
    triggers = {
      "ENTER_REGION_2007"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {2004},
    regions = {},
    triggers = {
      "QUEST_FINISH_2003"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {2001},
    regions = {2009},
    triggers = {
      "ENTER_REGION_2009"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {2019},
    regions = {2017},
    triggers = {
      "ENTER_REGION_2017"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {2021},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {2010},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {2008},
    regions = {2016},
    triggers = {
      "ENTER_REGION_2016"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {2002},
    regions = {2005},
    triggers = {
      "ENTER_REGION_2005"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {2012},
    regions = {2014},
    triggers = {
      "ENTER_REGION_2014"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {2013},
    regions = {2015},
    triggers = {
      "ENTER_REGION_2015"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {2022},
    regions = {2011},
    triggers = {
      "ENTER_REGION_2011"
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
function condition_EVENT_QUEST_FINISH_2003(context, evt)
  if 300312 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_2003(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220132002, suite = 4}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_2005(context, evt)
  if evt.param1 ~= 2005 then
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
function action_EVENT_ENTER_REGION_2005(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220132002, suite = 10}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_2007(context, evt)
  if evt.param1 ~= 2007 then
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
function action_EVENT_ENTER_REGION_2007(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220132002, suite = 3}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_2009(context, evt)
  if evt.param1 ~= 2009 then
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
function action_EVENT_ENTER_REGION_2009(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220132002, suite = 5}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_2011(context, evt)
  if evt.param1 ~= 2011 then
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
function action_EVENT_ENTER_REGION_2011(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220132002, suite = 2}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_2014(context, evt)
  if evt.param1 ~= 2014 then
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
function action_EVENT_ENTER_REGION_2014(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220132002, suite = 11}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_2015(context, evt)
  if evt.param1 ~= 2015 then
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
function action_EVENT_ENTER_REGION_2015(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220132002, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220132009, suite = 2}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_2016(context, evt)
  if evt.param1 ~= 2016 then
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
function action_EVENT_ENTER_REGION_2016(context, evt)
  if ScriptLib.GetGroupVariableValueByGroup(context, "KeyCount", 220132011) ~= 3 then
    if ScriptLib.GetGroupVariableValueByGroup(context, "KeyFlower", 220132011) ~= 1 then
      ScriptLib.RefreshGroup(context, {group_id = 220132002, suite = 9})
    else
      ScriptLib.RefreshGroup(context, {group_id = 220132010, suite = 2})
      ScriptLib.RefreshGroup(context, {group_id = 220132002, suite = 1})
    end
  else
    ScriptLib.RefreshGroup(context, {group_id = 220132011, suite = 2})
    ScriptLib.RefreshGroup(context, {group_id = 220132002, suite = 1})
  end
  return 0
end
function condition_EVENT_ENTER_REGION_2017(context, evt)
  if evt.param1 ~= 2017 then
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
function action_EVENT_ENTER_REGION_2017(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220132002, suite = 6}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_FINISH_2023(context, evt)
  if 300304 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_2023(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220132002, suite = 12}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
