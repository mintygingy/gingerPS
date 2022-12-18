local base_info = {group_id = 235848005}
local defs = {
  starter = 5002,
  option_id = 94,
  delay = 3,
  time_limit = 60,
  challenge_id = 2010053,
  tide_cfg = {
    [1] = {
      monsters = {
        5006,
        5016,
        5017
      },
      min = 3,
      max = 3
    }
  },
  rand_table = {
    [1] = {
      {1}
    }
  },
  type = 1,
  rand_suites = {},
  point_list = {},
  buff_pool = {},
  buff_count = 0,
  buff_pool_spec = {},
  is_tutorial = 1
}
monsters = {
  [5006] = {
    config_id = 5006,
    monster_id = 25080401,
    pos = {
      x = 27.729,
      y = 84.004,
      z = 660.371
    },
    rot = {
      x = 0.0,
      y = 28.176,
      z = 0.0
    },
    level = 1,
    pose_id = 1
  },
  [5016] = {
    config_id = 5016,
    monster_id = 25080401,
    pos = {
      x = 30.631,
      y = 85.744,
      z = 677.549
    },
    rot = {
      x = 0.0,
      y = 184.475,
      z = 0.0
    },
    level = 1,
    pose_id = 1
  },
  [5017] = {
    config_id = 5017,
    monster_id = 25080401,
    pos = {
      x = 42.482,
      y = 85.366,
      z = 669.717
    },
    rot = {
      x = 0.0,
      y = 233.706,
      z = 0.0
    },
    level = 1,
    pose_id = 1
  }
}
npcs = {}
gadgets = {
  [5001] = {
    config_id = 5001,
    gadget_id = 70360010,
    pos = {
      x = 31.583,
      y = 84.238,
      z = 669.27
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [5002] = {
    config_id = 5002,
    gadget_id = 70360001,
    pos = {
      x = 31.571,
      y = 84.867,
      z = 669.304
    },
    rot = {
      x = 0.0,
      y = 37.616,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {94}
    }
  },
  [5004] = {
    config_id = 5004,
    gadget_id = 70310297,
    pos = {
      x = 116.15,
      y = 93.352,
      z = 700.72
    },
    rot = {
      x = 319.836,
      y = 56.101,
      z = 328.138
    },
    level = 1
  },
  [5005] = {
    config_id = 5005,
    gadget_id = 70310297,
    pos = {
      x = 92.7,
      y = 75.7,
      z = 733.19
    },
    rot = {
      x = 343.36,
      y = 282.736,
      z = 283.73
    },
    level = 1
  },
  [5008] = {
    config_id = 5008,
    gadget_id = 70690027,
    pos = {
      x = 99.651,
      y = 85.4,
      z = 776.493
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [5009] = {
    config_id = 5009,
    gadget_id = 70950011,
    pos = {
      x = 34.548,
      y = 85.062,
      z = 676.828
    },
    rot = {
      x = -0.004,
      y = 32.532,
      z = 354.557
    },
    level = 1
  },
  [5010] = {
    config_id = 5010,
    gadget_id = 70950011,
    pos = {
      x = 45.515,
      y = 83.823,
      z = 669.833
    },
    rot = {
      x = -0.004,
      y = 32.532,
      z = 354.557
    },
    level = 1
  },
  [5011] = {
    config_id = 5011,
    gadget_id = 70950011,
    pos = {
      x = 25.856,
      y = 86.044,
      z = 682.372
    },
    rot = {
      x = -0.004,
      y = 32.532,
      z = 354.557
    },
    level = 1
  },
  [5013] = {
    config_id = 5013,
    gadget_id = 70310296,
    pos = {
      x = 107.61,
      y = 68.913,
      z = 700.179
    },
    rot = {
      x = 0.27,
      y = 30.516,
      z = 1.388
    },
    level = 1
  },
  [5014] = {
    config_id = 5014,
    gadget_id = 70310296,
    pos = {
      x = 102.422,
      y = 68.531,
      z = 743.746
    },
    rot = {
      x = 0.879,
      y = 283.192,
      z = 0.836
    },
    level = 1
  },
  [5019] = {
    config_id = 5019,
    gadget_id = 70690011,
    pos = {
      x = 75.67,
      y = 80.758,
      z = 855.424
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [5020] = {
    config_id = 5020,
    gadget_id = 70900201,
    pos = {
      x = 31.583,
      y = 85.557,
      z = 669.27
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [5021] = {
    config_id = 5021,
    gadget_id = 70360001,
    pos = {
      x = 37.189,
      y = 84.455,
      z = 667.09
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [5022] = {
    config_id = 5022,
    gadget_id = 70690001,
    pos = {
      x = 99.312,
      y = 90.177,
      z = 787.961
    },
    rot = {
      x = 340.345,
      y = 332.581,
      z = 0.0
    },
    level = 1
  },
  [5023] = {
    config_id = 5023,
    gadget_id = 70690001,
    pos = {
      x = 94.976,
      y = 93.54,
      z = 796.321
    },
    rot = {
      x = 340.345,
      y = 332.581,
      z = 0.0
    },
    level = 1
  },
  [5024] = {
    config_id = 5024,
    gadget_id = 70690001,
    pos = {
      x = 90.639,
      y = 96.904,
      z = 804.68
    },
    rot = {
      x = 340.345,
      y = 332.581,
      z = 0.0
    },
    level = 1
  },
  [5025] = {
    config_id = 5025,
    gadget_id = 70690001,
    pos = {
      x = 86.302,
      y = 100.267,
      z = 813.04
    },
    rot = {
      x = 340.345,
      y = 332.581,
      z = 0.0
    },
    level = 1
  },
  [5026] = {
    config_id = 5026,
    gadget_id = 70690001,
    pos = {
      x = 81.966,
      y = 103.631,
      z = 821.399
    },
    rot = {
      x = 340.345,
      y = 332.581,
      z = 0.0
    },
    level = 1
  },
  [5027] = {
    config_id = 5027,
    gadget_id = 70690001,
    pos = {
      x = 77.629,
      y = 106.994,
      z = 829.759
    },
    rot = {
      x = 346.135,
      y = 338.84,
      z = 0.0
    },
    level = 1
  },
  [5028] = {
    config_id = 5028,
    gadget_id = 70690001,
    pos = {
      x = 74.263,
      y = 109.296,
      z = 838.455
    },
    rot = {
      x = 8.441,
      y = 0.459,
      z = 0.0
    },
    level = 1
  },
  [5029] = {
    config_id = 5029,
    gadget_id = 70690001,
    pos = {
      x = 74.342,
      y = 107.828,
      z = 848.346
    },
    rot = {
      x = 8.441,
      y = 0.459,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  [5007] = {
    config_id = 5007,
    shape = RegionShape.SPHERE,
    radius = 12,
    pos = {
      x = 30.299,
      y = 84.876,
      z = 668.901
    }
  }
}
triggers = {
  {
    config_id = 1005003,
    name = "SELECT_OPTION_5003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_5003",
    action = "action_EVENT_SELECT_OPTION_5003",
    trigger_count = 0
  },
  {
    config_id = 1005007,
    name = "ENTER_REGION_5007",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_5007",
    action = "action_EVENT_ENTER_REGION_5007",
    trigger_count = 0
  },
  {
    config_id = 1005015,
    name = "ANY_MONSTER_DIE_5015",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_5015",
    action = "action_EVENT_ANY_MONSTER_DIE_5015"
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
    gadgets = {
      5001,
      5002,
      5004,
      5005,
      5020
    },
    regions = {5007},
    triggers = {
      "SELECT_OPTION_5003",
      "ENTER_REGION_5007"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_5015"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {5021},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      5008,
      5019,
      5022,
      5023,
      5024,
      5025,
      5026,
      5027,
      5028,
      5029
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {5014},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      5009,
      5010,
      5011
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_5003(context, evt)
  if 5002 ~= evt.param1 then
    return false
  end
  if 94 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_5003(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 235848005, 5002, 94) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5001, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 235848005, 2)
  ScriptLib.AddExtraGroupSuite(context, 235848005, 6)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 5020}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_5007(context, evt)
  if evt.param1 ~= 5007 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  if 0 ~= ScriptLib.GetExhibitionAccumulableData(context, context.uid, 11401108) then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_5007(context, evt)
  ScriptLib.AddExhibitionAccumulableData(context, context.uid, "Activity_SummerTimeV2_Kazuha_Guide1", 1)
  ScriptLib.ShowClientTutorial(context, 862, {})
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_5015(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_5015(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 5004}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 5013}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 235848003, 2)
  ScriptLib.AddExtraGroupSuite(context, 235848003, 3)
  ScriptLib.RemoveExtraGroupSuite(context, 235848005, 6)
  return 0
end
require("V2_8/DLActivityDungeon")
