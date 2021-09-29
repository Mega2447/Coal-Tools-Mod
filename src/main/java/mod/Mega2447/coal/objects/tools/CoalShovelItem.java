package mod.Mega2447.coal.objects.tools;

import net.minecraft.world.item.ShovelItem;

public class CoalShovelItem extends ShovelItem {
    public CoalShovelItem(float attackDamageIn, float attackSpeedIn, Properties builder) {
        super(new CoalToolMaterial(), attackDamageIn, attackSpeedIn, builder);
    }
}
