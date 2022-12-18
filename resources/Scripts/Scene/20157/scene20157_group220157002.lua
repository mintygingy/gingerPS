local base_info = {group_id = 220157002}
monsters = {
  {
    config_id = 2001,
    monster_id = 24040301,
    pos = {
      x = 270.445,
      y = 183.717,
      z = 282.224
    },
    rot = {
      x = 0.0,
      y = 315.0,
      z = 0.0
    },
    level = 1,
    pose_id = 1002
  }
}
npcs = {}
gadgets = {
  {
    config_id = 2006,
    gadget_id = 70211012,
    pos = {
      x = 264.301,
      y = 183.711,
      z = 279.574
    },
    rot = {
      x = 0.0,
      y = 45.0,
      z = 0.0
    },
    level = 1,
    drop_tag = "\230\136\152\230\150\151\228\184\173\231\186\167\233\161\187\229\188\165",
    state = GadgetState.ChestLocked,
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 2007,
    gadget_id = 70330416,
    pos = {
      x = 267.305,
      y = 184.262,
      z = 268.586
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
    config_id = 1002005,
    name = "ANY_MONSTER_DIE_2005",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_2005",
    action = "action_EVENT_ANY_MONSTER_DIE_2005"
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
    monsters = {2001},
    gadgets = {2006, 2007},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_2005"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_DIE_2005(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_2005(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 2007, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220157005, 2)
  ScriptLib.AddExtraGroupSuite(context, 220157006, 2)
  ScriptLib.AddExtraGroupSuite(context, 220157007, 2)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 2006, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
