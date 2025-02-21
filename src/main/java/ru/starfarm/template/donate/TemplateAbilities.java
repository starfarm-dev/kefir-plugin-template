package ru.starfarm.template.donate;

import lombok.Getter;
import ru.starfarm.core.donate.ability.CoreDonateAbility;

import java.util.List;

@Getter
public enum TemplateAbilities implements CoreDonateAbility.Enum {

    // Названия должны совпадать с названием донат привилегий в DonateGroup
    VIP("Описание возможностей для VIP игроков"),
    VIP_PLUS("Описание возможностей для VIP+ игроков"),
    //...
    UNIQUE("Описание возможностей для UNIQUE игроков", "Дает §cOP");


    private final List<String> description;

    TemplateAbilities(String... description) {
        this.description = List.of(description);
    }


}
