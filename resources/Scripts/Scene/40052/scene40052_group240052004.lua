local base_info = {group_id = 240052004}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 4001,
    gadget_id = 70290508,
    pos = {
      x = 697.433,
      y = 58.019,
      z = 341.815
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 4002,
    gadget_id = 70360001,
    pos = {
      x = 697.433,
      y = 58.019,
      z = 341.815
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {220}
    }
  },
  {
    config_id = 4003,
    gadget_id = 70290484,
    pos = {
      x = 697.433,
      y = 58.131,
      z = 341.815
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
    config_id = 1004004,
    name = "SELECT_OPTION_4004",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_4004",
    action = "action_EVENT_SELECT_OPTION_4004"
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
    gadgets = {4001, 4003},
    regions = {},
    triggers = {
      "SELECT_OPTION_4004"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {4002},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_4004(context, evt)
  if 4002 ~= evt.param1 then
    return false
  end
  if 220 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_4004(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 240052004, 4002, 220) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 4001, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 4003, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
