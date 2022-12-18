local base_info = {group_id = 220135011}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 11001,
    gadget_id = 70310303,
    pos = {
      x = 108.614,
      y = -227.005,
      z = 590.091
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {
  {
    config_id = 11002,
    shape = RegionShape.SPHERE,
    radius = 110,
    pos = {
      x = 125.735,
      y = -221.844,
      z = 605.737
    },
    team_ability_group_list = {
      "RegionAbility_Dreamland_KazuhaMovie"
    }
  }
}
triggers = {}
variables = {}
init_config = {
  suite = 1,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {11001},
    regions = {11002},
    triggers = {},
    rand_weight = 100
  }
}
