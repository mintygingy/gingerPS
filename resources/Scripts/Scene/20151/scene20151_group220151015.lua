local base_info = {group_id = 220151015}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 15001,
    shape = RegionShape.CUBIC,
    size = {
      x = 35.0,
      y = 10.0,
      z = 15.0
    },
    pos = {
      x = -138.503,
      y = 7.5,
      z = 61.4
    }
  },
  {
    config_id = 15002,
    shape = RegionShape.CUBIC,
    size = {
      x = 35.0,
      y = 10.0,
      z = 15.0
    },
    pos = {
      x = -138.503,
      y = 7.5,
      z = 84.6
    }
  },
  {
    config_id = 15003,
    shape = RegionShape.CUBIC,
    size = {
      x = 15.0,
      y = 10.0,
      z = 10.0
    },
    pos = {
      x = -150.2,
      y = 7.5,
      z = 73.1
    }
  },
  {
    config_id = 15004,
    shape = RegionShape.CUBIC,
    size = {
      x = 14.0,
      y = 10.0,
      z = 10.0
    },
    pos = {
      x = -127.7,
      y = 7.5,
      z = 73.072
    }
  }
}
triggers = {
  {
    config_id = 1015001,
    name = "ENTER_REGION_15001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_15001",
    action = "action_EVENT_ENTER_REGION_15001",
    trigger_count = 0
  },
  {
    config_id = 1015002,
    name = "ENTER_REGION_15002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_15002",
    action = "action_EVENT_ENTER_REGION_15002",
    trigger_count = 0
  },
  {
    config_id = 1015003,
    name = "ENTER_REGION_15003",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_15003",
    action = "action_EVENT_ENTER_REGION_15003",
    trigger_count = 0
  },
  {
    config_id = 1015004,
    name = "ENTER_REGION_15004",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_15004",
    action = "action_EVENT_ENTER_REGION_15004",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "IsFinalMove_check",
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
      15001,
      15002,
      15003,
      15004
    },
    triggers = {
      "ENTER_REGION_15001",
      "ENTER_REGION_15002",
      "ENTER_REGION_15003",
      "ENTER_REGION_15004"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_15001(context, evt)
  if evt.param1 ~= 15001 then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "success", 220151002) ~= 1 then
    return false
  end
  if 1 > ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "IsFinalMove_check", 220151015) ~= 1 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_15001(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "IsFinalMove_check", 0, 220151015) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220151005, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_15002(context, evt)
  if evt.param1 ~= 15002 then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "success", 220151002) ~= 1 then
    return false
  end
  if 1 > ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "IsFinalMove_check", 220151015) ~= 1 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_15002(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "IsFinalMove_check", 0, 220151015) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220151005, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_15003(context, evt)
  if evt.param1 ~= 15003 then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "success", 220151002) ~= 1 then
    return false
  end
  if 1 > ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "IsFinalMove_check", 220151015) ~= 1 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_15003(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "IsFinalMove_check", 0, 220151015) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220151005, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_15004(context, evt)
  if evt.param1 ~= 15004 then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "success", 220151002) ~= 1 then
    return false
  end
  if 1 > ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "IsFinalMove_check", 220151015) ~= 1 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_15004(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "IsFinalMove_check", 0, 220151015) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220151005, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
