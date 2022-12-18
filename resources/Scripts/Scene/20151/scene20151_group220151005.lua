local base_info = {group_id = 220151005}
local defs = {
  elevatorOptionID = 491,
  gadget_elevatorID = 5001,
  finalMovePoints = {
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8
  }
}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 5001,
    gadget_id = 70330316,
    pos = {
      x = -138.626,
      y = -46.118,
      z = 73.02
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true,
    server_global_value_config = {SGV_ShineEffect = 0}
  },
  {
    config_id = 5002,
    gadget_id = 70330341,
    pos = {
      x = -138.586,
      y = -45.21,
      z = 83.691
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {491}
    }
  },
  {
    config_id = 5004,
    gadget_id = 70330459,
    pos = {
      x = -142.126,
      y = -8.291,
      z = 80.89
    },
    rot = {
      x = 90.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {491}
    }
  },
  {
    config_id = 5007,
    gadget_id = 70900201,
    pos = {
      x = -138.238,
      y = 3.136,
      z = 70.649
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 5013,
    gadget_id = 70330424,
    pos = {
      x = -226.091,
      y = -85.628,
      z = 73.427
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 180.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  {
    config_id = 5014,
    gadget_id = 70330424,
    pos = {
      x = -226.091,
      y = -85.6,
      z = 73.427
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  {
    config_id = 5015,
    gadget_id = 70330424,
    pos = {
      x = -204.069,
      y = -84.4,
      z = 155.272
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  {
    config_id = 5016,
    gadget_id = 70330424,
    pos = {
      x = -204.069,
      y = -84.444,
      z = 155.272
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 180.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  {
    config_id = 5021,
    gadget_id = 70330317,
    pos = {
      x = -138.574,
      y = 2.784,
      z = 73.035
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
    config_id = 5008,
    shape = RegionShape.CUBIC,
    size = {
      x = 12.0,
      y = 5.0,
      z = 12.0
    },
    pos = {
      x = -139.199,
      y = 3.02,
      z = 72.832
    }
  },
  {
    config_id = 5009,
    shape = RegionShape.CUBIC,
    size = {
      x = 9.0,
      y = 10.0,
      z = 4.0
    },
    pos = {
      x = -141.87,
      y = -9.718,
      z = 81.657
    }
  },
  {
    config_id = 5010,
    shape = RegionShape.CUBIC,
    size = {
      x = 25.0,
      y = 20.0,
      z = 35.0
    },
    pos = {
      x = -138.332,
      y = -9.718,
      z = 96.451
    }
  }
}
triggers = {
  {
    config_id = 1005003,
    name = "VARIABLE_CHANGE_5003",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "success1",
    condition = "condition_EVENT_VARIABLE_CHANGE_5003",
    action = "action_EVENT_VARIABLE_CHANGE_5003",
    trigger_count = 0
  },
  {
    config_id = 1005005,
    name = "PLATFORM_ARRIVAL_5005",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_5005",
    action = "action_EVENT_PLATFORM_ARRIVAL_5005"
  },
  {
    config_id = 1005006,
    name = "VARIABLE_CHANGE_5006",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "CurMovePoint",
    condition = "condition_EVENT_VARIABLE_CHANGE_5006",
    action = "action_EVENT_VARIABLE_CHANGE_5006",
    trigger_count = 0
  },
  {
    config_id = 1005008,
    name = "ENTER_REGION_5008",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_5008",
    action = "action_EVENT_ENTER_REGION_5008"
  },
  {
    config_id = 1005009,
    name = "ENTER_REGION_5009",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_5009",
    action = "action_EVENT_ENTER_REGION_5009",
    trigger_count = 0
  },
  {
    config_id = 1005010,
    name = "LEAVE_REGION_5010",
    event = EventType.EVENT_LEAVE_REGION,
    source = "",
    condition = "condition_EVENT_LEAVE_REGION_5010",
    action = "action_EVENT_LEAVE_REGION_5010",
    trigger_count = 0
  },
  {
    config_id = 1005011,
    name = "PLATFORM_ARRIVAL_5011",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_5011",
    action = "action_EVENT_PLATFORM_ARRIVAL_5011"
  },
  {
    config_id = 1005012,
    name = "PLATFORM_ARRIVAL_5012",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_5012",
    action = "action_EVENT_PLATFORM_ARRIVAL_5012"
  },
  {
    config_id = 1005017,
    name = "PLATFORM_ARRIVAL_5017",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_5017",
    action = "action_EVENT_PLATFORM_ARRIVAL_5017"
  },
  {
    config_id = 1005018,
    name = "PLATFORM_ARRIVAL_5018",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_5018",
    action = "action_EVENT_PLATFORM_ARRIVAL_5018"
  },
  {
    config_id = 1005019,
    name = "GADGET_STATE_CHANGE_5019",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_5019",
    action = "action_EVENT_GADGET_STATE_CHANGE_5019",
    trigger_count = 0
  },
  {
    config_id = 1005020,
    name = "GADGET_CREATE_5020",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_5020",
    action = "action_EVENT_GADGET_CREATE_5020",
    trigger_count = 0
  },
  {
    config_id = 1005022,
    name = "PLATFORM_ARRIVAL_5022",
    event = EventType.EVENT_PLATFORM_ARRIVAL,
    source = "",
    condition = "condition_EVENT_PLATFORM_ARRIVAL_5022",
    action = "action_EVENT_PLATFORM_ARRIVAL_5022"
  },
  {
    config_id = 1005023,
    name = "GADGET_STATE_CHANGE_5023",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_5023",
    action = "action_EVENT_GADGET_STATE_CHANGE_5023",
    trigger_count = 0
  },
  {
    config_id = 1005024,
    name = "GADGET_STATE_CHANGE_5024",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_5024",
    action = "action_EVENT_GADGET_STATE_CHANGE_5024",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "pointarray_ID",
    value = 5,
    no_refresh = false
  },
  {
    config_id = 2,
    name = "CurMovePoint",
    value = 2,
    no_refresh = false
  },
  {
    config_id = 3,
    name = "MovePoint1",
    value = 1,
    no_refresh = false
  },
  {
    config_id = 4,
    name = "MovePoint2",
    value = 2,
    no_refresh = false
  },
  {
    config_id = 5,
    name = "IsBlockMoveMode",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 6,
    name = "success1",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 7,
    name = "IsFinalMove",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 9,
    name = "IsReminder",
    value = 0,
    no_refresh = false
  },
  {
    config_id = 10,
    name = "IsInL2",
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
    gadgets = {
      5001,
      5002,
      5004,
      5013,
      5014,
      5015,
      5016
    },
    regions = {5009, 5010},
    triggers = {
      "VARIABLE_CHANGE_5003",
      "PLATFORM_ARRIVAL_5005",
      "VARIABLE_CHANGE_5006",
      "ENTER_REGION_5009",
      "LEAVE_REGION_5010",
      "PLATFORM_ARRIVAL_5011",
      "PLATFORM_ARRIVAL_5012",
      "PLATFORM_ARRIVAL_5017",
      "PLATFORM_ARRIVAL_5018",
      "GADGET_STATE_CHANGE_5019",
      "GADGET_CREATE_5020",
      "GADGET_STATE_CHANGE_5023",
      "GADGET_STATE_CHANGE_5024"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {5007},
    regions = {5008},
    triggers = {
      "ENTER_REGION_5008"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {5021},
    regions = {},
    triggers = {
      "PLATFORM_ARRIVAL_5022"
    },
    rand_weight = 100
  }
}
function condition_EVENT_VARIABLE_CHANGE_5003(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "success1", 220151005) ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_5003(context, evt)
  SetElevator_finalMove(context, 6, 1)
  ScriptLib.SetGroupVariableValue(context, "IsBlockMoveMode", 1)
  ScriptLib.BeginCameraSceneLookWithTemplate(context, 3, {
    look_configid = 0,
    look_pos = {
      x = -143,
      y = 6,
      z = 77
    },
    follow_type = 2,
    follow_pos = {
      x = -125,
      y = 18,
      z = 61
    },
    is_broadcast = false,
    delay = 0
  })
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_5005(context, evt)
  if 5001 ~= evt.param1 then
    return false
  end
  if 6 ~= evt.param2 then
    return false
  end
  if 8 ~= evt.param3 then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "IsArrive_Flower", 220151010) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_5005(context, evt)
  ScriptLib.TransPlayerToPos(context, {
    uid_list = ScriptLib.GetSceneUidList(context),
    pos = {
      x = 679.7,
      y = 58,
      z = 424.5
    },
    radius = 2,
    rot = {
      x = 0,
      y = 315,
      z = 0
    },
    is_skip_ui = false
  })
  return 0
end
function condition_EVENT_VARIABLE_CHANGE_5006(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "IsReminder") ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "CurMovePoint") ~= 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "IsInL2") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_5006(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220151005, 2)
  if 0 ~= ScriptLib.ChangeGroupVariableValue(context, "IsReminder", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : change_GroupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_5008(context, evt)
  if evt.param1 ~= 5008 then
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
function action_EVENT_ENTER_REGION_5008(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 5007}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_5009(context, evt)
  if evt.param1 ~= 5009 then
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
function action_EVENT_ENTER_REGION_5009(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "IsInL2", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_LEAVE_REGION_5010(context, evt)
  if ScriptLib.GetGroupVariableValue(context, "IsInL2") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_LEAVE_REGION_5010(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "IsInL2", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_5011(context, evt)
  if 5001 ~= evt.param1 then
    return false
  end
  if 6 ~= evt.param2 then
    return false
  end
  if 3 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_5011(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5013, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5014, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_5012(context, evt)
  if 5001 ~= evt.param1 then
    return false
  end
  if 6 ~= evt.param2 then
    return false
  end
  if 5 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_5012(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5015, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5016, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220151005, EntityType.GADGET, 5013) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220151005, EntityType.GADGET, 5014) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_5017(context, evt)
  if 5001 ~= evt.param1 then
    return false
  end
  if 6 ~= evt.param2 then
    return false
  end
  if 1 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_5017(context, evt)
  ScriptLib.SetEntityServerGlobalValueByConfigId(context, 5001, "SGV_ShineEffect", 1)
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_5018(context, evt)
  if 5001 ~= evt.param1 then
    return false
  end
  if 6 ~= evt.param2 then
    return false
  end
  if 2 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_5018(context, evt)
  if 0 ~= ScriptLib.ShowReminder(context, 1000090000) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_5019(context, evt)
  if 5001 ~= evt.param2 or GadgetState.GearAction1 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_5019(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "IsFinalMove_check", 1, 220151015) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_5020(context, evt)
  if 5001 ~= evt.param1 then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "success", 220151002) ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_5020(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220151005, 3)
  SetElevator_finalMove(context, 6, 1)
  ScriptLib.SetGroupVariableValue(context, "IsBlockMoveMode", 1)
  return 0
end
function condition_EVENT_PLATFORM_ARRIVAL_5022(context, evt)
  if 5001 ~= evt.param1 then
    return false
  end
  if 6 ~= evt.param2 then
    return false
  end
  if 1 ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_PLATFORM_ARRIVAL_5022(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5021, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_5023(context, evt)
  if 5001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_5023(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5004, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_5024(context, evt)
  if 5001 ~= evt.param2 or GadgetState.Default ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_5024(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5004, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
require("V3_1/DeshretElevator")
