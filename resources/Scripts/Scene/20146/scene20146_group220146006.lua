local base_info = {group_id = 220146006}
monsters = {
  {
    config_id = 6001,
    monster_id = 26090401,
    pos = {
      x = 253.85,
      y = 96.889,
      z = 690.029
    },
    rot = {
      x = 0.0,
      y = 323.249,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 102
  },
  {
    config_id = 6002,
    monster_id = 26090401,
    pos = {
      x = 254.934,
      y = 96.722,
      z = 697.166
    },
    rot = {
      x = 0.0,
      y = 230.011,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 102
  },
  {
    config_id = 6003,
    monster_id = 26090501,
    pos = {
      x = 250.443,
      y = 96.707,
      z = 697.638
    },
    rot = {
      x = 0.0,
      y = 142.15,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 102
  },
  {
    config_id = 6004,
    monster_id = 26090501,
    pos = {
      x = 249.487,
      y = 96.643,
      z = 691.958
    },
    rot = {
      x = 0.0,
      y = 47.632,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 102
  }
}
npcs = {}
gadgets = {
  {
    config_id = 6007,
    gadget_id = 70950156,
    pos = {
      x = 253.763,
      y = 96.956,
      z = 694.318
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6008,
    gadget_id = 70310148,
    pos = {
      x = 253.025,
      y = 96.959,
      z = 694.095
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6009,
    gadget_id = 70900201,
    pos = {
      x = 253.025,
      y = 99.817,
      z = 694.095
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
    config_id = 6006,
    shape = RegionShape.SPHERE,
    radius = 3,
    pos = {
      x = 252.747,
      y = 96.776,
      z = 694.047
    }
  }
}
triggers = {
  {
    config_id = 1006005,
    name = "ANY_MONSTER_DIE_6005",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_6005",
    action = "action_EVENT_ANY_MONSTER_DIE_6005"
  },
  {
    config_id = 1006006,
    name = "ENTER_REGION_6006",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_6006",
    action = "action_EVENT_ENTER_REGION_6006"
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
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_6005"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {6008, 6009},
    regions = {6006},
    triggers = {
      "ENTER_REGION_6006"
    },
    rand_weight = 100
  },
  {
    monsters = {
      6001,
      6002,
      6003,
      6004
    },
    gadgets = {6007},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_DIE_6005(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_6005(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220146007, 2)
  return 0
end
function condition_EVENT_ENTER_REGION_6006(context, evt)
  if evt.param1 ~= 6006 then
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
function action_EVENT_ENTER_REGION_6006(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220146006, 3)
  ScriptLib.KillExtraGroupSuite(context, 220146006, 2)
  ScriptLib.KillExtraGroupSuite(context, 220146005, 1)
  return 0
end
