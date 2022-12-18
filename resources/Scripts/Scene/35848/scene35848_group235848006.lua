local base_info = {group_id = 235848006}
local defs = {
  starter = 6002,
  option_id = 94,
  delay = 3,
  time_limit = 60,
  challenge_id = 2010053,
  tide_cfg = {
    [1] = {
      monsters = {6004},
      min = 1,
      max = 1
    }
  },
  rand_table = {
    [1] = {
      {1}
    }
  },
  type = 1,
  rand_suites = {},
  point_list = {
    6005,
    6006,
    6007
  },
  buff_pool = {
    6008,
    6009,
    6010
  },
  buff_count = 3,
  buff_pool_spec = {},
  is_tutorial = 1
}
monsters = {
  [6004] = {
    config_id = 6004,
    monster_id = 24010101,
    pos = {
      x = 107.059,
      y = 85.4,
      z = 763.045
    },
    rot = {
      x = 0.0,
      y = 108.352,
      z = 0.0
    },
    level = 1,
    affix = {1007},
    pose_id = 100
  }
}
npcs = {}
gadgets = {
  [6001] = {
    config_id = 6001,
    gadget_id = 70360010,
    pos = {
      x = 114.965,
      y = 85.333,
      z = 757.812
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6002] = {
    config_id = 6002,
    gadget_id = 70360001,
    pos = {
      x = 114.965,
      y = 85.333,
      z = 757.812
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {94}
    }
  },
  [6005] = {
    config_id = 6005,
    gadget_id = 70350085,
    pos = {
      x = 110.514,
      y = 85.938,
      z = 761.601
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6006] = {
    config_id = 6006,
    gadget_id = 70350085,
    pos = {
      x = 114.148,
      y = 86.027,
      z = 749.755
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6007] = {
    config_id = 6007,
    gadget_id = 70350085,
    pos = {
      x = 122.681,
      y = 86.045,
      z = 761.208
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6008] = {
    config_id = 6008,
    gadget_id = 70310318,
    pos = {
      x = 97.416,
      y = 87.568,
      z = 762.155
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6009] = {
    config_id = 6009,
    gadget_id = 70310319,
    pos = {
      x = 99.12,
      y = 86.849,
      z = 766.853
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6010] = {
    config_id = 6010,
    gadget_id = 70310320,
    pos = {
      x = 103.022,
      y = 86.969,
      z = 773.509
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [6012] = {
    config_id = 6012,
    gadget_id = 70900201,
    pos = {
      x = 114.965,
      y = 86.126,
      z = 757.812
    },
    rot = {
      x = 0.0,
      y = 161.54,
      z = 0.0
    },
    level = 1
  },
  [6014] = {
    config_id = 6014,
    gadget_id = 70360001,
    pos = {
      x = 115.584,
      y = 85.4,
      z = 756.273
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
  [6013] = {
    config_id = 6013,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 114.66,
      y = 85.4,
      z = 758.086
    }
  }
}
triggers = {
  {
    config_id = 1006003,
    name = "SELECT_OPTION_6003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_6003",
    action = "action_EVENT_SELECT_OPTION_6003",
    trigger_count = 0
  },
  {
    config_id = 1006011,
    name = "ANY_MONSTER_DIE_6011",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_6011",
    action = "action_EVENT_ANY_MONSTER_DIE_6011",
    trigger_count = 0
  },
  {
    config_id = 1006013,
    name = "ENTER_REGION_6013",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_6013",
    action = "action_EVENT_ENTER_REGION_6013",
    trigger_count = 0
  },
  {
    config_id = 1006015,
    name = "GADGET_CREATE_6015",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_6015",
    action = "action_EVENT_GADGET_CREATE_6015",
    trigger_count = 0
  },
  {
    config_id = 1006016,
    name = "GADGET_CREATE_6016",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_6016",
    action = "action_EVENT_GADGET_CREATE_6016",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "suite",
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
    gadgets = {6014},
    regions = {},
    triggers = {
      "GADGET_CREATE_6016"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      6005,
      6006,
      6007,
      6008,
      6009,
      6010
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {6012},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {6001, 6002},
    regions = {6013},
    triggers = {
      "SELECT_OPTION_6003",
      "ANY_MONSTER_DIE_6011",
      "ENTER_REGION_6013",
      "GADGET_CREATE_6015"
    },
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_6003(context, evt)
  if 6002 ~= evt.param1 then
    return false
  end
  if 94 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_6003(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 235848006, 6002, 94) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 6001, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.RemoveExtraGroupSuite(context, 235848006, 3)
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_6011(context, evt)
  if ScriptLib.GetGroupMonsterCountByGroupId(context, 235848006) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_6011(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 235848005, 4)
  ScriptLib.AddExtraGroupSuite(context, 235848001, 3)
  ScriptLib.AddExtraGroupSuite(context, 235848001, 4)
  return 0
end
function condition_EVENT_ENTER_REGION_6013(context, evt)
  if evt.param1 ~= 6013 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  if 0 ~= ScriptLib.GetExhibitionAccumulableData(context, context.uid, 11401109) then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_6013(context, evt)
  ScriptLib.AddExhibitionAccumulableData(context, context.uid, "Activity_SummerTimeV2_Kazuha_Guide2", 1)
  ScriptLib.ShowClientTutorial(context, 863, {})
  return 0
end
function condition_EVENT_GADGET_CREATE_6015(context, evt)
  if 6001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_6015(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "suite", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_6016(context, evt)
  if 6014 ~= evt.param1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "suite") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_6016(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 235848006, 4)
  return 0
end
require("V2_8/DLActivityDungeon")
