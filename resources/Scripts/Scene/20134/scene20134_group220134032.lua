local base_info = {group_id = 220134032}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 32001,
    gadget_id = 70210102,
    pos = {
      x = 503.791,
      y = 614.452,
      z = -1599.739
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 16,
    chest_drop_id = 1050198,
    drop_count = 1,
    isOneoff = true,
    persistent = true,
    autopick = true
  },
  {
    config_id = 32002,
    gadget_id = 70210102,
    pos = {
      x = 509.149,
      y = 613.578,
      z = -1591.219
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 16,
    chest_drop_id = 1050199,
    drop_count = 1,
    isOneoff = true,
    persistent = true,
    autopick = true
  },
  {
    config_id = 32003,
    gadget_id = 70210102,
    pos = {
      x = 491.155,
      y = 612.254,
      z = -1585.436
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 16,
    chest_drop_id = 1050202,
    drop_count = 1,
    isOneoff = true,
    persistent = true,
    autopick = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1032004,
    name = "GADGET_STATE_CHANGE_32004",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_32004",
    action = "action_EVENT_GADGET_STATE_CHANGE_32004"
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
      32001,
      32002,
      32003
    },
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_32004"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_32004(context, evt)
  if GadgetState.ChestOpened == ScriptLib.GetGadgetStateByConfigId(context, 220134032, 32001) then
    return true
  end
  if GadgetState.ChestOpened == ScriptLib.GetGadgetStateByConfigId(context, 220134032, 32002) then
    return true
  end
  if GadgetState.ChestOpened == ScriptLib.GetGadgetStateByConfigId(context, 220134032, 32003) then
    return true
  end
  return false
end
function action_EVENT_GADGET_STATE_CHANGE_32004(context, evt)
  ScriptLib.TryRecordActivityPushTips(context, 2014004)
  ScriptLib.ShowClientTutorial(context, 1170, {})
  return 0
end
