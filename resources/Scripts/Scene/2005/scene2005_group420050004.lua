local base_info = {group_id = 420050004}
local defs = {
  ScoreCid = 4001,
  PedalCid = 4002,
  Operator = 4003
}
local keyName = "SGV_ScoringShelf_01"
function EnterField(context, evt)
  local countNum = ScriptLib.GetGroupTempValue(context, keyName, {})
  countNum = countNum + 1
  if 10 < countNum then
    countNum = 10
  end
  ScriptLib.SetEntityServerGlobalValueByConfigId(context, defs.ScoreCid, keyName, countNum)
  ScriptLib.SetGroupTempValue(context, keyName, countNum, {})
  return 0
end
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 4001,
    gadget_id = 77307006,
    pos = {
      x = 554.4,
      y = 383.6,
      z = 215.9
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    server_global_value_config = {SGV_ScoringShelf_01 = 0}
  },
  {
    config_id = 4002,
    gadget_id = 77307010,
    pos = {
      x = 554.4,
      y = 383.6,
      z = 220.9
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 4003,
    gadget_id = 70360001,
    pos = {
      x = 544.367,
      y = 383.6,
      z = 213.434
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_guest_can_operate = true,
    worktop_config = {
      init_options = {326}
    },
    follow_entity = 4001
  }
}
regions = {}
triggers = {
  {
    config_id = 1004004,
    name = "GADGET_CREATE_4004",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "",
    action = "action_EVENT_GADGET_CREATE_4004",
    trigger_count = 0
  },
  {
    config_id = 1004005,
    name = "SELECT_OPTION_4005",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "",
    action = "action_EVENT_SELECT_OPTION_4005",
    trigger_count = 0,
    forbid_guest = false
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
    gadgets = {
      4001,
      4002,
      4003
    },
    regions = {},
    triggers = {
      "GADGET_CREATE_4004",
      "SELECT_OPTION_4005"
    },
    rand_weight = 100
  }
}
function action_EVENT_GADGET_CREATE_4004(context, evt)
  if defs.ScoreCid ~= evt.param1 then
    return 0
  end
  ScriptLib.SetGroupTempValue(context, keyName, 0, {})
  ScriptLib.SetEntityServerGlobalValueByConfigId(context, defs.ScoreCid, keyName, 0)
  return 0
end
function action_EVENT_SELECT_OPTION_4005(context, evt)
  if defs.Operator ~= evt.param1 or 326 ~= evt.param2 then
    return 0
  end
  ScriptLib.SetGroupTempValue(context, keyName, 0, {})
  ScriptLib.SetEntityServerGlobalValueByConfigId(context, defs.ScoreCid, keyName, 0)
  return 0
end
