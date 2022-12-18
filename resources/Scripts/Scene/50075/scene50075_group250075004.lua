local base_info = {group_id = 250075004}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 4001,
    gadget_id = 70290487,
    pos = {
      x = 461.758,
      y = 13.478,
      z = 491.686
    },
    rot = {
      x = 0.0,
      y = 10.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 4002,
    gadget_id = 70290487,
    pos = {
      x = 472.874,
      y = 31.969,
      z = 476.835
    },
    rot = {
      x = 0.0,
      y = 334.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 4003,
    gadget_id = 70290487,
    pos = {
      x = 457.699,
      y = 19.158,
      z = 563.866
    },
    rot = {
      x = 0.0,
      y = 35.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1004004,
    name = "GADGET_CREATE_4004",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_4004",
    action = "action_EVENT_GADGET_CREATE_4004"
  },
  {
    config_id = 1004005,
    name = "GADGET_CREATE_4005",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "condition_EVENT_GADGET_CREATE_4005",
    action = "action_EVENT_GADGET_CREATE_4005"
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
      4001,
      4002,
      4003
    },
    regions = {},
    triggers = {
      "GADGET_CREATE_4004",
      "GADGET_CREATE_4005"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_CREATE_4004(context, evt)
  if 4002 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_4004(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 4002, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_CREATE_4005(context, evt)
  if 4003 ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_CREATE_4005(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 4003, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
