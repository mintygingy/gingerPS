local base_info = {group_id = 220132012}
monsters = {
  {
    config_id = 12001,
    monster_id = 26090401,
    pos = {
      x = 451.405,
      y = 13.652,
      z = 491.55
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    pose_id = 101
  },
  {
    config_id = 12003,
    monster_id = 26090501,
    pos = {
      x = 450.679,
      y = 13.55,
      z = 497.334
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    pose_id = 102
  },
  {
    config_id = 12004,
    monster_id = 26090701,
    pos = {
      x = 447.827,
      y = 13.55,
      z = 493.138
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    pose_id = 102
  }
}
npcs = {}
gadgets = {
  {
    config_id = 12002,
    gadget_id = 70211002,
    pos = {
      x = 451.108,
      y = 13.625,
      z = 494.196
    },
    rot = {
      x = 0.0,
      y = 0.0,
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
    config_id = 1012005,
    name = "ANY_MONSTER_DIE_12005",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_12005",
    action = "action_EVENT_ANY_MONSTER_DIE_12005"
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
      12001,
      12003,
      12004
    },
    gadgets = {12002},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_12005"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_DIE_12005(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_12005(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220132013, 2)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 12002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
