package ru.starfarm.template.command;

import org.bukkit.entity.Player;
import ru.starfarm.core.command.Command;
import ru.starfarm.core.command.argument.Argument;
import ru.starfarm.core.command.completer.Completer;
import ru.starfarm.core.command.context.CommandContext;
import ru.starfarm.core.util.component.Components;

public class TemplateCommand extends Command<Player> {

    public TemplateCommand() {
        super("template", "tm");
        prefix(Components.prefix("<gold>Template"));
        description(Components.of("Тестовая команда"));
        parameter("Строка", Argument.forString(), Completer.strings("template", "test"));
    }

    @Override
    protected void execute(CommandContext<Player> ctx) {
        var text = ctx.<String>get(0);
        ctx.respond(Components.of("Ты написал: "), Components.of(text));
    }

}
