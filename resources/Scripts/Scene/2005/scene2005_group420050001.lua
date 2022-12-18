local base_info = {group_id = 420050001}
local defs = {
  GalleryID = 410001,
  StartConfig = 1001,
  EndConfig = 1002,
  Operator = 1004,
  EnterRegionConfig = 1005,
  LeaveRegionConfig = 1006
}
function CheckUidNoExist(context, enterUid)
  local uidList = ScriptLib.GetGalleryUidList(context, defs.GalleryID)
  for i = 1, #uidList do
    if enterUid == uidList[i] then
      return false
    end
  end
  return true
end
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 1001,
    gadget_id = 77307001,
    pos = {
      x = 563.619,
      y = 383.6,
      z = 215.974
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1002,
    gadget_id = 77307002,
    pos = {
      x = 545.318,
      y = 383.6,
      z = 215.81
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1
  },
  {
    config_id = 1004,
    gadget_id = 70360001,
    pos = {
      x = 563.603,
      y = 383.6,
      z = 215.936
    },
    rot = {
      x = 0.0,
      y = 0.0,
      z = 0.0
    },
    level = 1,
    is_guest_can_operate = true,
    follow_entity = 1001
  }
}
regions = {
  {
    config_id = 1005,
    shape = RegionShape.SPHERE,
    radius = 2,
    pos = {
      x = 545.318,
      y = 383.6,
      z = 215.81
    },
    follow_entity = 1002
  },
  {
    config_id = 1006,
    shape = RegionShape.SPHERE,
    radius = 40,
    pos = {
      x = 545.318,
      y = 383.6,
      z = 215.81
    }
  }
}
triggers = {
  {
    config_id = 1001005,
    name = "ENTER_REGION_1005",
    event = EventType.EVENT_ENTER_REGION,
    source = "",
    condition = "",
    action = "action_EVENT_ENTER_REGION_1005",
    trigger_count = 0,
    forbid_guest = false,
    follow_entity = 1002
  },
  {
    config_id = 1001006,
    name = "LEAVE_REGION_1006",
    event = EventType.EVENT_LEAVE_REGION,
    source = "",
    condition = "",
    action = "action_EVENT_LEAVE_REGION_1006",
    trigger_count = 0,
    forbid_guest = false
  },
  {
    config_id = 1001007,
    name = "GADGET_CREATE_1007",
    event = EventType.EVENT_GADGET_CREATE,
    source = "",
    condition = "",
    action = "action_EVENT_GADGET_CREATE_1007",
    trigger_count = 0
  },
  {
    config_id = 1001008,
    name = "GALLERY_STOP_1008",
    event = EventType.EVENT_GALLERY_STOP,
    source = "",
    condition = "",
    action = "action_EVENT_GALLERY_STOP_1008",
    trigger_count = 0
  },
  {
    config_id = 1001009,
    name = "SELECT_OPTION_1009",
    event = EventType.EVENT_SELECT_OPTION,
    source = "",
    condition = "",
    action = "action_EVENT_SELECT_OPTION_1009",
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
      1001,
      1002,
      1004
    },
    regions = {1005, 1006},
    triggers = {
      "ENTER_REGION_1005",
      "LEAVE_REGION_1006",
      "GADGET_CREATE_1007",
      "GALLERY_STOP_1008",
      "SELECT_OPTION_1009"
    },
    rand_weight = 100
  }
}
function action_EVENT_ENTER_REGION_1005(context, evt)
  local tempStart = ScriptLib.GetGroupTempValue(context, "TempStart", {})
  local enterUid = context.uid
  if evt.param1 ~= defs.EnterRegionConfig or 0 == tempStart or CheckUidNoExist(context, enterUid) then
    return 0
  end
  ScriptLib.PrintContextLog(context, "## TD_\231\142\169\230\179\149\229\165\151\232\163\133_\232\174\161\230\151\182\229\153\168 : \229\174\140\230\136\144\231\142\169\230\179\149\231\154\132\231\142\169\229\174\182uid\230\152\175 " .. enterUid)
  ScriptLib.UpdatePlayerGalleryScore(context, defs.GalleryID, {uid = enterUid})
  ScriptLib.StopGallery(context, defs.GalleryID, false)
  return 0
end
function action_EVENT_LEAVE_REGION_1006(context, evt)
  if evt.param1 ~= defs.LeaveRegionConfig then
    return 0
  end
  ScriptLib.PrintContextLog(context, "## TD_\231\142\169\230\179\149\229\165\151\232\163\133_\232\174\161\230\151\182\229\153\168 : \231\166\187\229\188\128\231\142\169\229\174\182\231\154\132uid\230\152\175 " .. context.uid)
  local ret = ScriptLib.TryReallocateEntityAuthority(context, context.uid, defs.EndConfig, evt.param1)
  ScriptLib.PrintContextLog(context, "## TD_\231\142\169\230\179\149\229\165\151\232\163\133_\232\174\161\230\151\182\229\153\168 : \229\136\135\230\141\162\231\154\132\231\142\169\229\174\182\230\152\175 = " .. ret)
  return 0
end
function action_EVENT_GADGET_CREATE_1007(context, evt)
  ScriptLib.PrintContextLog(context, "##TD Gadget" .. evt.param2 .. "ConfigID\228\184\186" .. evt.param1 .. "\229\136\155\231\148\159\228\186\134")
  if 70360001 == evt.param2 then
    ScriptLib.PrintContextLog(context, "##TD Gadget \231\172\166\229\144\136\230\157\161\228\187\182\239\188\140Gadget\229\136\155\231\148\159\228\186\134")
    ScriptLib.SetWorktopOptionsByGroupId(context, 0, evt.param1, {325})
    ScriptLib.SetGroupTempValue(context, "TempStart", 0, {})
  end
  return 0
end
function action_EVENT_GALLERY_STOP_1008(context, evt)
  ScriptLib.SetWorktopOptionsByGroupId(context, 0, defs.Operator, {325})
  ScriptLib.SetGroupTempValue(context, "TempStart", 0, {})
  ScriptLib.SetGadgetStateByConfigId(context, defs.EndConfig, 0)
  return 0
end
function action_EVENT_SELECT_OPTION_1009(context, evt)
  local uidList = ScriptLib.GetSceneUidList(context)
  if ScriptLib.StartHomeGallery(context, defs.GalleryID, context.uid) == -1 then
    ScriptLib.SendServerMessageByLuaKey(context, "HOMEOWRLD_DUPLICATE_GALLERY", {
      context.uid
    })
    return 0
  end
  ScriptLib.SetGroupTempValue(context, "TempStart", 1, {})
  ScriptLib.DelWorktopOption(context, evt.param2)
  ScriptLib.SetGadgetStateByConfigId(context, defs.EndConfig, 201)
  return 0
end
