local base_info = {group_id = 247203012}
local defs = {
  gadget_1 = 12001,
  group_1 = 247203012,
  group_core = 247203001,
  challenge_father = 999,
  challenge1 = 120,
  MonsterCount = 6,
  challenge_kill = 233
}
monsters = {
  {
    config_id = 12006,
    monster_id = 25080201,
    pos = {
      x = 135.54,
      y = 194.727,
      z = 366.258
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 11,
    disableWander = true,
    affix = {1007},
    pose_id = 1
  },
  {
    config_id = 12007,
    monster_id = 26040102,
    pos = {
      x = 146.97,
      y = 194.592,
      z = 367.93
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 11,
    disableWander = true,
    affix = {1007}
  },
  {
    config_id = 12008,
    monster_id = 26040104,
    pos = {
      x = 147.119,
      y = 194.592,
      z = 362.259
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 11,
    disableWander = true,
    affix = {1007}
  },
  {
    config_id = 12010,
    monster_id = 25080101,
    pos = {
      x = 135.54,
      y = 194.727,
      z = 363.835
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 11,
    disableWander = true,
    affix = {1007},
    pose_id = 1
  },
  {
    config_id = 12011,
    monster_id = 25210303,
    pos = {
      x = 135.54,
      y = 194.727,
      z = 368.624
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 11,
    disableWander = true,
    affix = {1007}
  },
  {
    config_id = 12012,
    monster_id = 25210501,
    pos = {
      x = 135.54,
      y = 194.727,
      z = 361.532
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 11,
    disableWander = true,
    affix = {1007}
  }
}
npcs = {}
gadgets = {
  {
    config_id = 12001,
    gadget_id = 70360010,
    pos = {
      x = 141.34,
      y = 194.656,
      z = 365.008
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStop
  },
  {
    config_id = 12009,
    gadget_id = 70950009,
    pos = {
      x = 141.34,
      y = 194.656,
      z = 365.008
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
    config_id = 12002,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 25.0,
      z = 35.0
    },
    pos = {
      x = 170.064,
      y = 202.269,
      z = 365.008
    }
  }
}
triggers = {
  {
    config_id = 1012002,
    name = "ENTER_REGION_12002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_12002",
    action = "action_EVENT_ENTER_REGION_12002"
  },
  {
    config_id = 1012003,
    name = "SELECT_OPTION_12003",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_12003",
    action = "action_EVENT_SELECT_OPTION_12003",
    trigger_count = 0
  },
  {
    config_id = 1012004,
    name = "VARIABLE_CHANGE_12004",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_12004",
    action = "action_EVENT_VARIABLE_CHANGE_12004",
    trigger_count = 0
  },
  {
    config_id = 1012005,
    name = "ANY_MONSTER_DIE_12005",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "",
    action = "action_EVENT_ANY_MONSTER_DIE_12005",
    trigger_count = 0
  },
  {
    config_id = 1012013,
    name = "ANY_MONSTER_DIE_12013",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_12013",
    action = "action_EVENT_ANY_MONSTER_DIE_12013"
  }
}
variables = {
  {
    config_id = 1,
    name = "success",
    value = 0,
    no_refresh = false
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
    gadgets = {12001},
    regions = {12002},
    triggers = {
      "ENTER_REGION_12002",
      "SELECT_OPTION_12003",
      "VARIABLE_CHANGE_12004",
      "ANY_MONSTER_DIE_12005"
    },
    rand_weight = 100
  },
  {
    monsters = {
      12006,
      12010,
      12011,
      12012
    },
    gadgets = {12009},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_12013"
    },
    rand_weight = 100
  },
  {
    monsters = {12007, 12008},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_12002(context, evt)
  if evt.param1 ~= 12002 then
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
function action_EVENT_ENTER_REGION_12002(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, defs.gadget_1, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, defs.group_1, defs.gadget_1, {7}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_12003(context, evt)
  if 12001 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_12003(context, evt)
  ScriptLib.ExecuteGroupLua(context, defs.group_core, "SetKillMonsterTarget", {
    defs.group_1,
    defs.MonsterCount
  })
  ScriptLib.ExecuteGroupLua(context, defs.group_core, "StartSubChallengeKillMonster", {
    defs.challenge1,
    defs.challenge_kill
  })
  ScriptLib.AddExtraGroupSuite(context, 247203012, 2)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, defs.group_1, defs.gadget_1, 7) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, defs.gadget_1, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_12004(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "success") ~= 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "success", 247203001) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_12004(context, evt)
  if 0 ~= ScriptLib.ChangeGroupVariableValueByGroup(context, "success", 1, defs.group_core) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable_by_group")
    return -1
  end
  return 0
end
function action_EVENT_ANY_MONSTER_DIE_12005(context, evt)
  ScriptLib.ExecuteGroupLua(context, defs.group_core, "AddMistTrialChildChallengeScore", {1})
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_12013(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_12013(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 247203012, 3)
  return 0
end
