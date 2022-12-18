local base_info = {group_id = 220157003}
monsters = {
  {
    config_id = 3001,
    monster_id = 25210307,
    pos = {
      x = 90.308,
      y = 188.33,
      z = 282.582
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {1008},
    title_id = 10135,
    special_name_id = 10186
  },
  {
    config_id = 3004,
    monster_id = 25110202,
    pos = {
      x = 86.641,
      y = 188.303,
      z = 286.278
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    pose_id = 101
  },
  {
    config_id = 3005,
    monster_id = 25110102,
    pos = {
      x = 86.838,
      y = 188.303,
      z = 279.079
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    pose_id = 1
  }
}
npcs = {}
gadgets = {
  {
    config_id = 3006,
    gadget_id = 70330453,
    pos = {
      x = 119.295,
      y = 189.022,
      z = 282.657
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3008,
    gadget_id = 70310043,
    pos = {
      x = 90.271,
      y = 188.33,
      z = 282.591
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1003002,
    name = "QUEST_FINISH_3002",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_3002",
    action = "action_EVENT_QUEST_FINISH_3002"
  },
  {
    config_id = 1003003,
    name = "ANY_MONSTER_DIE_3003",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_3003",
    action = "action_EVENT_ANY_MONSTER_DIE_3003"
  },
  {
    config_id = 1003007,
    name = "QUEST_FINISH_3007",
    event = EventType.EVENT_QUEST_FINISH,
    source = "",
    condition = "condition_EVENT_QUEST_FINISH_3007",
    action = "action_EVENT_QUEST_FINISH_3007"
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
    gadgets = {3006},
    regions = {},
    triggers = {
      "QUEST_FINISH_3002",
      "ANY_MONSTER_DIE_3003",
      "QUEST_FINISH_3007"
    },
    rand_weight = 100
  },
  {
    monsters = {
      3001,
      3004,
      3005
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {3008},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_QUEST_FINISH_3002(context, evt)
  if 1301113 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_3002(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220157003, 2)
  ScriptLib.AddExtraGroupSuite(context, 220157003, 3)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220157006, suite = 11}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  ScriptLib.ActivateDungeonCheckPoint(context, 1)
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_3003(context, evt)
  if evt.param1 ~= 3001 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_3003(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "1301119") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  if 0 ~= ScriptLib.KillGroupEntity(context, {
    group_id = 220157003,
    kill_policy = GroupKillPolicy.GROUP_KILL_MONSTER
  }) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_monster_by_group")
    return -1
  end
  ScriptLib.RemoveExtraGroupSuite(context, 220157003, 3)
  return 0
end
function condition_EVENT_QUEST_FINISH_3007(context, evt)
  if 1301112 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_QUEST_FINISH_3007(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 3006, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220157006, suite = 10}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
