local base_info = {group_id = 220133042}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 42001,
    gadget_id = 70211021,
    pos = {
      x = 15.488,
      y = 198.256,
      z = 614.718
    },
    rot = {
      x = 355.881,
      y = 192.424,
      z = 347.412
    },
    level = 16,
    drop_tag = "\230\136\152\230\150\151\233\171\152\231\186\167\231\190\164\229\178\155",
    isOneoff = true,
    persistent = true
  }
}
regions = {}
triggers = {
  {
    config_id = 1042002,
    name = "GROUP_LOAD_42002",
    event = EventType.EVENT_GROUP_LOAD,
    source = "",
    condition = "",
    action = "action_EVENT_GROUP_LOAD_42002",
    trigger_count = 0
  }
}
variables = {}
init_config = {
  suite = 2,
  end_suite = 0,
  rand_suite = false
}
suites = {
  {
    monsters = {},
    gadgets = {42001},
    regions = {},
    triggers = {},
    rand_weight = 100
  },
  {
    monsters = {},
    gadgets = {},
    regions = {},
    triggers = {
      "GROUP_LOAD_42002"
    },
    rand_weight = 100
  }
}
function action_EVENT_GROUP_LOAD_42002(context, evt)
  if ScriptLib.GetHostQuestState(context, 4007010) == 3 then
    ScriptLib.RefreshGroup(context, {group_id = 220133042, suite = 1})
  end
  return 0
end
