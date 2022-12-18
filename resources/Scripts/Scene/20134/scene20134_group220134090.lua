local base_info = {group_id = 220134090}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 90001,
    gadget_id = 70211131,
    pos = {
      x = 498.19,
      y = 612.323,
      z = -1604.826
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 16,
    drop_tag = "\232\167\163\232\176\156\232\182\133\231\186\167\231\190\164\229\178\155",
    isOneoff = true,
    persistent = true
  }
}
regions = {}
triggers = {}
variables = {}
init_config = {
  suite = 2,
  end_suite = 1,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {90001},
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
