package emu.gingerps.command.commands;

import emu.gingerps.gingerps;
import emu.gingerps.command.Command;
import emu.gingerps.command.CommandHandler;
import emu.gingerps.game.player.Player;
import emu.gingerps.utils.Utils;

import java.util.List;
import java.util.Locale;

import static emu.gingerps.utils.Language.translate;

@Command(label = "language", usage = {"[<language code>]"}, aliases = {"lang"}, targetRequirement = Command.TargetRequirement.NONE)
public final class LanguageCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        if (args.isEmpty()) {
            String curLangCode = null;
            if (sender != null) {
                curLangCode = Utils.getLanguageCode(sender.getAccount().getLocale());
            }
            else {
                curLangCode = gingerps.getLanguage().getLanguageCode();
            }
            CommandHandler.sendMessage(sender, translate(sender, "commands.language.current_language", curLangCode));
            return;
        }

        String langCode = args.get(0);

        var languageInst = gingerps.getLanguage(langCode);
        var actualLangCode = languageInst.getLanguageCode();
        var locale = Locale.forLanguageTag(actualLangCode);
        if (sender != null) {
            var account = sender.getAccount();
            account.setLocale(locale);
            account.save();
        }
        else {
            gingerps.setLanguage(languageInst);
            var config = gingerps.getConfig();
            config.language.language = locale;
            gingerps.saveConfig(config);
        }

        if (!langCode.equals(actualLangCode)) {
            CommandHandler.sendMessage(sender, translate(sender, "commands.language.language_not_found", langCode));
        }

        CommandHandler.sendMessage(sender, translate(sender, "commands.language.language_changed", actualLangCode));

    }
}
