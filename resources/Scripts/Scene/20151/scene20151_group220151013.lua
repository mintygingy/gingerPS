local base_info = {group_id = 220151013}
monsters = {
  {
    config_id = 13001,
    monster_id = 26090201,
    pos = {
      x = -44.879,
      y = -23.119,
      z = 68.338
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    pose_id = 102
  },
  {
    config_id = 13002,
    monster_id = 26090201,
    pos = {
      x = -44.795,
      y = -23.055,
      z = 76.433
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    pose_id = 102
  },
  {
    config_id = 13006,
    monster_id = 26090201,
    pos = {
      x = -48.75,
      y = -23.055,
      z = 72.687
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    pose_id = 102
  },
  {
    config_id = 13007,
    monster_id = 26090201,
    pos = {
      x = -41.832,
      y = -23.074,
      z = 72.877
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    pose_id = 102
  }
}
npcs = {}
gadgets = {
  {
    config_id = 13008,
    gadget_id = 70210101,
    pos = {
      x = -45.012,
      y = -23.098,
      z = 72.74
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    drop_tag = "\230\144\156\229\136\174\231\130\185\232\167\163\232\176\156\230\158\156\232\148\172\233\161\187\229\188\165",
    isOneoff = true,
    persistent = true
  }
}
regions = {
  {
    config_id = 13005,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = -44.916,
      y = -23.098,
      z = 72.401
    }
  }
}
triggers = {
  {
    config_id = 1013005,
    name = "ENTER_REGION_13005",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_13005",
    action = "action_EVENT_ENTER_REGION_13005"
  }
}
variables = {}
garbages = {
  gadgets = {
    {
      config_id = 13003,
      gadget_id = 70211012,
      pos = {
        x = -44.92,
        y = -23.098,
        z = 72.688
      },
      rot = {
        x = 0.0,
        y = 270.0,
        z = 0.0
      },
      level = 1,
      drop_tag = "\230\136\152\230\150\151\228\184\173\231\186\167\233\161\187\229\188\165",
      state = GadgetState.ChestLocked,
      isOneoff = true,
      persistent = true
    }
  },
  triggers = {
    {
      config_id = 1013004,
      name = "ANY_MONSTER_DIE_13004",
      event = EventType.EVENT_ANY_MONSTER_DIE,
      source = "",
      condition = "condition_EVENT_ANY_MONSTER_DIE_13004",
      action = ""
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
    gadgets = {13008},
    regions = {13005},
    triggers = {
      "ENTER_REGION_13005"
    },
    rand_weight = 100
  },
  {
    monsters = {
      13001,
      13002,
      13006,
      13007
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_13005(context, evt)
  if evt.param1 ~= 13005 then
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
function action_EVENT_ENTER_REGION_13005(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220151013, 2)
  return 0
end
