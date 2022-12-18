local base_info = {group_id = 220162002}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 2001,
    gadget_id = 70360286,
    pos = {
      x = 25.957,
      y = -30.934,
      z = 27.605
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
    gadget_id = 70710913,
    pos = {
      x = -24.003,
      y = -33.971,
      z = 27.742
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    chest_drop_id = 1050255,
    drop_count = 1,
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 2007,
    gadget_id = 70710913,
    pos = {
      x = -3.232,
      y = -35.148,
      z = -19.714
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    chest_drop_id = 1050255,
    drop_count = 1,
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 2011,
    gadget_id = 70290664,
    pos = {
      x = 25.957,
      y = -30.934,
      z = 27.605
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
    gadget_id = 70290664,
    pos = {
      x = -24.003,
      y = -33.971,
      z = 27.742
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
    gadget_id = 70290664,
    pos = {
      x = -3.232,
      y = -35.148,
      z = -19.714
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2016,
    gadget_id = 70290664,
    pos = {
      x = -21.123,
      y = -34.045,
      z = -24.266
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2017,
    gadget_id = 70360286,
    pos = {
      x = -21.123,
      y = -34.045,
      z = -24.266
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
    gadget_id = 70360286,
    pos = {
      x = 15.257,
      y = -35.144,
      z = 0.999
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
    gadget_id = 70290664,
    pos = {
      x = 15.257,
      y = -35.144,
      z = 0.999
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2023,
    gadget_id = 70310148,
    pos = {
      x = -24.003,
      y = -33.971,
      z = 27.742
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2024,
    gadget_id = 70310148,
    pos = {
      x = -2.435,
      y = -35.029,
      z = -18.601
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2025,
    gadget_id = 70310148,
    pos = {
      x = -21.123,
      y = -34.047,
      z = -24.266
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2026,
    gadget_id = 70310148,
    pos = {
      x = 15.257,
      y = -35.145,
      z = 0.999
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2040,
    gadget_id = 70310148,
    pos = {
      x = 25.957,
      y = -32.434,
      z = 27.605
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
    config_id = 2010,
    shape = RegionShape.CYLINDER,
    radius = 50,
    pos = {
      x = -0.248,
      y = -33.271,
      z = 0.303
    },
    height = 25.0,
    team_ability_group_list = {
      "VoidSearching_AbilityGroup"
    }
  },
  {
    config_id = 2027,
    shape = RegionShape.CYLINDER,
    radius = 10,
    pos = {
      x = 25.435,
      y = -28.902,
      z = 26.08
    },
    height = 15.0
  },
  {
    config_id = 2028,
    shape = RegionShape.CYLINDER,
    radius = 10,
    pos = {
      x = 25.435,
      y = -28.902,
      z = 26.08
    },
    height = 15.0
  },
  {
    config_id = 2029,
    shape = RegionShape.CYLINDER,
    radius = 10,
    pos = {
      x = -24.003,
      y = -30.23,
      z = 27.742
    },
    height = 15.0
  },
  {
    config_id = 2030,
    shape = RegionShape.CYLINDER,
    radius = 10,
    pos = {
      x = -24.003,
      y = -30.23,
      z = 27.742
    },
    height = 15.0
  },
  {
    config_id = 2031,
    shape = RegionShape.CYLINDER,
    radius = 10,
    pos = {
      x = -3.232,
      y = -30.806,
      z = -19.714
    },
    height = 15.0
  },
  {
    config_id = 2032,
    shape = RegionShape.CYLINDER,
    radius = 10,
    pos = {
      x = -3.232,
      y = -30.806,
      z = -19.714
    },
    height = 15.0
  },
  {
    config_id = 2033,
    shape = RegionShape.CYLINDER,
    radius = 10,
    pos = {
      x = -21.123,
      y = -29.697,
      z = -24.266
    },
    height = 15.0
  },
  {
    config_id = 2034,
    shape = RegionShape.CYLINDER,
    radius = 10,
    pos = {
      x = -21.123,
      y = -29.697,
      z = -24.266
    },
    height = 15.0
  },
  {
    config_id = 2035,
    shape = RegionShape.CYLINDER,
    radius = 10,
    pos = {
      x = 15.257,
      y = -30.298,
      z = 0.999
    },
    height = 15.0
  },
  {
    config_id = 2036,
    shape = RegionShape.CYLINDER,
    radius = 10,
    pos = {
      x = 15.257,
      y = -30.298,
      z = 0.999
    },
    height = 15.0
  },
  {
    config_id = 2037,
    shape = RegionShape.CYLINDER,
    radius = 50,
    pos = {
      x = -0.248,
      y = -33.271,
      z = 0.303
    },
    height = 25.0
  }
}
triggers = {
  {
    config_id = 1002002,
    name = "GADGET_CREATE_2002",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_2002",
    action = "action_EVENT_GADGET_CREATE_2002"
  },
  {
    config_id = 1002003,
    name = "SELECT_OPTION_2003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_2003",
    action = "action_EVENT_SELECT_OPTION_2003"
  },
  {
    config_id = 1002006,
    name = "GADGET_STATE_CHANGE_2006",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_2006",
    action = "action_EVENT_GADGET_STATE_CHANGE_2006"
  },
  {
    config_id = 1002009,
    name = "GADGET_STATE_CHANGE_2009",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_2009",
    action = "action_EVENT_GADGET_STATE_CHANGE_2009"
  },
  {
    config_id = 1002014,
    name = "GADGET_CREATE_2014",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_2014",
    action = "action_EVENT_GADGET_CREATE_2014"
  },
  {
    config_id = 1002015,
    name = "SELECT_OPTION_2015",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_2015",
    action = "action_EVENT_SELECT_OPTION_2015"
  },
  {
    config_id = 1002019,
    name = "GADGET_CREATE_2019",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_2019",
    action = "action_EVENT_GADGET_CREATE_2019"
  },
  {
    config_id = 1002020,
    name = "SELECT_OPTION_2020",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_2020",
    action = "action_EVENT_SELECT_OPTION_2020"
  },
  {
    config_id = 1002027,
    name = "ENTER_REGION_2027",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_2027",
    action = "action_EVENT_ENTER_REGION_2027",
    trigger_count = 0
  },
  {
    config_id = 1002028,
    name = "LEAVE_REGION_2028",
    event = EventType.EVENT_LEAVE_REGION,
    source = "",
    condition = "",
    action = "action_EVENT_LEAVE_REGION_2028",
    trigger_count = 0
  },
  {
    config_id = 1002029,
    name = "ENTER_REGION_2029",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_2029",
    action = "action_EVENT_ENTER_REGION_2029",
    trigger_count = 0
  },
  {
    config_id = 1002030,
    name = "LEAVE_REGION_2030",
    event = EventType.EVENT_LEAVE_REGION,
    source = "",
    condition = "condition_EVENT_LEAVE_REGION_2030",
    action = "action_EVENT_LEAVE_REGION_2030",
    trigger_count = 0
  },
  {
    config_id = 1002031,
    name = "ENTER_REGION_2031",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_2031",
    action = "action_EVENT_ENTER_REGION_2031",
    trigger_count = 0
  },
  {
    config_id = 1002032,
    name = "LEAVE_REGION_2032",
    event = EventType.EVENT_LEAVE_REGION,
    source = "",
    condition = "condition_EVENT_LEAVE_REGION_2032",
    action = "action_EVENT_LEAVE_REGION_2032",
    trigger_count = 0
  },
  {
    config_id = 1002033,
    name = "ENTER_REGION_2033",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_2033",
    action = "action_EVENT_ENTER_REGION_2033",
    trigger_count = 0
  },
  {
    config_id = 1002034,
    name = "LEAVE_REGION_2034",
    event = EventType.EVENT_LEAVE_REGION,
    source = "",
    condition = "condition_EVENT_LEAVE_REGION_2034",
    action = "action_EVENT_LEAVE_REGION_2034",
    trigger_count = 0
  },
  {
    config_id = 1002035,
    name = "ENTER_REGION_2035",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_2035",
    action = "action_EVENT_ENTER_REGION_2035",
    trigger_count = 0
  },
  {
    config_id = 1002036,
    name = "LEAVE_REGION_2036",
    event = EventType.EVENT_LEAVE_REGION,
    source = "",
    condition = "condition_EVENT_LEAVE_REGION_2036",
    action = "action_EVENT_LEAVE_REGION_2036",
    trigger_count = 0
  },
  {
    config_id = 1002037,
    name = "ENTER_REGION_2037",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_2037",
    action = "action_EVENT_ENTER_REGION_2037"
  },
  {
    config_id = 1002038,
    name = "GADGET_CREATE_2038",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_2038",
    action = "action_EVENT_GADGET_CREATE_2038",
    trigger_count = 0
  },
  {
    config_id = 1002039,
    name = "GADGET_CREATE_2039",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_2039",
    action = "action_EVENT_GADGET_CREATE_2039",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "Var_1",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 2,
    name = "Var_2",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 3,
    name = "Var_3",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 4,
    name = "Var_4",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 5,
    name = "NoMoreOne01",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 6,
    name = "NoMoreOne02",
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
    gadgets = {},
    regions = {2037},
    triggers = {
      "ENTER_REGION_2037"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      2001,
      2004,
      2007,
      2011,
      2016,
      2017,
      2018,
      2021
    },
    regions = {
      2010,
      2027,
      2028,
      2033,
      2034,
      2035,
      2036
    },
    triggers = {
      "GADGET_CREATE_2002",
      "SELECT_OPTION_2003",
      "GADGET_STATE_CHANGE_2006",
      "GADGET_STATE_CHANGE_2009",
      "GADGET_CREATE_2014",
      "SELECT_OPTION_2015",
      "GADGET_CREATE_2019",
      "SELECT_OPTION_2020",
      "ENTER_REGION_2027",
      "LEAVE_REGION_2028",
      "ENTER_REGION_2033",
      "LEAVE_REGION_2034",
      "ENTER_REGION_2035",
      "LEAVE_REGION_2036",
      "GADGET_CREATE_2038",
      "GADGET_CREATE_2039"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {2040},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {2023},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {2024},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {2025},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {2026},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {2012},
    regions = {2029, 2030},
    triggers = {
      "ENTER_REGION_2029",
      "LEAVE_REGION_2030"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {2013},
    regions = {2031, 2032},
    triggers = {
      "ENTER_REGION_2031",
      "LEAVE_REGION_2032"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_2002(context, evt)
  if 2001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_2002(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220162002, 2001, {64}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_2003(context, evt)
  if 2001 ~= evt.param1 then
    return false
  end
  if 64 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_2003(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220162002, 2001, 64) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.AddQuestProgress(context, "220162002") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220162002, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_2006(context, evt)
  if 2004 ~= evt.param2 or GadgetState.ChestOpened ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_2006(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "NoMoreOne01", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "Var_1", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220162002, EntityType.GADGET, 2012) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220162002, EntityType.GADGET, 2023) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.AddQuestProgress(context, "2201620020") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_2009(context, evt)
  if 2007 ~= evt.param2 or GadgetState.ChestOpened ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_2009(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "NoMoreOne02", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "Var_2", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220162002, EntityType.GADGET, 2013) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220162002, EntityType.GADGET, 2024) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.AddQuestProgress(context, "2201620020") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_2014(context, evt)
  if 2017 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_2014(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220162002, 2017, {64}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_2015(context, evt)
  if 2017 ~= evt.param1 then
    return false
  end
  if 64 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_2015(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220162002, 2017, 64) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "Var_3", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220162002, EntityType.GADGET, 2016) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220162002, EntityType.GADGET, 2025) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.AddQuestProgress(context, "2201620021") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_2019(context, evt)
  if 2018 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_2019(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220162002, 2018, {64}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_2020(context, evt)
  if 2018 ~= evt.param1 then
    return false
  end
  if 64 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_2020(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220162002, 2018, 64) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "Var_4", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220162002, EntityType.GADGET, 2021) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220162002, EntityType.GADGET, 2026) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.AddQuestProgress(context, "2201620021") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_2027(context, evt)
  if evt.param1 ~= 2027 then
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
function action_EVENT_ENTER_REGION_2027(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220162002, 3)
  return 0
end
function action_EVENT_LEAVE_REGION_2028(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220162002, 3)
  return 0
end
function condition_EVENT_ENTER_REGION_2029(context, evt)
  if evt.param1 ~= 2029 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "Var_1") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_2029(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220162002, 4)
  return 0
end
function condition_EVENT_LEAVE_REGION_2030(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "Var_1") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_LEAVE_REGION_2030(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220162002, 4)
  return 0
end
function condition_EVENT_ENTER_REGION_2031(context, evt)
  if evt.param1 ~= 2031 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "Var_2") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_2031(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220162002, 5)
  return 0
end
function condition_EVENT_LEAVE_REGION_2032(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "Var_2") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_LEAVE_REGION_2032(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220162002, 5)
  return 0
end
function condition_EVENT_ENTER_REGION_2033(context, evt)
  if evt.param1 ~= 2033 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "Var_3") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_2033(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220162002, 6)
  return 0
end
function condition_EVENT_LEAVE_REGION_2034(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "Var_3") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_LEAVE_REGION_2034(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220162002, 6)
  return 0
end
function condition_EVENT_ENTER_REGION_2035(context, evt)
  if evt.param1 ~= 2035 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "Var_4") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_2035(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220162002, 7)
  return 0
end
function condition_EVENT_LEAVE_REGION_2036(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "Var_4") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_LEAVE_REGION_2036(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220162002, 7)
  return 0
end
function condition_EVENT_ENTER_REGION_2037(context, evt)
  if evt.param1 ~= 2037 then
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
function action_EVENT_ENTER_REGION_2037(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "Var_1", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "Var_2", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "Var_3", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "Var_4", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_2038(context, evt)
  if 2004 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_2038(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220162002, 8)
  return 0
end
function condition_EVENT_GADGET_CREATE_2039(context, evt)
  if 2007 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_2039(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220162002, 9)
  return 0
end
