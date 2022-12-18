local base_info = {group_id = 240052008}
monsters = {
  {
    config_id = 8002,
    monster_id = 25210101,
    pos = {
      x = 770.175,
      y = 73.89,
      z = 396.903
    },
    rot = {
      x = 0.0,
      y = 19.95,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 9003
  },
  {
    config_id = 8003,
    monster_id = 25210501,
    pos = {
      x = 768.714,
      y = 73.878,
      z = 397.964
    },
    rot = {
      x = 0.0,
      y = 114.451,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 9002
  },
  {
    config_id = 8004,
    monster_id = 25210201,
    pos = {
      x = 770.57,
      y = 73.701,
      z = 392.684
    },
    rot = {
      x = 0.0,
      y = 64.353,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 9006
  }
}
npcs = {}
gadgets = {
  {
    config_id = 8001,
    gadget_id = 70211002,
    pos = {
      x = 747.925,
      y = 77.102,
      z = 366.612
    },
    rot = {
      x = 0.0,
      y = 34.613,
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
    config_id = 1008005,
    name = "ANY_MONSTER_DIE_8005",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_8005",
    action = "action_EVENT_ANY_MONSTER_DIE_8005"
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
      8002,
      8003,
      8004
    },
    gadgets = {8001},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_8005"
    },
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
