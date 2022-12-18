local L0_1, L1_1, L2_1, L3_1, L4_1, L5_1, L6_1, L7_1
L0_1 = {}
L0_1.group_id = 133220525
L1_1 = {}
L2_1 = {}
L2_1.config_id = 525001
L2_1.monster_id = 25010501
L3_1 = {}
L3_1.x = -2835.273
L3_1.y = 200.521
L3_1.z = -4025.867
L2_1.pos = L3_1
L3_1 = {}
L3_1.x = 0.0
L3_1.y = 47.373
L3_1.z = 0.0
L2_1.rot = L3_1
L2_1.level = 27
L2_1.drop_tag = "\231\155\151\229\174\157\229\155\162"
L2_1.disableWander = true
L2_1.area_id = 11
L3_1 = {}
L3_1.config_id = 525005
L3_1.monster_id = 25010201
L4_1 = {}
L4_1.x = -2830.256
L4_1.y = 200.927
L4_1.z = -4026.485
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 0.0
L4_1.y = 14.127
L4_1.z = 0.0
L3_1.rot = L4_1
L3_1.level = 27
L3_1.drop_tag = "\231\155\151\229\174\157\229\155\162"
L3_1.disableWander = true
L3_1.pose_id = 9005
L3_1.area_id = 11
L4_1 = {}
L4_1.config_id = 525006
L4_1.monster_id = 25010301
L5_1 = {}
L5_1.x = -2831.043
L5_1.y = 200.392
L5_1.z = -4023.268
L4_1.pos = L5_1
L5_1 = {}
L5_1.x = 0.0
L5_1.y = 224.569
L5_1.z = 0.0
L4_1.rot = L5_1
L4_1.level = 27
L4_1.drop_tag = "\231\155\151\229\174\157\229\155\162"
L4_1.disableWander = true
L4_1.pose_id = 9002
L4_1.area_id = 11
L1_1[1] = L2_1
L1_1[2] = L3_1
L1_1[3] = L4_1
monsters = L1_1
L1_1 = {}
npcs = L1_1
L1_1 = {}
L2_1 = {}
L2_1.config_id = 525002
L2_1.gadget_id = 70211002
L3_1 = {}
L3_1.x = -2837.104
L3_1.y = 200.553
L3_1.z = -4018.927
L2_1.pos = L3_1
L3_1 = {}
L3_1.x = 8.868
L3_1.y = 125.895
L3_1.z = 0.0
L2_1.rot = L3_1
L2_1.level = 26
L2_1.drop_tag = "\230\136\152\230\150\151\228\189\142\231\186\167\231\168\187\229\166\187"
L3_1 = GadgetState
L3_1 = L3_1.ChestLocked
L2_1.state = L3_1
L2_1.isOneoff = true
L2_1.persistent = true
L3_1 = {}
L3_1.name = "chest"
L3_1.exp = 1
L2_1.explore = L3_1
L2_1.area_id = 11
L3_1 = {}
L3_1.config_id = 525004
L3_1.gadget_id = 70300105
L4_1 = {}
L4_1.x = -2830.018
L4_1.y = 201.165
L4_1.z = -4028.559
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 0.0
L4_1.y = 85.892
L4_1.z = 0.0
L3_1.rot = L4_1
L3_1.level = 27
L3_1.area_id = 11
L4_1 = {}
L4_1.config_id = 525007
L4_1.gadget_id = 70310001
L5_1 = {}
L5_1.x = -2835.338
L5_1.y = 200.519
L5_1.z = -4017.623
L4_1.pos = L5_1
L5_1 = {}
L5_1.x = 355.688
L5_1.y = 4.733
L5_1.z = 357.35
L4_1.rot = L5_1
L4_1.level = 27
L5_1 = GadgetState
L5_1 = L5_1.GearStart
L4_1.state = L5_1
L4_1.area_id = 11
L5_1 = {}
L5_1.config_id = 525008
L5_1.gadget_id = 70310006
L6_1 = {}
L6_1.x = -2827.675
L6_1.y = 200.767
L6_1.z = -4025.86
L5_1.pos = L6_1
L6_1 = {}
L6_1.x = 0.0
L6_1.y = 337.64
L6_1.z = 0.0
L5_1.rot = L6_1
L5_1.level = 27
L6_1 = GadgetState
L6_1 = L6_1.GearStart
L5_1.state = L6_1
L5_1.area_id = 11
L1_1[1] = L2_1
L1_1[2] = L3_1
L1_1[3] = L4_1
L1_1[4] = L5_1
gadgets = L1_1
L1_1 = {}
regions = L1_1
L1_1 = {}
L2_1 = {}
L2_1.config_id = 1525003
L2_1.name = "ANY_MONSTER_DIE_525003"
L3_1 = EventType
L3_1 = L3_1.EVENT_ANY_MONSTER_DIE
L2_1.event = L3_1
L2_1.source = ""
L2_1.condition = "condition_EVENT_ANY_MONSTER_DIE_525003"
L2_1.action = "action_EVENT_ANY_MONSTER_DIE_525003"
L1_1[1] = L2_1
triggers = L1_1
L1_1 = {}
variables = L1_1
L1_1 = {}
L1_1.suite = 1
L1_1.end_suite = 0
L1_1.rand_suite = false
init_config = L1_1
L1_1 = {}
L2_1 = {}
L3_1 = {}
L4_1 = 525001
L5_1 = 525005
L6_1 = 525006
L3_1[1] = L4_1
L3_1[2] = L5_1
L3_1[3] = L6_1
L2_1.monsters = L3_1
L3_1 = {}
L4_1 = 525002
L5_1 = 525004
L6_1 = 525007
L7_1 = 525008
L3_1[1] = L4_1
L3_1[2] = L5_1
L3_1[3] = L6_1
L3_1[4] = L7_1
L2_1.gadgets = L3_1
L3_1 = {}
L2_1.regions = L3_1
L3_1 = {}
L4_1 = "ANY_MONSTER_DIE_525003"
L3_1[1] = L4_1
L2_1.triggers = L3_1
L2_1.rand_weight = 100
L1_1[1] = L2_1
suites = L1_1
function L1_1(A0_2, A1_2)
  local L2_2, L3_2
  L2_2 = ScriptLib
  L2_2 = L2_2.GetGroupMonsterCount
  L3_2 = A0_2
  L2_2 = L2_2(L3_2)
  if L2_2 ~= 0 then
    L2_2 = false
    return L2_2
  end
  L2_2 = true
  return L2_2
