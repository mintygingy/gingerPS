local base_info = {group_id = 240662001}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 70360010,
    pos = {
      x = 0.0,
      y = 9.152,
      z = -0.477
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
    config_id = 1002,
    shape = RegionShape.CUBIC,
    size = {
      x = 40.0,
      y = 10.0,
      z = 10.0
    },
    pos = {
      x = 0.0,
      y = 12.0,
      z = 22.722
    }
  }
}
triggers = {
  {
    config_id = 1001002,
    name = "ENTER_REGION_1002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_1002",
    action = "action_EVENT_ENTER_REGION_1002"
  },
  {
    config_id = 1001003,
    name = "SELECT_OPTION_1003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_1003",
    action = "action_EVENT_SELECT_OPTION_1003",
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
    regions = {1002},
    triggers = {
      "ENTER_REGION_1002",
      "SELECT_OPTION_1003"
    },
    rand_weight = 100
  }
}
function TLA_del_work_options_by_group_configid(context, evt, group_id, config_id, option_id)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, group_id, config_id, option_id) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  return 0
end
function TLA_refresh_group_tosuite(context, evt, group_id, suite_id)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = group_id, suite = suite_id}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function TLA_set_gadget_state_by_configid(context, evt, config_id, state)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, config_id, state) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_1002(context, evt)
  if evt.param1 ~= 1002 then
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
function action_EVENT_ENTER_REGION_1002(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 240662001, 1001, {7}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 1001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_1003(context, evt)
  if 1001 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_1003(context, evt)
  ScriptLib.AutoMonsterTide(context, 1, 240662002, {
    2004,
    2005,
    2006,
    2007,
    2008,
    2010,
    2011,
    2012,
    2013,
    2014,
    2016,
    2017,
    2018,
    2019,
    2020
  }, 15, 5, 5)
  TLA_del_work_options_by_group_configid(context, evt, 240662001, 1001, 7)
  TLA_set_gadget_state_by_configid(context, evt, 1001, GadgetState.GearStop)
  TLA_refresh_group_tosuite(context, evt, 240662003, 2)
  return 0
end
