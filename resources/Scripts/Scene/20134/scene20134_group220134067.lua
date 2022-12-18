local base_info = {group_id = 220134067}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 67001,
    gadget_id = 70211001,
    pos = {
      x = 629.213,
      y = 613.098,
      z = -1587.009
    },
    rot = {
      x = 0.0,
      y = 337.015,
      z = 0.0
    },
    level = 16,
    drop_tag = "\230\136\152\230\150\151\228\189\142\231\186\167\231\190\164\229\178\155",
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
    gadgets = {67001},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
