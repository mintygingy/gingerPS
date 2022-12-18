local base_info = {group_id = 220163005}
monsters = {
  {
    config_id = 5001,
    monster_id = 23010501,
    pos = {
      x = 43.157,
      y = 82.542,
      z = -2.144
    },
    rot = {
      x = 0.0,
      y = 39.839,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 9001
  },
  {
    config_id = 5002,
    monster_id = 23010401,
    pos = {
      x = 43.792,
      y = 82.806,
      z = 6.369
    },
    rot = {
      x = 0.0,
      y = 123.793,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 9012
  },
  {
    config_id = 5008,
    monster_id = 23010601,
    pos = {
      x = 40.176,
      y = 82.806,
      z = 4.526
    },
    rot = {
      x = 0.0,
      y = 95.732,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 5010,
    monster_id = 23040101,
    pos = {
      x = 37.155,
      y = 82.542,
      z = 3.111
    },
    rot = {
      x = 0.0,
      y = 85.724,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 5011,
    monster_id = 23010301,
    pos = {
      x = 42.168,
      y = 82.83,
      z = 0.881
    },
    rot = {
      x = 0.0,
      y = 49.279,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 9011
  }
}
npcs = {}
gadgets = {
  {
    config_id = 5003,
    gadget_id = 70350464,
    pos = {
      x = 32.91,
      y = 85.416,
      z = 3.137
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5004,
    gadget_id = 70350464,
    pos = {
      x = 53.307,
      y = 85.461,
      z = 3.08
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5007,
    gadget_id = 70211011,
    pos = {
      x = 38.068,
      y = 82.544,
      z = -1.994
    },
    rot = {
      x = 0.0,
      y = 46.676,
      z = 0.0
    },
    level = 1,
    drop_tag = "\230\136\152\230\150\151\228\184\173\231\186\167\233\161\187\229\188\165",
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 5009,
    gadget_id = 70220103,
    pos = {
      x = 29.526,
      y = 88.22,
      z = 1.367
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  {
    config_id = 5005,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 58.367,
      y = 82.037,
      z = 2.832
    }
  }
}
triggers = {
  {
    config_id = 1005005,
    name = "ENTER_REGION_5005",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_5005",
    action = "action_EVENT_ENTER_REGION_5005"
  },
  {
    config_id = 1005006,
    name = "ANY_MONSTER_DIE_5006",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_5006",
    action = "action_EVENT_ANY_MONSTER_DIE_5006"
  },
  {
    config_id = 1005012,
    name = "ANY_MONSTER_DIE_5012",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_5012",
    action = "action_EVENT_ANY_MONSTER_DIE_5012"
  },
  {
    config_id = 1005013,
    name = "ANY_MONSTER_DIE_5013",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_5013",
    action = "action_EVENT_ANY_MONSTER_DIE_5013"
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
    monsters = {5002, 5011},
    gadgets = {5003, 5004},
    regions = {5005},
    triggers = {
      "ENTER_REGION_5005",
      "ANY_MONSTER_DIE_5012"
    },
    rand_weight = 100
  },
  {
    monsters = {5001, 5008},
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_5013"
    },
    rand_weight = 100
  },
  {
    monsters = {5010},
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_5006"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_5005(context, evt)
  if evt.param1 ~= 5005 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_5005(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5004, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_5006(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_5006(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5003, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "fightRoom3", 1, 220163002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 5007}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 5009}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_5012(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_5012(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220163005, 2)
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_5013(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_5013(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220163005, 3)
  return 0
end
