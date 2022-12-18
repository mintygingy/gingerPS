local base_info = {group_id = 220145009}
monsters = {
  {
    config_id = 9002,
    monster_id = 26090701,
    pos = {
      x = 535.995,
      y = 94.862,
      z = 548.054
    },
    rot = {
      x = 0.0,
      y = 106.485,
      z = 0.0
    },
    level = 1,
    pose_id = 104
  },
  {
    config_id = 9003,
    monster_id = 26090901,
    pos = {
      x = 539.887,
      y = 94.855,
      z = 545.304
    },
    rot = {
      x = 0.0,
      y = 336.588,
      z = 0.0
    },
    level = 1,
    pose_id = 104
  },
  {
    config_id = 9004,
    monster_id = 26090801,
    pos = {
      x = 537.518,
      y = 94.739,
      z = 544.364
    },
    rot = {
      x = 0.0,
      y = 10.624,
      z = 0.0
    },
    level = 1,
    pose_id = 104
  }
}
npcs = {}
gadgets = {
  {
    config_id = 9001,
    gadget_id = 70211002,
    pos = {
      x = 538.28,
      y = 94.903,
      z = 546.914
    },
    rot = {
      x = 0.0,
      y = 192.115,
      z = 0.0
    },
    level = 1,
    drop_tag = "\230\136\152\230\150\151\228\189\142\231\186\167\233\161\187\229\188\165",
    state = GadgetState.ChestLocked,
    isOneoff = true,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1009005,
    name = "ANY_MONSTER_DIE_9005",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_9005",
    action = "action_EVENT_ANY_MONSTER_DIE_9005"
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
      9002,
      9003,
      9004
    },
    gadgets = {9001},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_9005"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_DIE_9005(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_9005(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 9001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.ShowReminder(context, 33010119) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
