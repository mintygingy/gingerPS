local base_info = {group_id = 220133037}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 37001,
    gadget_id = 70310242,
    pos = {
      x = 13.92,
      y = 182.675,
      z = 628.057
    },
    rot = {
      x = 0.0,
      y = 196.717,
      z = 0.0
    },
    level = 1,
    interact_id = 64
  },
  {
    config_id = 37002,
    gadget_id = 70310381,
    pos = {
      x = -7.16,
      y = 184.08,
      z = 627.72
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
    config_id = 1037003,
    name = "GADGET_STATE_CHANGE_37003",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_37003",
    action = "action_EVENT_GADGET_STATE_CHANGE_37003",
    trigger_count = 0
  },
  {
    config_id = 1037004,
    name = "GADGET_STATE_CHANGE_37004",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_37004",
    action = "action_EVENT_GADGET_STATE_CHANGE_37004",
    trigger_count = 0
  },
  {
    config_id = 1037005,
    name = "GADGET_STATE_CHANGE_37005",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_37005",
    action = "action_EVENT_GADGET_STATE_CHANGE_37005",
    trigger_count = 0
  },
  {
    config_id = 1037006,
    name = "GADGET_STATE_CHANGE_37006",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_37006",
    action = "action_EVENT_GADGET_STATE_CHANGE_37006",
    trigger_count = 0
  },
  {
    config_id = 1037007,
    name = "GADGET_STATE_CHANGE_37007",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_37007",
    action = "action_EVENT_GADGET_STATE_CHANGE_37007",
    trigger_count = 0
  }
}
variables = {
  {
    config_id = 1,
    name = "DrumTime",
    value = 1,
    no_refresh = true
  },
  {
    config_id = 2,
    name = "CsShown",
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
    gadgets = {37001},
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_37003",
      "GADGET_STATE_CHANGE_37004",
      "GADGET_STATE_CHANGE_37005",
      "GADGET_STATE_CHANGE_37006",
      "GADGET_STATE_CHANGE_37007"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {37002},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_37003(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133037, 37001) then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "DrumTime") ~= 1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_37003(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "DrumTime", 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  ScriptLib.AddExtraGroupSuite(context, 220133037, 2)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220133038, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220133041, 41005, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220133042, 42001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_37004(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133037, 37001) then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "DrumTime") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_37004(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220133037, 2)
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220133038, suite = 1}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220133041, 41005, GadgetState.GearStop) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220133042, 42001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_37005(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133037, 37001) then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_37005(context, evt)
  if 0 ~= ScriptLib.MarkPlayerAction(context, 2801, 1, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_37006(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133037, 37001) then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "DrumTime") ~= 1 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "CsShown") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_37006(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "CsShown", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "CsShown", 0, 220133038) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.PlayCutScene(context, 201330101, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : play_cutscene")
    return -1
  end
  return 0
end
function condition_EVENT_GADGET_STATE_CHANGE_37007(context, evt)
  if GadgetState.GearStart ~= ScriptLib.GetGadgetStateByConfigId(context, 220133037, 37001) then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "DrumTime") ~= 0 then
    return false
  end
  if ScriptLib.GetGroupVariableValue(context, "CsShown") ~= 0 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_37007(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValue(context, "CsShown", 1) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable")
    return -1
  end
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "CsShown", 0, 220133038) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  if 0 ~= ScriptLib.PlayCutScene(context, 201330103, 0) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : play_cutscene")
    return -1
  end
  return 0
end
