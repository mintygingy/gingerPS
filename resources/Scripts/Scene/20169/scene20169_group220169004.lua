local base_info = {group_id = 220169004}
monsters = {
  {
    config_id = 4001,
    monster_id = 23050101,
    pos = {
      x = 0.233,
      y = -2.544,
      z = 50.043
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 4002,
    monster_id = 23020101,
    pos = {
      x = 0.233,
      y = -2.544,
      z = 54.987
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  }
}
npcs = {}
gadgets = {
  {
    config_id = 4006,
    gadget_id = 70290833,
    pos = {
      x = 6.046,
      y = -2.045,
      z = 52.463
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  {
    config_id = 4003,
    shape = RegionShape.CUBIC,
    size = {
      x = 4.0,
      y = 6.0,
      z = 3.0
    },
    pos = {
      x = 6.046,
      y = -2.045,
      z = 52.463
    }
  }
}
triggers = {
  {
    config_id = 1004003,
    name = "ENTER_REGION_4003",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_4003",
    action = "action_EVENT_ENTER_REGION_4003"
  },
  {
    config_id = 1004004,
    name = "QUEST_FINISH_4004",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_4004",
    action = "action_EVENT_QUEST_FINISH_4004"
  },
  {
    config_id = 1004005,
    name = "ANY_MONSTER_DIE_4005",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_4005",
    action = "action_EVENT_ANY_MONSTER_DIE_4005"
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
      "QUEST_FINISH_4004"
    },
    rand_weight = 100
  },
  {
    monsters = {4001, 4002},
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_4005"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {4006},
    regions = {4003},
    triggers = {
      "ENTER_REGION_4003"
    },
    rand_weight = 100
  }
}
function TLA_add_groupsuite(context, evt, group_id, suite_id)
  ScriptLib.AddExtraGroupSuite(context, group_id, suite_id)
  return 0
end
function TLA_set_gadget_state_by_configid(context, evt, config_id, state)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, config_id, state) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_4003(context, evt)
  if evt.param1 ~= 4003 then
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
function action_EVENT_ENTER_REGION_4003(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "30312101") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_QUEST_FINISH_4004(context, evt)
  if 303105 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_4004(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220169004, 2)
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220169003, 3001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220169013, suite = 6}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_4005(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_4005(context, evt)
  TLA_add_groupsuite(context, evt, 220169004, 3)
  ScriptLib.AddQuestProgress(context, "30312001")
  TLA_set_gadget_state_by_configid(context, evt, 4006, GadgetState.GearStart)
  return 0
end
