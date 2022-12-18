local base_info = {group_id = 220151010}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 10001,
    gadget_id = 70290196,
    pos = {
      x = 619.185,
      y = 60.966,
      z = 462.675
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 10002,
    gadget_id = 70330365,
    pos = {
      x = 679.577,
      y = 55.302,
      z = 424.791
    },
    rot = {
      x = 0.0,
      y = 315.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 10004,
    gadget_id = 70330433,
    pos = {
      x = -248.14,
      y = -60.15,
      z = 142.72
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  {
    config_id = 10009,
    shape = RegionShape.CUBIC,
    size = {
      x = 100.0,
      y = 8.0,
      z = 28.0
    },
    pos = {
      x = -176.136,
      y = -105.0,
      z = 74.294
    }
  },
  {
    config_id = 10010,
    shape = RegionShape.CUBIC,
    size = {
      x = 28.0,
      y = 8.0,
      z = 100.0
    },
    pos = {
      x = -203.12,
      y = -105.0,
      z = 108.464
    }
  },
  {
    config_id = 10011,
    shape = RegionShape.SPHERE,
    radius = 15,
    pos = {
      x = 679.697,
      y = 56.61,
      z = 425.014
    }
  }
}
triggers = {
  {
    config_id = 1010009,
    name = "ENTER_REGION_10009",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_10009",
    action = "action_EVENT_ENTER_REGION_10009",
    trigger_count = 0
  },
  {
    config_id = 1010010,
    name = "ENTER_REGION_10010",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_10010",
    action = "action_EVENT_ENTER_REGION_10010",
    trigger_count = 0
  },
  {
    config_id = 1010011,
    name = "ENTER_REGION_10011",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "condition_EVENT_ENTER_REGION_10011",
    action = "action_EVENT_ENTER_REGION_10011"
  }
}
variables = {
  {
    config_id = 1,
    name = "IsArrive_Flower",
    value = 0,
    no_refresh = false
  }
}
garbages = {
  gadgets = {
    {
      config_id = 10003,
      gadget_id = 70290196,
      pos = {
        x = 618.831,
        y = 60.829,
        z = 462.276
      },
      rot = {
        x = 0.0,
        y = 0.0,
        z = 0.0
      },
      level = 1
    },
    {
      config_id = 10006,
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
      config_id = 10008,
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
      config_id = 10013,
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
      config_id = 10014,
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
    }
  },
  regions = {
    {
      config_id = 10005,
      shape = RegionShape.SPHERE,
      radius = 15,
      pos = {
        x = -191.227,
        y = -87.861,
        z = 72.833
      }
    },
    {
      config_id = 10007,
      shape = RegionShape.SPHERE,
      radius = 15,
      pos = {
        x = -204.412,
        y = -88.156,
        z = 125.954
      }
    }
  },
  triggers = {
    {
      config_id = 1010005,
      name = "ENTER_REGION_10005",
      event = EventType.EVENT_ENTER_REGION,
      source = "",
      condition = "condition_EVENT_ENTER_REGION_10005",
      action = "action_EVENT_ENTER_REGION_10005"
    },
    {
      config_id = 1010007,
      name = "ENTER_REGION_10007",
      event = EventType.EVENT_ENTER_REGION,
      source = "",
      condition = "condition_EVENT_ENTER_REGION_10007",
      action = "action_EVENT_ENTER_REGION_10007"
    },
    {
      config_id = 1010012,
      name = "QUEST_FINISH_10012",
      event = EventType.EVENT_QUEST_FINISH,
      source = "",
      condition = "condition_EVENT_QUEST_FINISH_10012",
      action = "action_EVENT_QUEST_FINISH_10012"
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
      10001,
      10002,
      10004
    },
    regions = {
      10009,
      10010,
      10011
    },
    triggers = {
      "ENTER_REGION_10009",
      "ENTER_REGION_10010",
      "ENTER_REGION_10011"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ENTER_REGION_10009(context, evt)
  if evt.param1 ~= 10009 then
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
function action_EVENT_ENTER_REGION_10009(context, evt)
  ScriptLib.TransPlayerToPos(context, {
    uid_list = ScriptLib.GetSceneUidList(context),
    pos = {
      x = 675.8,
      y = 58,
      z = 427.5
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
function condition_EVENT_ENTER_REGION_10010(context, evt)
  if evt.param1 ~= 10010 then
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
function action_EVENT_ENTER_REGION_10010(context, evt)
  ScriptLib.TransPlayerToPos(context, {
    uid_list = ScriptLib.GetSceneUidList(context),
    pos = {
      x = 675.8,
      y = 58,
      z = 427.5
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
function condition_EVENT_ENTER_REGION_10011(context, evt)
  if evt.param1 ~= 10011 then
    return false
  end
  if ScriptLib.GetRegionEntityCount(context, {
    region_eid = evt.source_eid,
    entity_type = EntityType.AVATAR
  }) < 0 then
    return false
  end
  return true
end
function action_EVENT_ENTER_REGION_10011(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "IsArrive_Flower", 1, 220151010) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  return 0
end
