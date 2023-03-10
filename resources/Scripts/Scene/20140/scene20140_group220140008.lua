local base_info = {group_id = 220140008}
monsters = {
  {
    config_id = 8001,
    monster_id = 25080401,
    pos = {
      x = 64.212,
      y = 56.85,
      z = 400.331
    },
    rot = {
      x = 0.0,
      y = 182.593,
      z = 0.0
    },
    level = 1,
    pose_id = 1
  },
  {
    config_id = 8002,
    monster_id = 25050301,
    pos = {
      x = 59.982,
      y = 56.85,
      z = 401.232
    },
    rot = {
      x = 0.0,
      y = 164.393,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 8003,
    monster_id = 25050301,
    pos = {
      x = 61.467,
      y = 56.85,
      z = 396.08
    },
    rot = {
      x = 0.0,
      y = 244.746,
      z = 0.0
    },
    level = 1
  }
}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 8005,
    shape = RegionShape.CUBIC,
    size = {
      x = 30.0,
      y = 10.0,
      z = 30.0
    },
    pos = {
      x = 59.617,
      y = 56.85,
      z = 394.794
    }
  }
}
triggers = {
  {
    config_id = 1008005,
    name = "ENTER_REGION_8005",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_8005",
    action = "action_EVENT_ENTER_REGION_8005"
  }
}
variables = {}
garbages = {
  triggers = {
    {
      config_id = 1008006,
      name = "ANY_MONSTER_DIE_8006",
      event = EventType.EVENT_ANY_MONSTER_DIE,
      source = "",
      condition = "condition_EVENT_ANY_MONSTER_DIE_8006",
      action = "action_EVENT_ANY_MONSTER_DIE_8006"
    }
  }
}
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
    monsters = {},
    gadgets = {},
    regions = {8005},
    triggers = {
      "ENTER_REGION_8005"
    },
    rand_weight = 100
  },
  {
    monsters = {
      8001,
      8002,
      8003
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_8005(context, evt)
  if evt.param1 ~= 8005 then
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
function action_EVENT_ENTER_REGION_8005(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220140008, suite = 3}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
