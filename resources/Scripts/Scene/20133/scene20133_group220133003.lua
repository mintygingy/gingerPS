local base_info = {group_id = 220133003}
monsters = {
  {
    config_id = 3001,
    monster_id = 21010501,
    pos = {
      x = 2423.974,
      y = 533.128,
      z = -1786.863
    },
    rot = {
      x = 0.0,
      y = 32.908,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  {
    config_id = 3003,
    monster_id = 21010501,
    pos = {
      x = 2417.353,
      y = 533.08,
      z = -1787.336
    },
    rot = {
      x = 0.0,
      y = 56.534,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  {
    config_id = 3008,
    monster_id = 22010101,
    pos = {
      x = 2434.768,
      y = 536.701,
      z = -1792.858
    },
    rot = {
      x = 0.0,
      y = 261.733,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  {
    config_id = 3009,
    monster_id = 21010501,
    pos = {
      x = 2434.594,
      y = 536.18,
      z = -1796.112
    },
    rot = {
      x = 0.0,
      y = 261.733,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  {
    config_id = 3010,
    monster_id = 21010401,
    pos = {
      x = 2422.546,
      y = 533.026,
      z = -1781.536
    },
    rot = {
      x = 0.0,
      y = 68.169,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  {
    config_id = 3011,
    monster_id = 21010401,
    pos = {
      x = 2422.546,
      y = 533.026,
      z = -1781.536
    },
    rot = {
      x = 0.0,
      y = 68.169,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  }
}
npcs = {}
gadgets = {
  {
    config_id = 3004,
    gadget_id = 70211102,
    pos = {
      x = 2433.056,
      y = 532.937,
      z = -1779.814
    },
    rot = {
      x = 0.0,
      y = 270.75,
      z = 0.0
    },
    level = 16,
    drop_tag = "\232\167\163\232\176\156\228\189\142\231\186\167\231\190\164\229\178\155",
    state = GadgetState.ChestTrap,
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 3012,
    gadget_id = 70220026,
    pos = {
      x = 2442.382,
      y = 537.138,
      z = -1796.237
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3013,
    gadget_id = 70310001,
    pos = {
      x = 2416.347,
      y = 533.082,
      z = -1783.33
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  {
    config_id = 3014,
    gadget_id = 70310001,
    pos = {
      x = 2414.223,
      y = 533.082,
      z = -1790.009
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  {
    config_id = 3015,
    gadget_id = 70310001,
    pos = {
      x = 2451.268,
      y = 536.756,
      z = -1782.696
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  {
    config_id = 3016,
    gadget_id = 70310001,
    pos = {
      x = 2454.318,
      y = 536.662,
      z = -1785.908
    },
    rot = {
      x = 351.288,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  }
}
regions = {
  {
    config_id = 3005,
    shape = RegionShape.SPHERE,
    radius = 3.5,
    pos = {
      x = 2433.056,
      y = 532.937,
      z = -1779.814
    }
  }
}
triggers = {
  {
    config_id = 1003005,
    name = "ENTER_REGION_3005",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3005",
    action = "action_EVENT_ENTER_REGION_3005"
  },
  {
    config_id = 1003006,
    name = "ANY_MONSTER_DIE_3006",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_3006",
    action = "action_EVENT_ANY_MONSTER_DIE_3006",
    trigger_count = 0
  },
  {
    config_id = 1003007,
    name = "ANY_MONSTER_DIE_3007",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_3007",
    action = "action_EVENT_ANY_MONSTER_DIE_3007",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "Wave",
    value = 0,
    no_refresh = false
  }
}
garbages = {
  triggers = {
    {
      config_id = 1003002,
      name = "GROUP_LOAD_3002",
      event = EventType.EVENT_GROUP_LOAD,
      source = "",
      condition = "condition_EVENT_GROUP_LOAD_3002",
      action = "action_EVENT_GROUP_LOAD_3002",
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
    gadgets = {
      3004,
      3012,
      3013,
      3014,
      3015,
      3016
    },
    regions = {3005},
    triggers = {
      "ENTER_REGION_3005",
      "ANY_MONSTER_DIE_3006"
    },
    rand_weight = 100
  },
  {
    monsters = {
      3001,
      3003,
      3010,
      3011
    },
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_3006",
      "ANY_MONSTER_DIE_3007"
    },
    rand_weight = 100
  },
  {
    monsters = {3008, 3009},
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_3006"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_3005(context, evt)
  if evt.param1 ~= 3005 then
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
function action_EVENT_ENTER_REGION_3005(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3004, GadgetState.ChestLocked) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220133003, 2)
  local pos = {
    x = 2416.271,
    y = 533.0818,
    z = -1789.001
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = true,
    duration = 2,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = 0,
    is_set_follow_pos = false,
    follow_pos = pos_follow,
    is_force_walk = false,
    is_change_play_mode = false,
    is_set_screen_XY = false,
    screen_x = 0,
    screen_y = 0
  }) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_cameraLook_Begin")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_3006(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "Wave") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_3006(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3004, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_3007(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "Wave") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_3007(context, evt)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "Wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220133003, 3)
  local pos = {
    x = 2436.744,
    y = 537.1246,
    z = -1792.699
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = true,
    duration = 2,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = 0,
    is_set_follow_pos = false,
    follow_pos = pos_follow,
    is_force_walk = false,
    is_change_play_mode = false,
    is_set_screen_XY = false,
    screen_x = 0,
    screen_y = 0
  }) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_cameraLook_Begin")
    return -1
  end
  return 0
end
