local base_info = {group_id = 220151016}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 16001,
    gadget_id = 70290196,
    pos = {
      x = 608.537,
      y = 64.667,
      z = 481.877
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 16003,
    gadget_id = 70211121,
    pos = {
      x = 640.538,
      y = 57.985,
      z = 467.073
    },
    rot = {
      x = 0.0,
      y = 250.0,
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
    config_id = 1016002,
    name = "QUEST_FINISH_16002",
    event = EventType.EVENT_QUEST_FINISH,
    source = "302106",
    condition = "",
    action = "action_EVENT_QUEST_FINISH_16002"
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
    gadgets = {16001},
    regions = {},
    triggers = {
      "QUEST_FINISH_16002"
    },
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {16003},
    regions = {},
    triggers = {},
    rand_weight = 100
  }
}
function action_EVENT_QUEST_FINISH_16002(context, evt)
  ScriptLib.AddExtraGroupSuite(context, 220151016, 2)
  return 0
end
