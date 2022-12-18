local base_info = {group_id = 220133035}
local defs = {
  gadget_animal = 35001,
  pointarray_ID = 8,
  maxPointCount = 16,
  gadget_Reward = 0,
  pointInfo = {
    2,
    8,
    11,
    16
  },
  addSuite_Info = 2,
  animal_state = {
    0,
    0,
    0,
    0
  }
}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 35001,
    gadget_id = 70360358,
    pos = {
      x = 4238.82,
      y = 561.579,
      z = 268.624
    },
    rot = {
      x = 15.946,
      y = 117.868,
      z = 8.27
    },
    level = 1,
    start_route = false,
    persistent = true,
    is_use_point_array = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1035003,
    name = "PLATFORM_REACH_POINT_35003",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_35003",
    action = "action_EVENT_PLATFORM_REACH_POINT_35003",
    trigger_count = 0
  },
  {
    config_id = 1035004,
    name = "PLATFORM_REACH_POINT_35004",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_35004",
    action = "action_EVENT_PLATFORM_REACH_POINT_35004",
    trigger_count = 0
  },
  {
    config_id = 1035005,
    name = "PLATFORM_REACH_POINT_35005",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_35005",
    action = "action_EVENT_PLATFORM_REACH_POINT_35005",
    trigger_count = 0
  },
  {
    config_id = 1035006,
    name = "PLATFORM_REACH_POINT_35006",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_35006",
    action = "action_EVENT_PLATFORM_REACH_POINT_35006",
    trigger_count = 0
  }
}
variables = {}
garbages = {
  triggers = {
    {
      config_id = 1035007,
      name = "GADGET_STATE_CHANGE_35007",
      event = EventType.EVENT_GADGET_STATE_CHANGE,
      source = "",
      condition = "condition_EVENT_GADGET_STATE_CHANGE_35007",
      action = "action_EVENT_GADGET_STATE_CHANGE_35007",
      trigger_count = 0
    }
  }
}
init_config = {
  io_type = 1,
  suite = 1,
  end_suite = 2,
  rand_suite = false
}
suite_disk = {
  [1] = {
    gadgets = {
      {
        config_id = 35001,
        state = 0,
        platform_info = {
          point_id = 0,
          move_type = 1,
          route_id = 0,
          route_index = 0,
          is_started = false
        }
      }
    },
    monsters = {},
    regions = {},
    triggers = {
      "PLATFORM_REACH_POINT_35003",
      "PLATFORM_REACH_POINT_35004",
      "PLATFORM_REACH_POINT_35005",
      "PLATFORM_REACH_POINT_35006"
    },
    npcs = {},
    variables = {}
  },
  [2] = {
    gadgets = {},
    monsters = {},
    regions = {},
    triggers = {},
    npcs = {},
    variables = {}
  }
}
function condition_EVENT_PLATFORM_REACH_POINT_35003(context, evt)
  if 35001 ~= evt.param1 then
    return false
  end
  if 8 ~= evt.param2 then
    return false
  end
  if 2 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_35003(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 35001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_35004(context, evt)
  if 35001 ~= evt.param1 then
    return false
  end
  if 8 ~= evt.param2 then
    return false
  end
  if 8 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_35004(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 35001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_35005(context, evt)
  if 35001 ~= evt.param1 then
    return false
  end
  if 8 ~= evt.param2 then
    return false
  end
  if 11 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_35005(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 35001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_35006(context, evt)
  if 35001 ~= evt.param1 then
    return false
  end
  if 8 ~= evt.param2 then
    return false
  end
  if 16 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_35006(context, evt)
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220133063, 63002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
require("V2_8/AnimalSeelie")
