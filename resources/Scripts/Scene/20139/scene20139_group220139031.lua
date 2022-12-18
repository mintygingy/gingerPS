local base_info = {group_id = 220139031}
monsters = {
  {
    config_id = 31001,
    monster_id = 20011201,
    pos = {
      x = -125.127,
      y = 85.865,
      z = -83.452
    },
    rot = {
      x = 0.0,
      y = 266.531,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 31002,
    monster_id = 20011201,
    pos = {
      x = -123.64,
      y = 85.865,
      z = -84.677
    },
    rot = {
      x = 0.0,
      y = 266.531,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 31003,
    monster_id = 20011201,
    pos = {
      x = -126.61,
      y = 85.865,
      z = -84.585
    },
    rot = {
      x = 0.0,
      y = 266.531,
      z = 0.0
    },
    level = 1
  }
}
npcs = {}
gadgets = {
  {
    config_id = 31005,
    gadget_id = 70211001,
    pos = {
      x = -134.275,
      y = 83.028,
      z = -84.16
    },
    rot = {
      x = 350.657,
      y = 92.78,
      z = 0.0
    },
    level = 16,
    drop_tag = "\230\136\152\230\150\151\228\189\142\231\186\167\231\190\164\229\178\155",
    isOneoff = true,
    persistent = true
  }
}
regions = {
  {
    config_id = 31004,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = -129.716,
      y = 83.826,
      z = -84.005
    }
  }
}
triggers = {
  {
    config_id = 1031004,
    name = "ENTER_REGION_31004",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_31004",
    action = "action_EVENT_ENTER_REGION_31004"
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
    gadgets = {31005},
    regions = {31004},
    triggers = {
      "ENTER_REGION_31004"
    },
    rand_weight = 100
  },
  {
    monsters = {
      31001,
      31002,
      31003
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_31004(context, evt)
  if evt.param1 ~= 31004 then
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
function action_EVENT_ENTER_REGION_31004(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220139031, 2)
  return 0
end
