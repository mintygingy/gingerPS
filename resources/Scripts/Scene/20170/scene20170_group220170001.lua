local base_info = {group_id = 220170001}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 70350433,
    pos = {
      x = 56.17,
      y = 76.347,
      z = -64.344
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1002,
    gadget_id = 70310108,
    pos = {
      x = 51.963,
      y = 76.347,
      z = -64.344
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  {
    config_id = 1004,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 51.963,
      y = 76.347,
      z = -64.344
    }
  }
}
triggers = {
  {
    config_id = 1001003,
    name = "QUEST_FINISH_1003",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_1003",
    action = "action_EVENT_QUEST_FINISH_1003"
  },
  {
    config_id = 1001004,
    name = "ENTER_REGION_1004",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_1004",
    action = "action_EVENT_ENTER_REGION_1004"
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
    gadgets = {1001},
    regions = {},
    triggers = {
      "QUEST_FINISH_1003"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {1002},
    regions = {1004},
    triggers = {
      "ENTER_REGION_1004"
    },
    rand_weight = 100
  }
}
function condition_EVENT_QUEST_FINISH_1003(context, evt)
  if 303106 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_1003(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220170001, 2)
  return 0
end
function condition_EVENT_ENTER_REGION_1004(context, evt)
  if evt.param1 ~= 1004 then
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
function action_EVENT_ENTER_REGION_1004(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "30312201") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
