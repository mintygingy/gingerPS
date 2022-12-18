local base_info = {group_id = 220149003}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 3001,
    gadget_id = 71700450,
    pos = {
      x = 449.164,
      y = 101.092,
      z = 315.18
    },
    rot = {
      x = 0.0,
      y = 254.6,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3002,
    gadget_id = 70290549,
    pos = {
      x = 509.64,
      y = 106.96,
      z = 284.27
    },
    rot = {
      x = 352.592,
      y = 44.55,
      z = 350.152
    },
    level = 1
  },
  {
    config_id = 3004,
    gadget_id = 70290466,
    pos = {
      x = 536.735,
      y = 112.875,
      z = 317.243
    },
    rot = {
      x = 343.0,
      y = 10.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3034,
    gadget_id = 70211121,
    pos = {
      x = 493.754,
      y = 100.003,
      z = 256.15
    },
    rot = {
      x = 0.0,
      y = 45.0,
      z = 0.0
    },
    level = 1,
    drop_tag = "\232\167\163\232\176\156\233\171\152\231\186\167\233\161\187\229\188\165",
    isOneoff = true,
    persistent = true
  }
}
regions = {
  {
    config_id = 3005,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 536.965,
      y = 113.533,
      z = 316.228
    }
  },
  {
    config_id = 3008,
    shape = RegionShape.SPHERE,
    radius = 8,
    pos = {
      x = 536.293,
      y = 115.259,
      z = 306.881
    }
  }
}
triggers = {
  {
    config_id = 1003003,
    name = "QUEST_FINISH_3003",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_3003",
    action = "action_EVENT_QUEST_FINISH_3003",
    trigger_count = 0
  },
  {
    config_id = 1003005,
    name = "ENTER_REGION_3005",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3005",
    action = "action_EVENT_ENTER_REGION_3005"
  },
  {
    config_id = 1003006,
    name = "QUEST_FINISH_3006",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_3006",
    action = "action_EVENT_QUEST_FINISH_3006"
  },
  {
    config_id = 1003007,
    name = "QUEST_FINISH_3007",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_3007",
    action = "action_EVENT_QUEST_FINISH_3007",
    trigger_count = 0
  },
  {
    config_id = 1003008,
    name = "ENTER_REGION_3008",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_3008",
    action = "action_EVENT_ENTER_REGION_3008"
  },
  {
    config_id = 1003009,
    name = "QUEST_START_3009",
    event = EventType.EVENT_QUEST_START,
    source = "1300212",
    condition = "condition_EVENT_QUEST_START_3009",
    action = "action_EVENT_QUEST_START_3009",
    trigger_count = 0
  },
  {
    config_id = 1003012,
    name = "QUEST_FINISH_3012",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_3012",
    action = "action_EVENT_QUEST_FINISH_3012"
  },
  {
    config_id = 1003017,
    name = "QUEST_FINISH_3017",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_3017",
    action = "action_EVENT_QUEST_FINISH_3017"
  },
  {
    config_id = 1003020,
    name = "QUEST_FINISH_3020",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_3020",
    action = "action_EVENT_QUEST_FINISH_3020"
  },
  {
    config_id = 1003028,
    name = "QUEST_FINISH_3028",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_3028",
    action = "action_EVENT_QUEST_FINISH_3028"
  },
  {
    config_id = 1003044,
    name = "QUEST_START_3044",
    event = EventType.EVENT_QUEST_START,
    source = "1300215",
    condition = "condition_EVENT_QUEST_START_3044",
    action = "action_EVENT_QUEST_START_3044",
    trigger_count = 0
  },
  {
    config_id = 1003051,
    name = "QUEST_FINISH_3051",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_3051",
    action = "action_EVENT_QUEST_FINISH_3051"
  },
  {
    config_id = 1003061,
    name = "QUEST_FINISH_3061",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_3061",
    action = "action_EVENT_QUEST_FINISH_3061"
  },
  {
    config_id = 1003070,
    name = "DUNGEON_SETTLE_3070",
    event = EventType.EVENT_DUNGEON_SETTLE,
    source = "",
    condition = "condition_EVENT_DUNGEON_SETTLE_3070",
    action = "action_EVENT_DUNGEON_SETTLE_3070"
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
    gadgets = {
      3001,
      3002,
      3004
    },
    regions = {3005},
    triggers = {
      "QUEST_FINISH_3003",
      "ENTER_REGION_3005",
      "QUEST_FINISH_3006",
      "QUEST_FINISH_3007",
      "QUEST_START_3009",
      "QUEST_FINISH_3012",
      "QUEST_FINISH_3017",
      "QUEST_FINISH_3020",
      "QUEST_FINISH_3028",
      "QUEST_START_3044",
      "QUEST_FINISH_3051",
      "QUEST_FINISH_3061",
      "DUNGEON_SETTLE_3070"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {3008},
    triggers = {
      "ENTER_REGION_3008"
    },
    rand_weight = 100
  }
}
function condition_EVENT_QUEST_FINISH_3003(context, evt)
  if 1300212 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_3003(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220149017, suite = 2}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  ScriptLib.RemoveExtraGroupSuite(context, 220149002, 3)
  return 0
end
function condition_EVENT_ENTER_REGION_3005(context, evt)
  if evt.param1 ~= 3005 then
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
function action_EVENT_ENTER_REGION_3005(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 201490101) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_FINISH_3006(context, evt)
  if 1300206 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_3006(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220149017, suite = 8}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_FINISH_3007(context, evt)
  if 1300215 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_3007(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_3008(context, evt)
  if evt.param1 ~= 3008 then
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
function action_EVENT_ENTER_REGION_3008(context, evt)
  ScriptLib.ActivateDungeonCheckPoint(context, 10)
  return 0
end
function condition_EVENT_QUEST_START_3009(context, evt)
  local curQuestState = ScriptLib.GetHostQuestState(context, 1300212)
  if -1 == curQuestState or 0 == curQuestState then
    return false
  end
  if curQuestState ~= 2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_START_3009(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_FINISH_3012(context, evt)
  if 1300207 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_3012(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220149017, suite = 10}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_FINISH_3017(context, evt)
  if 1300216 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_3017(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220149017, suite = 5}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_FINISH_3020(context, evt)
  if 1300205 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_3020(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220149017, suite = 6}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_FINISH_3028(context, evt)
  if 1300208 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_3028(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220149019, 19001) then
    if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220149017, suite = 22}) then
      ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
      return -1
    end
  elseif 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220149017, suite = 11}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220149004, 4005, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_START_3044(context, evt)
  local curQuestState = ScriptLib.GetHostQuestState(context, 1300215)
  if -1 == curQuestState or 0 == curQuestState then
    return false
  end
  if curQuestState ~= 2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_START_3044(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_FINISH_3051(context, evt)
  if 1300210 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_3051(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220149017, suite = 16}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220149003, 2)
  return 0
end
function condition_EVENT_QUEST_FINISH_3061(context, evt)
  if 1300211 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_3061(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220149017, suite = 19}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_DUNGEON_SETTLE_3070(context, evt)
  if 1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_DUNGEON_SETTLE_3070(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220149017, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 3034}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
