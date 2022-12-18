local base_info = {group_id = 220133090}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 90001,
    gadget_id = 70310469,
    pos = {
      x = 1061.927,
      y = -388.461,
      z = 2092.631
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 90002,
    gadget_id = 70310469,
    pos = {
      x = 1071.821,
      y = -388.461,
      z = 2092.631
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 90003,
    gadget_id = 70310471,
    pos = {
      x = 1066.858,
      y = -382.658,
      z = 2099.372
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
    config_id = 90004,
    gadget_id = 70310470,
    pos = {
      x = 1066.818,
      y = -384.052,
      z = 2099.379
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1090005,
    name = "QUEST_START_90005",
    event = EventType.EVENT_QUEST_START,
    source = "4006924",
    condition = "",
    action = "action_EVENT_QUEST_START_90005",
    trigger_count = 0
  },
  {
    config_id = 1090006,
    name = "QUEST_FINISH_90006",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_90006",
    action = "action_EVENT_QUEST_FINISH_90006",
    trigger_count = 0
  },
  {
    config_id = 1090007,
    name = "QUEST_START_90007",
    event = EventType.EVENT_QUEST_START,
    source = "4006924",
    condition = "condition_EVENT_QUEST_START_90007",
    action = "action_EVENT_QUEST_START_90007",
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
      90001,
      90002,
      90004
    },
    regions = {},
    triggers = {
      "QUEST_START_90005",
      "QUEST_FINISH_90006",
      "QUEST_START_90007"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {90003},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function action_EVENT_QUEST_START_90005(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 90004, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 90001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 90002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_FINISH_90006(context, evt)
  if 4006924 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_90006(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 90003}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 90004, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 90001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 90002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_START_90007(context, evt)
  if 90003 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_QUEST_START_90007(context, evt)
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220133090, EntityType.GADGET, 90003) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
