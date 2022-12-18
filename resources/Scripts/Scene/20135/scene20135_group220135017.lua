local base_info = {group_id = 220135017}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 17001,
    gadget_id = 70290137,
    pos = {
      x = 100.049,
      y = 101.043,
      z = -14.616
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 17002,
    gadget_id = 70360001,
    pos = {
      x = 100.049,
      y = 101.043,
      z = -14.616
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 17009,
    gadget_id = 70360001,
    pos = {
      x = 95.17,
      y = 101.031,
      z = -8.253
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  {
    config_id = 17010,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 99.965,
      y = 101.093,
      z = -14.539
    }
  }
}
triggers = {
  {
    config_id = 1017003,
    name = "SELECT_OPTION_17003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_17003",
    action = "action_EVENT_SELECT_OPTION_17003",
    trigger_count = 0
  },
  {
    config_id = 1017004,
    name = "TIME_AXIS_PASS_17004",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "temp",
    condition = "condition_EVENT_TIME_AXIS_PASS_17004",
    action = "action_EVENT_TIME_AXIS_PASS_17004",
    trigger_count = 0
  },
  {
    config_id = 1017005,
    name = "SELECT_OPTION_17005",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_17005",
    action = "action_EVENT_SELECT_OPTION_17005",
    trigger_count = 0
  },
  {
    config_id = 1017006,
    name = "TIME_AXIS_PASS_17006",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "temp",
    condition = "condition_EVENT_TIME_AXIS_PASS_17006",
    action = "action_EVENT_TIME_AXIS_PASS_17006",
    trigger_count = 0
  },
  {
    config_id = 1017007,
    name = "GADGET_CREATE_17007",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_17007",
    action = "action_EVENT_GADGET_CREATE_17007",
    trigger_count = 0
  },
  {
    config_id = 1017008,
    name = "TIME_AXIS_PASS_17008",
    event = EventType.EVENT_TIME_AXIS_PASS,
    source = "temp2",
    condition = "condition_EVENT_TIME_AXIS_PASS_17008",
    action = "action_EVENT_TIME_AXIS_PASS_17008",
    trigger_count = 0
  },
  {
    config_id = 1017010,
    name = "ENTER_REGION_17010",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_17010",
    action = "action_EVENT_ENTER_REGION_17010",
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
    gadgets = {17009},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {17001, 17002},
    regions = {17010},
    triggers = {
      "SELECT_OPTION_17003",
      "TIME_AXIS_PASS_17004",
      "SELECT_OPTION_17005",
      "TIME_AXIS_PASS_17006",
      "GADGET_CREATE_17007",
      "TIME_AXIS_PASS_17008",
      "ENTER_REGION_17010"
    },
    rand_weight = 100
  }
}
function condition_EVENT_SELECT_OPTION_17003(context, evt)
  if 17002 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_17003(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220135017, 17002, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220135017, 17002, 626) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 17001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "temp", {5, 7}, false)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_17004(context, evt)
  if "temp" ~= evt.source_name or 2 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_17004(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220135017, 17002, {1, 626}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_17005(context, evt)
  if 17002 ~= evt.param1 then
    return false
  end
  if 626 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_17005(context, evt)
  if evt.uid ~= nil then
    local t_pos = {
      x = 108.3111,
      y = -221.17,
      z = 528.0668
    }
    if 0 ~= ScriptLib.TransPlayerToPos(context, {
      uid_list = {
        evt.uid
      },
      pos = t_pos,
      rot = {
        x = 0,
        y = 0,
        z = 0
      }
    }) then
      ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : trans_player_byOption")
      return -1
    end
  else
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : trans_player_byOption")
    return -1
  end
  ScriptLib.RemoveExtraGroupSuite(context, 220135001, 2)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_17006(context, evt)
  if "temp" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_17006(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 17001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_17007(context, evt)
  if 17002 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_17007(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 17001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  ScriptLib.InitTimeAxis(context, "temp2", {2}, false)
  return 0
end
function condition_EVENT_TIME_AXIS_PASS_17008(context, evt)
  if "temp2" ~= evt.source_name or 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_TIME_AXIS_PASS_17008(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220135017, 17002, {1, 626}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_17010(context, evt)
  if evt.param1 ~= 17010 then
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
function action_EVENT_ENTER_REGION_17010(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "7903602") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
