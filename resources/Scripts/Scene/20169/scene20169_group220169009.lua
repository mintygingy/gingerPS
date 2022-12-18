local base_info = {group_id = 220169009}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 9001,
    gadget_id = 70360287,
    pos = {
      x = 10.692,
      y = 65.721,
      z = -81.953
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 9002,
    gadget_id = 70360287,
    pos = {
      x = 10.85,
      y = 71.0,
      z = -76.619
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 9009,
    gadget_id = 70360288,
    pos = {
      x = 15.941,
      y = 71.104,
      z = -84.107
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 9010,
    gadget_id = 70360170,
    pos = {
      x = 20.131,
      y = 67.23,
      z = -82.407
    },
    rot = {
      x = 270.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 9013,
    gadget_id = 70360288,
    pos = {
      x = 13.46,
      y = 76.989,
      z = -69.929
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 9014,
    gadget_id = 70360170,
    pos = {
      x = 10.689,
      y = 72.571,
      z = -66.146
    },
    rot = {
      x = 270.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 9017,
    gadget_id = 70211101,
    pos = {
      x = 23.188,
      y = 65.301,
      z = -74.004
    },
    rot = {
      x = 0.0,
      y = 315.0,
      z = 0.0
    },
    level = 1,
    drop_tag = "\232\167\163\232\176\156\228\189\142\231\186\167\233\161\187\229\188\165",
    isOneoff = true,
    persistent = true
  }
}
regions = {
  {
    config_id = 9007,
    shape = RegionShape.CUBIC,
    size = {
      x = 8.0,
      y = 8.0,
      z = 8.0
    },
    pos = {
      x = 10.692,
      y = 65.992,
      z = -87.525
    }
  },
  {
    config_id = 9008,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 8.0,
      z = 6.0
    },
    pos = {
      x = 10.692,
      y = 71.902,
      z = -74.252
    }
  },
  {
    config_id = 9018,
    shape = RegionShape.CUBIC,
    size = {
      x = 10.0,
      y = 8.0,
      z = 8.0
    },
    pos = {
      x = 10.692,
      y = 71.724,
      z = -85.567
    }
  },
  {
    config_id = 9019,
    shape = RegionShape.CUBIC,
    size = {
      x = 9.0,
      y = 8.0,
      z = 8.0
    },
    pos = {
      x = 10.692,
      y = 65.921,
      z = -74.431
    }
  }
}
triggers = {
  {
    config_id = 1009003,
    name = "GADGET_CREATE_9003",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_9003",
    action = "action_EVENT_GADGET_CREATE_9003"
  },
  {
    config_id = 1009004,
    name = "GADGET_CREATE_9004",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_9004",
    action = "action_EVENT_GADGET_CREATE_9004"
  },
  {
    config_id = 1009005,
    name = "SELECT_OPTION_9005",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_9005",
    action = "action_EVENT_SELECT_OPTION_9005"
  },
  {
    config_id = 1009006,
    name = "SELECT_OPTION_9006",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_9006",
    action = "action_EVENT_SELECT_OPTION_9006"
  },
  {
    config_id = 1009007,
    name = "ENTER_REGION_9007",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_9007",
    action = "action_EVENT_ENTER_REGION_9007",
    trigger_count = 0
  },
  {
    config_id = 1009008,
    name = "ENTER_REGION_9008",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_9008",
    action = "action_EVENT_ENTER_REGION_9008",
    trigger_count = 0
  },
  {
    config_id = 1009011,
    name = "GADGET_CREATE_9011",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_9011",
    action = "action_EVENT_GADGET_CREATE_9011"
  },
  {
    config_id = 1009012,
    name = "SELECT_OPTION_9012",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_9012",
    action = "action_EVENT_SELECT_OPTION_9012"
  },
  {
    config_id = 1009015,
    name = "GADGET_CREATE_9015",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_9015",
    action = "action_EVENT_GADGET_CREATE_9015"
  },
  {
    config_id = 1009016,
    name = "SELECT_OPTION_9016",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_9016",
    action = "action_EVENT_SELECT_OPTION_9016"
  },
  {
    config_id = 1009018,
    name = "ENTER_REGION_9018",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_9018",
    action = "action_EVENT_ENTER_REGION_9018",
    trigger_count = 0
  },
  {
    config_id = 1009019,
    name = "ENTER_REGION_9019",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_9019",
    action = "action_EVENT_ENTER_REGION_9019",
    trigger_count = 0
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
      9001,
      9002,
      9009,
      9010,
      9017
    },
    regions = {
      9007,
      9008,
      9018,
      9019
    },
    triggers = {
      "ENTER_REGION_9007",
      "ENTER_REGION_9008",
      "GADGET_CREATE_9011",
      "SELECT_OPTION_9012",
      "ENTER_REGION_9018",
      "ENTER_REGION_9019"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_9003(context, evt)
  if 9001 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_9003(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptions(context, {1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_work_options")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_9004(context, evt)
  if 9002 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_9004(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptions(context, {1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_work_options")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_9005(context, evt)
  if 9001 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_9005(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 9001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220169009, 9001, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_9006(context, evt)
  if 9002 ~= evt.param1 then
    return false
  end
  if 1 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_9006(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 9002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220169009, 9002, 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_9007(context, evt)
  if evt.param1 ~= 9007 then
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
function action_EVENT_ENTER_REGION_9007(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 9001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_9008(context, evt)
  if evt.param1 ~= 9008 then
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
function action_EVENT_ENTER_REGION_9008(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 9002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_9011(context, evt)
  if 9010 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_9011(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptions(context, {7}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_work_options")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_9012(context, evt)
  if 9010 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_9012(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 9010, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 9009, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220169009, 9010, 7) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_9015(context, evt)
  if 9014 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_9015(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptions(context, {7}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_work_options")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_9016(context, evt)
  if 9014 ~= evt.param1 then
    return false
  end
  if 7 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_9016(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 9014, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 9013, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220169009, 9014, 7) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_9018(context, evt)
  if evt.param1 ~= 9018 then
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
function action_EVENT_ENTER_REGION_9018(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 9002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_9019(context, evt)
  if evt.param1 ~= 9019 then
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
function action_EVENT_ENTER_REGION_9019(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 9001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
