local base_info = {group_id = 220158006}
monsters = {
  {
    config_id = 6001,
    monster_id = 21030601,
    pos = {
      x = 290.75,
      y = 220.57,
      z = 567.104
    },
    rot = {
      x = 0.0,
      y = 222.292,
      z = 0.0
    },
    level = 1,
    affix = {1109},
    pose_id = 9012
  },
  {
    config_id = 6002,
    monster_id = 21010601,
    pos = {
      x = 282.989,
      y = 219.086,
      z = 562.71
    },
    rot = {
      x = 0.0,
      y = 122.886,
      z = 0.0
    },
    level = 1,
    affix = {1109},
    pose_id = 9013
  },
  {
    config_id = 6003,
    monster_id = 21010601,
    pos = {
      x = 288.362,
      y = 221.743,
      z = 556.665
    },
    rot = {
      x = 0.0,
      y = 299.891,
      z = 0.0
    },
    level = 1,
    affix = {1109},
    pose_id = 9013
  }
}
npcs = {}
gadgets = {
  {
    config_id = 6006,
    gadget_id = 70220103,
    pos = {
      x = 274.618,
      y = 222.355,
      z = 600.295
    },
    rot = {
      x = 0.0,
      y = 214.357,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6007,
    gadget_id = 70220103,
    pos = {
      x = 250.151,
      y = 223.686,
      z = 635.553
    },
    rot = {
      x = 0.0,
      y = 214.357,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  {
    config_id = 6008,
    shape = RegionShape.SPHERE,
    radius = 13,
    pos = {
      x = 287.597,
      y = 221.485,
      z = 555.741
    }
  }
}
triggers = {
  {
    config_id = 1006004,
    name = "ANY_MONSTER_DIE_6004",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_6004",
    action = "action_EVENT_ANY_MONSTER_DIE_6004"
  },
  {
    config_id = 1006008,
    name = "ENTER_REGION_6008",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_6008",
    action = "action_EVENT_ENTER_REGION_6008",
    trigger_count = 0
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
      6001,
      6002,
      6003
    },
    gadgets = {},
    regions = {6008},
    triggers = {
      "ANY_MONSTER_DIE_6004",
      "ENTER_REGION_6008"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {6006, 6007},
    regions = {},
    triggers = {},
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
function condition_EVENT_ANY_MONSTER_DIE_6004(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_6004(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220158006, 2)
  ScriptLib.AddExtraGroupSuite(context, 220158002, 3)
  return 0
end
function condition_EVENT_ENTER_REGION_6008(context, evt)
  if evt.param1 ~= 6008 then
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
function action_EVENT_ENTER_REGION_6008(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220158002, 2)
  ScriptLib.SetWeatherAreaState(context, 10156, 1)
  return 0
end
