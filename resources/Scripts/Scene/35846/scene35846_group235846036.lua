local base_info = {group_id = 235846036}
local defs = {
  challenge_id = 2010054,
  is_tutorial = 1,
  starter = 36020,
  option_id = 24,
  delay = 3,
  time_limit = 120,
  tide_cfg = {
    [1] = {
      monsters = {36001},
      min = 1,
      max = 1
    },
    [2] = {
      monsters = {
        36002,
        36012,
        36011
      },
      min = 3,
      max = 3
    }
  },
  rand_table = {
    [1] = {
      {1},
      {2}
    }
  },
  type = 2,
  rand_suites = {9}
}
monsters = {
  [36001] = {
    config_id = 36001,
    monster_id = 20011501,
    pos = {
      x = 2523.851,
      y = 552.793,
      z = -1717.573
    },
    rot = {
      x = 0.0,
      y = 267.275,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  [36002] = {
    config_id = 36002,
    monster_id = 21011201,
    pos = {
      x = 2523.917,
      y = 552.783,
      z = -1722.524
    },
    rot = {
      x = 0.0,
      y = 300.365,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  [36011] = {
    config_id = 36011,
    monster_id = 20011501,
    pos = {
      x = 2523.531,
      y = 552.781,
      z = -1719.498
    },
    rot = {
      x = 0.0,
      y = 273.798,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  [36012] = {
    config_id = 36012,
    monster_id = 21011201,
    pos = {
      x = 2523.929,
      y = 552.783,
      z = -1716.5
    },
    rot = {
      x = 0.0,
      y = 257.238,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  }
}
npcs = {}
gadgets = {
  [36005] = {
    config_id = 36005,
    gadget_id = 70900201,
    pos = {
      x = 2522.491,
      y = 552.785,
      z = -1718.113
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [36010] = {
    config_id = 36010,
    gadget_id = 70710399,
    pos = {
      x = 2522.39,
      y = 552.785,
      z = -1718.579
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [36020] = {
    config_id = 36020,
    gadget_id = 70360010,
    pos = {
      x = 2522.525,
      y = 552.597,
      z = -1718.278
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {24}
    }
  },
  [36031] = {
    config_id = 36031,
    gadget_id = 70310321,
    pos = {
      x = 2514.772,
      y = 552.313,
      z = -1713.457
    },
    rot = {
      x = 5.731,
      y = 110.22,
      z = 354.61
    },
    level = 1
  },
  [36032] = {
    config_id = 36032,
    gadget_id = 70220111,
    pos = {
      x = 2514.208,
      y = 552.231,
      z = -1715.901
    },
    rot = {
      x = 356.706,
      y = 108.423,
      z = 355.159
    },
    level = 1,
    interact_id = 64
  }
}
regions = {
  [36003] = {
    config_id = 36003,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 2522.223,
      y = 552.788,
      z = -1714.687
    }
  }
}
triggers = {
  {
    config_id = 1036003,
    name = "ENTER_REGION_36003",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_36003",
    action = "action_EVENT_ENTER_REGION_36003"
  },
  {
    config_id = 1036017,
    name = "VARIABLE_CHANGE_36017",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_36017",
    action = "action_EVENT_VARIABLE_CHANGE_36017",
    trigger_count = 0
  },
  {
    config_id = 1036018,
    name = "GROUP_LOAD_36018",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_36018",
    action = "action_EVENT_GROUP_LOAD_36018",
    trigger_count = 0
  },
  {
    config_id = 1036021,
    name = "GROUP_REFRESH_36021",
    event = EventType.EVENT_GROUP_REFRESH,
    source = "",
    condition = "condition_EVENT_GROUP_REFRESH_36021",
    action = "action_EVENT_GROUP_REFRESH_36021",
    trigger_count = 0
  },
  {
    config_id = 1036049,
    name = "SELECT_OPTION_36049",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_36049",
    action = "action_EVENT_SELECT_OPTION_36049",
    trigger_count = 0
  },
  {
    config_id = 1036053,
    name = "CHALLENGE_SUCCESS_36053",
    event = EventType.EVENT_CHALLENGE_SUCCESS,
    source = "2010054",
    condition = "",
    action = "action_EVENT_CHALLENGE_SUCCESS_36053",
    trigger_count = 0
  },
  {
    config_id = 1036055,
    name = "CHALLENGE_FAIL_36055",
    event = EventType.EVENT_CHALLENGE_FAIL,
    source = "2010054",
    condition = "",
    action = "action_EVENT_CHALLENGE_FAIL_36055",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "OptionAdd",
    value = 0,
    no_refresh = true
  }
}
garbages = {
  monsters = {
    {
      config_id = 36004,
      monster_id = 21020501,
      pos = {
        x = 2525.03,
        y = 552.719,
        z = -1703.052
      },
      rot = {
        x = 0.0,
        y = 183.204,
        z = 0.0
      },
      level = 13,
      drop_id = 1000100
    },
    {
      config_id = 36006,
      monster_id = 20011401,
      pos = {
        x = 2523.221,
        y = 552.789,
        z = -1717.653
      },
      rot = {
        x = 0.0,
        y = 229.35,
        z = 0.0
      },
      level = 1,
      drop_id = 1000100,
      disableWander = true
    },
    {
      config_id = 36007,
      monster_id = 21020301,
      pos = {
        x = 2526.364,
        y = 552.7,
        z = -1726.166
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 13,
      drop_id = 1000100
    },
    {
      config_id = 36008,
      monster_id = 21020501,
      pos = {
        x = 2522.819,
        y = 552.84,
        z = -1729.23
      },
      rot = {
        x = 0.0,
        y = 353.531,
        z = 0.0
      },
      level = 13,
      drop_id = 1000100
    },
    {
      config_id = 36009,
      monster_id = 21011201,
      pos = {
        x = 2523.079,
        y = 552.789,
        z = -1715.497
      },
      rot = {
        x = 0.0,
        y = 236.81,
        z = 0.0
      },
      level = 1,
      drop_id = 1000100,
      disableWander = true
    },
    {
      config_id = 36013,
      monster_id = 21020301,
      pos = {
        x = 2520.519,
        y = 552.696,
        z = -1730.671
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 13,
      drop_id = 1000100
    },
    {
      config_id = 36014,
      monster_id = 21030201,
      pos = {
        x = 2527.224,
        y = 552.7,
        z = -1728.927
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 13,
      drop_id = 1000100
    },
    {
      config_id = 36015,
      monster_id = 20011502,
      pos = {
        x = 2519.31,
        y = 552.693,
        z = -1732.156
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 13,
      drop_id = 1000100
    },
    {
      config_id = 36016,
      monster_id = 21011201,
      pos = {
        x = 2524.711,
        y = 552.789,
        z = -1720.578
      },
      rot = {
        x = 0.0,
        y = 286.323,
        z = 0.0
      },
      level = 1,
      drop_id = 1000100,
      disableWander = true
    },
    {
      config_id = 36019,
      monster_id = 21010402,
      pos = {
        x = 2527.224,
        y = 552.7,
        z = -1728.927
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 13,
      drop_id = 1000100
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
    regions = {36003},
    triggers = {
      "ENTER_REGION_36003",
      "VARIABLE_CHANGE_36017",
      "GROUP_LOAD_36018",
      "GROUP_REFRESH_36021",
      "SELECT_OPTION_36049",
      "CHALLENGE_SUCCESS_36053",
      "CHALLENGE_FAIL_36055"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {36005},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {36001},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {
      36002,
      36011,
      36012
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {36031, 36032},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {36010},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {36020},
    regions = {},
    triggers = {},
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
function condition_EVENT_ENTER_REGION_36003(context, evt)
  if evt.param1 ~= 36003 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  if 0 ~= ScriptLib.GetExhibitionAccumulableData(context, context.uid, 11404110) then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_36003(context, evt)
  ScriptLib.AddExhibitionAccumulableData(context, context.uid, "Activity_SummerTimeV2_Xinyan_Guide2", 1)
  ScriptLib.ShowClientTutorial(context, 865, {})
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_36017(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "OptionAdd") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_36017(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 235846036, 11)
  return 0
end
function condition_EVENT_GROUP_LOAD_36018(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "OptionAdd") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_36018(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 235846036, 11)
  return 0
end
function condition_EVENT_GROUP_REFRESH_36021(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "OptionAdd") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_REFRESH_36021(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 235846036, 11)
  return 0
end
function condition_EVENT_SELECT_OPTION_36049(context, evt)
  if 36020 ~= evt.param1 then
    return false
  end
  if 24 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_36049(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 36020, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 235846036, 10)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 235846036, 36020, 24) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 235846036, EntityType.GADGET, 36005) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_SUCCESS_36053(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "OptionAdd", 1, 235846019) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 235846038, 38004, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 235846038, 3)
  ScriptLib.RemoveExtraGroupSuite(context, 235846036, 10)
  return 0
end
function action_EVENT_CHALLENGE_FAIL_36055(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 235846036, 10)
  return 0
end
require("V2_8/DLActivityDungeon")
