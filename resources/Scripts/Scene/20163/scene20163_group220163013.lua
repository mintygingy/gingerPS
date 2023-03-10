local base_info = {group_id = 220163013}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 13003,
    gadget_id = 70900203,
    pos = {
      x = 2.566,
      y = 122.101,
      z = -14.946
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
    config_id = 13002,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 10.0,
      z = 10.0
    },
    pos = {
      x = 1.753,
      y = 126.332,
      z = -19.106
    }
  },
  {
    config_id = 13005,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 2.672,
      y = 126.225,
      z = -10.982
    }
  }
}
triggers = {
  {
    config_id = 1013002,
    name = "ENTER_REGION_13002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_13002",
    action = "action_EVENT_ENTER_REGION_13002"
  },
  {
    config_id = 1013005,
    name = "ENTER_REGION_13005",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_13005",
    action = "action_EVENT_ENTER_REGION_13005"
  }
}
variables = {
  {
    config_id = 1,
    name = "discSuccess4",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 2,
    name = "default",
    value = 0,
    no_refresh = true
  }
}
garbages = {
  triggers = {
    {
      config_id = 1013001,
      name = "VARIABLE_CHANGE_13001",
      event = EventType.EVENT_VARIABLE_CHANGE,
      source = "",
      condition = "condition_EVENT_VARIABLE_CHANGE_13001",
      action = ""
    },
    {
      config_id = 1013004,
      name = "VARIABLE_CHANGE_13004",
      event = EventType.EVENT_VARIABLE_CHANGE,
      source = "",
      condition = "condition_EVENT_VARIABLE_CHANGE_13004",
      action = "action_EVENT_VARIABLE_CHANGE_13004"
    }
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
    regions = {13002, 13005},
    triggers = {
      "ENTER_REGION_13002",
      "ENTER_REGION_13005"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_13002(context, evt)
  if evt.param1 ~= 13002 then
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
function action_EVENT_ENTER_REGION_13002(context, evt)
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220163013, EntityType.GADGET, 13003) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.AddQuestProgress(context, "302803") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_13005(context, evt)
  if evt.param1 ~= 13005 then
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
function action_EVENT_ENTER_REGION_13005(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 13003}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
