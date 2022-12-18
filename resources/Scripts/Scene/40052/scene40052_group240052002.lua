local base_info = {group_id = 240052002}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 2001,
    gadget_id = 70290508,
    pos = {
      x = 758.17,
      y = 56.843,
      z = 377.486
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2002,
    gadget_id = 70360001,
    pos = {
      x = 758.17,
      y = 56.843,
      z = 377.486
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
    config_id = 2004,
    gadget_id = 70290528,
    pos = {
      x = 748.32,
      y = 64.85,
      z = 356.63
    },
    rot = {
      x = 0.0,
      y = 20.555,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1002003,
    name = "SELECT_OPTION_2003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_2003",
    action = "action_EVENT_SELECT_OPTION_2003"
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
      2001,
      2002,
      2004
    },
    regions = {},
    triggers = {
      "SELECT_OPTION_2003"
    },
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_2003(context, evt)
  if 2002 ~= evt.param1 then
    return false
  end
  if 220 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_2003(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 240052002, 2002, 220) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 2001, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 2004, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 240052010, 3)
  local pos = {
    x = 748.0575,
    y = 64.85,
    z = 356.871
  }
  local pos_follow = {
    x = 758.21,
    y = 58.966,
    z = 388.89
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 2,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = 0,
    is_set_follow_pos = true,
    is_abs_follow_pos = true,
    follow_pos = pos_follow,
    is_force_walk = false,
    is_change_play_mode = false,
    disable_protect = 1,
    blend_type = 1,
    blend_duration = 1,
    is_set_screen_XY = false,
    screen_x = 0,
    screen_y = 0
  }) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_cameraLook_Begin")
    return -1
  end
  return 0
end
