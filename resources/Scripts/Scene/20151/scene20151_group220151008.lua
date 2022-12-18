local base_info = {group_id = 220151008}
monsters = {
  {
    config_id = 8001,
    monster_id = 26090901,
    pos = {
      x = -134.362,
      y = -9.868,
      z = 97.506
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    pose_id = 101
  },
  {
    config_id = 8002,
    monster_id = 26090901,
    pos = {
      x = -140.811,
      y = -9.868,
      z = 97.033
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    pose_id = 101
  },
  {
    config_id = 8007,
    monster_id = 26120401,
    pos = {
      x = -132.56,
      y = -9.868,
      z = 101.622
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    pose_id = 101
  },
  {
    config_id = 8008,
    monster_id = 26120401,
    pos = {
      x = -143.572,
      y = -9.868,
      z = 101.149
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    pose_id = 101
  },
  {
    config_id = 8009,
    monster_id = 26090901,
    pos = {
      x = -137.64,
      y = -9.868,
      z = 100.462
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    pose_id = 101
  }
}
npcs = {}
gadgets = {
  {
    config_id = 8003,
    gadget_id = 70211012,
    pos = {
      x = -137.738,
      y = -8.448,
      z = 110.13
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    drop_tag = "\230\136\152\230\150\151\228\184\173\231\186\167\233\161\187\229\188\165",
    state = GadgetState.ChestLocked,
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 8005,
    gadget_id = 70330317,
    pos = {
      x = -138.761,
      y = -9.858,
      z = 74.072
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
    config_id = 8004,
    shape = RegionShape.CUBIC,
    size = {
      x = 20.0,
      y = 10.0,
      z = 10.0
    },
    pos = {
      x = -138.351,
      y = -9.858,
      z = 87.252
    }
  }
}
triggers = {
  {
    config_id = 1008004,
    name = "ENTER_REGION_8004",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_8004",
    action = "action_EVENT_ENTER_REGION_8004"
  },
  {
    config_id = 1008006,
    name = "ANY_MONSTER_DIE_8006",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_8006",
    action = "action_EVENT_ANY_MONSTER_DIE_8006"
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
    gadgets = {8003},
    regions = {8004},
    triggers = {
      "ENTER_REGION_8004"
    },
    rand_weight = 100
  },
  {
    monsters = {
      8001,
      8002,
      8007,
      8008,
      8009
    },
    gadgets = {8005},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_8006"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_8004(context, evt)
  if evt.param1 ~= 8004 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_8004(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220151008, 2)
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_8006(context, evt)
  if ScriptLib.GetGroupMonsterCountByGroupId(context, 220151008) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_8006(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 8005, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 8003, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
