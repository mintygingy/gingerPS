local base_info = {group_id = 220133030}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 30001,
    gadget_id = 70360001,
    pos = {
      x = 497.987,
      y = 176.085,
      z = 1879.336
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1030002,
    name = "GADGET_CREATE_30002",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_30002",
    action = "action_EVENT_GADGET_CREATE_30002",
    trigger_count = 0
  },
  {
    config_id = 1030003,
    name = "SELECT_OPTION_30003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_30003",
    action = "action_EVENT_SELECT_OPTION_30003",
    trigger_count = 0
  },
  {
    config_id = 1030004,
    name = "GROUP_LOAD_30004",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_30004",
    trigger_count = 0
  },
  {
    config_id = 1030005,
    name = "GROUP_LOAD_30005",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_30005",
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
    gadgets = {},
    regions = {},
    triggers = {
      "GROUP_LOAD_30004"
    },
    rand_weight = 100,
    ban_refresh = true
  },
  {
    monsters = {},
    gadgets = {30001},
    regions = {},
    triggers = {
      "GADGET_CREATE_30002",
      "SELECT_OPTION_30003",
      "GROUP_LOAD_30005"
    },
    rand_weight = 100,
    ban_refresh = true
  }
}
function condition_EVENT_GADGET_CREATE_30002(context, evt)
  if 30001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_30002(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220133030, 30001, {1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_30003(context, evt)
  if 30001 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_30003(context, evt)
  if evt.uid ~= nil then
    local t_pos = {
      x = 1062.296,
      y = -388.4613,
      z = 2108.598
    }
    if 0 ~= ScriptLib.TransPlayerToPos(context, {
      uid_list = {
        evt.uid
      },
      pos = t_pos,
      rot = {
        x = 0,
        y = 90,
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
  return 0
end
function action_EVENT_GROUP_LOAD_30004(context, evt)
  if ScriptLib.GetHostQuestState(context, 4006912) == 2 then
    ScriptLib.RefreshGroup(context, {group_id = 220133030, suite = 2})
  end
  return 0
end
function action_EVENT_GROUP_LOAD_30005(context, evt)
  if ScriptLib.GetHostQuestState(context, 4006912) == 3 then
    ScriptLib.RefreshGroup(context, {group_id = 220133030, suite = 1})
  end
  return 0
end
