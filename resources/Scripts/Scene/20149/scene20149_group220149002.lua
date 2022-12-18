local base_info = {group_id = 220149002}
monsters = {
  {
    config_id = 2001,
    monster_id = 24020101,
    pos = {
      x = 473.247,
      y = 107.999,
      z = 195.754
    },
    rot = {
      x = 0.0,
      y = 150.0,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    pose_id = 100
  },
  {
    config_id = 2002,
    monster_id = 24020101,
    pos = {
      x = 466.849,
      y = 108.07,
      z = 189.161
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1,
    drop_id = 1000100,
    pose_id = 100
  }
}
npcs = {}
gadgets = {
  {
    config_id = 2004,
    gadget_id = 70290528,
    pos = {
      x = 467.31,
      y = 113.6,
      z = 208.26
    },
    rot = {
      x = 2.725,
      y = 156.488,
      z = 354.235
    },
    level = 1
  },
  {
    config_id = 2006,
    gadget_id = 70900201,
    pos = {
      x = 465.225,
      y = 105.173,
      z = 221.183
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2008,
    gadget_id = 70900201,
    pos = {
      x = 493.334,
      y = 101.358,
      z = 258.341
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
    config_id = 2007,
    shape = RegionShape.CUBIC,
    size = {
      x = 15.0,
      y = 10.0,
      z = 10.0
    },
    pos = {
      x = 465.225,
      y = 107.339,
      z = 221.183
    }
  }
}
triggers = {
  {
    config_id = 1002003,
    name = "ANY_MONSTER_DIE_2003",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_2003",
    action = "action_EVENT_ANY_MONSTER_DIE_2003"
  },
  {
    config_id = 1002007,
    name = "ENTER_REGION_2007",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_2007",
    action = "action_EVENT_ENTER_REGION_2007"
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
    monsters = {2001, 2002},
    gadgets = {2004},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_2003"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {2006},
    regions = {2007},
    triggers = {
      "ENTER_REGION_2007"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {2008},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_DIE_2003(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_2003(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "1333020301") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 2004, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  if 0 ~= ScriptLib.AddQuestProgress(context, "1300203") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220149002, 2)
  return 0
end
function condition_EVENT_ENTER_REGION_2007(context, evt)
  if evt.param1 ~= 2007 then
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
function action_EVENT_ENTER_REGION_2007(context, evt)
  ScriptLib.RemoveExtraGroupSuite(context, 220149002, 2)
  ScriptLib.AddExtraGroupSuite(context, 220149002, 3)
  return 0
end
