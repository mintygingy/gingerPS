local base_info = {group_id = 220151002}
local defs = {
  pointarray_ID = 1,
  elevatorOptionID = 24,
  gadget_elevatorID = 2008
}
defs.RotateTime = 5
defs.gadget_1 = 2001
defs.gadget_2 = 2002
defs.gadget_3 = 2003
defs.rotation_1 = 120
defs.rotation_2 = 0
defs.rotation_3 = 240
defs.boardControlList = {
  [2004] = {2003},
  [2005] = {2002},
  [2006] = {2001}
}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 2001,
    gadget_id = 70330302,
    pos = {
      x = -127.548,
      y = 5.872,
      z = 97.21
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 2002,
    gadget_id = 70330302,
    pos = {
      x = -138.438,
      y = 5.872,
      z = 97.188
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 2003,
    gadget_id = 70330302,
    pos = {
      x = -149.509,
      y = 5.872,
      z = 97.193
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 2004,
    gadget_id = 70330341,
    pos = {
      x = -149.509,
      y = 3.346,
      z = 83.248
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
    config_id = 2005,
    gadget_id = 70330341,
    pos = {
      x = -138.602,
      y = 5.149,
      z = 113.348
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
    config_id = 2006,
    gadget_id = 70330341,
    pos = {
      x = -128.089,
      y = 2.995,
      z = 83.248
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
    config_id = 2008,
    gadget_id = 70330303,
    pos = {
      x = -127.549,
      y = 5.872,
      z = 97.21
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 2009,
    gadget_id = 70330303,
    pos = {
      x = -138.438,
      y = 5.872,
      z = 97.188
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 2010,
    gadget_id = 70330303,
    pos = {
      x = -149.509,
      y = 5.872,
      z = 97.193
    },
    rot = {
      x = 0.0,
      y = 180.0,
      z = 0.0
    },
    level = 1,
    is_use_point_array = true
  },
  {
    config_id = 2011,
    gadget_id = 70330287,
    pos = {
      x = -138.663,
      y = -46.3,
      z = 73.021
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
    config_id = 1002007,
    name = "VARIABLE_CHANGE_2007",
    event = EventType.EVENT_VARIABLE_CHANGE,
    source = "",
    condition = "condition_EVENT_VARIABLE_CHANGE_2007",
    action = "action_EVENT_VARIABLE_CHANGE_2007"
  },
  {
    config_id = 1002012,
    name = "GADGET_STATE_CHANGE_2012",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_2012",
    action = "action_EVENT_GADGET_STATE_CHANGE_2012"
  },
  {
    config_id = 1002013,
    name = "SELECT_OPTION_2013",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_2013",
    action = "action_EVENT_SELECT_OPTION_2013",
    trigger_count = 0
  },
  {
    config_id = 1002014,
    name = "SELECT_OPTION_2014",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_2014",
    action = "action_EVENT_SELECT_OPTION_2014",
    trigger_count = 0
  },
  {
    config_id = 1002015,
    name = "SELECT_OPTION_2015",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_2015",
    action = "action_EVENT_SELECT_OPTION_2015",
    trigger_count = 0
  },
  {
    config_id = 1002016,
    name = "SELECT_OPTION_2016",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "condition_EVENT_SELECT_OPTION_2016",
    action = "action_EVENT_SELECT_OPTION_2016",
    trigger_count = 0
  }
}
variables = {}
garbages = {
  gadgets = {
    {
      config_id = 2017,
      gadget_id = 70330341,
      pos = {
        x = -138.602,
        y = 2.98,
        z = 83.248
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1,
      state = GadgetState.GearStop
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
      2001,
      2002,
      2003,
      2004,
      2005,
      2006,
      2008,
      2009,
      2010,
      2011
    },
    regions = {},
    triggers = {
      "VARIABLE_CHANGE_2007",
      "GADGET_STATE_CHANGE_2012",
      "SELECT_OPTION_2013",
      "SELECT_OPTION_2014",
      "SELECT_OPTION_2015",
      "SELECT_OPTION_2016"
    },
    rand_weight = 100
  }
}
function condition_EVENT_VARIABLE_CHANGE_2007(context, evt)
  if evt.param1 == evt.param2 then
    return false
  end
  if ScriptLib.GetGroupVariableValueByGroup(context, "success", 220151002) ~= 1 then
    return false
  end
  return true
end
function action_EVENT_VARIABLE_CHANGE_2007(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "success1", 1, 220151005) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.RemoveEntityByConfigId(context, 220151002, EntityType.GADGET, 2011) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : remove_gadget_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220151002, 2004, 493) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220151002, 2006, 493) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220151002, 2004, 492) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 0, 2006, 492) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 2004, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 2006, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_2012(context, evt)
  if 2004 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 or GadgetState.GearStop ~= evt.param3 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_2012(context, evt)
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220151002, 2004, {493}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220151002, 2006, {493}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_2013(context, evt)
  if 2004 ~= evt.param1 then
    return false
  end
  if 493 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_2013(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220151002, 2004, 493) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220151002, 2004, {492}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 2004, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_2014(context, evt)
  if 2004 ~= evt.param1 then
    return false
  end
  if 492 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_2014(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220151002, 2004, 492) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220151002, 2004, {493}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 2004, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_2015(context, evt)
  if 2006 ~= evt.param1 then
    return false
  end
  if 493 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_2015(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220151002, 2006, 493) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220151002, 2006, {492}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 2006, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_SELECT_OPTION_2016(context, evt)
  if 2006 ~= evt.param1 then
    return false
  end
  if 492 ~= evt.param2 then
    return false
  end
  return true
end
function action_EVENT_SELECT_OPTION_2016(context, evt)
  if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 220151002, 2006, 492) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
    return -1
  end
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220151002, 2006, {493}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 2006, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
require("V3_1/DesertRotObelisk_Auto")
