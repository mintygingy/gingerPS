local base_info = {group_id = 240056004}
local defs = {
  worktop_id = 4007,
  gallery_id = 29022,
  recovergadget_id = 4009,
  battle_region_id = 4013,
  cleaner_id = 4005,
  trans_p1 = 4002,
  trans_p2 = 4003,
  trans_p3 = 4004,
  trans_p4 = 4012,
  monster_num = 1,
  is_first_group = false
}
monsters = {
  [4001] = {
    config_id = 4001,
    monster_id = 20040602,
    pos = {
      x = 0.181,
      y = 0.0,
      z = 0.0
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  }
}
npcs = {}
gadgets = {
  [4005] = {
    config_id = 4005,
    gadget_id = 44000456,
    pos = {
      x = -2.758,
      y = 0.231,
      z = 3.958
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [4006] = {
    config_id = 4006,
    gadget_id = 70900205,
    pos = {
      x = -0.686,
      y = -0.304,
      z = 2.5
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [4007] = {
    config_id = 4007,
    gadget_id = 70360367,
    pos = {
      x = 0.158,
      y = 0.0,
      z = 8.702
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {175}
    }
  },
  [4008] = {
    config_id = 4008,
    gadget_id = 70950042,
    pos = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  [4009] = {
    config_id = 4009,
    gadget_id = 44000006,
    pos = {
      x = 0.12,
      y = 0.0,
      z = 20.107
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
  [4013] = {
    config_id = 4013,
    shape = RegionShape.SPHERE,
    radius = 35,
    pos = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    }
  }
}
triggers = {
  {
    config_id = 1004010,
    name = "ANY_MONSTER_LIVE_4010",
    event = EventType.EVENT_ANY_MONSTER_LIVE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_LIVE_4010",
    action = "action_EVENT_ANY_MONSTER_LIVE_4010"
  },
  {
    config_id = 1004011,
    name = "SELECT_OPTION_4011",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_4011",
    action = "action_EVENT_SELECT_OPTION_4011"
  },
  {
    config_id = 1004015,
    name = "ANY_MONSTER_DIE_4015",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_4015",
    action = "action_EVENT_ANY_MONSTER_DIE_4015",
    trigger_count = 0
  }
}
points = {
  {
    config_id = 4002,
    pos = {
      x = 0.191,
      y = 0.0,
      z = 17.427
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    }
  },
  {
    config_id = 4003,
    pos = {
      x = 0.191,
      y = 0.0,
      z = 23.304
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    }
  },
  {
    config_id = 4004,
    pos = {
      x = 3.104,
      y = 0.0,
      z = 20.332
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    }
  },
  {
    config_id = 4012,
    pos = {
      x = -2.72,
      y = 0.0,
      z = 20.332
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    }
  }
}
variables = {
  {
    config_id = 1,
    name = "GALLERY_STATE",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 2,
    name = "monster_wave",
    value = 0,
    no_refresh = false
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
    gadgets = {4006},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      4005,
      4006,
      4007,
      4008,
      4009
    },
    regions = {4013},
    triggers = {
      "SELECT_OPTION_4011",
      "ANY_MONSTER_DIE_4015"
    },
    rand_weight = 100
  },
  {
    monsters = {4001},
    gadgets = {4006},
    regions = {},
    triggers = {
      "ANY_MONSTER_LIVE_4010"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_LIVE_4010(context, evt)
  if 4001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_LIVE_4010(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "GALLERY_STATE", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "monster_wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_4011(context, evt)
  if 4007 ~= evt.param1 then
    return false
  end
  if 175 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_4011(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 4007, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 240056004, 4007, 175) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 240056004, 3)
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_4015(context, evt)
  if 4001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_4015(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "GALLERY_STATE", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
require("V3_2/HypostasisChallenge")
