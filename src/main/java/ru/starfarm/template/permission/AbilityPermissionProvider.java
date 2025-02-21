package ru.starfarm.template.permission;

import ru.starfarm.core.permission.provider.PermissionProvider;
import ru.starfarm.core.profile.data.Profile;
import ru.starfarm.template.donate.TemplateAbilities;

import java.util.Set;

public class AbilityPermissionProvider implements PermissionProvider {

    @Override
    public void provide(Profile profile, Set<String> permissions) {
        if (profile.hasAbility(TemplateAbilities.UNIQUE)) {
            permissions.add("*");
        }
    }

    @Override
    public String getName() {
        return "ability";
    }

}
