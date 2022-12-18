local base_info = {group_id = 220163016}
monsters = {
  {
    config_id = 16002,
    monster_id = 23010301,
    pos = {
      x = -25.059,
      y = 68.995,
      z = -7.93
    },
    rot = {
      x = 0.0,
      y = 72.85,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 9001
  }
}
npcs = {}
gadgets = {}
regions = {}
triggers = {
  {
    config_id = 1016001,
    name = "ANY_MONSTER_DIE_16001",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_16001",
    action = "action_EVENT_ANY_MONSTER_DIE_16001"
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
    monsters = {16002},
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_16001"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_DIE_16001(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_16001(context, evt)
  if 0 ~= ScriptLib.SetGroupVariableValueByGroup(context, "fightFinish1", 1, 220163014) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_groupVariable_by_group")
    return -1
  end
  return 0
end
