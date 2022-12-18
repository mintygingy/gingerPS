local base_info = {group_id = 220163012}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 12001,
    gadget_id = 70220103,
    pos = {
      x = -43.453,
      y = 77.092,
      z = -30.097
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1012003,
    name = "VARIABLE_CHANGE_12003",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_12003",
    action = "action_EVENT_VARIABLE_CHANGE_12003",
    trigger_count = 0
  },
  {
    config_id = 1012004,
    name = "VARIABLE_CHANGE_12004",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_12004",
    action = "action_EVENT_VARIABLE_CHANGE_12004",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "discSuccess1",
    value = 0,
    no_refresh = true
  }
}
garbages = {
  gadgets = {
    {
      config_id = 12006,
      gadget_id = 70900203,
      pos = {
        x = -47.005,
        y = 84.521,
        z = -37.983
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1,
      vision_level = VisionLevelType.VISION_LEVEL_SUPER
    },
    {
      config_id = 12008,
      gadget_id = 70350085,
      pos = {
        x = -43.966,
        y = 76.235,
        z = -27.568
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1,
      vision_level = VisionLevelType.VISION_LEVEL_SUPER
    }
  },
  regions = {
    {
      config_id = 12007,
      shape = RegionShape.SPHERE,
      radius = 5,
      pos = {
        x = -47.128,
        y = 83.657,
        z = -40.141
      }
    },
    {
      config_id = 12009,
      shape = RegionShape.SPHERE,
      radius = 5,
      pos = {
        x = -43.9,
        y = 75.916,
        z = -31.571
      }
    }
  },
  triggers = {
    {
      config_id = 1012002,
      name = "VARIABLE_CHANGE_12002",
      event = EventType.EVENT_VARIABLE_CHANGE,
      source = "",
      condition = "condition_EVENT_VARIABLE_CHANGE_12002",
      action = "action_EVENT_VARIABLE_CHANGE_12002"
    },
    {
      config_id = 1012005,
      name = "GADGET_CREATE_12005",
      event = EventType.EVENT_GADGET_CREATE,
      source = "",
      condition = "condition_EVENT_GADGET_CREATE_12005",
      action = "action_EVENT_GADGET_CREATE_12005",
      trigger_count = 0
    },
    {
      config_id = 1012007,
      name = "ENTER_REGION_12007",
      event = EventType.EVENT_ENTER_REGION,
      source = "",
      condition = "condition_EVENT_ENTER_REGION_12007",
      action = "action_EVENT_ENTER_REGION_12007"
    },
    {
      config_id = 1012009,
      name = "ENTER_REGION_12009",
      event = EventType.EVENT_ENTER_REGION,
      source = "",
      condition = "condition_EVENT_ENTER_REGION_12009",
      action = "action_EVENT_ENTER_REGION_12009"
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
    triggers = {
      "VARIABLE_CHANGE_12003",
      "VARIABLE_CHANGE_12004"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {12001},
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
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_VARIABLE_CHANGE_12003(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "discSuccess1") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_12003(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220163012, 2)
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_12004(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "discSuccess1") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_12004(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220163012, 2)
  return 0
end
