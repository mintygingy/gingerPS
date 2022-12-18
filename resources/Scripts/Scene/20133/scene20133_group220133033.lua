local base_info = {group_id = 220133033}
local defs = {
  gadget_animal = 33001,
  pointarray_ID = 7,
  maxPointCount = 12,
  gadget_Reward = 33002,
  pointInfo = {
    5,
    8,
    11,
    12
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
    config_id = 33001,
    gadget_id = 70360358,
    pos = {
      x = -123.094,
      y = 181.475,
      z = 626.198
    },
    rot = {
      x = 350.167,
      y = 176.308,
      z = 19.203
    },
    level = 1,
    start_route = false,
    persistent = true,
    is_use_point_array = true,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  },
  {
    config_id = 33002,
    gadget_id = 70211101,
    pos = {
      x = -46.986,
      y = 178.98,
      z = 611.717
    },
    rot = {
      x = 354.346,
      y = 299.359,
      z = 351.282
    },
    level = 16,
    drop_tag = "\232\167\163\232\176\156\228\189\142\231\186\167\231\190\164\229\178\155",
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 33007,
    gadget_id = 70360001,
    pos = {
      x = -123.397,
      y = 181.492,
      z = 629.415
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_SUPER
  }
}
regions = {}
triggers = {
  {
    config_id = 1033003,
    name = "PLATFORM_REACH_POINT_33003",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_33003",
    action = "action_EVENT_PLATFORM_REACH_POINT_33003",
    trigger_count = 0
  },
  {
    config_id = 1033004,
    name = "PLATFORM_REACH_POINT_33004",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_33004",
    action = "action_EVENT_PLATFORM_REACH_POINT_33004",
    trigger_count = 0
  },
  {
    config_id = 1033005,
    name = "PLATFORM_REACH_POINT_33005",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_33005",
    action = "action_EVENT_PLATFORM_REACH_POINT_33005",
    trigger_count = 0
  },
  {
    config_id = 1033006,
    name = "PLATFORM_REACH_POINT_33006",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_33006",
    action = "action_EVENT_PLATFORM_REACH_POINT_33006",
    trigger_count = 0
  },
  {
    config_id = 1033008,
    name = "GROUP_LOAD_33008",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_33008",
    action = "action_EVENT_GROUP_LOAD_33008",
    trigger_count = 0
  }
}
variables = {}
init_config = {
  io_type = 1,
  suite = 3,
  end_suite = 2,
  rand_suite = false
}
suite_disk = {
  [1] = {
    gadgets = {
      {
        config_id = 33001,
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
      "PLATFORM_REACH_POINT_33003",
      "PLATFORM_REACH_POINT_33004",
      "PLATFORM_REACH_POINT_33005",
      "PLATFORM_REACH_POINT_33006"
    },
    npcs = {},
    variables = {}
  },
  [2] = {
    gadgets = {
      {config_id = 33002, state = 0}
    },
    monsters = {},
    regions = {},
    triggers = {},
    npcs = {},
    variables = {}
  },
  [3] = {
    gadgets = {
      {config_id = 33007, state = 0}
    },
    monsters = {},
    regions = {},
    triggers = {
      "GROUP_LOAD_33008"
    },
    npcs = {},
    variables = {}
  }
}
function condition_EVENT_PLATFORM_REACH_POINT_33003(context, evt)
  if 33001 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  if 5 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_33003(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 33001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_33004(context, evt)
  if 33001 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  if 8 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_33004(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 33001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_33005(context, evt)
  if 33001 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  if 11 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_33005(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 33001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_33006(context, evt)
  if 33001 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  if 12 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_33006(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 33001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_33008(context, evt)
  if ScriptLib.GetGroupVariableValueByGroup(context, "isFinished", 220133032) ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_33008(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220133033, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
require("V2_8/AnimalSeelie")
