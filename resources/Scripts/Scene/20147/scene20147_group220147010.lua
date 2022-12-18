local base_info = {group_id = 220147010}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 10001,
    gadget_id = 70290508,
    pos = {
      x = 748.304,
      y = 90.701,
      z = 366.475
    },
    rot = {
      x = 0.0,
      y = 28.887,
      z = 0.0
    },
    level = 30,
    vision_level = VisionLevelType.VISION_LEVEL_NORMAL
  },
  {
    config_id = 10002,
    gadget_id = 70290484,
    pos = {
      x = 748.304,
      y = 90.584,
      z = 366.475
    },
    rot = {
      x = 0.0,
      y = 28.887,
      z = 0.0
    },
    level = 30,
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 10003,
    gadget_id = 70900201,
    pos = {
      x = 748.304,
      y = 93.26,
      z = 366.475
    },
    rot = {
      x = 0.0,
      y = 246.934,
      z = 0.0
    },
    level = 30
  },
  {
    config_id = 10004,
    gadget_id = 70360001,
    pos = {
      x = 748.304,
      y = 90.701,
      z = 366.475
    },
    rot = {
      x = 0.0,
      y = 28.887,
      z = 0.0
    },
    level = 30,
    isOneoff = true,
    persistent = true,
    worktop_config = {
      init_options = {220}
    }
  }
}
regions = {}
triggers = {
  {
    config_id = 1010005,
    name = "SELECT_OPTION_10005",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_10005",
    action = "action_EVENT_SELECT_OPTION_10005"
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
      10001,
      10002,
      10003
    },
    regions = {},
    triggers = {
      "SELECT_OPTION_10005"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {10004},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_10005(context, evt)
  if 10004 ~= evt.param1 then
    return false
  end
  if 220 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_10005(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220147010, 10004, 220) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 10001, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.ChangeGroupVariableValueByGroup(context, "KeyNum", 1, 220147002) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 10003}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
