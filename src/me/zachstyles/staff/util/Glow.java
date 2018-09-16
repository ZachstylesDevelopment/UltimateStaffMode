package me.zachstyles.staff.util;
import org.bukkit.inventory.*;
import org.bukkit.enchantments.*;

public class Glow extends Enchantment
{
    public Glow(final int id) {
        super(id);
    }
    
    public boolean canEnchantItem(final ItemStack arg0) {
        return false;
    }
    
    public boolean conflictsWith(final Enchantment arg0) {
        return false;
    }
    
    public EnchantmentTarget getItemTarget() {
        return null;
    }
    
    public int getMaxLevel() {
        return 0;
    }
    
    public String getName() {
        return null;
    }
    
    public int getStartLevel() {
        return 0;
    }
}
