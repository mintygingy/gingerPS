local base_info = {group_id = 240052009}
monsters = {
  {
    config_id = 9001,
    monster_id = 25310101,
    pos = {
      x = 855.737,
      y = 76.861,
      z = 436.864
    },
    rot = {
      x = 0.0,
      y = 342.259,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {6111},
    isElite = true,
    pose_id = 9003
  },
  {
    config_id = 9002,
    monster_id = 25310201,
    pos = {
      x = 854.6,
      y = 76.866,
      z = 439.495
    },
    rot = {
      x = 0.0,
      y = 158.891,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {6111},
    isElite = true,
    pose_id = 9003
  },
  {
    config_id = 9003,
    monster_id = 25310301,
    pos = {
      x = 852.513,
      y = 76.599,
      z = 437.19
    },
    rot = {
      x = 0.0,
      y = 72.66,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {6111},
    isElite = true,
    pose_id = 9001
  },
  {
    config_id = 9006,
    monster_id = 23050101,
    pos = {
      x = 859.086,
      y = 76.406,
      z = 439.21
    },
    rot = {
      x = 0.0,
      y = 252.854,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    affix = {6110},
    isElite = true
  }
}
npcs = {}
gadgets = {
  {
    config_id = 9004,
    gadget_id = 70211021,
    pos = {
      x = 855.406,
      y = 76.868,
      z = 438.204
    },
    rot = {
      x = 0.0,
      y = 248.14,
      z = 0.0
    },
    level = 1,
    drop_tag = "\230\136\152\230\150\151\233\171\152\231\186\167\233\161\187\229\188\165",
    isOneoff = true,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1009005,
    name = "ANY_MONSTER_DIE_9005",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_9005",
    action = "action_EVENT_ANY_MONSTER_DIE_9005"
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
      "ANY_MONSTER_DIE_9005"
    },
    rand_weight = 100
  },
  {
    monsters = {
      9001,
      9002,
      9003,
      9006
    },
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {9004},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_DIE_9005(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_9005(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 240052009, 3)
  return 0
end
