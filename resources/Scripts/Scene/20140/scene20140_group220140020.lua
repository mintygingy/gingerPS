local base_info = {group_id = 220140020}
local defs = {
  fireMachineList = {20001},
  initConfig = {
    [20001] = 2
  },
  controlRelation = {},
  selectID_horizon = 613,
  selectID_vertical = 612,
  horizon_steps = {
    [20002] = {
      0,
      102,
      103,
      104
    },
    [20003] = {
      0,
      102,
      103,
      104
    },
    [20004] = {
      0,
      102,
      103,
      104
    },
    [20005] = {
      0,
      102,
      103,
      104
    },
    [20006] = {
      0,
      102,
      103,
      104
    }
  },
  vertical_steps = {
    [20002] = {
      0,
      302,
      303,
      304
    },
    [20003] = {
      0,
      302,
      303,
      304
    },
    [20004] = {
      0,
      302,
      303,
      304
    }
  }
}
monsters = {
  {
    config_id = 20003,
    monster_id = 25080101,
    pos = {
      x = 27.13,
      y = 84.544,
      z = 665.036
    },
    rot = {
      x = 0.0,
      y = 81.486,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 1003
  },
  {
    config_id = 20004,
    monster_id = 25080101,
    pos = {
      x = 31.694,
      y = 83.982,
      z = 661.314
    },
    rot = {
      x = 0.0,
      y = 351.758,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 1003
  },
  {
    config_id = 20005,
    monster_id = 25080201,
    pos = {
      x = 33.253,
      y = 84.842,
      z = 669.438
    },
    rot = {
      x = 0.0,
      y = 215.403,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 1003
  },
  {
    config_id = 20009,
    monster_id = 25080201,
    pos = {
      x = 26.209,
      y = 83.388,
      z = 652.783
    },
    rot = {
      x = 0.0,
      y = 115.163,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 1
  }
}
npcs = {}
gadgets = {
  {
    config_id = 20001,
    gadget_id = 70310158,
    pos = {
      x = 22.146,
      y = 83.538,
      z = 654.692
    },
    rot = {
      x = 0.443,
      y = 40.766,
      z = 359.897
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 20002,
    gadget_id = 70310386,
    pos = {
      x = 22.181,
      y = 84.117,
      z = 654.661
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 20008,
    gadget_id = 70310188,
    pos = {
      x = 31.034,
      y = 84.823,
      z = 665.032
    },
    rot = {
      x = 357.192,
      y = 358.889,
      z = 356.975
    },
    level = 1,
    state = GadgetState.GearStart,
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 20013,
    gadget_id = 70380298,
    pos = {
      x = 41.658,
      y = 85.74,
      z = 669.852
    },
    rot = {
      x = 4.924,
      y = 123.295,
      z = 0.668
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1020006,
    name = "ANY_MONSTER_DIE_20006",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_20006",
    action = "action_EVENT_ANY_MONSTER_DIE_20006",
    trigger_count = 0
  },
  {
    config_id = 1020012,
    name = "ANY_GADGET_DIE_20012",
    event = EventType.EVENT_ANY_GADGET_DIE,
    source = "",
    condition = "condition_EVENT_ANY_GADGET_DIE_20012",
    action = "action_EVENT_ANY_GADGET_DIE_20012",
    trigger_count = 0
  },
  {
    config_id = 1020014,
    name = "GROUP_LOAD_20014",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_20014",
    action = "action_EVENT_GROUP_LOAD_20014",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "plat",
    value = 1,
    no_refresh = true
  },
  {
    config_id = 2,
    name = "chest",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 3,
    name = "temp",
    value = 0,
    no_refresh = true
  }
}
garbages = {
  triggers = {
    {
      config_id = 1020015,
      name = "AVATAR_NEAR_PLATFORM_20015",
      event = EventType.EVENT_AVATAR_NEAR_PLATFORM,
      source = "",
      condition = "condition_EVENT_AVATAR_NEAR_PLATFORM_20015",
      action = "action_EVENT_AVATAR_NEAR_PLATFORM_20015",
      trigger_count = 0
    },
    {
      config_id = 1020016,
      name = "AVATAR_NEAR_PLATFORM_20016",
      event = EventType.EVENT_AVATAR_NEAR_PLATFORM,
      source = "",
      condition = "condition_EVENT_AVATAR_NEAR_PLATFORM_20016",
      action = "action_EVENT_AVATAR_NEAR_PLATFORM_20016",
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
    gadgets = {20001, 20013},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_20006",
      "ANY_GADGET_DIE_20012",
      "GROUP_LOAD_20014"
    },
    rand_weight = 100
  },
  {
    monsters = {
      20003,
      20004,
      20005,
      20009
    },
    gadgets = {20002, 20008},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_DIE_20006(context, evt)
  if ScriptLib.GetGroupMonsterCountByGroupId(context, 220140020) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_20006(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "temp", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 20001, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 20002}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_GADGET_DIE_20012(context, evt)
  if 20008 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_GADGET_DIE_20012(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "temp", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "plat", 10, 220140004) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_20014(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "temp") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_20014(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220140020, 2)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 20001, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
require("V2_8/FireMachineColorHandle")
