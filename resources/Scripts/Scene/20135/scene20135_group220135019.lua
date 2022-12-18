local base_info = {group_id = 220135019}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 19001,
    gadget_id = 70300057,
    pos = {
      x = 107.823,
      y = -216.03,
      z = 691.474
    },
    rot = {
      x = 0.0,
      y = 186.003,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  {
    config_id = 19002,
    shape = RegionShape.CUBIC,
    size = {
      x = 50.0,
      y = 50.0,
      z = 200.0
    },
    pos = {
      x = 110.221,
      y = -218.253,
      z = 608.393
    }
  },
  {
    config_id = 19003,
    shape = RegionShape.CUBIC,
    size = {
      x = 50.0,
      y = 50.0,
      z = 200.0
    },
    pos = {
      x = 112.367,
      y = -215.869,
      z = 608.393
    }
  }
}
triggers = {
  {
    config_id = 1019002,
    name = "ENTER_REGION_19002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_19002",
    action = "action_EVENT_ENTER_REGION_19002",
    trigger_count = 0
  },
  {
    config_id = 1019003,
    name = "LEAVE_REGION_19003",
    event = EventType.EVENT_LEAVE_REGION,
    source = "",
    condition = "",
    action = "action_EVENT_LEAVE_REGION_19003",
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
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {19002},
    triggers = {
      "ENTER_REGION_19002"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {19001},
    regions = {19003},
    triggers = {
      "LEAVE_REGION_19003"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_19002(context, evt)
  if evt.param1 ~= 19002 then
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
function action_EVENT_ENTER_REGION_19002(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220135019, suite = 3}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function action_EVENT_LEAVE_REGION_19003(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220135019, suite = 2}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
