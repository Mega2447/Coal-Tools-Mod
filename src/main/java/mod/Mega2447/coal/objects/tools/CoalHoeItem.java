package mod.Mega2447.coal.objects.tools;

import net.minecraft.world.item.HoeItem;

public class CoalHoeItem extends HoeItem {
    public CoalHoeItem(int attackDamage, float attackSpeed, Properties properties) {
        super(new CoalToolMaterial(), attackDamage, attackSpeed, properties);
    }
}
