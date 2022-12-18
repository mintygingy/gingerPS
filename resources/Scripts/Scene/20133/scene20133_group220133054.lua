local base_info = {group_id = 220133054}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 54001,
    gadget_id = 70310242,
    pos = {
      x = -123.454,
      y = 181.861,
      z = 625.185
    },
    rot = {
      x = 351.301,
      y = 299.603,
      z = 346.251
    },
    level = 1,
    interact_id = 64
  },
  {
    config_id = 54002,
    gadget_id = 70310384,
    pos = {
      x = -104.99,
      y = 180.7,
      z = 625.75
    },
    rot = {
      x = 0.0,
      y = 0.0,
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
    config_id = 1054003,
    name = "GADGET_STATE_CHANGE_54003",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_54003",
    action = "action_EVENT_GADGET_STATE_CHANGE_54003",
    trigger_count = 0
  },
  {
    config_id = 1054004,
    name = "GADGET_STATE_CHANGE_54004",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_54004",
    action = "action_EVENT_GADGET_STATE_CHANGE_54004",
    trigger_count = 0
  },
  {
    config_id = 1054005,
    name = "GADGET_STATE_CHANGE_54005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_54005",
    action = "action_EVENT_GADGET_STATE_CHANGE_54005"
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
    gadgets = {54001, 54002},
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_54003",
      "GADGET_STATE_CHANGE_54004",
      "GADGET_STATE_CHANGE_54005"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_54003(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133054, 54001) then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_54003(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 54002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_54004(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133054, 54001) then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_54004(context, evt)
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2801, 1, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_54005(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133054, 54001) then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_54005(context, evt)
  local pos = {
    x = -103.51,
    y = 181.98,
    z = 623.05
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 3,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = 0,
    is_set_follow_pos = false,
    follow_pos = pos_follow,
    is_force_walk = false,
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
