local base_info = {group_id = 220152002}
monsters = {
  {
    config_id = 2001,
    monster_id = 29070102,
    pos = {
      x = -0.172,
      y = -58.149,
      z = -0.201
    },
    rot = {
      x = 0.0,
      y = 32.253,
      z = 0.0
    },
    level = 1,
    title_id = 162
  }
}
npcs = {}
gadgets = {}
regions = {}
triggers = {
  {
    config_id = 1002002,
    name = "ANY_MONSTER_DIE_2002",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_2002",
    action = "action_EVENT_ANY_MONSTER_DIE_2002"
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
      "ANY_MONSTER_DIE_2002"
    },
    rand_weight = 100
  },
  {
    monsters = {2001},
    gadgets = {},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_DIE_2002(context, evt)
  if evt.param1 ~= 2001 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_2002(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220152002, 2)
  return 0
end
