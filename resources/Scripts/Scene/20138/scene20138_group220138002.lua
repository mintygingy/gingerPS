local base_info = {group_id = 220138002}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 2001,
    gadget_id = 71700418,
    pos = {
      x = 3.785,
      y = 57.777,
      z = 156.211
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2002,
    gadget_id = 70710745,
    pos = {
      x = 3.785,
      y = 59.154,
      z = 156.211
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2006,
    gadget_id = 70360001,
    pos = {
      x = 3.785,
      y = 59.161,
      z = 156.211
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1002003,
    name = "GADGET_CREATE_2003",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_2003",
    action = "action_EVENT_GADGET_CREATE_2003",
    trigger_count = 0
  },
  {
    config_id = 1002005,
    name = "SELECT_OPTION_2005",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_2005",
    action = "action_EVENT_SELECT_OPTION_2005",
    trigger_count = 0
  },
  {
    config_id = 1002008,
    name = "GROUP_LOAD_2008",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_2008",
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
    gadgets = {2001, 2002},
    regions = {},
    triggers = {
      "GROUP_LOAD_2008"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      2001,
      2002,
      2006
    },
    regions = {},
    triggers = {
      "GADGET_CREATE_2003",
      "SELECT_OPTION_2005"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_2003(context, evt)
  if 2006 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_2003(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220138002, 2006, {195}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_2005(context, evt)
  if 2006 ~= evt.param1 then
    return false
  end
  if 195 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_2005(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007201") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_LOAD_2008(context, evt)
  if ScriptLib.GetHostQuestState(context, 4007201) == 2 then
    ScriptLib.RefreshGroup(context, {group_id = 220138002, suite = 2})
  end
  return 0
end
