local base_info = {group_id = 220140023}
monsters = {
  {
    config_id = 23003,
    monster_id = 25080401,
    pos = {
      x = 69.876,
      y = 106.97,
      z = 902.085
    },
    rot = {
      x = 0.0,
      y = 174.999,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 1
  },
  {
    config_id = 23004,
    monster_id = 25080401,
    pos = {
      x = 75.242,
      y = 106.97,
      z = 902.317
    },
    rot = {
      x = 0.0,
      y = 174.999,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 1
  },
  {
    config_id = 23005,
    monster_id = 25050301,
    pos = {
      x = 65.595,
      y = 106.98,
      z = 904.721
    },
    rot = {
      x = 0.0,
      y = 182.476,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  {
    config_id = 23008,
    monster_id = 25050301,
    pos = {
      x = 79.764,
      y = 106.98,
      z = 904.418
    },
    rot = {
      x = 0.0,
      y = 174.121,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  {
    config_id = 23010,
    monster_id = 25050401,
    pos = {
      x = 70.36,
      y = 106.97,
      z = 889.085
    },
    rot = {
      x = 0.0,
      y = 180.207,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  {
    config_id = 23012,
    monster_id = 25050301,
    pos = {
      x = 67.02,
      y = 106.97,
      z = 892.492
    },
    rot = {
      x = 0.0,
      y = 177.524,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  {
    config_id = 23013,
    monster_id = 25050301,
    pos = {
      x = 79.373,
      y = 106.97,
      z = 892.736
    },
    rot = {
      x = 0.0,
      y = 191.54,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  {
    config_id = 23020,
    monster_id = 25050401,
    pos = {
      x = 76.256,
      y = 106.986,
      z = 889.448
    },
    rot = {
      x = 0.0,
      y = 169.537,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true
  },
  {
    config_id = 23027,
    monster_id = 25080401,
    pos = {
      x = 78.837,
      y = 106.995,
      z = 877.886
    },
    rot = {
      x = 0.0,
      y = 170.442,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 1
  },
  {
    config_id = 23028,
    monster_id = 25080401,
    pos = {
      x = 66.917,
      y = 106.995,
      z = 877.806
    },
    rot = {
      x = 0.0,
      y = 159.848,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    disableWander = true,
    pose_id = 1
  }
}
npcs = {}
gadgets = {
  {
    config_id = 23002,
    gadget_id = 70360001,
    pos = {
      x = 73.903,
      y = 106.97,
      z = 888.972
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 23014,
    gadget_id = 70211012,
    pos = {
      x = 76.157,
      y = 107.09,
      z = 921.019
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 16,
    drop_tag = "\230\136\152\230\150\151\228\184\173\231\186\167\231\190\164\229\178\155",
    state = GadgetState.ChestLocked,
    isOneoff = true,
    persistent = true
  }
}
regions = {
  {
    config_id = 23001,
    shape = RegionShape.SPHERE,
    radius = 30,
    pos = {
      x = 72.845,
      y = 106.97,
      z = 889.43
    }
  },
  {
    config_id = 23007,
    shape = RegionShape.SPHERE,
    radius = 5,
    pos = {
      x = 72.845,
      y = 106.97,
      z = 921.216
    }
  }
}
triggers = {
  {
    config_id = 1023001,
    name = "ENTER_REGION_23001",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "",
    action = "action_EVENT_ENTER_REGION_23001",
    trigger_count = 0
  },
  {
    config_id = 1023006,
    name = "QUEST_START_23006",
    event = EventType.EVENT_QUEST_START,
    source = "4006711",
    condition = "condition_EVENT_QUEST_START_23006",
    action = "action_EVENT_QUEST_START_23006",
    trigger_count = 0
  },
  {
    config_id = 1023007,
    name = "ENTER_REGION_23007",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_23007",
    action = "action_EVENT_ENTER_REGION_23007",
    trigger_count = 0
  },
  {
    config_id = 1023009,
    name = "ANY_MONSTER_DIE_23009",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_23009",
    action = "action_EVENT_ANY_MONSTER_DIE_23009",
    trigger_count = 0
  },
  {
    config_id = 1023011,
    name = "GROUP_LOAD_23011",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_23011",
    trigger_count = 0
  },
  {
    config_id = 1023015,
    name = "GROUP_LOAD_23015",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_23015",
    action = "action_EVENT_GROUP_LOAD_23015",
    trigger_count = 0
  },
  {
    config_id = 1023016,
    name = "ANY_MONSTER_DIE_23016",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_23016",
    action = "action_EVENT_ANY_MONSTER_DIE_23016",
    trigger_count = 0
  },
  {
    config_id = 1023029,
    name = "ANY_MONSTER_DIE_23029",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_23029",
    action = "action_EVENT_ANY_MONSTER_DIE_23029"
  }
}
variables = {
  {
    config_id = 1,
    name = "temp",
    value = 0,
    no_refresh = true
  },
  {
    config_id = 2,
    name = "load",
    value = 1,
    no_refresh = true
  }
}
garbages = {
  monsters = {
    {
      config_id = 23019,
      monster_id = 25050301,
      pos = {
        x = 85.507,
        y = 107.0,
        z = 895.283
      },
      rot = {
        x = 0.0,
        y = 269.887,
        z = 0.0
      },
      level = 1,
      disableWander = true
    },
    {
      config_id = 23021,
      monster_id = 25050301,
      pos = {
        x = 85.696,
        y = 106.836,
        z = 889.988
      },
      rot = {
        x = 0.0,
        y = 269.887,
        z = 0.0
      },
      level = 1,
      disableWander = true
    }
  },
  triggers = {
    {
      config_id = 1023024,
      name = "ANY_MONSTER_DIE_23024",
      event = EventType.EVENT_ANY_MONSTER_DIE,
      source = "",
      condition = "condition_EVENT_ANY_MONSTER_DIE_23024",
      action = "action_EVENT_ANY_MONSTER_DIE_23024"
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
    gadgets = {23002, 23014},
    regions = {23001, 23007},
    triggers = {
      "ENTER_REGION_23001",
      "QUEST_START_23006",
      "ENTER_REGION_23007",
      "GROUP_LOAD_23011",
      "GROUP_LOAD_23015"
    },
    rand_weight = 100
  },
  {
    monsters = {23027, 23028},
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_23009"
    },
    rand_weight = 100
  },
  {
    monsters = {
      23010,
      23012,
      23013,
      23020
    },
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_23016"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {
      23003,
      23004,
      23005,
      23008
    },
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_23029"
    },
    rand_weight = 100
  }
}
function action_EVENT_ENTER_REGION_23001(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "load") == 1 and (ScriptLib.GetGroupVariableValue(context, "temp") == 0 or ScriptLib.GetGroupVariableValue(context, "temp") == 1 or ScriptLib.GetGroupVariableValue(context, "temp") == 2) then
    ScriptLib.SetGroupVariableValue(context, "temp", 0)
    ScriptLib.SetGroupVariableValue(context, "load", 0)
    ScriptLib.AddExtraGroupSuite(context, 0, 2)
    ScriptLib.ShowReminder(context, 60010370)
  end
  return 0
end
function condition_EVENT_QUEST_START_23006(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "temp") ~= 3 then
    return false
  end
  return true
end
function action_EVENT_QUEST_START_23006(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "4006711") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_23007(context, evt)
  if evt.param1 ~= 23007 then
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
function action_EVENT_ENTER_REGION_23007(context, evt)
  ScriptLib.ActivateDungeonCheckPoint(context, 12)
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_23009(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "temp") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_23009(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "temp", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220140023, 3)
  return 0
end
function action_EVENT_GROUP_LOAD_23011(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "load", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220140023, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_23015(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "temp") ~= 3 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_23015(context, evt)
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220140023, 23014, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.AddQuestProgress(context, "4006711") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_23016(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "temp") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_23016(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "temp", 2) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220140023, 5)
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_23029(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "temp") ~= 2 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_23029(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "temp", 3) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 23014, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.AddQuestProgress(context, "4006711") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  return 0
end
