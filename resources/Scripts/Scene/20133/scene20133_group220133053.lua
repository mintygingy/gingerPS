local base_info = {group_id = 220133053}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 53001,
    gadget_id = 70310184,
    pos = {
      x = -8.372,
      y = 144.928,
      z = 614.72
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1053002,
    name = "GROUP_LOAD_53002",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "condition_EVENT_GROUP_LOAD_53002",
    action = "action_EVENT_GROUP_LOAD_53002",
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
    gadgets = {53001},
    regions = {},
    triggers = {
      "GROUP_LOAD_53002"
    },
    rand_weight = 100
  }
}
function condition_EVENT_GROUP_LOAD_53002(context, evt)
  if ScriptLib.GetGroupVariableValueByGroup(context, "GadgetBDie", 220133091) ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GROUP_LOAD_53002(context, evt)
  if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 53001, GadgetState.GearStart) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
    return -1
  end
  return 0
end
