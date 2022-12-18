local base_info = {group_id = 220139013}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 13001,
    gadget_id = 70710745,
    pos = {
      x = 97.452,
      y = 143.286,
      z = 22.081
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 13002,
    gadget_id = 71700418,
    pos = {
      x = 97.452,
      y = 141.909,
      z = 22.081
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 13003,
    gadget_id = 70360001,
    pos = {
      x = 97.452,
      y = 143.293,
      z = 22.081
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1013004,
    name = "GADGET_CREATE_13004",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_13004",
    action = "action_EVENT_GADGET_CREATE_13004",
    trigger_count = 0
  },
  {
    config_id = 1013005,
    name = "SELECT_OPTION_13005",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_13005",
    action = "action_EVENT_SELECT_OPTION_13005",
    trigger_count = 0
  },
  {
    config_id = 1013006,
    name = "GROUP_LOAD_13006",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_13006",
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
    gadgets = {13001, 13002},
    regions = {},
    triggers = {
      "GROUP_LOAD_13006"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {
      13001,
      13002,
      13003
    },
    regions = {},
    triggers = {
      "GADGET_CREATE_13004",
      "SELECT_OPTION_13005"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_13004(context, evt)
  if 13003 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_13004(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220139013, 13003, {195}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_13005(context, evt)
  if 13003 ~= evt.param1 then
    return false
  end
  if 195 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_13005(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007311") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function action_EVENT_GROUP_LOAD_13006(context, evt)
  if ScriptLib.GetHostQuestState(context, 4007311) == 2 then
    ScriptLib.RefreshGroup(context, {group_id = 220139013, suite = 2})
  end
  return 0
end
