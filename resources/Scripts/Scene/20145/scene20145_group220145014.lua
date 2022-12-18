local base_info = {group_id = 220145014}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 14001,
    shape = RegionShape.POLYGON,
    pos = {
      x = 437.252,
      y = 70.983,
      z = 488.207
    },
    height = 41.966,
    point_array = {
      {x = 427.483, y = 502.467},
      {x = 435.318, y = 498.815},
      {x = 447.02, y = 473.947},
      {x = 440.973, y = 475.202}
    }
  },
  {
    config_id = 14002,
    shape = RegionShape.SPHERE,
    radius = 10,
    pos = {
      x = 473.422,
      y = 67.529,
      z = 530.518
    }
  },
  {
    config_id = 14003,
    shape = RegionShape.POLYGON,
    pos = {
      x = 482.624,
      y = 100.0,
      z = 514.719
    },
    height = 10.0,
    point_array = {
      {x = 491.979, y = 509.562},
      {x = 481.477, y = 501.933},
      {x = 473.269, y = 515.268},
      {x = 478.176, y = 527.505},
      {x = 484.759, y = 526.171}
    }
  },
  {
    config_id = 14004,
    shape = RegionShape.SPHERE,
    radius = 15,
    pos = {
      x = 533.826,
      y = 94.459,
      z = 536.648
    }
  },
  {
    config_id = 14006,
    shape = RegionShape.SPHERE,
    radius = 11,
    pos = {
      x = 467.668,
      y = 141.901,
      z = 476.696
    }
  },
  {
    config_id = 14007,
    shape = RegionShape.SPHERE,
    radius = 15,
    pos = {
      x = 570.928,
      y = 92.078,
      z = 520.141
    }
  }
}
triggers = {
  {
    config_id = 1014001,
    name = "ENTER_REGION_14001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_14001",
    action = "action_EVENT_ENTER_REGION_14001"
  },
  {
    config_id = 1014002,
    name = "ENTER_REGION_14002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_14002",
    action = "action_EVENT_ENTER_REGION_14002"
  },
  {
    config_id = 1014003,
    name = "ENTER_REGION_14003",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_14003",
    action = "action_EVENT_ENTER_REGION_14003"
  },
  {
    config_id = 1014004,
    name = "ENTER_REGION_14004",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_14004",
    action = "action_EVENT_ENTER_REGION_14004"
  },
  {
    config_id = 1014006,
    name = "ENTER_REGION_14006",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_14006",
    action = "action_EVENT_ENTER_REGION_14006"
  },
  {
    config_id = 1014007,
    name = "ENTER_REGION_14007",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_14007",
    action = "action_EVENT_ENTER_REGION_14007"
  }
}
variables = {
  {
    config_id = 1,
    name = "RmdFlag",
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
    gadgets = {},
    regions = {
      14001,
      14002,
      14003,
      14004,
      14006,
      14007
    },
    triggers = {
      "ENTER_REGION_14001",
      "ENTER_REGION_14002",
      "ENTER_REGION_14003",
      "ENTER_REGION_14004",
      "ENTER_REGION_14006",
      "ENTER_REGION_14007"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_14001(context, evt)
  if evt.param1 ~= 14001 then
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
function action_EVENT_ENTER_REGION_14001(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 33010097) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_14002(context, evt)
  if evt.param1 ~= 14002 then
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
function action_EVENT_ENTER_REGION_14002(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 33010198) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_14003(context, evt)
  if evt.param1 ~= 14003 then
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
function action_EVENT_ENTER_REGION_14003(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, -993957095) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_14004(context, evt)
  if evt.param1 ~= 14004 then
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
function action_EVENT_ENTER_REGION_14004(context, evt)
  local pos = {
    x = 542.9449,
    y = 110.9799,
    z = 554.0987
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = true,
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
  if 0 ~= ScriptLib.ShowReminder(context, 33010118) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_14006(context, evt)
  if evt.param1 ~= 14006 then
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
function action_EVENT_ENTER_REGION_14006(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 33010133) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_14007(context, evt)
  if evt.param1 ~= 14007 then
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
function action_EVENT_ENTER_REGION_14007(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "RmdFlag") == 0 then
    ScriptLib.ShowReminder(context, 33010125)
    ScriptLib.ChangeGroupVariableValue(context, "RmdFlag", 1)
  elseif ScriptLib.GetGroupVariableValue(context, "RmdFlag") == 1 then
    ScriptLib.ShowReminder(context, 33010129)
    ScriptLib.ChangeGroupVariableValue(context, "RmdFlag", 1)
  end
  return 0
end
