local base_info = {group_id = 220133083}
monsters = {
  {
    config_id = 83001,
    monster_id = 20011501,
    pos = {
      x = 4266.92,
      y = 568.132,
      z = 145.428
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  {
    config_id = 83005,
    monster_id = 20011301,
    pos = {
      x = 4267.346,
      y = 567.689,
      z = 153.093
    },
    rot = {
      x = 0.0,
      y = 178.128,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  {
    config_id = 83006,
    monster_id = 20011501,
    pos = {
      x = 4263.974,
      y = 570.298,
      z = 148.44
    },
    rot = {
      x = 0.0,
      y = 73.27,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  {
    config_id = 83007,
    monster_id = 20011301,
    pos = {
      x = 4270.825,
      y = 570.572,
      z = 149.06
    },
    rot = {
      x = 0.0,
      y = 297.21,
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
    config_id = 83002,
    gadget_id = 70211012,
    pos = {
      x = 4266.638,
      y = 567.789,
      z = 148.821
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 355.354
    },
    level = 16,
    drop_tag = "\230\136\152\230\150\151\228\184\173\231\186\167\231\190\164\229\178\155",
    state = GadgetState.ChestLocked,
    isOneoff = true,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1083003,
    name = "ANY_MONSTER_DIE_83003",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_83003",
    action = "action_EVENT_ANY_MONSTER_DIE_83003"
  },
  {
    config_id = 1083004,
    name = "ANY_MONSTER_DIE_83004",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_83004",
    action = "action_EVENT_ANY_MONSTER_DIE_83004",
    trigger_count = 0
  },
  {
    config_id = 1083008,
    name = "ANY_MONSTER_DIE_83008",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_83008",
    action = "action_EVENT_ANY_MONSTER_DIE_83008",
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
init_config = {
  suite = 1,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {83001},
    gadgets = {83002},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_83003",
      "ANY_MONSTER_DIE_83004"
    },
    rand_weight = 100
  },
  {
    monsters = {83005},
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_83008"
    },
    rand_weight = 100
  },
  {
    monsters = {83006, 83007},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_DIE_83003(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "Wave") ~= 2 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_83003(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 83002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.MarkPlayerAction(context, 4001, 3, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_83004(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "Wave") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_83004(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220133083, 2)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "Wave", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_83008(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "Wave") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_83008(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220133083, 3)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "Wave", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
