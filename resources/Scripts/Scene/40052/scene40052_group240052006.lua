local base_info = {group_id = 240052006}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 6001,
    gadget_id = 70290506,
    pos = {
      x = 771.004,
      y = 73.991,
      z = 399.344
    },
    rot = {
      x = 0.0,
      y = 227.939,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 6002,
    gadget_id = 70360001,
    pos = {
      x = 770.171,
      y = 75.184,
      z = 398.631
    },
    rot = {
      x = 0.0,
      y = 234.109,
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
    config_id = 1006003,
    name = "SELECT_OPTION_6003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_6003",
    action = "action_EVENT_SELECT_OPTION_6003"
  },
  {
    config_id = 1006004,
    name = "GADGET_STATE_CHANGE_6004",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_6004",
    action = "action_EVENT_GADGET_STATE_CHANGE_6004"
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
    gadgets = {6001},
    regions = {},
    triggers = {
      "SELECT_OPTION_6003",
      "GADGET_STATE_CHANGE_6004"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {6002},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_6003(context, evt)
  if 6002 ~= evt.param1 then
    return false
  end
  if 769 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_6003(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 240052006, 6002, 769) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 6001, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 240052009, 2)
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_6004(context, evt)
  if 6001 ~= evt.param2 or GadgetState.Action03 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_6004(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 240052006, 2)
  return 0
end
