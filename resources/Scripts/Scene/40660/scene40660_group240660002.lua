local base_info = {group_id = 240660002}
monsters = {
  {
    config_id = 2004,
    monster_id = 20011001,
    pos = {
      x = 0.005,
      y = 9.202,
      z = -6.812
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 2005,
    monster_id = 20011201,
    pos = {
      x = 2.685,
      y = 9.202,
      z = -6.724
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 2006,
    monster_id = 20011201,
    pos = {
      x = -3.001,
      y = 9.202,
      z = -6.632
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 2007,
    monster_id = 20011001,
    pos = {
      x = 5.615,
      y = 9.202,
      z = -6.45
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 2008,
    monster_id = 20011001,
    pos = {
      x = -5.512,
      y = 9.202,
      z = -6.074
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true
  },
  {
    config_id = 2010,
    monster_id = 26090701,
    pos = {
      x = -5.658,
      y = 9.202,
      z = -8.99
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  },
  {
    config_id = 2011,
    monster_id = 26090701,
    pos = {
      x = 5.615,
      y = 9.202,
      z = -9.462
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101
  },
  {
    config_id = 2012,
    monster_id = 20010801,
    pos = {
      x = -3.062,
      y = 9.202,
      z = -9.85
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2013,
    monster_id = 20010801,
    pos = {
      x = 2.731,
      y = 9.202,
      z = -9.835
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2014,
    monster_id = 20010601,
    pos = {
      x = -0.038,
      y = 9.202,
      z = -9.905
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2016,
    monster_id = 20010801,
    pos = {
      x = 2.058,
      y = 9.202,
      z = -5.878
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 2017,
    monster_id = 20010801,
    pos = {
      x = -1.901,
      y = 9.202,
      z = -5.765
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  }
}
npcs = {}
gadgets = {
  {
    config_id = 2003,
    gadget_id = 70900205,
    pos = {
      x = -0.045,
      y = 5.089,
      z = 12.229
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
    config_id = 1002001,
    name = "CHALLENGE_SUCCESS_2001",
    event = EventType.EVENT_CHALLENGE_SUCCESS,
    source = "1",
    condition = "",
    action = "action_EVENT_CHALLENGE_SUCCESS_2001"
  },
  {
    config_id = 1002002,
    name = "CHALLENGE_FAIL_2002",
    event = EventType.EVENT_CHALLENGE_FAIL,
    source = "1",
    condition = "",
    action = "action_EVENT_CHALLENGE_FAIL_2002"
  },
  {
    config_id = 1002009,
    name = "ANY_MONSTER_LIVE_2009",
    event = EventType.EVENT_ANY_MONSTER_LIVE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_LIVE_2009",
    action = "action_EVENT_ANY_MONSTER_LIVE_2009"
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
    gadgets = {2003},
    regions = {},
    triggers = {
      "CHALLENGE_SUCCESS_2001",
      "CHALLENGE_FAIL_2002",
      "ANY_MONSTER_LIVE_2009"
    },
    rand_weight = 100
  }
}
function action_EVENT_CHALLENGE_SUCCESS_2001(context, evt)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 240660003, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function action_EVENT_CHALLENGE_FAIL_2002(context, evt)
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 240660001, 1001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 240660001, 1001, {7}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 240660003, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 240660002, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
function condition_EVENT_ANY_MONSTER_LIVE_2009(context, evt)
  if 2004 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_LIVE_2009(context, evt)
  if 0 ~= ScriptLib.ActiveChallenge(context, 1, 191, 300, 240660002, 12, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_challenge")
    return -1
  end
  return 0
end
