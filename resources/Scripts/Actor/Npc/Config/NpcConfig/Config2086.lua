local L0_1, L1_1, L2_1, L3_1, L4_1, L5_1, L6_1, L7_1, L8_1, L9_1, L10_1, L11_1, L12_1, L13_1, L14_1
L0_1 = require
L1_1 = "Actor/ActorCommon"
L0_1(L1_1)
L0_1 = require
L1_1 = "Actor/Npc/Config/NpcConfigCommon"
L0_1 = L0_1(L1_1)
L1_1 = L0_1.GeneralPattern
L2_1 = L0_1.DailyCondition
L3_1 = L0_1.QuestState
L4_1 = L0_1.ActionPointType
L5_1 = L0_1.CompareOperation
L6_1 = {}
L7_1 = {}
L7_1.NpcId = "2086"
L7_1.Alias = "Npc2086"
L8_1 = {}
L9_1 = {}
L9_1.transTeleport = true
L10_1 = {}
L10_1.activityId = 2007
L10_1.activityCondId = 2007000
L10_1.isActivityValid = true
L10_1.sceneId = 3
L10_1.priority = 1
L9_1.condition = L10_1
L10_1 = {}
L11_1 = {}
L11_1.startTime = 0
L11_1.id = 1682
L12_1 = L4_1.MultiTalkPoint
L11_1.actionType1 = L12_1
L10_1[1] = L11_1
L9_1.schedulePoints = L10_1
L10_1 = {}
L10_1.transTeleport = true
L11_1 = {}
L12_1 = L2_1.Night
L11_1.daily = L12_1
L11_1.sceneId = 3
L11_1.priority = 0
L10_1.condition = L11_1
L11_1 = {}
L12_1 = {}
L12_1.startTime = 19
L12_1.id = 1804
L13_1 = L4_1.MultiTalkPoint
L12_1.actionType1 = L13_1
L11_1[1] = L12_1
L10_1.schedulePoints = L11_1
L11_1 = {}
L11_1.transTeleport = true
L12_1 = {}
L13_1 = L2_1.Day
L12_1.daily = L13_1
L12_1.sceneId = 3
L12_1.priority = 0
L11_1.condition = L12_1
L12_1 = {}
L13_1 = {}
L13_1.startTime = 7
L13_1.id = 1682
L14_1 = L4_1.MultiTalkPoint
L13_1.actionType1 = L14_1
L12_1[1] = L13_1
L11_1.schedulePoints = L12_1
L8_1[1] = L9_1
L8_1[2] = L10_1
L8_1[3] = L11_1
L7_1.DailyScheduleData = L8_1
L8_1 = {}
L9_1 = {}
L10_1 = {}
L10_1.titleStr = "NPC_TITLE_2086"
L10_1.priority = 0
L11_1 = {}
L12_1 = {}
L13_1 = {}
L14_1 = L2_1.AllDay
L13_1.daily = L14_1
L12_1.condition = L13_1
L12_1.priority = 0
L12_1.isShow = true
L11_1[1] = L12_1
L10_1.condList = L11_1
L9_1[1] = L10_1
L8_1.titleDatas = L9_1
L7_1.TitleData = L8_1
L6_1.Data = L7_1
return L6_1
