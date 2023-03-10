local base_info = {group_id = 220133036}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 36001,
    gadget_id = 70310242,
    pos = {
      x = -46.903,
      y = 163.357,
      z = 499.185
    },
    rot = {
      x = 354.721,
      y = 215.462,
      z = 0.0
    },
    level = 1,
    interact_id = 64
  },
  {
    config_id = 36002,
    gadget_id = 70310383,
    pos = {
      x = -28.5,
      y = 160.27,
      z = 509.23
    },
    rot = {
      x = 0.0,
      y = 1.548,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1036003,
    name = "GADGET_STATE_CHANGE_36003",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_36003",
    action = "action_EVENT_GADGET_STATE_CHANGE_36003",
    trigger_count = 0
  },
  {
    config_id = 1036004,
    name = "GADGET_STATE_CHANGE_36004",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_36004",
    action = "action_EVENT_GADGET_STATE_CHANGE_36004",
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
    gadgets = {36001, 36002},
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_36003",
      "GADGET_STATE_CHANGE_36004"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_36003(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133036, 36001) then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_36003(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 36002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  local pos = {
    x = -25.58206,
    y = 159.2544,
    z = 507.2841
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 1.5,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = 0,
    is_set_follow_pos = false,
    follow_pos = pos_follow,
    is_force_walk = true,
    is_change_play_mode = false,
    is_set_screen_XY = false,
    screen_x = 0,
    screen_y = 0
  }) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_cameraLook_Begin")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_36004(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133036, 36001) then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_36004(context, evt)
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2801, 1, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
