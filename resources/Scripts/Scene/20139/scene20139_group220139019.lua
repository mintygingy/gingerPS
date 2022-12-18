local base_info = {group_id = 220139019}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 19002,
    gadget_id = 70310251,
    pos = {
      x = 40.793,
      y = 36.427,
      z = -35.246
    },
    rot = {
      x = 0.0,
      y = 193.23,
      z = 0.0
    },
    level = 1,
    persistent = true,
    arguments = {32}
  },
  {
    config_id = 19003,
    gadget_id = 70310251,
    pos = {
      x = 59.008,
      y = 36.427,
      z = -35.286
    },
    rot = {
      x = 0.0,
      y = 180.454,
      z = 0.0
    },
    level = 1,
    state = GadgetState.ChestLocked,
    persistent = true,
    arguments = {33}
  },
  {
    config_id = 19004,
    gadget_id = 70310292,
    pos = {
      x = 48.676,
      y = 35.558,
      z = 6.304
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true,
    is_use_point_array = true
  },
  {
    config_id = 19005,
    gadget_id = 70310433,
    pos = {
      x = 48.641,
      y = 38.172,
      z = 3.704
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 19006,
    gadget_id = 70310431,
    pos = {
      x = 42.142,
      y = 35.558,
      z = -18.455
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 19007,
    gadget_id = 70310432,
    pos = {
      x = 58.54,
      y = 35.558,
      z = -18.455
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 19011,
    gadget_id = 70310434,
    pos = {
      x = 48.689,
      y = 38.133,
      z = 3.766
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 19013,
    gadget_id = 70690011,
    pos = {
      x = 49.948,
      y = 19.035,
      z = -26.958
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 19021,
    gadget_id = 70690011,
    pos = {
      x = 35.84,
      y = 18.381,
      z = 1.884
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 19022,
    gadget_id = 70690011,
    pos = {
      x = 49.948,
      y = 19.035,
      z = -5.594
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 19023,
    gadget_id = 70690011,
    pos = {
      x = 17.532,
      y = 18.381,
      z = 1.884
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 19024,
    gadget_id = 70350277,
    pos = {
      x = 49.948,
      y = 34.32,
      z = -26.958
    },
    rot = {
      x = 270.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 19025,
    gadget_id = 70350277,
    pos = {
      x = 49.948,
      y = 34.32,
      z = -2.513
    },
    rot = {
      x = 270.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 19026,
    gadget_id = 70350277,
    pos = {
      x = 38.324,
      y = 29.622,
      z = 1.928
    },
    rot = {
      x = 270.0,
      y = 233.32,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 19027,
    gadget_id = 70350277,
    pos = {
      x = 20.121,
      y = 29.622,
      z = 2.347
    },
    rot = {
      x = 270.0,
      y = 233.32,
      z = 0.0
    },
    level = 1,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1019009,
    name = "OBSERVATION_POINT_NOTIFY_19009",
    event = EventType.EVENT_OBSERVATION_POINT_NOTIFY,
    source = "",
    condition = "",
    action = "action_EVENT_OBSERVATION_POINT_NOTIFY_19009",
    trigger_count = 0
  },
  {
    config_id = 1019010,
    name = "OBSERVATION_POINT_NOTIFY_19010",
    event = EventType.EVENT_OBSERVATION_POINT_NOTIFY,
    source = "",
    condition = "",
    action = "action_EVENT_OBSERVATION_POINT_NOTIFY_19010",
    trigger_count = 0
  },
  {
    config_id = 1019012,
    name = "VARIABLE_CHANGE_19012",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_19012",
    action = "action_EVENT_VARIABLE_CHANGE_19012",
    trigger_count = 0
  },
  {
    config_id = 1019014,
    name = "GROUP_LOAD_19014",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_19014",
    action = "action_EVENT_GROUP_LOAD_19014",
    trigger_count = 0
  },
  {
    config_id = 1019020,
    name = "GROUP_LOAD_19020",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_19020",
    action = "action_EVENT_GROUP_LOAD_19020",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "finish1",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 2,
    name = "finish2",
    value = 0,
    no_refresh = false
  }
}
garbages = {
  gadgets = {
    {
      config_id = 19001,
      gadget_id = 70310251,
      pos = {
        x = 49.9,
        y = 37.765,
        z = -36.089
      },
      rot = {
        x = 0.0,
        y = 183.507,
        z = 0.0
      },
      level = 1,
      arguments = {32}
    },
    {
      config_id = 19008,
      gadget_id = 70310292,
      pos = {
        x = 49.508,
        y = 35.558,
        z = -18.455
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1
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
    gadgets = {
      19002,
      19003,
      19004,
      19005,
      19006,
      19007,
      19011,
      19024,
      19025,
      19026,
      19027
    },
    regions = {},
    triggers = {
      "OBSERVATION_POINT_NOTIFY_19009",
      "OBSERVATION_POINT_NOTIFY_19010",
      "VARIABLE_CHANGE_19012",
      "GROUP_LOAD_19014",
      "GROUP_LOAD_19020"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      19013,
      19021,
      19022,
      19023
    },
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
function action_EVENT_OBSERVATION_POINT_NOTIFY_19009(context, evt)
  if 19002 == evt.param1 and 405 == evt.param2 then
    ScriptLib.SetGadgetStateByConfigId(context, 19006, GadgetState.GearStart)
    ScriptLib.SetGadgetStateByConfigId(context, 19003, GadgetState.Default)
    ScriptLib.SetGadgetStateByConfigId(context, 19011, GadgetState.GearStart)
    ScriptLib.SetGadgetStateByConfigId(context, 19002, GadgetState.ChestOpened)
    ScriptLib.SetGadgetStateByConfigId(context, 19004, GadgetState.GearStart)
  end
  return 0
end
function action_EVENT_OBSERVATION_POINT_NOTIFY_19010(context, evt)
  if 19003 == evt.param1 and 405 == evt.param2 then
    ScriptLib.SetGadgetStateByConfigId(context, 19007, GadgetState.GearStart)
    ScriptLib.SetGroupVariableValue(context, "finish1", 1)
    ScriptLib.SetGadgetStateByConfigId(context, 19003, GadgetState.ChestOpened)
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_19012(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "finish1") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_19012(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220139019, 2)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 19024}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 19025}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 19026}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 19027}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_19014(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "finish1") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_19014(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220139019, 2)
  return 0
end
function condition_EVENT_GROUP_LOAD_19020(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "finish2") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_19020(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220139019, 3)
  return 0
end
