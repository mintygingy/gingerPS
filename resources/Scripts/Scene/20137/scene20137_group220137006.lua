local base_info = {group_id = 220137006}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 6001,
    gadget_id = 70310251,
    pos = {
      x = 544.169,
      y = 48.74,
      z = -242.822
    },
    rot = {
      x = 0.0,
      y = 222.358,
      z = 0.0
    },
    level = 1,
    persistent = true,
    arguments = {3}
  },
  {
    config_id = 6002,
    gadget_id = 70310354,
    pos = {
      x = 568.133,
      y = 47.764,
      z = -218.784
    },
    rot = {
      x = 0.0,
      y = 45.036,
      z = 0.0
    },
    level = 1,
    persistent = true
  }
}
regions = {
  {
    config_id = 6006,
    shape = RegionShape.SPHERE,
    radius = 4,
    pos = {
      x = 544.169,
      y = 48.84,
      z = -242.822
    }
  }
}
triggers = {
  {
    config_id = 1006003,
    name = "OBSERVATION_POINT_NOTIFY_6003",
    event = EventType.EVENT_OBSERVATION_POINT_NOTIFY,
    source = "",
    condition = "",
    action = "action_EVENT_OBSERVATION_POINT_NOTIFY_6003",
    trigger_count = 0
  },
  {
    config_id = 1006004,
    name = "GADGET_STATE_CHANGE_6004",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_6004",
    action = "action_EVENT_GADGET_STATE_CHANGE_6004",
    trigger_count = 0
  },
  {
    config_id = 1006005,
    name = "OBSERVATION_POINT_NOTIFY_6005",
    event = EventType.EVENT_OBSERVATION_POINT_NOTIFY,
    source = "",
    condition = "",
    action = "action_EVENT_OBSERVATION_POINT_NOTIFY_6005",
    trigger_count = 0
  },
  {
    config_id = 1006006,
    name = "ENTER_REGION_6006",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "",
    action = "action_EVENT_ENTER_REGION_6006"
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
    gadgets = {6001, 6002},
    regions = {6006},
    triggers = {
      "OBSERVATION_POINT_NOTIFY_6003",
      "GADGET_STATE_CHANGE_6004",
      "OBSERVATION_POINT_NOTIFY_6005",
      "ENTER_REGION_6006"
    },
    rand_weight = 100
  }
}
function action_EVENT_OBSERVATION_POINT_NOTIFY_6003(context, evt)
  if 6001 == evt.param1 and 405 == evt.param2 then
    ScriptLib.SetGadgetStateByConfigId(context, 6002, GadgetState.GearStart)
    ScriptLib.AddQuestProgress(context, "4007104")
    ScriptLib.SetGadgetStateByConfigId(context, 6001, 405)
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_6004(context, evt)
  if 6002 ~= evt.param2 or GadgetState.GearStart ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_6004(context, evt)
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2802, 1, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
function action_EVENT_OBSERVATION_POINT_NOTIFY_6005(context, evt)
  if 6001 == evt.param1 and 0 == evt.param2 then
    ScriptLib.SetGadgetStateByConfigId(context, 6002, GadgetState.Default)
    ScriptLib.SetGadgetStateByConfigId(context, 6001, GadgetState.Default)
  end
  return 0
end
function action_EVENT_ENTER_REGION_6006(context, evt)
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) == 1 then
    ScriptLib.TryRecordActivityPushTips(context, 2014013)
    ScriptLib.ShowClientTutorial(context, 1188, {})
  end
  return 0
end
