local base_info = {group_id = 220147007}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 7001,
    gadget_id = 70290508,
    pos = {
      x = 701.668,
      y = 74.687,
      z = 354.771
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 7002,
    gadget_id = 70900201,
    pos = {
      x = 701.668,
      y = 76.925,
      z = 354.771
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
    gadget_id = 70360001,
    pos = {
      x = 701.668,
      y = 74.687,
      z = 354.771
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
  }
}
regions = {}
triggers = {
  {
    config_id = 1007004,
    name = "SELECT_OPTION_7004",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_7004",
    action = "action_EVENT_SELECT_OPTION_7004"
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
      7003
    },
    regions = {},
    triggers = {
      "SELECT_OPTION_7004"
    },
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_7004(context, evt)
  if 7003 ~= evt.param1 then
    return false
  end
  if 220 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_7004(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220147007, 7003, 220) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 7001, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValueByGroup(context, "KeyNum", 1, 220147002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 7002}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
