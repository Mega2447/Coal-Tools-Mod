package mod.Mega2447.coal.objects.tools;

import net.minecraft.item.SwordItem;

public class CoalSwordItem extends SwordItem {
    public CoalSwordItem(int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(new CoalToolMaterial(), attackDamageIn, attackSpeedIn, builderIn);
    }
}
