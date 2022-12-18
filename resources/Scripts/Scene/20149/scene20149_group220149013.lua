local base_info = {group_id = 220149013}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 13001,
    gadget_id = 70211101,
    pos = {
      x = 531.806,
      y = 105.277,
      z = 293.443
    },
    rot = {
      x = 0.0,
      y = 295.0,
      z = 0.0
    },
    level = 1,
    drop_tag = "\232\167\163\232\176\156\228\189\142\231\186\167\233\161\187\229\188\165",
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 13002,
    gadget_id = 70211101,
    pos = {
      x = 470.71,
      y = 132.515,
      z = 385.932
    },
    rot = {
      x = 0.0,
      y = 135.0,
      z = 0.0
    },
    level = 1,
    drop_tag = "\232\167\163\232\176\156\228\189\142\231\186\167\233\161\187\229\188\165",
    isOneoff = true,
    persistent = true
  },
  {
    config_id = 13003,
    gadget_id = 70211101,
    pos = {
      x = 493.2,
      y = 108.88,
      z = 297.903
    },
    rot = {
      x = 0.0,
      y = 330.0,
      z = 0.0
    },
    level = 1,
    drop_tag = "\232\167\163\232\176\156\228\189\142\231\186\167\233\161\187\229\188\165",
    isOneoff = true,
    persistent = true
  }
}
regions = {}
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
    gadgets = {
      13001,
      13002,
      13003
    },
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
