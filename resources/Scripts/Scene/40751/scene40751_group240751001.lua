local base_info = {group_id = 240751001}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 70360010,
    pos = {
      x = 0.021,
      y = 9.156,
      z = -0.572
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  }
}
regions = {
  {
    config_id = 1003,
    shape = RegionShape.CUBIC,
    size = {
      x = 40.0,
      y = 10.0,
      z = 10.0
    },
    pos = {
      x = 0.021,
      y = 9.14,
      z = 22.15
    }
  }
}
triggers = {
  {
    config_id = 1001003,
    name = "ENTER_REGION_1003",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_1003",
    action = "action_EVENT_ENTER_REGION_1003",
    forbid_guest = false
  },
  {
    config_id = 1001004,
    name = "SELECT_OPTION_1004",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_1004",
    action = "action_EVENT_SELECT_OPTION_1004",
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
    gadgets = {1001},
    regions = {1003},
    triggers = {
      "ENTER_REGION_1003",
      "SELECT_OPTION_1004"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_1003(context, evt)
  if evt.param1 ~= 1003 then
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
function action_EVENT_ENTER_REGION_1003(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 240751001, 1001, {7}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 240751001, 1001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_1004(context, evt)
  if 1001 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_1004(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 240751002, suite = 2}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 240751001, 1001, 7) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 240751001, 1001, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 240751003, suite = 2}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
