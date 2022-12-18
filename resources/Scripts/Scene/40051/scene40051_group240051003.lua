local base_info = {group_id = 240051003}
monsters = {
  {
    config_id = 3002,
    monster_id = 26090201,
    pos = {
      x = 567.369,
      y = 92.216,
      z = 518.287
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    pose_id = 105
  },
  {
    config_id = 3003,
    monster_id = 26090201,
    pos = {
      x = 565.602,
      y = 92.006,
      z = 525.394
    },
    rot = {
      x = 0.0,
      y = 102.762,
      z = 0.0
    },
    level = 1,
    pose_id = 105
  },
  {
    config_id = 3004,
    monster_id = 26090801,
    pos = {
      x = 562.02,
      y = 92.052,
      z = 521.506
    },
    rot = {
      x = 0.0,
      y = 78.543,
      z = 0.0
    },
    level = 1,
    pose_id = 102
  },
  {
    config_id = 3006,
    monster_id = 26090501,
    pos = {
      x = 546.077,
      y = 93.984,
      z = 536.689
    },
    rot = {
      x = 0.0,
      y = 91.651,
      z = 0.0
    },
    level = 1,
    pose_id = 101
  },
  {
    config_id = 3007,
    monster_id = 26090401,
    pos = {
      x = 534.927,
      y = 94.477,
      z = 540.329
    },
    rot = {
      x = 0.0,
      y = 323.716,
      z = 0.0
    },
    level = 1,
    pose_id = 101
  },
  {
    config_id = 3008,
    monster_id = 26090901,
    pos = {
      x = 538.008,
      y = 94.629,
      z = 543.127
    },
    rot = {
      x = 0.0,
      y = 108.028,
      z = 0.0
    },
    level = 1,
    pose_id = 104
  },
  {
    config_id = 3009,
    monster_id = 26090701,
    pos = {
      x = 542.195,
      y = 94.54,
      z = 540.047
    },
    rot = {
      x = 0.0,
      y = 299.526,
      z = 0.0
    },
    level = 1,
    pose_id = 101
  }
}
npcs = {}
gadgets = {
  {
    config_id = 3001,
    gadget_id = 70211002,
    pos = {
      x = 570.673,
      y = 92.1,
      z = 523.423
    },
    rot = {
      x = 0.0,
      y = 251.186,
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
    config_id = 1003005,
    name = "ANY_MONSTER_DIE_3005",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_3005",
    action = "action_EVENT_ANY_MONSTER_DIE_3005"
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
      3002,
      3003,
      3004,
      3006,
      3007,
      3008,
      3009
    },
    gadgets = {3001},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_3005"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_DIE_3005(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_3005(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
