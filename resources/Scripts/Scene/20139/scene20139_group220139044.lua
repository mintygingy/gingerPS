local base_info = {group_id = 220139044}
monsters = {}
npcs = {}
gadgets = {}
regions = {}
triggers = {}
variables = {}
garbages = {
  regions = {
    {
      config_id = 44001,
      shape = RegionShape.SPHERE,
      radius = 10,
      pos = {
        x = -1.103,
        y = 71.012,
        z = 147.67
      }
    }
  },
  triggers = {
    {
      config_id = 1044001,
      name = "ENTER_REGION_44001",
      event = EventType.EVENT_ENTER_REGION,
      source = "",
      condition = "condition_EVENT_ENTER_REGION_44001",
      action = "",
      trigger_count = 0
    }
  }
}
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
    triggers = {},
    rand_weight = 100
  }
}
