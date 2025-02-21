package ru.starfarm.template.achievement;

import lombok.Getter;
import ru.starfarm.core.achievement.CoreAchievement;

import java.util.List;

@Getter
public enum TemplateAchievement implements CoreAchievement.Enum {

    JOIN("Вход", "Войдите на сервер"),
    DEATH("Смерть", "Умрите...");


    private final String name;
    private final List<String> description;

    TemplateAchievement(String name, String... description) {
        this.name = name;
        this.description = List.of(description);
    }


    @Override
    public String getSection() {
        return "TEMPLATE"; // Название секции достижений
    }

}
