local base_info = {group_id = 220141001}
monsters = {
  {
    config_id = 1001,
    monster_id = 21010201,
    pos = {
      x = 29.478,
      y = 0.0,
      z = 12.797
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1002,
    monster_id = 21010201,
    pos = {
      x = 29.1,
      y = 0.0,
      z = 14.897
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1003,
    monster_id = 20010604,
    pos = {
      x = 50.309,
      y = 0.0,
      z = -10.531
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1004,
    monster_id = 20010604,
    pos = {
      x = 50.34,
      y = 0.0,
      z = -6.25
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1005,
    monster_id = 20010901,
    pos = {
      x = 49.933,
      y = 0.0,
      z = 33.351
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1006,
    monster_id = 20011001,
    pos = {
      x = 46.535,
      y = 0.0,
      z = 32.746
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1007,
    monster_id = 21010701,
    pos = {
      x = 16.641,
      y = 0.0,
      z = 31.293
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1008,
    monster_id = 21010701,
    pos = {
      x = 19.489,
      y = 0.0,
      z = 32.535
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1009,
    monster_id = 21020601,
    pos = {
      x = 14.644,
      y = 0.0,
      z = 30.937
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1010,
    monster_id = 21010701,
    pos = {
      x = -13.062,
      y = 0.0,
      z = 42.31
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1011,
    monster_id = 21010701,
    pos = {
      x = -10.215,
      y = 0.0,
      z = 43.552
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1012,
    monster_id = 21020601,
    pos = {
      x = -15.06,
      y = 0.0,
      z = 41.954
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1013,
    monster_id = 21020101,
    pos = {
      x = -7.032,
      y = 0.0,
      z = 12.455
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1014,
    monster_id = 21010601,
    pos = {
      x = -6.353,
      y = 0.0,
      z = 8.902
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1015,
    monster_id = 21010601,
    pos = {
      x = -8.289,
      y = 0.0,
      z = 5.579
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1018,
    monster_id = 20011001,
    pos = {
      x = 52.263,
      y = 0.0,
      z = 32.003
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  }
}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 1016,
    shape = RegionShape.POLYGON,
    pos = {
      x = 17.493,
      y = 2.574,
      z = 13.639
    },
    height = 45.147,
    point_array = {
      {x = 2.796, y = 1.351},
      {x = 9.449, y = 1.555},
      {x = 9.386, y = 18.888},
      {x = 32.356, y = 19.461},
      {x = 32.415, y = 25.928},
      {x = 2.597, y = 25.912},
      {x = 2.572, y = 17.208}
    }
  }
}
triggers = {
  {
    config_id = 1001016,
    name = "ENTER_REGION_1016",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_1016",
    action = "action_EVENT_ENTER_REGION_1016"
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
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {
      1001,
      1002,
      1003,
      1004,
      1005,
      1006,
      1007,
      1008,
      1009,
      1010,
      1011,
      1012,
      1013,
      1014,
      1015,
      1018
    },
    gadgets = {},
    regions = {1016},
    triggers = {
      "ENTER_REGION_1016"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_1016(context, evt)
  if evt.param1 ~= 1016 then
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
function action_EVENT_ENTER_REGION_1016(context, evt)
  if 0 ~= ScriptLib.KillGroupEntity(context, {
    group_id = 220141001,
    kill_policy = GroupKillPolicy.GROUP_KILL_MONSTER
  }) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_monster_by_group")
    return -1
  end
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007316") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
