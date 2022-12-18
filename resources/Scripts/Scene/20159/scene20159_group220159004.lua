local base_info = {group_id = 220159004}
monsters = {
  {
    config_id = 4001,
    monster_id = 26120101,
    pos = {
      x = 480.939,
      y = 148.591,
      z = 419.188
    },
    rot = {
      x = 0.0,
      y = 12.151,
      z = 0.0
    },
    level = 1,
    pose_id = 201
  },
  {
    config_id = 4002,
    monster_id = 26090401,
    pos = {
      x = 484.484,
      y = 145.026,
      z = 423.628
    },
    rot = {
      x = 0.0,
      y = 335.975,
      z = 0.0
    },
    level = 1,
    pose_id = 101
  },
  {
    config_id = 4003,
    monster_id = 26090401,
    pos = {
      x = 489.777,
      y = 145.04,
      z = 424.23
    },
    rot = {
      x = 0.0,
      y = 316.54,
      z = 0.0
    },
    level = 1,
    pose_id = 101
  },
  {
    config_id = 4004,
    monster_id = 26090401,
    pos = {
      x = 479.18,
      y = 144.97,
      z = 422.624
    },
    rot = {
      x = 0.0,
      y = 0.344,
      z = 0.0
    },
    level = 1,
    pose_id = 101
  },
  {
    config_id = 4005,
    monster_id = 26120101,
    pos = {
      x = 490.689,
      y = 146.958,
      z = 419.741
    },
    rot = {
      x = 0.0,
      y = 341.599,
      z = 0.0
    },
    level = 1,
    pose_id = 201
  }
}
npcs = {}
gadgets = {}
regions = {}
triggers = {
  {
    config_id = 1004009,
    name = "ANY_MONSTER_DIE_4009",
    event = EventType.EVENT_ANY_MONSTER_DIE,
    source = "",
    condition = "condition_EVENT_ANY_MONSTER_DIE_4009",
    action = "action_EVENT_ANY_MONSTER_DIE_4009"
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
    monsters = {
      4001,
      4002,
      4003,
      4004,
      4005
    },
    gadgets = {},
    regions = {},
    triggers = {
      "ANY_MONSTER_DIE_4009"
    },
    rand_weight = 100
  }
}
function condition_EVENT_ANY_MONSTER_DIE_4009(context, evt)
  if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
    return false
  end
  return true
end
function action_EVENT_ANY_MONSTER_DIE_4009(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220159005, 2)
  return 0
end
