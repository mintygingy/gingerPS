local base_info = {group_id = 220134068}
local defs = {
  point_sum = 6,
  route_2 = 8,
  gadget_seelie = 68001
}
defs.final_point = defs.point_sum - 1
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 68001,
    gadget_id = 70310244,
    pos = {
      x = 353.132,
      y = 634.453,
      z = -1504.913
    },
    rot = {
      x = 0.0,
      y = 297.679,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 68008,
    gadget_id = 70360001,
    pos = {
      x = 317.546,
      y = 648.615,
      z = -1481.792
    },
    rot = {
      x = 0.0,
      y = 297.679,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {411}
    }
  }
}
regions = {
  {
    config_id = 68003,
    shape = RegionShape.SPHERE,
    radius = 7,
    pos = {
      x = 355.031,
      y = 637.32,
      z = -1506.912
    }
  }
}
triggers = {
  {
    config_id = 1068002,
    name = "SELECT_OPTION_68002",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_68002",
    action = "action_EVENT_SELECT_OPTION_68002",
    trigger_count = 0
  },
  {
    config_id = 1068003,
    name = "ENTER_REGION_68003",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_68003",
    action = "action_EVENT_ENTER_REGION_68003"
  },
  {
    config_id = 1068004,
    name = "AVATAR_NEAR_PLATFORM_68004",
    event = EventType.EVENT_AVATAR_NEAR_PLATFORM,
    source = "",
    condition = "condition_EVENT_AVATAR_NEAR_PLATFORM_68004",
    action = "action_EVENT_AVATAR_NEAR_PLATFORM_68004",
    trigger_count = 0
  },
  {
    config_id = 1068006,
    name = "PLATFORM_REACH_POINT_68006",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_68006",
    action = "action_EVENT_PLATFORM_REACH_POINT_68006",
    trigger_count = 0
  },
  {
    config_id = 1068007,
    name = "PLATFORM_REACH_POINT_68007",
    event = EventType.EVENT_PLATFORM_REACH_POINT,
    source = "",
    condition = "condition_EVENT_PLATFORM_REACH_POINT_68007",
    action = "action_EVENT_PLATFORM_REACH_POINT_68007",
    trigger_count = 0
  }
}
variables = {}
init_config = {
  suite = 1,
  end_suite = 2,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {68001, 68008},
    regions = {68003},
    triggers = {
      "SELECT_OPTION_68002",
      "ENTER_REGION_68003",
      "AVATAR_NEAR_PLATFORM_68004",
      "PLATFORM_REACH_POINT_68006",
      "PLATFORM_REACH_POINT_68007"
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
function condition_EVENT_SELECT_OPTION_68002(context, evt)
  if 68008 ~= evt.param1 then
    return false
  end
  if 411 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_68002(context, evt)
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 68001, 8) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 68001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2005, 1, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220134068, 68008, 411) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_68003(context, evt)
  if evt.param1 ~= 68003 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_68003(context, evt)
  if 0 ~= ScriptLib.SetPlatformRouteId(context, 68001, 12) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_platform_routeId")
    return -1
  end
  if 0 ~= ScriptLib.StartPlatform(context, 68001) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : start_platform")
    return -1
  end
  return 0
end
function condition_EVENT_AVATAR_NEAR_PLATFORM_68004(context, evt)
  if defs.gadget_seelie ~= evt.param1 then
    return false
  end
  if defs.route_2 ~= evt.param2 then
    return false
  end
  if defs.final_point == evt.param3 then
    return false
  end
  return true
end
function action_EVENT_AVATAR_NEAR_PLATFORM_68004(context, evt)
  if 0 ~= ScriptLib.StartPlatform(context, 68001) then
    return -1
  end
  if 0 ~= evt.param3 then
    ScriptLib.MarkPlayerAction(context, 2005, 2, evt.param3 + 1)
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_68006(context, evt)
  if 68001 ~= evt.param1 then
    return false
  end
  if 8 ~= evt.param2 then
    return false
  end
  if 3 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_68006(context, evt)
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220134041, 41011, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_REACH_POINT_68007(context, evt)
  if 68001 ~= evt.param1 then
    return false
  end
  if 8 ~= evt.param2 then
    return false
  end
  if 5 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_REACH_POINT_68007(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220134063, 2)
  if 0 ~= ScriptLib.GoToGroupSuite(context, 220134063, 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : goto_groupSuite")
    return -1
  end
  if 0 ~= ScriptLib.GoToGroupSuite(context, 220134068, 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : goto_groupSuite")
    return -1
  end
  return 0
end
