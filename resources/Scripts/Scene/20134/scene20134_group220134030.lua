local base_info = {group_id = 220134030}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 30001,
    shape = RegionShape.CUBIC,
    size = {
      x = 5.0,
      y = 5.0,
      z = 5.0
    },
    pos = {
      x = 499.758,
      y = 607.554,
      z = -1572.69
    }
  }
}
triggers = {
  {
    config_id = 1030001,
    name = "ENTER_REGION_30001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_30001",
    action = "action_EVENT_ENTER_REGION_30001",
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
    gadgets = {},
    regions = {30001},
    triggers = {
      "ENTER_REGION_30001",
      "GROUP_LOAD_30005"
    },
    rand_weight = 100,
    ban_refresh = true
  }
}
function condition_EVENT_ENTER_REGION_30001(context, evt)
  if evt.param1 ~= 30001 then
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
function action_EVENT_ENTER_REGION_30001(context, evt)
  if evt.uid ~= nil then
    local t_pos = {
      x = 514.3438,
      y = 847.4159,
      z = -1205.154
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
  return 0
end
function action_EVENT_GROUP_LOAD_30004(context, evt)
  if ScriptLib.GetHostQuestState(context, 4007607) == 3 and ScriptLib.GetHostQuestState(context, 4007610) ~= 3 then
    ScriptLib.RefreshGroup(context, {group_id = 220134030, suite = 2})
  end
  return 0
end
function action_EVENT_GROUP_LOAD_30005(context, evt)
  if ScriptLib.GetHostQuestState(context, 4007610) == 3 then
    ScriptLib.RefreshGroup(context, {group_id = 220134030, suite = 1})
  end
  return 0
end
