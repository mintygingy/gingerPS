local base_info = {group_id = 240051008}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 8001,
    gadget_id = 70290506,
    pos = {
      x = 468.475,
      y = 143.219,
      z = 475.375
    },
    rot = {
      x = 0.0,
      y = 340.487,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 8002,
    gadget_id = 70360001,
    pos = {
      x = 468.338,
      y = 144.068,
      z = 476.04
    },
    rot = {
      x = 0.0,
      y = 340.487,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {769}
    }
  }
}
regions = {}
triggers = {
  {
    config_id = 1008003,
    name = "SELECT_OPTION_8003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_8003",
    action = "action_EVENT_SELECT_OPTION_8003"
  },
  {
    config_id = 1008004,
    name = "GADGET_STATE_CHANGE_8004",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_8004",
    action = "action_EVENT_GADGET_STATE_CHANGE_8004"
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
    gadgets = {8001},
    regions = {},
    triggers = {
      "SELECT_OPTION_8003",
      "GADGET_STATE_CHANGE_8004"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {8002},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_8003(context, evt)
  if 8002 ~= evt.param1 then
    return false
  end
  if 769 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_8003(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 240051008, 8002, 769) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 8001, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_8004(context, evt)
  if 8001 ~= evt.param2 or GadgetState.Action03 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_8004(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 240051008, 2)
  return 0
end
