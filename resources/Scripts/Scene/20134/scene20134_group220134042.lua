local base_info = {group_id = 220134042}
function EX_SetStarProjectorSGV(context, prev_context, config_id, light_index, is_on)
  ScriptLib.PrintContextLog(context, "## [StarProjector] EX_SetStarProjectorSGV called. light_index@" .. light_index .. " is_on@" .. is_on)
  ScriptLib.SetEntityServerGlobalValueByConfigId(context, config_id, "SGV_StarProjector_LightOn_" .. light_index, is_on)
  return 0
end
monsters = {}
npcs = {}
gadgets = {
  {
    config_id = 42001,
    gadget_id = 70310331,
    pos = {
      x = 500.098,
      y = 613.455,
      z = -1591.462
    },
    rot = {
      x = 0.0,
      y = 182.154,
      z = 0.0
    },
    level = 1,
    vision_level = VisionLevelType.VISION_LEVEL_REMOTE
  }
}
regions = {}
triggers = {}
variables = {}
init_config = {
  suite = 1,
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
  }
}
