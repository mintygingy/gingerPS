local base_info = {group_id = 220138001}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 70211101,
    pos = {
      x = -21.555,
      y = 0.494,
      z = 4.82
    },
    rot = {
      x = 0.0,
      y = 184.948,
      z = 0.0
    },
    level = 16,
    drop_tag = "\232\167\163\232\176\156\228\189\142\231\186\167\231\190\164\229\178\155",
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
    gadgets = {1001},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
