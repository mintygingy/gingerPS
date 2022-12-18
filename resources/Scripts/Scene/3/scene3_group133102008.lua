local L0_1, L1_1, L2_1, L3_1, L4_1, L5_1, L6_1, L7_1, L8_1
L0_1 = {}
L0_1.group_id = 133102008
L1_1 = {}
L2_1 = {}
L2_1.config_id = 8001
L2_1.monster_id = 22010201
L3_1 = {}
L3_1.x = 1938.674
L3_1.y = 258.146
L3_1.z = 755.031
L2_1.pos = L3_1
L3_1 = {}
L3_1.x = 353.287
L3_1.y = 95.152
L3_1.z = 356.892
L2_1.rot = L3_1
L2_1.level = 25
L2_1.drop_id = 1000100
L2_1.pose_id = 9013
L2_1.area_id = 5
L3_1 = {}
L3_1.config_id = 8002
L3_1.monster_id = 21010601
L4_1 = {}
L4_1.x = 1950.53
L4_1.y = 261.129
L4_1.z = 758.444
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 3.117
L4_1.y = 251.186
L4_1.z = 0.827
L3_1.rot = L4_1
L3_1.level = 25
L3_1.drop_id = 1000100
L3_1.pose_id = 9012
L3_1.area_id = 5
L4_1 = {}
L4_1.config_id = 8003
L4_1.monster_id = 21010201
L5_1 = {}
L5_1.x = 1951.446
L5_1.y = 260.654
L5_1.z = 753.838
L4_1.pos = L5_1
L5_1 = {}
L5_1.x = 2.583
L5_1.y = 273.112
L5_1.z = 1.931
L4_1.rot = L5_1
L4_1.level = 25
L4_1.drop_id = 1000100
L4_1.pose_id = 9012
L4_1.area_id = 5
L5_1 = {}
L5_1.config_id = 8004
L5_1.monster_id = 21010201
L6_1 = {}
L6_1.x = 1943.895
L6_1.y = 256.976
L6_1.z = 745.771
L5_1.pos = L6_1
L6_1 = {}
L6_1.x = 357.756
L6_1.y = 10.387
L6_1.z = 2.316
L5_1.rot = L6_1
L5_1.level = 25
L5_1.drop_id = 1000100
L5_1.pose_id = 9012
L5_1.area_id = 5
L6_1 = {}
L6_1.config_id = 8005
L6_1.monster_id = 21010601
L7_1 = {}
L7_1.x = 1949.138
L7_1.y = 259.178
L7_1.z = 748.463
L6_1.pos = L7_1
L7_1 = {}
L7_1.x = 0.45
L7_1.y = 154.325
L7_1.z = 356.807
L6_1.rot = L7_1
L6_1.level = 25
L6_1.drop_id = 1000100
L6_1.pose_id = 9012
L6_1.area_id = 5
L1_1[1] = L2_1
L1_1[2] = L3_1
L1_1[3] = L4_1
L1_1[4] = L5_1
L1_1[5] = L6_1
monsters = L1_1
L1_1 = {}
npcs = L1_1
L1_1 = {}
L2_1 = {}
L2_1.config_id = 8007
L2_1.gadget_id = 70220013
L3_1 = {}
L3_1.x = 1941.819
L3_1.y = 259.425
L3_1.z = 759.713
L2_1.pos = L3_1
L3_1 = {}
L3_1.x = 354.871
L3_1.y = 68.947
L3_1.z = 359.105
L2_1.rot = L3_1
L2_1.level = 1
L2_1.area_id = 5
L3_1 = {}
L3_1.config_id = 8008
L3_1.gadget_id = 70220013
L4_1 = {}
L4_1.x = 1938.121
L4_1.y = 256.293
L4_1.z = 748.637
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 1.444
L4_1.y = 326.784
L4_1.z = 5.457
L3_1.rot = L4_1
L3_1.level = 1
L3_1.area_id = 5
L1_1[1] = L2_1
L1_1[2] = L3_1
gadgets = L1_1
L1_1 = {}
regions = L1_1
L1_1 = {}
L2_1 = {}
L2_1.config_id = 1008010
L2_1.name = "ANY_MONSTER_DIE_8010"
L3_1 = EventType
L3_1 = L3_1.EVENT_ANY_MONSTER_DIE
L2_1.event = L3_1
L2_1.source = ""
L2_1.condition = "condition_EVENT_ANY_MONSTER_DIE_8010"
L2_1.action = "action_EVENT_ANY_MONSTER_DIE_8010"
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
L4_1 = 8001
L5_1 = 8002
L6_1 = 8003
L7_1 = 8004
L8_1 = 8005
L3_1[1] = L4_1
L3_1[2] = L5_1
L3_1[3] = L6_1
L3_1[4] = L7_1
L3_1[5] = L8_1
L2_1.monsters = L3_1
L3_1 = {}
L4_1 = 8007
L5_1 = 8008
L3_1[1] = L4_1
L3_1[2] = L5_1
L2_1.gadgets = L3_1
L3_1 = {}
L2_1.regions = L3_1
L3_1 = {}
L4_1 = "ANY_MONSTER_DIE_8010"
L3_1[1] = L4_1
L2_1.triggers = L3_1
L2_1.rand_weight = 100
L3_1 = {}
L4_1 = {}
L3_1.monsters = L4_1
L4_1 = {}
L3_1.gadgets = L4_1
L4_1 = {}
L3_1.regions = L4_1
L4_1 = {}
L3_1.triggers = L4_1
L3_1.rand_weight = 100
L1_1[1] = L2_1
L1_1[2] = L3_1
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
condition_EVENT_ANY_MONSTER_DIE_8010 = L1_1
function L1_1(A0_2, A1_2)
  local L2_2, L3_2, L4_2
  L2_2 = ScriptLib
  L2_2 = L2_2.AddQuestProgress
  L3_2 = A0_2
  L4_2 = "133102008"
  L2_2 = L2_2(L3_2, L4_2)
  if 0 ~= L2_2 then
    L2_2 = ScriptLib
    L2_2 = L2_2.PrintContextLog
    L3_2 = A0_2
    L4_2 = "@@ LUA_WARNING : add_quest_progress"
    L2_2(L3_2, L4_2)
    L2_2 = -1
    return L2_2
  end
  L2_2 = 0
  return L2_2
end
action_EVENT_ANY_MONSTER_DIE_8010 = L1_1