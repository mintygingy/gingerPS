local base_info = {group_id = 235852007}
monsters = {}
npcs = {}
gadgets = {}
regions = {
  {
    config_id = 7001,
    shape = RegionShape.CUBIC,
    size = {
      x = 100.0,
      y = 20.0,
      z = 100.0
    },
    pos = {
      x = 284.495,
      y = 596.53,
      z = -1676.417
    }
  },
  {
    config_id = 7003,
    shape = RegionShape.CUBIC,
    size = {
      x = 100.0,
      y = 20.0,
      z = 100.0
    },
    pos = {
      x = 195.854,
      y = 603.811,
      z = -1802.165
    }
  }
}
triggers = {
  {
    config_id = 1007001,
    name = "ENTER_REGION_7001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_7001",
    action = "action_EVENT_ENTER_REGION_7001",
    trigger_count = 0
  },
  {
    config_id = 1007003,
    name = "ENTER_REGION_7003",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_7003",
    action = "action_EVENT_ENTER_REGION_7003",
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
    regions = {7001, 7003},
    triggers = {
      "ENTER_REGION_7001",
      "ENTER_REGION_7003"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_7001(context, evt)
  if evt.param1 ~= 7001 then
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
function action_EVENT_ENTER_REGION_7001(context, evt)
  if evt.uid ~= nil then
    local t_pos = {
      x = 307.8,
      y = 625.1,
      z = -1671
    }
    if 0 ~= ScriptLib.TransPlayerToPos(context, {
      uid_list = {
        evt.uid
      },
      pos = t_pos,
      rot = {
        x = 0,
        y = -120,
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
function condition_EVENT_ENTER_REGION_7003(context, evt)
  if evt.param1 ~= 7003 then
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
function action_EVENT_ENTER_REGION_7003(context, evt)
  if evt.uid ~= nil then
    local t_pos = {
      x = 197,
      y = 645,
      z = -1810
    }
    if 0 ~= ScriptLib.TransPlayerToPos(context, {
      uid_list = {
        evt.uid
      },
      pos = t_pos,
      rot = {
        x = 0,
        y = -120,
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
