local base_info = {group_id = 201073002}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 2001,
    gadget_id = 70210121,
    pos = {
      x = 87.673,
      y = 2.212,
      z = 0.794
    },
    rot = {
      x = 0.0,
      y = 270.0,
      z = 0.0
    },
    level = 1,
    chest_drop_id = 1050219,
    drop_count = 1,
    isOneoff = true,
    persistent = true,
    room = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1002002,
    name = "GADGET_STATE_CHANGE_2002",
    event = EventType.EVENT_GADGET_STATE_CHANGE,
    source = "2001",
    condition = "condition_EVENT_GADGET_STATE_CHANGE_2002",
    action = "action_EVENT_GADGET_STATE_CHANGE_2002",
    trigger_count = 0
  }
}
variables = {}
garbages = {
  triggers = {
    {
      config_id = 1002003,
      name = "QUEST_FINISH_2003",
      event = EventType.EVENT_QUEST_FINISH,
      source = "7350204",
      condition = "condition_EVENT_QUEST_FINISH_2003",
      action = "action_EVENT_QUEST_FINISH_2003"
    }
  }
}
init_config = {
  io_type = 1,
  secure_suite_index = 1,
  suite = 1,
  end_suite = 0,
  rand_suite = false,
  father_quest = 73502,
  quest_config = {
    [7350204] = {
      {state = 3, suite = 2}
    }
  }
}
suite_disk = {
  [1] = {
    gadgets = {},
    monsters = {},
    regions = {},
    triggers = {},
    npcs = {},
    variables = {}
  },
  [2] = {
    gadgets = {
      {config_id = 2001, state = 0}
    },
    monsters = {},
    regions = {},
    triggers = {
      "GADGET_STATE_CHANGE_2002"
    },
    npcs = {},
    variables = {}
  }
}
function condition_EVENT_GADGET_STATE_CHANGE_2002(context, evt)
  if 2001 ~= evt.param2 or GadgetState.ChestOpened ~= evt.param1 then
    return false
  end
  return true
end
function action_EVENT_GADGET_STATE_CHANGE_2002(context, evt)
  if 0 ~= ScriptLib.AddQuestProgress(context, "735020501") then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : add_quest_progress")
    return -1
  end
  if 0 ~= ScriptLib.ShowReminder(context, 400177) then
    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : active_reminder_ui")
    return -1
  end
  return 0
end
