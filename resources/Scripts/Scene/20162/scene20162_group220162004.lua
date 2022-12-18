local base_info = {group_id = 220162004}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 4001,
    gadget_id = 70710880,
    pos = {
      x = 24.618,
      y = -31.664,
      z = 26.279
    },
    rot = {
      x = 0.4,
      y = 188.37,
      z = 21.508
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1004002,
    name = "QUEST_FINISH_4002",
    event = EventType.EVENT_QUEST_FINISH,
    source = "302235",
    condition = "",
    action = "action_EVENT_QUEST_FINISH_4002",
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
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {4001},
    regions = {},
    triggers = {
      "QUEST_FINISH_4002"
    },
    rand_weight = 100
  }
}
function action_EVENT_QUEST_FINISH_4002(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 4001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
