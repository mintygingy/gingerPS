local base_info = {group_id = 220157004}
monsters = {
  {
    config_id = 4003,
    monster_id = 28060402,
    pos = {
      x = 281.082,
      y = 174.332,
      z = 257.716
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    pose_id = 3
  },
  {
    config_id = 4004,
    monster_id = 28060402,
    pos = {
      x = 279.583,
      y = 174.332,
      z = 260.226
    },
    rot = {
      x = 0.0,
      y = 320.0,
      z = 0.0
    },
    level = 1,
    pose_id = 3
  },
  {
    config_id = 4005,
    monster_id = 28060402,
    pos = {
      x = 277.48,
      y = 174.332,
      z = 255.986
    },
    rot = {
      x = 0.0,
      y = 330.0,
      z = 0.0
    },
    level = 1,
    pose_id = 3
  }
}
npcs = {}
gadgets = {
  {
    config_id = 4001,
    gadget_id = 70350004,
    pos = {
      x = 282.719,
      y = 174.649,
      z = 258.522
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 4002,
    gadget_id = 70211102,
    pos = {
      x = 287.722,
      y = 174.342,
      z = 257.807
    },
    rot = {
      x = 0.0,
      y = 240.0,
      z = 0.0
    },
    level = 1,
    drop_tag = "\232\167\163\232\176\156\228\189\142\231\186\167\233\161\187\229\188\165",
    state = GadgetState.ChestLocked,
    isOneoff = true,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1004006,
    name = "ANY_MONSTER_DIE_4006",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_4006",
    action = "action_EVENT_ANY_MONSTER_DIE_4006"
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
    gadgets = {4001, 4002},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {
      4003,
      4004,
      4005
    },
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_4006"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_DIE_4006(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_4006(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 4001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 4002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
