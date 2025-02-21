package ru.starfarm.template;

import org.bukkit.Material;
import ru.starfarm.core.CorePlugin;
import ru.starfarm.core.achievement.Achievements;
import ru.starfarm.core.command.Commands;
import ru.starfarm.core.donate.Donates;
import ru.starfarm.core.permission.Permissions;
import ru.starfarm.template.achievement.AchievementListener;
import ru.starfarm.template.achievement.TemplateAchievement;
import ru.starfarm.template.command.TemplateCommand;
import ru.starfarm.template.donate.TemplateAbilities;
import ru.starfarm.template.permission.AbilityPermissionProvider;

public class TemplatePlugin extends CorePlugin {

    @Override
    protected void enable() throws Exception {
        //Создание своих достижений
        Achievements.appendSection("Тестовые достижения", Material.COMMAND_BLOCK, TemplateAchievement.class);
        AchievementListener.setup(eventContext());

        //Заполнение донат возможностей
        Donates.appendAbilities("Тестовый сервер", Material.COMMAND_BLOCK, TemplateAbilities.class);
        Permissions.registerProvider(new AbilityPermissionProvider());

        //Регистрация команды
        Commands.register(new TemplateCommand());
    }

    @Override
    protected void disable() throws Exception {

    }

}
