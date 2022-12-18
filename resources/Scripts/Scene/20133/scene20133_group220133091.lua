local base_info = {group_id = 220133091}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 91001,
    gadget_id = 70800249,
    pos = {
      x = 2252.827,
      y = 516.451,
      z = 456.653
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    isOneoff = true,
    persistent = true,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  {
    config_id = 91010,
    gadget_id = 70800249,
    pos = {
      x = 2252.827,
      y = 516.451,
      z = 456.653
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    isOneoff = true,
    persistent = true,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  }
}
regions = {}
triggers = {
  {
    config_id = 1091002,
    name = "GROUP_LOAD_91002",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_91002",
    trigger_count = 0
  },
  {
    config_id = 1091004,
    name = "GROUP_LOAD_91004",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_91004",
    action = "action_EVENT_GROUP_LOAD_91004",
    trigger_count = 0
  },
  {
    config_id = 1091005,
    name = "GROUP_LOAD_91005",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_91005",
    action = "action_EVENT_GROUP_LOAD_91005",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "GadgetADie",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 2,
    name = "GadgetBDie",
    value = 0,
    no_refresh = true
  }
}
garbages = {
  regions = {
    {
      config_id = 91003,
      shape = RegionShape.SPHERE,
      radius = 12,
      pos = {
        x = 219.04,
        y = 131.765,
        z = 2081.908
      }
    }
  },
  triggers = {
    {
      config_id = 1091003,
      name = "ENTER_REGION_91003",
      event = EventType.EVENT_ENTER_REGION,
      source = "",
      condition = "condition_EVENT_ENTER_REGION_91003",
      action = "action_EVENT_ENTER_REGION_91003",
      trigger_count = 0
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
    gadgets = {91001},
    regions = {},
    triggers = {
      "GROUP_LOAD_91002",
      "GROUP_LOAD_91004",
      "GROUP_LOAD_91005"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {91010},
    regions = {},
    triggers = {
      "GROUP_LOAD_91002"
    },
    rand_weight = 100
  }
}
function action_EVENT_GROUP_LOAD_91002(context, evt)
  if ScriptLib.GetHostQuestState(context, 4006815) == 3 then
    ScriptLib.AddExtraGroupSuite(context, 220133091, 2)
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_91004(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "GadgetADie") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_91004(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 91001}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_91005(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "GadgetBDie") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_91005(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 91010}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
