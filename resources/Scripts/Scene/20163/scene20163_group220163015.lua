local base_info = {group_id = 220163015}
monsters = {
  {
    config_id = 15002,
    monster_id = 23010601,
    pos = {
      x = 36.868,
      y = 73.756,
      z = -58.518
    },
    rot = {
      x = 0.0,
      y = 327.994,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 9012
  }
}
npcs = {}
gadgets = {
  {
    config_id = 15001,
    gadget_id = 70211002,
    pos = {
      x = 38.857,
      y = 74.121,
      z = -64.422
    },
    rot = {
      x = 0.0,
      y = 319.825,
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
    config_id = 1015003,
    name = "ANY_MONSTER_DIE_15003",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_15003",
    action = "action_EVENT_ANY_MONSTER_DIE_15003"
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
    monsters = {15002},
    gadgets = {15001},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_15003"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_DIE_15003(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_15003(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "fightFinish3", 1, 220163014) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 15001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
