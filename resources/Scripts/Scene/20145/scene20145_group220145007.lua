local base_info = {group_id = 220145007}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 7001,
    gadget_id = 70290506,
    pos = {
      x = 468.44,
      y = 143.207,
      z = 475.31
    },
    rot = {
      x = 0.0,
      y = 346.715,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 7002,
    gadget_id = 70290508,
    pos = {
      x = 494.593,
      y = 118.479,
      z = 497.447
    },
    rot = {
      x = 0.0,
      y = 291.38,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 7003,
    gadget_id = 70900201,
    pos = {
      x = 494.593,
      y = 120.536,
      z = 497.447
    },
    rot = {
      x = 0.0,
      y = 291.38,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 7007,
    gadget_id = 70360001,
    pos = {
      x = 494.593,
      y = 118.584,
      z = 497.447
    },
    rot = {
      x = 0.0,
      y = 329.152,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {220}
    }
  },
  {
    config_id = 7008,
    gadget_id = 70900201,
    pos = {
      x = 468.208,
      y = 148.374,
      z = 476.074
    },
    rot = {
      x = 0.0,
      y = 329.152,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 7009,
    gadget_id = 70360001,
    pos = {
      x = 468.301,
      y = 144.387,
      z = 476.13
    },
    rot = {
      x = 0.0,
      y = 329.152,
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
    config_id = 1007004,
    name = "GADGET_STATE_CHANGE_7004",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_7004",
    action = "action_EVENT_GADGET_STATE_CHANGE_7004"
  },
  {
    config_id = 1007005,
    name = "SELECT_OPTION_7005",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_7005",
    action = "action_EVENT_SELECT_OPTION_7005"
  },
  {
    config_id = 1007006,
    name = "SELECT_OPTION_7006",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_7006",
    action = "action_EVENT_SELECT_OPTION_7006"
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
      7001,
      7002,
      7003,
      7007
    },
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_7004",
      "SELECT_OPTION_7005",
      "SELECT_OPTION_7006"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {7008},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {7009},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_7004(context, evt)
  if 7001 ~= evt.param2 or GadgetState.Action03 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_7004(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220145007, 3)
  return 0
end
function condition_EVENT_SELECT_OPTION_7005(context, evt)
  if 7007 ~= evt.param1 then
    return false
  end
  if 220 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_7005(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220145007, 7007, 220) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 7002, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValueByGroup(context, "KeyNum", 1, 220145001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 7003}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_7006(context, evt)
  if 7009 ~= evt.param1 then
    return false
  end
  if 769 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_7006(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220145007, 7009, 769) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 7001, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 7008}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220145011, 2)
  return 0
end
