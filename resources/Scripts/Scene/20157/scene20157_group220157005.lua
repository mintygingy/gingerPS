local base_info = {group_id = 220157005}
monsters = {
  {
    config_id = 5002,
    monster_id = 28060402,
    pos = {
      x = 246.89,
      y = 182.323,
      z = 247.273
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    pose_id = 1
  },
  {
    config_id = 5003,
    monster_id = 28060402,
    pos = {
      x = 248.967,
      y = 182.355,
      z = 253.264
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 1
  }
}
npcs = {}
gadgets = {}
regions = {}
triggers = {
  {
    config_id = 1005001,
    name = "ANY_MONSTER_DIE_5001",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_5001",
    action = "action_EVENT_ANY_MONSTER_DIE_5001"
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
    monsters = {5002, 5003},
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_5001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_DIE_5001(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_5001(context, evt)
  if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 220157001, 1001, GadgetState.Default) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
    return -1
  end
  if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 220157001, 1001, {7}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
    return -1
  end
  if 0 ~= ScriptLib.RefreshGroup(context, {group_id = 220157006, suite = 3}) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
    return -1
  end
  return 0
end
