local base_info = {group_id = 220157008}
monsters = {
  {
    config_id = 8001,
    monster_id = 24040201,
    pos = {
      x = 155.869,
      y = 181.864,
      z = 282.481
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    pose_id = 1
  }
}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 8005,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 20.0,
      z = 25.0
    },
    pos = {
      x = 162.533,
      y = 189.929,
      z = 283.008
    }
  }
}
triggers = {
  {
    config_id = 1008003,
    name = "ANY_MONSTER_DIE_8003",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_8003",
    action = "action_EVENT_ANY_MONSTER_DIE_8003"
  },
  {
    config_id = 1008004,
    name = "TIME_AXIS_PASS_8004",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "",
    condition = "condition_EVENT_TIME_AXIS_PASS_8004",
    action = "action_EVENT_TIME_AXIS_PASS_8004"
  },
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
  regions = {
    {
      config_id = 8002,
      shape = RegionShape.SPHERE,
      radius = 5,
      pos = {
        x = 169.432,
        y = 185.017,
        z = 282.885
      }
    }
  },
  triggers = {
    {
      config_id = 1008002,
      name = "ENTER_REGION_8002",
      event = EventType.EVENT_ENTER_REGION,
      source = "",
      condition = "condition_EVENT_ENTER_REGION_8002",
      action = "action_EVENT_ENTER_REGION_8002"
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
    monsters = {8001},
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_8003",
      "TIME_AXIS_PASS_8004"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_DIE_8003(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_8003(context, evt)
  ScriptLib.InitTimeAxis(context, "timergate", {3}, false)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_8004(context, evt)
  if "timergate" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_8004(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "1301125") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
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
  ScriptLib.AddExtraGroupSuite(context, 220157008, 3)
  ScriptLib.ActivateDungeonCheckPoint(context, 2)
  return 0
end
