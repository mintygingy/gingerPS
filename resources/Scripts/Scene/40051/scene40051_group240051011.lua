local base_info = {group_id = 240051011}
monsters = {
  {
    config_id = 11001,
    monster_id = 24030201,
    pos = {
      x = 492.281,
      y = 145.199,
      z = 418.684
    },
    rot = {
      x = 0.0,
      y = 284.075,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    isElite = true,
    pose_id = 102
  },
  {
    config_id = 11002,
    monster_id = 24030101,
    pos = {
      x = 477.58,
      y = 145.064,
      z = 413.59
    },
    rot = {
      x = 0.0,
      y = 26.014,
      z = 0.0
    },
    level = 1,
    disableWander = true,
    isElite = true,
    pose_id = 102
  }
}
npcs = {}
gadgets = {
  {
    config_id = 11003,
    gadget_id = 70211121,
    pos = {
      x = 484.631,
      y = 145.169,
      z = 420.974
    },
    rot = {
      x = 0.0,
      y = 340.502,
      z = 0.0
    },
    level = 1,
    drop_tag = "\232\167\163\232\176\156\233\171\152\231\186\167\233\161\187\229\188\165",
    isOneoff = true,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1011004,
    name = "ANY_MONSTER_DIE_11004",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_11004",
    action = "action_EVENT_ANY_MONSTER_DIE_11004"
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
    monsters = {11001, 11002},
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_11004"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {11003},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_DIE_11004(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_11004(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 240051011, 2)
  return 0
end
