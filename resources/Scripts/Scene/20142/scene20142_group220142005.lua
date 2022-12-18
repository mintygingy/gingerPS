local base_info = {group_id = 220142005}
local defs = {
  fireMachineList = {5001},
  initConfig = {
    [5001] = 1
  },
  controlRelation = {},
  selectID_horizon = 613,
  selectID_vertical = 612,
  horizon_steps = {
    [5006] = {
      0,
      102,
      103,
      104
    },
    [5008] = {
      0,
      102,
      103,
      104
    },
    [5013] = {
      0,
      102,
      103,
      104
    }
  },
  vertical_steps = {
    [5006] = {
      0,
      302,
      303,
      304
    },
    [5008] = {
      0,
      302,
      303,
      304
    },
    [5013] = {
      0,
      302,
      303,
      304
    }
  },
  init_state = {},
  levelTagGroupID = 7,
  switchByLevelTag = 1,
  switchByLevelTag_suites = {
    ["2_8_Kazuha_04"] = {1, 2},
    ["2_8_Kazuha_01"] = {1},
    ["2_8_Kazuha_02"] = {1, 2},
    ["2_8_Kazuha_03"] = {1, 2},
    ["2_8_Kazuha_05"] = {1, 2},
    ["2_8_Kazuha_06"] = {1, 2},
    ["2_8_Kazuha_07"] = {1, 2}
  },
  saved_gadget = {
    5003,
    5005,
    5001
  },
  spec_gadget = {5005}
}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 5001,
    gadget_id = 70310158,
    pos = {
      x = 67.355,
      y = 1.076,
      z = 92.498
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart
  },
  {
    config_id = 5003,
    gadget_id = 70211001,
    pos = {
      x = 71.607,
      y = 0.688,
      z = 100.009
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 16,
    drop_tag = "\230\136\152\230\150\151\228\189\142\231\186\167\231\190\164\229\178\155",
    state = GadgetState.ChestLocked,
    isOneoff = true,
    persistent = true,
    autopick = true
  },
  {
    config_id = 5004,
    gadget_id = 70310188,
    pos = {
      x = 57.521,
      y = 1.951,
      z = 92.482
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 5005,
    gadget_id = 70310164,
    pos = {
      x = 57.521,
      y = 1.459,
      z = 92.482
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.ChestLocked,
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 5006,
    gadget_id = 70310159,
    pos = {
      x = 61.282,
      y = 1.387,
      z = 92.482
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {613}
    }
  },
  {
    config_id = 5008,
    gadget_id = 70310159,
    pos = {
      x = 61.282,
      y = 1.314,
      z = 106.952
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {613}
    }
  },
  {
    config_id = 5011,
    gadget_id = 70310188,
    pos = {
      x = 71.675,
      y = 1.009,
      z = 100.047
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    state = GadgetState.GearStart,
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 5013,
    gadget_id = 70310159,
    pos = {
      x = 65.53,
      y = 1.346,
      z = 106.876
    },
    rot = {
      x = 0.0,
      y = 141.396,
      z = 0.0
    },
    level = 1,
    persistent = true
  }
}
regions = {
  {
    config_id = 5002,
    shape = RegionShape.CUBIC,
    size = {
      x = 15.0,
      y = 10.0,
      z = 8.0
    },
    pos = {
      x = 63.235,
      y = 0.538,
      z = 107.968
    }
  },
  {
    config_id = 5007,
    shape = RegionShape.CUBIC,
    size = {
      x = 15.0,
      y = 10.0,
      z = 8.0
    },
    pos = {
      x = 65.502,
      y = 0.538,
      z = 92.591
    }
  },
  {
    config_id = 5009,
    shape = RegionShape.CUBIC,
    size = {
      x = 25.0,
      y = 10.0,
      z = 20.0
    },
    pos = {
      x = 87.047,
      y = 4.668,
      z = 50.065
    }
  }
}
triggers = {
  {
    config_id = 1005002,
    name = "ENTER_REGION_5002",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "",
    action = "action_EVENT_ENTER_REGION_5002",
    trigger_count = 0
  },
  {
    config_id = 1005007,
    name = "ENTER_REGION_5007",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "",
    action = "action_EVENT_ENTER_REGION_5007"
  },
  {
    config_id = 1005009,
    name = "ENTER_REGION_5009",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "",
    action = "action_EVENT_ENTER_REGION_5009",
    trigger_count = 0
  },
  {
    config_id = 1005014,
    name = "ANY_GADGET_DIE_5014",
    event = EventType.EVENT_ANY_GADGET_DIE,
    source = "",
    condition = "condition_EVENT_ANY_GADGET_DIE_5014",
    action = "action_EVENT_ANY_GADGET_DIE_5014"
  },
  {
    config_id = 1005015,
    name = "ANY_GADGET_DIE_5015",
    event = EventType.EVENT_ANY_GADGET_DIE,
    source = "",
    condition = "condition_EVENT_ANY_GADGET_DIE_5015",
    action = "action_EVENT_ANY_GADGET_DIE_5015"
  }
}
variables = {
  {
    config_id = 2,
    name = "show",
    value = 0,
    no_refresh = true
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
      5004,
      5005,
      5006,
      5008,
      5013
    },
    regions = {
      5002,
      5007,
      5009
    },
    triggers = {
      "ENTER_REGION_5002",
      "ENTER_REGION_5007",
      "ENTER_REGION_5009",
      "ANY_GADGET_DIE_5015"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {5003, 5011},
    regions = {},
    triggers = {
      "ANY_GADGET_DIE_5014"
    },
    rand_weight = 100
  }
}
function action_EVENT_ENTER_REGION_5002(context, evt)
  if evt.param1 == 5002 and ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) == 1 and ScriptLib.TryRecordActivityPushTips(context, 2014002) == 0 then
    ScriptLib.ShowClientTutorial(context, 1178, {})
  end
  return 0
end
function action_EVENT_ENTER_REGION_5007(context, evt)
  if evt.param1 == 5007 and ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) == 1 and ScriptLib.TryRecordActivityPushTips(context, 2014002) == 0 then
    ScriptLib.ShowClientTutorial(context, 1178, {})
  end
  return 0
end
function action_EVENT_ENTER_REGION_5009(context, evt)
  if evt.param1 == 5009 and ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) == 1 and ScriptLib.TryRecordActivityPushTips(context, 2014002) == 0 then
    ScriptLib.ShowClientTutorial(context, 1178, {})
  end
  return 0
end
function condition_EVENT_ANY_GADGET_DIE_5014(context, evt)
  if 5011 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_GADGET_DIE_5014(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5003, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_GADGET_DIE_5015(context, evt)
  if 5004 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_GADGET_DIE_5015(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 5005, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
require("V2_8/FireMachineColorHandle")
require("V2_8/DreamLandSuiteState_Spec")
