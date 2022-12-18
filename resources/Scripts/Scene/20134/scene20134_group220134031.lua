local base_info = {group_id = 220134031}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 31001,
    gadget_id = 70360001,
    pos = {
      x = 502.628,
      y = 848.287,
      z = -1189.388
    },
    rot = {
      x = 0.0,
      y = 358.025,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  {
    config_id = 31004,
    shape = RegionShape.SPHERE,
    radius = 20,
    pos = {
      x = 508.679,
      y = 848.278,
      z = -1191.926
    }
  }
}
triggers = {
  {
    config_id = 1031002,
    name = "GADGET_CREATE_31002",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_31002",
    action = "action_EVENT_GADGET_CREATE_31002",
    trigger_count = 0
  },
  {
    config_id = 1031003,
    name = "SELECT_OPTION_31003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_31003",
    action = "action_EVENT_SELECT_OPTION_31003",
    trigger_count = 0
  },
  {
    config_id = 1031004,
    name = "ENTER_REGION_31004",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_31004",
    action = "action_EVENT_ENTER_REGION_31004",
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
    monsters = {},
    gadgets = {31001},
    regions = {31004},
    triggers = {
      "GADGET_CREATE_31002",
      "SELECT_OPTION_31003",
      "ENTER_REGION_31004"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_31002(context, evt)
  if 31001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_31002(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptions(context, {98}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_work_options")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_31003(context, evt)
  if 31001 ~= evt.param1 then
    return false
  end
  if 98 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_31003(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "touchcelestialball") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  if 0 ~= ScriptLib.AddQuestProgress(context, "divein2") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
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
  if 0 ~= ScriptLib.AddQuestProgress(context, "monahouse") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
