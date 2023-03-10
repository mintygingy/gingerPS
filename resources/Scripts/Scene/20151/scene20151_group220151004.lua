local base_info = {group_id = 220151004}
local defs = {
  elevatorOptionID = 491,
  gadget_elevatorID = 4001,
  finalMovePoints = {
    1,
    2,
    3,
    4,
    5,
    6
  }
}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 4001,
    gadget_id = 70330316,
    pos = {
      x = -30.294,
      y = -13.607,
      z = 72.795
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
    config_id = 4002,
    gadget_id = 70330341,
    pos = {
      x = -35.203,
      y = -18.551,
      z = 85.918
    },
    rot = {
      x = 270.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {491}
    }
  },
  {
    config_id = 4007,
    gadget_id = 70900201,
    pos = {
      x = -30.3,
      y = 0.701,
      z = 72.737
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
    config_id = 4005,
    shape = RegionShape.CUBIC,
    size = {
      x = 60.0,
      y = 20.0,
      z = 35.0
    },
    pos = {
      x = -29.293,
      y = 0.729,
      z = 61.595
    }
  },
  {
    config_id = 4008,
    shape = RegionShape.CUBIC,
    size = {
      x = 3.0,
      y = 8.0,
      z = 3.0
    },
    pos = {
      x = -30.434,
      y = 0.701,
      z = 72.783
    }
  }
}
triggers = {
  {
    config_id = 1004004,
    name = "VARIABLE_CHANGE_4004",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "success1",
    condition = "condition_EVENT_VARIABLE_CHANGE_4004",
    action = "action_EVENT_VARIABLE_CHANGE_4004",
    trigger_count = 0
  },
  {
    config_id = 1004005,
    name = "ENTER_REGION_4005",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_4005",
    action = "action_EVENT_ENTER_REGION_4005"
  },
  {
    config_id = 1004008,
    name = "ENTER_REGION_4008",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_4008",
    action = "action_EVENT_ENTER_REGION_4008"
  },
  {
    config_id = 1004009,
    name = "GADGET_STATE_CHANGE_4009",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_4009",
    action = "action_EVENT_GADGET_STATE_CHANGE_4009",
    trigger_count = 0
  },
  {
    config_id = 1004010,
    name = "GADGET_STATE_CHANGE_4010",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_4010",
    action = "action_EVENT_GADGET_STATE_CHANGE_4010",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "pointarray_ID",
    value = 3,
    no_refresh = false
  },
  {
    config_id = 2,
    name = "CurMovePoint",
    value = 1,
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
  }
}
garbages = {
  regions = {
    {
      config_id = 4003,
      shape = RegionShape.CUBIC,
      size = {
        x = 15.0,
        y = 15.0,
        z = 30.0
      },
      pos = {
        x = -29.661,
        y = -9.766,
        z = 72.032
      }
    },
    {
      config_id = 4006,
      shape = RegionShape.SPHERE,
      radius = 5,
      pos = {
        x = -40.884,
        y = 0.671,
        z = 74.174
      }
    }
  },
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
      config_id = 1004006,
      name = "ENTER_REGION_4006",
      event = EventType.EVENT_ENTER_REGION,
      source = "",
      condition = "",
      action = "action_EVENT_ENTER_REGION_4006"
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
    gadgets = {4001, 4002},
    regions = {},
    triggers = {
      "VARIABLE_CHANGE_4004",
      "GADGET_STATE_CHANGE_4009",
      "GADGET_STATE_CHANGE_4010"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {4007},
    regions = {4005, 4008},
    triggers = {
      "ENTER_REGION_4005",
      "ENTER_REGION_4008"
    },
    rand_weight = 100
  }
}
function condition_EVENT_VARIABLE_CHANGE_4004(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "success1", 220151004) ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_4004(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220151004, 2)
  return 0
end
function condition_EVENT_ENTER_REGION_4005(context, evt)
  if evt.param1 ~= 4005 then
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
function action_EVENT_ENTER_REGION_4005(context, evt)
  SetElevator(context, 4, 1)
  ScriptLib.BeginCameraSceneLookWithTemplate(context, 3, {
    look_configid = 0,
    look_pos = {
      x = -30,
      y = 3,
      z = 73
    },
    follow_type = 2,
    follow_pos = {
      x = -40,
      y = 15,
      z = 80
    },
    is_broadcast = false,
    delay = 0
  })
  return 0
end
function condition_EVENT_ENTER_REGION_4008(context, evt)
  if evt.param1 ~= 4008 then
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
function action_EVENT_ENTER_REGION_4008(context, evt)
  if 0 ~= ScriptLib.KillEntityByConfigId(context, {config_id = 4007}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : kill_entity_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_4009(context, evt)
  if 4001 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_4009(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 4002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_4010(context, evt)
  if 4001 ~= evt.param2 or GadgetState.Default ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_4010(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 4002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
require("V3_1/DeshretElevator")
