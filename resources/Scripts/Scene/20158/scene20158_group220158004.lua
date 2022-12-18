local base_info = {group_id = 220158004}
monsters = {
  {
    config_id = 4001,
    monster_id = 21020301,
    pos = {
      x = 215.049,
      y = 193.415,
      z = 655.555
    },
    rot = {
      x = 0.0,
      y = 238.557,
      z = 0.0
    },
    level = 1,
    affix = {1109}
  },
  {
    config_id = 4002,
    monster_id = 21010201,
    pos = {
      x = 202.143,
      y = 187.836,
      z = 634.473
    },
    rot = {
      x = 0.0,
      y = 261.437,
      z = 0.0
    },
    level = 1,
    affix = {1109},
    pose_id = 9010
  },
  {
    config_id = 4003,
    monster_id = 21010201,
    pos = {
      x = 198.406,
      y = 189.752,
      z = 644.671
    },
    rot = {
      x = 0.0,
      y = 167.306,
      z = 0.0
    },
    level = 1,
    affix = {1109},
    pose_id = 9010
  },
  {
    config_id = 4004,
    monster_id = 21010501,
    pos = {
      x = 203.604,
      y = 190.831,
      z = 649.748
    },
    rot = {
      x = 0.0,
      y = 192.903,
      z = 0.0
    },
    level = 1,
    affix = {1109},
    pose_id = 9013
  },
  {
    config_id = 4006,
    monster_id = 20011301,
    pos = {
      x = 213.385,
      y = 191.148,
      z = 647.62
    },
    rot = {
      x = 0.0,
      y = 254.418,
      z = 0.0
    },
    level = 1,
    affix = {1109}
  },
  {
    config_id = 4007,
    monster_id = 21030301,
    pos = {
      x = 218.32,
      y = 194.367,
      z = 657.624
    },
    rot = {
      x = 0.0,
      y = 259.941,
      z = 0.0
    },
    level = 1,
    affix = {1109},
    pose_id = 9012
  },
  {
    config_id = 4008,
    monster_id = 21011001,
    pos = {
      x = 221.516,
      y = 190.083,
      z = 640.272
    },
    rot = {
      x = 0.0,
      y = 279.456,
      z = 0.0
    },
    level = 1,
    affix = {1109},
    pose_id = 9013
  },
  {
    config_id = 4013,
    monster_id = 20011201,
    pos = {
      x = 198.393,
      y = 188.652,
      z = 637.983
    },
    rot = {
      x = 0.0,
      y = 269.981,
      z = 0.0
    },
    level = 1,
    affix = {1109}
  },
  {
    config_id = 4014,
    monster_id = 20011201,
    pos = {
      x = 205.609,
      y = 189.156,
      z = 640.678
    },
    rot = {
      x = 0.0,
      y = 211.2,
      z = 0.0
    },
    level = 1,
    affix = {1109}
  }
}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 4012,
    shape = RegionShape.SPHERE,
    radius = 15,
    pos = {
      x = 199.669,
      y = 188.44,
      z = 631.636
    }
  }
}
triggers = {
  {
    config_id = 1004009,
    name = "ANY_MONSTER_DIE_4009",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_4009",
    action = "action_EVENT_ANY_MONSTER_DIE_4009"
  },
  {
    config_id = 1004011,
    name = "ANY_MONSTER_DIE_4011",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_4011",
    action = "action_EVENT_ANY_MONSTER_DIE_4011"
  },
  {
    config_id = 1004012,
    name = "ENTER_REGION_4012",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_4012",
    action = "action_EVENT_ENTER_REGION_4012"
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
      4002,
      4003,
      4004,
      4013,
      4014
    },
    gadgets = {},
    regions = {4012},
    triggers = {
      "ANY_MONSTER_DIE_4009",
      "ENTER_REGION_4012"
    },
    rand_weight = 100
  },
  {
    monsters = {
      4001,
      4006,
      4007,
      4008
    },
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_4011"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_DIE_4009(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_4009(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220158004, 2)
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_4011(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_4011(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220158002, 5)
  return 0
end
function condition_EVENT_ENTER_REGION_4012(context, evt)
  if evt.param1 ~= 4012 then
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
function action_EVENT_ENTER_REGION_4012(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 201580102) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
