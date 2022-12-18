local base_info = {group_id = 250080003}
local defs = {
  fireMachineList = {3001},
  initConfig = {
    [3001] = 2
  },
  controlRelation = {
    [3007] = 3001
  }
}
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 3001,
    gadget_id = 70310158,
    pos = {
      x = 98.769,
      y = 99.628,
      z = 32.125
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3002,
    gadget_id = 70310163,
    pos = {
      x = 91.509,
      y = 100.783,
      z = 41.832
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3003,
    gadget_id = 70310164,
    pos = {
      x = 103.414,
      y = 100.877,
      z = 39.931
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3004,
    gadget_id = 70310165,
    pos = {
      x = 97.847,
      y = 100.702,
      z = 48.946
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3005,
    gadget_id = 70310159,
    pos = {
      x = 98.728,
      y = 99.628,
      z = 42.357
    },
    rot = {
      x = 0.0,
      y = 90.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 3006,
    gadget_id = 70310159,
    pos = {
      x = 106.709,
      y = 99.99,
      z = 42.357
    },
    rot = {
      x = 0.0,
      y = 187.053,
      z = 0.0
    },
    level = 1,
    state = GadgetState.ChestLocked
  },
  {
    config_id = 3007,
    gadget_id = 70360001,
    pos = {
      x = 98.769,
      y = 99.314,
      z = 32.125
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    worktop_config = {
      init_options = {79}
    }
  },
  {
    config_id = 3008,
    gadget_id = 70310188,
    pos = {
      x = 106.514,
      y = 100.648,
      z = 42.399
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  }
}
regions = {}
triggers = {
  {
    config_id = 1003009,
    name = "ANY_GADGET_DIE_3009",
    event = EventType.EVENT_ANY_GADGET_DIE,
    source = "",
    condition = "",
    action = "action_EVENT_ANY_GADGET_DIE_3009",
    trigger_count = 0
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
      3003,
      3004,
      3005,
      3006,
      3007,
      3008
    },
    regions = {},
    triggers = {
      "ANY_GADGET_DIE_3009"
    },
    rand_weight = 100
  }
}
function action_EVENT_ANY_GADGET_DIE_3009(context, evt)
  if evt.param1 == 3008 then
    ScriptLib.SetGadgetStateByConfigId(context, 3006, GadgetState.Default)
  end
  return 0
end
require("V2_8/FireMachineColorHandle")
