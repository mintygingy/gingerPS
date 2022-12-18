local base_info = {group_id = 220139006}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 6001,
    gadget_id = 70310452,
    pos = {
      x = -21.286,
      y = 51.728,
      z = 37.288
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    isOneoff = true
  }
}
regions = {
  {
    config_id = 6002,
    shape = RegionShape.CYLINDER,
    radius = 1,
    pos = {
      x = -21.184,
      y = 51.728,
      z = 38.177
    },
    height = 10.0
  }
}
triggers = {
  {
    config_id = 1006002,
    name = "ENTER_REGION_6002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_6002",
    action = "action_EVENT_ENTER_REGION_6002"
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
    gadgets = {6001},
    regions = {6002},
    triggers = {
      "ENTER_REGION_6002"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_6002(context, evt)
  if evt.param1 ~= 6002 then
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
function action_EVENT_ENTER_REGION_6002(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4007308") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 6001}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "CastleToyC", 1, 220139004) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  return 0
end
