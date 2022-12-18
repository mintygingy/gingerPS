local base_info = {group_id = 220145010}
monsters = {
  {
    config_id = 10001,
    monster_id = 26090401,
    pos = {
      x = 525.651,
      y = 94.359,
      z = 555.406
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    pose_id = 101
  },
  {
    config_id = 10002,
    monster_id = 26090201,
    pos = {
      x = 520.183,
      y = 89.646,
      z = 587.89
    },
    rot = {
      x = 0.0,
      y = 298.233,
      z = 0.0
    },
    level = 1,
    pose_id = 105
  },
  {
    config_id = 10003,
    monster_id = 26090201,
    pos = {
      x = 517.217,
      y = 89.63,
      z = 583.63
    },
    rot = {
      x = 0.0,
      y = 42.363,
      z = 0.0
    },
    level = 1,
    pose_id = 105
  },
  {
    config_id = 10005,
    monster_id = 26090501,
    pos = {
      x = 565.231,
      y = 92.03,
      z = 527.48
    },
    rot = {
      x = 0.0,
      y = 193.44,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  },
  {
    config_id = 10006,
    monster_id = 26090501,
    pos = {
      x = 568.388,
      y = 92.084,
      z = 521.08
    },
    rot = {
      x = 0.0,
      y = 299.765,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  },
  {
    config_id = 10007,
    monster_id = 26090501,
    pos = {
      x = 561.099,
      y = 92.048,
      z = 520.497
    },
    rot = {
      x = 0.0,
      y = 51.448,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  }
}
npcs = {}
gadgets = {
  {
    config_id = 10008,
    gadget_id = 70210101,
    pos = {
      x = 528.988,
      y = 94.104,
      z = 556.417
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    drop_tag = "\230\144\156\229\136\174\231\130\185\232\167\163\232\176\156\233\128\154\231\148\168\233\161\187\229\188\165",
    isOneoff = true,
    persistent = true
  }
}
regions = {
  {
    config_id = 10004,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 568.801,
      y = 92.074,
      z = 520.748
    }
  }
}
triggers = {
  {
    config_id = 1010004,
    name = "ENTER_REGION_10004",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_10004",
    action = "action_EVENT_ENTER_REGION_10004"
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
      10001,
      10002,
      10003
    },
    gadgets = {10008},
    regions = {10004},
    triggers = {
      "ENTER_REGION_10004"
    },
    rand_weight = 100
  },
  {
    monsters = {
      10005,
      10006,
      10007
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_10004(context, evt)
  if evt.param1 ~= 10004 then
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
function action_EVENT_ENTER_REGION_10004(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220145010, 2)
  return 0
end
