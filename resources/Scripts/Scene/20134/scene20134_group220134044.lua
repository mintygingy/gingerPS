local base_info = {group_id = 220134044}
local defs = {
  max_gear = 4,
  timer = 10,
  group_id = 220134044,
  gadget_1 = 44001,
  gadget_2 = 44002,
  gadget_3 = 44003,
  gadget_4 = 44005,
  gadget_chest = 44004
}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 44001,
    gadget_id = 70900049,
    pos = {
      x = 637.014,
      y = 605.919,
      z = -1480.199
    },
    rot = {
      x = 0.0,
      y = 330.8,
      z = 0.0
    },
    level = 1,
    state = GadgetState.Action01,
    persistent = true
  },
  {
    config_id = 44002,
    gadget_id = 70310237,
    pos = {
      x = 648.116,
      y = 606.021,
      z = -1479.693
    },
    rot = {
      x = 0.0,
      y = 329.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.Action01,
    persistent = true
  },
  {
    config_id = 44003,
    gadget_id = 70310237,
    pos = {
      x = 644.214,
      y = 605.979,
      z = -1474.918
    },
    rot = {
      x = 0.0,
      y = 59.1,
      z = 0.0
    },
    level = 1,
    state = GadgetState.Action01,
    persistent = true
  },
  {
    config_id = 44004,
    gadget_id = 70211111,
    pos = {
      x = 640.358,
      y = 605.852,
      z = -1480.732
    },
    rot = {
      x = 0.0,
      y = 330.5,
      z = 0.0
    },
    level = 16,
    drop_tag = "\232\167\163\232\176\156\228\184\173\231\186\167\231\190\164\229\178\155",
    showcutscene = true,
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 44005,
    gadget_id = 70310236,
    pos = {
      x = 643.909,
      y = 605.852,
      z = -1483.342
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.Action01,
    persistent = true
  },
  {
    config_id = 44007,
    gadget_id = 70380306,
    pos = {
      x = 640.486,
      y = 606.037,
      z = -1479.938
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
    config_id = 44009,
    gadget_id = 70310300,
    pos = {
      x = 648.116,
      y = 606.021,
      z = -1479.693
    },
    rot = {
      x = 0.0,
      y = 329.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.Action01,
    persistent = true
  },
  {
    config_id = 44010,
    gadget_id = 70310300,
    pos = {
      x = 644.214,
      y = 605.979,
      z = -1474.918
    },
    rot = {
      x = 0.0,
      y = 59.1,
      z = 0.0
    },
    level = 1,
    state = GadgetState.Action01,
    persistent = true
  },
  {
    config_id = 44011,
    gadget_id = 70310301,
    pos = {
      x = 643.909,
      y = 605.852,
      z = -1483.342
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.Action01,
    persistent = true
  },
  {
    config_id = 44016,
    gadget_id = 70310396,
    pos = {
      x = 637.014,
      y = 605.919,
      z = -1480.199
    },
    rot = {
      x = 0.0,
      y = 330.8,
      z = 0.0
    },
    level = 1,
    state = GadgetState.Action01,
    persistent = true
  }
}
regions = {
  {
    config_id = 44014,
    shape = RegionShape.SPHERE,
    radius = 15,
    pos = {
      x = 645.02,
      y = 605.852,
      z = -1480.3
    }
  },
  {
    config_id = 44015,
    shape = RegionShape.SPHERE,
    radius = 15,
    pos = {
      x = 645.02,
      y = 605.852,
      z = -1480.3
    }
  }
}
triggers = {
  {
    config_id = 1044006,
    name = "GADGET_STATE_CHANGE_44006",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_44006",
    action = "action_EVENT_GADGET_STATE_CHANGE_44006",
    trigger_count = 0
  },
  {
    config_id = 1044008,
    name = "GADGET_STATE_CHANGE_44008",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_44008",
    action = "action_EVENT_GADGET_STATE_CHANGE_44008",
    trigger_count = 0
  },
  {
    config_id = 1044012,
    name = "GADGET_STATE_CHANGE_44012",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_44012",
    action = "action_EVENT_GADGET_STATE_CHANGE_44012",
    trigger_count = 0
  },
  {
    config_id = 1044013,
    name = "GADGET_STATE_CHANGE_44013",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_44013",
    action = "action_EVENT_GADGET_STATE_CHANGE_44013",
    trigger_count = 0
  },
  {
    config_id = 1044014,
    name = "ENTER_REGION_44014",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_44014",
    action = "action_EVENT_ENTER_REGION_44014",
    trigger_count = 0
  },
  {
    config_id = 1044015,
    name = "LEAVE_REGION_44015",
    event = EventType.EVENT_LEAVE_REGION,
    source = "",
    condition = "condition_EVENT_LEAVE_REGION_44015",
    action = "action_EVENT_LEAVE_REGION_44015",
    trigger_count = 0
  },
  {
    config_id = 1044017,
    name = "GADGET_STATE_CHANGE_44017",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_44017",
    action = "action_EVENT_GADGET_STATE_CHANGE_44017",
    trigger_count = 0
  },
  {
    config_id = 1044018,
    name = "GROUP_LOAD_44018",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_44018",
    action = "action_EVENT_GROUP_LOAD_44018",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "active_count",
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
      44001,
      44002,
      44003,
      44005,
      44009,
      44010,
      44011,
      44016
    },
    regions = {44014, 44015},
    triggers = {
      "GADGET_STATE_CHANGE_44006",
      "GADGET_STATE_CHANGE_44008",
      "GADGET_STATE_CHANGE_44012",
      "GADGET_STATE_CHANGE_44013",
      "ENTER_REGION_44014",
      "LEAVE_REGION_44015",
      "GADGET_STATE_CHANGE_44017",
      "GROUP_LOAD_44018"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_44006(context, evt)
  if GadgetState.Action02 ~= ScriptLib.GetGadgetStateByConfigId(context, 220134044, 44001) then
    return false
  end
  if GadgetState.Action02 ~= ScriptLib.GetGadgetStateByConfigId(context, 220134044, 44011) then
    return false
  end
  if GadgetState.Action02 ~= ScriptLib.GetGadgetStateByConfigId(context, 220134044, 44009) then
    return false
  end
  if GadgetState.Action02 ~= ScriptLib.GetGadgetStateByConfigId(context, 220134044, 44010) then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_44006(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 44004}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_44008(context, evt)
  if GadgetState.Action02 ~= ScriptLib.GetGadgetStateByConfigId(context, 220134044, 44011) then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_44008(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 44005, GadgetState.Action02) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_44012(context, evt)
  if GadgetState.Action02 ~= ScriptLib.GetGadgetStateByConfigId(context, 220134044, 44009) then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_44012(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 44002, GadgetState.Action02) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_44013(context, evt)
  if GadgetState.Action02 ~= ScriptLib.GetGadgetStateByConfigId(context, 220134044, 44010) then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_44013(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 44003, GadgetState.Action02) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ENTER_REGION_44014(context, evt)
  if evt.param1 ~= 44014 then
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
function action_EVENT_ENTER_REGION_44014(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 44007, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220134006, 6012, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220134007, 7002, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220134043, 43008, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function condition_EVENT_LEAVE_REGION_44015(context, evt)
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 1 then
    return false
  end
  return true
end
function action_EVENT_LEAVE_REGION_44015(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 44007, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_44017(context, evt)
  if GadgetState.Action02 ~= ScriptLib.GetGadgetStateByConfigId(context, 220134044, 44001) then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_44017(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 44007}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220134049, 49002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function condition_EVENT_GROUP_LOAD_44018(context, evt)
  if GadgetState.Action02 ~= ScriptLib.GetGadgetStateByConfigId(context, 220134044, 44001) then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_44018(context, evt)
  if 0 ~= ScriptLib.CreateGadget(context, {config_id = 44007}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : create_gadget")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220134049, 49002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
