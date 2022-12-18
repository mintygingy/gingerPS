local base_info = {group_id = 235848003}
local defs = {
  starter = 3003,
  option_id = 94,
  delay = 3,
  time_limit = 60,
  challenge_id = 2010053,
  tide_cfg = {
    [1] = {
      monsters = {3001, 3004},
      min = 2,
      max = 2
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
  [3001] = {
    config_id = 3001,
    monster_id = 25100101,
    pos = {
      x = 132.521,
      y = 85.4,
      z = 692.348
    },
    rot = {
      x = 0.0,
      y = 248.643,
      z = 0.0
    },
    level = 1,
    pose_id = 1
  },
  [3004] = {
    config_id = 3004,
    monster_id = 25100201,
    pos = {
      x = 133.945,
      y = 85.4,
      z = 687.427
    },
    rot = {
      x = 0.0,
      y = 264.429,
      z = 0.0
    },
    level = 1,
    pose_id = 1
  }
}
npcs = {}
gadgets = {
  [3002] = {
    config_id = 3002,
    gadget_id = 70360010,
    pos = {
      x = 122.94,
      y = 85.333,
      z = 684.958
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [3003] = {
    config_id = 3003,
    gadget_id = 70360001,
    pos = {
      x = 122.94,
      y = 85.333,
      z = 684.958
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
  [3005] = {
    config_id = 3005,
    gadget_id = 70360001,
    pos = {
      x = 124.075,
      y = 85.4,
      z = 682.361
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [3010] = {
    config_id = 3010,
    gadget_id = 70900201,
    pos = {
      x = 122.94,
      y = 86.126,
      z = 684.958
    },
    rot = {
      x = 0.0,
      y = 161.54,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1003006,
    name = "GADGET_CREATE_3006",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_3006",
    action = "action_EVENT_GADGET_CREATE_3006",
    trigger_count = 0
  },
  {
    config_id = 1003007,
    name = "GADGET_CREATE_3007",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_3007",
    action = "action_EVENT_GADGET_CREATE_3007",
    trigger_count = 0
  },
  {
    config_id = 1003011,
    name = "SELECT_OPTION_3011",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_3011",
    action = "action_EVENT_SELECT_OPTION_3011",
    trigger_count = 0
  },
  {
    config_id = 1003012,
    name = "ANY_MONSTER_DIE_3012",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_3012",
    action = "action_EVENT_ANY_MONSTER_DIE_3012"
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
    gadgets = {3005},
    regions = {},
    triggers = {
      "GADGET_CREATE_3007"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {3010},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {3002, 3003},
    regions = {},
    triggers = {
      "GADGET_CREATE_3006",
      "SELECT_OPTION_3011",
      "ANY_MONSTER_DIE_3012"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_3006(context, evt)
  if 3002 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_3006(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "suite", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_3007(context, evt)
  if 3005 ~= evt.param1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "suite") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_3007(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 235848003, 3)
  return 0
end
function condition_EVENT_SELECT_OPTION_3011(context, evt)
  if 3003 ~= evt.param1 then
    return false
  end
  if 94 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_3011(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 235848003, 3003, 94) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3002, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.RemoveExtraGroupSuite(context, 235848003, 2)
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_3012(context, evt)
  if ScriptLib.GetGroupMonsterCountByGroupId(context, 235848003) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_3012(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 235848006, 3)
  if 0 ~= ScriptLib.KillGroupEntity(context, {
    group_id = 235848005,
    monsters = {},
    gadgets = {5005}
  }) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_monsters_and_gadgets_by_group")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 235848005, 5)
  ScriptLib.AddExtraGroupSuite(context, 235848006, 4)
  return 0
end
require("V2_8/DLActivityDungeon")
