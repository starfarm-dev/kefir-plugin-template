package ru.starfarm.template.achievement;

import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import ru.starfarm.core.event.EventContext;
import ru.starfarm.core.profile.Profiles;

public class AchievementListener {

    public static void setup(EventContext events) {
        events.on(PlayerJoinEvent.class, event -> {
            Profiles.getLazy(event.getPlayer())
                    .thenAcceptAsync(profile -> profile.giveAchievement(TemplateAchievement.JOIN));
        });
        events.on(PlayerDeathEvent.class, event -> {
            Profiles.getLazy(event.getPlayer())
                    .thenAcceptAsync(profile -> profile.giveAchievement(TemplateAchievement.DEATH));
        });
    }

}
