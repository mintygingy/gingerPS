local base_info = {group_id = 220138014}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 14001,
    gadget_id = 70310251,
    pos = {
      x = -9.875,
      y = 38.32,
      z = 76.705
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true,
    arguments = {28}
  },
  {
    config_id = 14002,
    gadget_id = 70310314,
    pos = {
      x = 11.632,
      y = 32.367,
      z = 61.88
    },
    rot = {
      x = 0.182,
      y = 179.972,
      z = 270.0
    },
    level = 1,
    is_enable_interact = false
  },
  {
    config_id = 14004,
    gadget_id = 70310379,
    pos = {
      x = 15.109,
      y = 32.167,
      z = 63.385
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 90.0
    },
    level = 1,
    persistent = true,
    is_enable_interact = false
  },
  {
    config_id = 14005,
    gadget_id = 70310313,
    pos = {
      x = 11.631,
      y = 32.364,
      z = 64.213
    },
    rot = {
      x = 0.069,
      y = 359.972,
      z = 90.0
    },
    level = 1
  },
  {
    config_id = 14006,
    gadget_id = 70310314,
    pos = {
      x = 11.632,
      y = 32.367,
      z = 56.984
    },
    rot = {
      x = 0.182,
      y = 179.972,
      z = 270.0
    },
    level = 1,
    is_enable_interact = false
  },
  {
    config_id = 14007,
    gadget_id = 70310313,
    pos = {
      x = 11.631,
      y = 32.364,
      z = 59.318
    },
    rot = {
      x = 0.069,
      y = 359.972,
      z = 90.0
    },
    level = 1,
    is_enable_interact = false
  },
  {
    config_id = 14008,
    gadget_id = 70310429,
    pos = {
      x = 14.176,
      y = 34.555,
      z = 65.762
    },
    rot = {
      x = 0.0,
      y = 89.147,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 14009,
    gadget_id = 70310429,
    pos = {
      x = 14.451,
      y = 34.555,
      z = 61.117
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 14011,
    gadget_id = 70310314,
    pos = {
      x = 11.968,
      y = 46.113,
      z = 53.889
    },
    rot = {
      x = 89.641,
      y = 348.027,
      z = 78.14
    },
    level = 1
  },
  {
    config_id = 14012,
    gadget_id = 70310313,
    pos = {
      x = 11.971,
      y = 48.58,
      z = 53.874
    },
    rot = {
      x = 89.661,
      y = 348.027,
      z = 78.141
    },
    level = 1,
    is_enable_interact = false
  },
  {
    config_id = 14013,
    gadget_id = 70310314,
    pos = {
      x = 11.983,
      y = 50.711,
      z = 53.861
    },
    rot = {
      x = 270.224,
      y = 163.776,
      z = 286.11
    },
    level = 1,
    is_enable_interact = false
  },
  {
    config_id = 14014,
    gadget_id = 70310308,
    pos = {
      x = 11.944,
      y = 51.517,
      z = 53.862
    },
    rot = {
      x = 89.972,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    is_enable_interact = false
  }
}
regions = {}
triggers = {
  {
    config_id = 1014003,
    name = "GADGET_STATE_CHANGE_14003",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_14003",
    action = "action_EVENT_GADGET_STATE_CHANGE_14003",
    trigger_count = 0
  },
  {
    config_id = 1014010,
    name = "GROUP_LOAD_14010",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_14010",
    action = "action_EVENT_GROUP_LOAD_14010",
    trigger_count = 0
  },
  {
    config_id = 1014015,
    name = "OBSERVATION_POINT_NOTIFY_14015",
    event = EventType.EVENT_OBSERVATION_POINT_NOTIFY,
    source = "",
    condition = "",
    action = "action_EVENT_OBSERVATION_POINT_NOTIFY_14015",
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
    gadgets = {
      14001,
      14004,
      14006,
      14007,
      14008,
      14009,
      14011,
      14012,
      14013,
      14014
    },
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_14003",
      "GROUP_LOAD_14010",
      "OBSERVATION_POINT_NOTIFY_14015"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {14002, 14005},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_14003(context, evt)
  if 14004 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.Default ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_14003(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220138014, 2)
  return 0
end
function condition_EVENT_GROUP_LOAD_14010(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220138014, 14004) then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_14010(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220138014, 2)
  return 0
end
function action_EVENT_OBSERVATION_POINT_NOTIFY_14015(context, evt)
  if 14001 == evt.param1 and 605 == evt.param2 then
    ScriptLib.SetGadgetStateByConfigId(context, 14004, GadgetState.GearStart)
    ScriptLib.SetGroupVariableValueByGroup(context, "eyefinish3", 1, 220138022)
    ScriptLib.SetGadgetStateByConfigId(context, 14001, GadgetState.ChestOpened)
    ScriptLib.KillEntityByConfigId(context, {
      group_id = 220138014,
      config_id = 14008,
      entity_type = EntityType.GADGET
    })
    ScriptLib.KillEntityByConfigId(context, {
      group_id = 220138014,
      config_id = 14009,
      entity_type = EntityType.GADGET
    })
  end
  return 0
end
