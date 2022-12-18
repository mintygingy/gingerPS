local base_info = {group_id = 240052003}
monsters = {
  {
    config_id = 3005,
    monster_id = 25210201,
    pos = {
      x = 735.201,
      y = 71.353,
      z = 333.224
    },
    rot = {
      x = 0.0,
      y = 189.503,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 9006
  },
  {
    config_id = 3006,
    monster_id = 25210401,
    pos = {
      x = 732.12,
      y = 71.497,
      z = 332.693
    },
    rot = {
      x = 0.0,
      y = 275.604,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 9001
  },
  {
    config_id = 3007,
    monster_id = 25210401,
    pos = {
      x = 738.23,
      y = 71.787,
      z = 337.008
    },
    rot = {
      x = 0.0,
      y = 268.227,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 9503
  }
}
npcs = {}
gadgets = {
  {
    config_id = 3001,
    gadget_id = 70290508,
    pos = {
      x = 735.044,
      y = 71.477,
      z = 329.499
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3002,
    gadget_id = 70360001,
    pos = {
      x = 735.044,
      y = 71.525,
      z = 329.499
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {220}
    }
  },
  {
    config_id = 3003,
    gadget_id = 70290484,
    pos = {
      x = 735.044,
      y = 71.477,
      z = 329.499
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1003004,
    name = "SELECT_OPTION_3004",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_3004",
    action = "action_EVENT_SELECT_OPTION_3004"
  },
  {
    config_id = 1003008,
    name = "ANY_MONSTER_DIE_3008",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_3008",
    action = "action_EVENT_ANY_MONSTER_DIE_3008"
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
    monsters = {
      3005,
      3006,
      3007
    },
    gadgets = {3001, 3003},
    regions = {},
    triggers = {
      "SELECT_OPTION_3004",
      "ANY_MONSTER_DIE_3008"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {3002},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_3004(context, evt)
  if 3002 ~= evt.param1 then
    return false
  end
  if 220 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_3004(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 240052003, 3002, 220) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3001, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_3008(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_3008(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3003, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 240052003, 2)
  return 0
end
