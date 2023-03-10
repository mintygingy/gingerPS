local base_info = {group_id = 220151009}
monsters = {
  {
    config_id = 9001,
    monster_id = 26120301,
    pos = {
      x = -131.718,
      y = 2.98,
      z = 69.493
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    pose_id = 101
  },
  {
    config_id = 9002,
    monster_id = 26120301,
    pos = {
      x = -145.535,
      y = 2.98,
      z = 77.782
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    pose_id = 101
  },
  {
    config_id = 9014,
    monster_id = 26120101,
    pos = {
      x = -131.712,
      y = 2.98,
      z = 77.782
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    pose_id = 201
  },
  {
    config_id = 9015,
    monster_id = 26120101,
    pos = {
      x = -144.951,
      y = 2.98,
      z = 69.493
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    pose_id = 201
  }
}
npcs = {}
gadgets = {
  {
    config_id = 9003,
    gadget_id = 70330452,
    pos = {
      x = -150.578,
      y = 5.493,
      z = 96.325
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 9006,
    gadget_id = 70330417,
    pos = {
      x = -118.845,
      y = 4.929,
      z = 73.015
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 9009,
    gadget_id = 70330452,
    pos = {
      x = -137.328,
      y = 5.493,
      z = 96.185
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 9010,
    gadget_id = 70330452,
    pos = {
      x = -126.019,
      y = 5.493,
      z = 95.826
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  },
  {
    config_id = 9016,
    gadget_id = 70310016,
    pos = {
      x = -136.776,
      y = 2.552,
      z = 75.057
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 9017,
    gadget_id = 70310016,
    pos = {
      x = -140.616,
      y = 2.552,
      z = 75.057
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 9018,
    gadget_id = 70310016,
    pos = {
      x = -136.689,
      y = 2.552,
      z = 70.907
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 9019,
    gadget_id = 70310016,
    pos = {
      x = -140.501,
      y = 2.552,
      z = 70.907
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 9020,
    gadget_id = 70900201,
    pos = {
      x = -149.458,
      y = 4.016,
      z = 83.3
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 9021,
    gadget_id = 70900201,
    pos = {
      x = -128.034,
      y = 3.712,
      z = 83.258
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
    config_id = 9004,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 10.0,
      z = 10.0
    },
    pos = {
      x = -138.688,
      y = 7.72,
      z = 72.593
    }
  },
  {
    config_id = 9022,
    shape = RegionShape.SPHERE,
    radius = 3,
    pos = {
      x = -149.478,
      y = 3.656,
      z = 83.242
    }
  },
  {
    config_id = 9023,
    shape = RegionShape.SPHERE,
    radius = 3,
    pos = {
      x = -128.207,
      y = 3.304,
      z = 83.23
    }
  },
  {
    config_id = 9024,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 10.0,
      z = 10.0
    },
    pos = {
      x = -138.688,
      y = -5.152,
      z = 73.086
    }
  }
}
triggers = {
  {
    config_id = 1009004,
    name = "LEAVE_REGION_9004",
    event = EventType.EVENT_LEAVE_REGION,
    source = "",
    condition = "condition_EVENT_LEAVE_REGION_9004",
    action = "action_EVENT_LEAVE_REGION_9004"
  },
  {
    config_id = 1009005,
    name = "ANY_MONSTER_DIE_9005",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_9005",
    action = "action_EVENT_ANY_MONSTER_DIE_9005"
  },
  {
    config_id = 1009022,
    name = "ENTER_REGION_9022",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_9022",
    action = "action_EVENT_ENTER_REGION_9022"
  },
  {
    config_id = 1009023,
    name = "ENTER_REGION_9023",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_9023",
    action = "action_EVENT_ENTER_REGION_9023"
  },
  {
    config_id = 1009024,
    name = "ENTER_REGION_9024",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_9024",
    action = "action_EVENT_ENTER_REGION_9024",
    trigger_count = 0
  },
  {
    config_id = 1009025,
    name = "VARIABLE_CHANGE_9025",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_9025",
    action = "action_EVENT_VARIABLE_CHANGE_9025"
  }
}
variables = {}
garbages = {
  gadgets = {
    {
      config_id = 9007,
      gadget_id = 70330317,
      pos = {
        x = -138.54,
        y = -45.053,
        z = 73.414
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1
    },
    {
      config_id = 9008,
      gadget_id = 70330317,
      pos = {
        x = -138.761,
        y = -9.858,
        z = 74.072
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1
    },
    {
      config_id = 9011,
      gadget_id = 70330452,
      pos = {
        x = -151.021,
        y = 5.393,
        z = 27.44
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1
    },
    {
      config_id = 9012,
      gadget_id = 70330452,
      pos = {
        x = -137.31,
        y = 5.393,
        z = 26.956
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1
    },
    {
      config_id = 9013,
      gadget_id = 70330452,
      pos = {
        x = -126.005,
        y = 5.393,
        z = 27.577
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1
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
    gadgets = {
      9003,
      9006,
      9009,
      9010
    },
    regions = {9004},
    triggers = {
      "LEAVE_REGION_9004"
    },
    rand_weight = 100
  },
  {
    monsters = {
      9001,
      9002,
      9014,
      9015
    },
    gadgets = {
      9016,
      9017,
      9018,
      9019
    },
    regions = {9024},
    triggers = {
      "ANY_MONSTER_DIE_9005",
      "ENTER_REGION_9024"
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
    monsters = {},
    gadgets = {9020, 9021},
    regions = {9022, 9023},
    triggers = {
      "ENTER_REGION_9022",
      "ENTER_REGION_9023",
      "VARIABLE_CHANGE_9025"
    },
    rand_weight = 100
  }
}
function condition_EVENT_LEAVE_REGION_9004(context, evt)
  if ScriptLib.GetGroupMonsterCountByGroupId(context, 220151009) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_LEAVE_REGION_9004(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220151009, 2)
  return 0
end
function condition_EVENT_ANY_MONSTER_DIE_9005(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_9005(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220151009, 4)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 9003, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 9009, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 9010, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220151002, 2004, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220151002, 2005, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220151002, 2006, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  local pos = {
    x = -138.5,
    y = 6,
    z = 97
  }
  local pos_follow = {
    x = 0,
    y = 0,
    z = 0
  }
  if 0 ~= ScriptLib.BeginCameraSceneLook(context, {
    look_pos = pos,
    is_allow_input = false,
    duration = 3,
    is_force = true,
    is_broadcast = false,
    is_recover_keep_current = true,
    delay = 0,
    is_set_follow_pos = false,
    follow_pos = pos_follow,
    is_force_walk = false,
    is_change_play_mode = false,
    is_set_screen_XY = false,
    screen_x = 0,
    screen_y = 0
  }) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_cameraLook_Begin")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220151009, EntityType.GADGET, 9016) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220151009, EntityType.GADGET, 9017) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220151009, EntityType.GADGET, 9018) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220151009, EntityType.GADGET, 9019) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_9022(context, evt)
  if evt.param1 ~= 9022 then
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
function action_EVENT_ENTER_REGION_9022(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 9020}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_9023(context, evt)
  if evt.param1 ~= 9023 then
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
function action_EVENT_ENTER_REGION_9023(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 9021}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_9024(context, evt)
  if evt.param1 ~= 9024 then
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
function action_EVENT_ENTER_REGION_9024(context, evt)
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220151009, EntityType.GADGET, 9016) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220151009, EntityType.GADGET, 9017) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220151009, EntityType.GADGET, 9018) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220151009, EntityType.GADGET, 9019) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_9025(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "success", 220151002) ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_9025(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 9020}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 9021}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
