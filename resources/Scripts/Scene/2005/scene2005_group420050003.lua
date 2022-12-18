local base_info = {group_id = 420050003}
local defs = {
  ScoreCid = 3001,
  PedalCid = 3002,
  Operator = 3003
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
    config_id = 3001,
    gadget_id = 77307005,
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
    config_id = 3002,
    gadget_id = 77307009,
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
    config_id = 3003,
    gadget_id = 70360001,
    pos = {
      x = 555.976,
      y = 383.6,
      z = 213.609
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
    follow_entity = 3001
  }
}
regions = {}
triggers = {
  {
    config_id = 1003004,
    name = "GADGET_CREATE_3004",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "",
    action = "action_EVENT_GADGET_CREATE_3004",
    trigger_count = 0
  },
  {
    config_id = 1003005,
    name = "SELECT_OPTION_3005",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "",
    action = "action_EVENT_SELECT_OPTION_3005",
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
      3001,
      3002,
      3003
    },
    regions = {},
    triggers = {
      "GADGET_CREATE_3004",
      "SELECT_OPTION_3005"
    },
    rand_weight = 100
  }
}
function action_EVENT_GADGET_CREATE_3004(context, evt)
  if defs.ScoreCid ~= evt.param1 then
    return 0
  end
  ScriptLib.SetGroupTempValue(context, keyName, 0, {})
  ScriptLib.SetEntityServerGlobalValueByConfigId(context, defs.ScoreCid, keyName, 0)
  return 0
end
function action_EVENT_SELECT_OPTION_3005(context, evt)
  if defs.Operator ~= evt.param1 or 326 ~= evt.param2 then
    return 0
  end
  ScriptLib.SetGroupTempValue(context, keyName, 0, {})
  ScriptLib.SetEntityServerGlobalValueByConfigId(context, defs.ScoreCid, keyName, 0)
  return 0
end
