local base_info = {group_id = 220147009}
local defs = {
  active_step = 201,
  inactive_step = 0,
  gadget_array = {
    9002,
    9003,
    9004
  },
  reset_gear_list = {}
}
local v = 0
local v_error = 0
local max_bit = #defs.gadget_array
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 9001,
    gadget_id = 70310200,
    pos = {
      x = 747.855,
      y = 96.756,
      z = 367.526
    },
    rot = {
      x = 0.0,
      y = 317.526,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 9002,
    gadget_id = 70310200,
    pos = {
      x = 749.562,
      y = 97.451,
      z = 379.991
    },
    rot = {
      x = 0.0,
      y = 174.477,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 9003,
    gadget_id = 70310200,
    pos = {
      x = 756.327,
      y = 105.649,
      z = 384.489
    },
    rot = {
      x = 0.0,
      y = 215.083,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 9004,
    gadget_id = 70310200,
    pos = {
      x = 768.075,
      y = 110.713,
      z = 381.614
    },
    rot = {
      x = 0.0,
      y = 228.781,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 9006,
    gadget_id = 70310198,
    pos = {
      x = 760.532,
      y = 91.876,
      z = 355.596
    },
    rot = {
      x = 0.0,
      y = 253.26,
      z = 0.0
    },
    level = 30,
    persistent = true
  },
  {
    config_id = 9007,
    gadget_id = 70330255,
    pos = {
      x = 748.801,
      y = 93.208,
      z = 368.772
    },
    rot = {
      x = 329.807,
      y = 4.394,
      z = 6.383
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 9008,
    gadget_id = 70330255,
    pos = {
      x = 750.106,
      y = 99.423,
      z = 379.924
    },
    rot = {
      x = 313.717,
      y = 57.389,
      z = 355.296
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 9009,
    gadget_id = 70330255,
    pos = {
      x = 757.57,
      y = 107.359,
      z = 383.875
    },
    rot = {
      x = 337.01,
      y = 99.162,
      z = 354.881
    },
    level = 1,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1009010,
    name = "GADGET_STATE_CHANGE_9010",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_9010",
    action = "action_EVENT_GADGET_STATE_CHANGE_9010",
    trigger_count = 0
  },
  {
    config_id = 1009011,
    name = "GADGET_STATE_CHANGE_9011",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_9011",
    action = "action_EVENT_GADGET_STATE_CHANGE_9011",
    trigger_count = 0
  },
  {
    config_id = 1009012,
    name = "VARIABLE_CHANGE_9012",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "gear_reset",
    condition = "",
    action = "action_EVENT_VARIABLE_CHANGE_9012",
    trigger_count = 0
  },
  {
    config_id = 1009013,
    name = "VARIABLE_CHANGE_9013",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "trigger_output",
    condition = "condition_EVENT_VARIABLE_CHANGE_9013",
    action = "action_EVENT_VARIABLE_CHANGE_9013",
    trigger_count = 0
  },
  {
    config_id = 1009014,
    name = "VARIABLE_CHANGE_9014",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "trigger_output",
    condition = "condition_EVENT_VARIABLE_CHANGE_9014",
    action = "action_EVENT_VARIABLE_CHANGE_9014",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "sort",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 2,
    name = "gear_reset",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 3,
    name = "v_error",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 4,
    name = "trigger_output",
    value = 0,
    no_refresh = false
  }
}
init_config = {
  suite = 1,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {9001, 9006},
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_9010"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      9002,
      9003,
      9004
    },
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_9011",
      "VARIABLE_CHANGE_9012",
      "VARIABLE_CHANGE_9013",
      "VARIABLE_CHANGE_9014"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      9007,
      9008,
      9009
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_9010(context, evt)
  if 9001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_9010(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 9001}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220147009, 2)
  ScriptLib.AddExtraGroupSuite(context, 220147009, 3)
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_9011(context, evt)
  for i = 1, #defs.gadget_array do
    if defs.gadget_array[i] == evt.param2 then
      return true
    end
  end
  return false
end
function action_EVENT_GADGET_STATE_CHANGE_9011(context, evt)
  if 9 < max_bit or max_bit <= 1 then
    return -1
  end
  if evt.param1 == defs.active_step then
    for i = 1, max_bit do
      if defs.gadget_array[i] == evt.param2 then
        v = ScriptLib.GetGroupVariableValue(context, "sort")
        v = 10 * v + i
        ScriptLib.SetGroupVariableValue(context, "sort", v)
        break
      end
      if i == max_bit and defs.gadget_array[i] ~= evt.param2 then
        ScriptLib.SetGroupVariableValue(context, "v_error", 1)
        v = 10 * v
      end
    end
  end
  if v > 10 ^ (max_bit - 1) then
    v_error = ScriptLib.GetGroupVariableValue(context, "v_error")
    if 0 == v_error then
      for i = max_bit, 1, -1 do
        if v % 10 ~= i then
          v_error = 1
          break
        end
        v = math.floor(v / 10)
      end
    end
    v = 0
    if v_error ~= 1 then
      v_error = -1
    end
    ScriptLib.SetGroupVariableValue(context, "sort", v)
    ScriptLib.SetGroupVariableValue(context, "gear_reset", v_error)
    ScriptLib.SetGroupVariableValue(context, "v_error", 0)
  end
  return 0
end
function action_EVENT_VARIABLE_CHANGE_9012(context, evt)
  if evt.param1 == evt.param2 then
    return -1
  end
  if evt.param1 == 1 then
    if #defs.reset_gear_list == 0 then
      defs.reset_gear_list = defs.gadget_array
    end
    for i = 1, #defs.reset_gear_list do
      ScriptLib.SetGroupGadgetStateByConfigId(context, 0, defs.reset_gear_list[i], defs.inactive_step)
    end
    ScriptLib.SetGroupVariableValue(context, "trigger_output", -1)
  elseif -1 == evt.param1 then
    ScriptLib.SetGroupVariableValue(context, "trigger_output", 1)
  end
  ScriptLib.SetGroupVariableValue(context, "gear_reset", 0)
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_9013(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if evt.param1 == -1 then
    return true
  end
  return false
end
function action_EVENT_VARIABLE_CHANGE_9013(context, evt)
  ScriptLib.KillExtraGroupSuite(context, 220147009, 2)
  ScriptLib.RemoveExtraGroupSuite(context, 220147009, 3)
  ScriptLib.AddExtraGroupSuite(context, 220147009, 1)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "trigger_output", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_9014(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if evt.param1 > 0 then
    return true
  end
  return false
end
function action_EVENT_VARIABLE_CHANGE_9014(context, evt)
  local pos = {
    x = 748.3039,
    y = 90.70079,
    z = 366.4749
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = true,
    duration = 2,
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
  ScriptLib.AddExtraGroupSuite(context, 220147010, 2)
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220147010, 10002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
