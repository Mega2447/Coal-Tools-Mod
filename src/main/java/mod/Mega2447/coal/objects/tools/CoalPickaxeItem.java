package mod.Mega2447.coal.objects.tools;

import net.minecraft.world.item.PickaxeItem;

public class CoalPickaxeItem extends PickaxeItem {
    public CoalPickaxeItem(int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(new CoalToolMaterial(), attackDamageIn, attackSpeedIn, builder);
    }
}
