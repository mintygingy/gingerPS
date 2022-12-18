local base_info = {group_id = 220147008}
monsters = {
  {
    config_id = 8002,
    monster_id = 26090201,
    pos = {
      x = 736.8,
      y = 71.661,
      z = 334.863
    },
    rot = {
      x = 0.0,
      y = 9.436,
      z = 0.0
    },
    level = 1,
    pose_id = 104
  },
  {
    config_id = 8003,
    monster_id = 26090201,
    pos = {
      x = 732.834,
      y = 71.401,
      z = 337.824
    },
    rot = {
      x = 0.0,
      y = 68.37,
      z = 0.0
    },
    level = 1,
    pose_id = 104
  },
  {
    config_id = 8004,
    monster_id = 26090401,
    pos = {
      x = 732.838,
      y = 71.39,
      z = 333.341
    },
    rot = {
      x = 0.0,
      y = 57.662,
      z = 0.0
    },
    level = 1,
    pose_id = 104
  }
}
npcs = {}
gadgets = {
  {
    config_id = 8001,
    gadget_id = 70211022,
    pos = {
      x = 736.865,
      y = 71.666,
      z = 340.174
    },
    rot = {
      x = 0.0,
      y = 221.182,
      z = 0.0
    },
    level = 1,
    drop_tag = "\230\136\152\230\150\151\233\171\152\231\186\167\233\161\187\229\188\165",
    state = GadgetState.ChestLocked,
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 8006,
    gadget_id = 70210101,
    pos = {
      x = 736.524,
      y = 58.99,
      z = 346.503
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    drop_tag = "\230\144\156\229\136\174\231\130\185\232\167\163\232\176\156\233\128\154\231\148\168\233\161\187\229\188\165",
    isOneoff = true,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1008005,
    name = "ANY_MONSTER_DIE_8005",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_8005",
    action = "action_EVENT_ANY_MONSTER_DIE_8005"
  },
  {
    config_id = 1008007,
    name = "GADGET_STATE_CHANGE_8007",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_8007",
    action = "action_EVENT_GADGET_STATE_CHANGE_8007"
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
    gadgets = {8001, 8006},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_8005",
      "GADGET_STATE_CHANGE_8007"
    },
    rand_weight = 100
  },
  {
    monsters = {
      8002,
      8003,
      8004
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_DIE_8005(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_8005(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 8001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_8007(context, evt)
  if 8001 ~= evt.param2 or GadgetState.ChestOpened ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_8007(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 33010114) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