end
condition_EVENT_ANY_MONSTER_DIE_525003 = L1_1
function L1_1(A0_2, A1_2)
  local L2_2, L3_2, L4_2, L5_2, L6_2
  L2_2 = ScriptLib
  L2_2 = L2_2.SetGadgetStateByConfigId
  L3_2 = A0_2
  L4_2 = 525002
  L5_2 = GadgetState
  L5_2 = L5_2.Default
  L2_2 = L2_2(L3_2, L4_2, L5_2)
  if 0 ~= L2_2 then
    L2_2 = ScriptLib
    L2_2 = L2_2.PrintContextLog
    L3_2 = A0_2
    L4_2 = "@@ LUA_WARNING : set_gadget_state_by_configId"
    L2_2(L3_2, L4_2)
    L2_2 = -1
    return L2_2
  end
  L2_2 = ScriptLib
  L2_2 = L2_2.MarkPlayerAction
  L3_2 = A0_2
  L4_2 = 4000
  L5_2 = 3
  L6_2 = 1
  L2_2 = L2_2(L3_2, L4_2, L5_2, L6_2)
  if 0 ~= L2_2 then
    L2_2 = ScriptLib
    L2_2 = L2_2.PrintContextLog
    L3_2 = A0_2
    L4_2 = "@@ LUA_WARNING : mark_playerAction"
    L2_2(L3_2, L4_2)
    L2_2 = -1
    return L2_2
  end
  L2_2 = 0
  return L2_2
end
action_EVENT_ANY_MONSTER_DIE_525003 = L1_1
