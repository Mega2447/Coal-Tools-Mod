package mod.Mega2447.coal.objects.tools;

import net.minecraft.world.item.AxeItem;

public class CoalAxeItem extends AxeItem {
    public CoalAxeItem(float attackDamageIn, float attackSpeedIn, Properties builder) {
        super(new CoalToolMaterial(), attackDamageIn, attackSpeedIn, builder);
    }
}
