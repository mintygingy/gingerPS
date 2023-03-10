local base_info = {group_id = 250079007}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 7001,
    gadget_id = 70211111,
    pos = {
      x = 692.316,
      y = 610.576,
      z = -1493.119
    },
    rot = {
      x = 0.0,
      y = 44.977,
      z = 0.0
    },
    level = 1,
    chest_drop_id = 1000100,
    drop_count = 1
  },
  {
    config_id = 7002,
    gadget_id = 70380306,
    pos = {
      x = 692.818,
      y = 609.833,
      z = -1494.076
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 7003,
    gadget_id = 70211111,
    pos = {
      x = 698.685,
      y = 609.919,
      z = -1495.359
    },
    rot = {
      x = 0.0,
      y = 307.988,
      z = 0.0
    },
    level = 1,
    chest_drop_id = 1000100,
    drop_count = 1
  },
  {
    config_id = 7004,
    gadget_id = 70211111,
    pos = {
      x = 688.932,
      y = 609.919,
      z = -1497.725
    },
    rot = {
      x = 0.0,
      y = 37.675,
      z = 0.0
    },
    level = 1,
    chest_drop_id = 1000100,
    drop_count = 1
  },
  {
    config_id = 7005,
    gadget_id = 70211111,
    pos = {
      x = 687.489,
      y = 609.919,
      z = -1485.976
    },
    rot = {
      x = 0.0,
      y = 133.926,
      z = 0.0
    },
    level = 1,
    chest_drop_id = 1000100,
    drop_count = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1007006,
    name = "GROUP_LOAD_7006",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_7006",
    trigger_count = 0
  },
  {
    config_id = 1007007,
    name = "GADGET_STATE_CHANGE_7007",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_7007",
    action = "action_EVENT_GADGET_STATE_CHANGE_7007",
    trigger_count = 0
  },
  {
    config_id = 1007008,
    name = "GADGET_STATE_CHANGE_7008",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_7008",
    action = "action_EVENT_GADGET_STATE_CHANGE_7008",
    trigger_count = 0
  },
  {
    config_id = 1007009,
    name = "GADGET_STATE_CHANGE_7009",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_7009",
    action = "action_EVENT_GADGET_STATE_CHANGE_7009",
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
    gadgets = {7001, 7002},
    regions = {},
    triggers = {
      "GROUP_LOAD_7006",
      "GADGET_STATE_CHANGE_7007",
      "GADGET_STATE_CHANGE_7008",
      "GADGET_STATE_CHANGE_7009"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {7003},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {7004},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {7005},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function action_EVENT_GROUP_LOAD_7006(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 250079007, 2)
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_7007(context, evt)
  if 7003 ~= evt.param2 or GadgetState.ChestOpened ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_7007(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 250079007, 3)
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_7008(context, evt)
  if 7004 ~= evt.param2 or GadgetState.ChestOpened ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_7008(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 250079007, 4)
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_7009(context, evt)
  if 7005 ~= evt.param2 or GadgetState.ChestOpened ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_7009(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 250079007, 2)
  return 0
end
