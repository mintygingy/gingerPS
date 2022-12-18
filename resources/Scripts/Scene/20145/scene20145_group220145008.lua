local base_info = {group_id = 220145008}
monsters = {
  {
    config_id = 8021,
    monster_id = 26120301,
    pos = {
      x = 476.029,
      y = 145.013,
      z = 422.356
    },
    rot = {
      x = 0.0,
      y = 105.331,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101,
    title_id = 10125,
    special_name_id = 10177
  },
  {
    config_id = 8022,
    monster_id = 26120301,
    pos = {
      x = 493.518,
      y = 145.529,
      z = 419.347
    },
    rot = {
      x = 0.0,
      y = 282.915,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 101,
    title_id = 10125,
    special_name_id = 10177
  },
  {
    config_id = 8023,
    monster_id = 26090201,
    pos = {
      x = 475.402,
      y = 145.02,
      z = 418.397
    },
    rot = {
      x = 0.0,
      y = 92.634,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 105
  },
  {
    config_id = 8024,
    monster_id = 26090201,
    pos = {
      x = 493.873,
      y = 144.856,
      z = 421.695
    },
    rot = {
      x = 0.0,
      y = 253.103,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 105
  },
  {
    config_id = 8025,
    monster_id = 26090201,
    pos = {
      x = 477.838,
      y = 145.075,
      z = 425.132
    },
    rot = {
      x = 0.0,
      y = 117.61,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 105
  },
  {
    config_id = 8026,
    monster_id = 26090201,
    pos = {
      x = 492.946,
      y = 144.983,
      z = 416.257
    },
    rot = {
      x = 0.0,
      y = 275.833,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    pose_id = 105
  }
}
npcs = {}
gadgets = {}
regions = {}
triggers = {
  {
    config_id = 1008027,
    name = "ANY_MONSTER_DIE_8027",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_8027",
    action = "action_EVENT_ANY_MONSTER_DIE_8027"
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
    triggers = {
      "ANY_MONSTER_DIE_8027"
    },
    rand_weight = 100
  },
  {
    monsters = {
      8021,
      8022,
      8023,
      8024,
      8025,
      8026
    },
    gadgets = {},
    regions = {},
    triggers = {},
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
function condition_EVENT_ANY_MONSTER_DIE_8027(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_8027(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "7306913") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  if 0 ~= ScriptLib.ShowReminder(context, 33010135) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
