local base_info = {group_id = 220139011}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 11001,
    gadget_id = 70211101,
    pos = {
      x = -11.1,
      y = 97.759,
      z = -147.792
    },
    rot = {
      x = 0.0,
      y = 0.0,
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
    gadgets = {11001},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
