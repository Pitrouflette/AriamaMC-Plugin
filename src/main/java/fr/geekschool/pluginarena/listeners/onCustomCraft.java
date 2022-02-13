package fr.geekschool.pluginarena.listeners;

import fr.geekschool.pluginarena.Main;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.Arrays;
import java.util.HashMap;

public class onCustomCraft implements Listener {


    @EventHandler
    public void onPlayerCraft(PrepareItemCraftEvent ev){
        if(ev.getInventory().getMatrix().length > 9){
            return;
        }

        ItemStack CrystalsFrag = new ItemStack(Material.PRISMARINE_CRYSTALS);
        ItemMeta CrystalsFragM = CrystalsFrag.getItemMeta();
        CrystalsFragM.setDisplayName("§3Crystals §9Fragment");
        CrystalsFragM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        CrystalsFragM.addEnchant(Enchantment.DURABILITY, 1, true);
        CrystalsFragM.setLore(Arrays.asList("§9--------------------",
                "§e⭐⭐⭐⭐⭐",
                "§3Item Crystal : Fragement",
                "§3Ceci vous permet de craft des ",
                "§9Crystals",
                "§9--------------------"));
        CrystalsFrag.setItemMeta(CrystalsFragM);

        ItemStack CrystalsIngot = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta CrystalsIngotM = CrystalsIngot.getItemMeta();
        CrystalsIngotM.setDisplayName("§3Crystals §9Ingot");
        CrystalsIngotM.addEnchant(Enchantment.DURABILITY, 1, true);
        CrystalsIngotM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        CrystalsIngotM.setLore(Arrays.asList("§9--------------------",
                "§e⭐⭐⭐⭐⭐⭐⭐⭐",
                "§3Item Crystal : Crystals",
                "§3Elle vous permet de craft des items en",
                "§9Crystals",
                "§9--------------------"));
        CrystalsIngot.setItemMeta(CrystalsIngotM);

        ItemStack CrystalsHelmet = new ItemStack(Material.CHAINMAIL_HELMET);
        ItemMeta CrystalsHelmetM = CrystalsHelmet.getItemMeta();
        CrystalsHelmetM.setDisplayName("§3Crystals §9Helmet");
        CrystalsHelmetM.addEnchant(Enchantment.DURABILITY, 5, true);
        CrystalsHelmetM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 7, true);
        CrystalsHelmetM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        CrystalsHelmetM.setLore(Arrays.asList("§9--------------------",
                "§e⭐⭐⭐⭐⭐⭐⭐⭐",
                "§3Item Crystal : Helmet",
                "§3Ceci est un pièce de l'armure en :",
                "§9Crystals",
                "§9--------------------"));
        CrystalsHelmet.setItemMeta(CrystalsHelmetM);

        ItemStack CrystalsCHestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
        ItemMeta CrystalsCHestplateM = CrystalsCHestplate.getItemMeta();
        CrystalsCHestplateM.setDisplayName("§3Crystals §9Chestplate");
        CrystalsCHestplateM.addEnchant(Enchantment.DURABILITY, 5, true);
        CrystalsCHestplateM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 7, true);
        CrystalsCHestplateM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        CrystalsCHestplateM.setLore(Arrays.asList("§9--------------------",
                "§e⭐⭐⭐⭐⭐⭐⭐⭐",
                "§3Item Crystal : Chestplate",
                "§3Ceci est un pièce de l'armure en :",
                "§9Crystals",
                "§9--------------------"));
        CrystalsCHestplate.setItemMeta(CrystalsCHestplateM);

        ItemStack CrystalsLegg = new ItemStack(Material.CHAINMAIL_LEGGINGS);
        ItemMeta CrystalsLeggM = CrystalsLegg.getItemMeta();
        CrystalsLeggM.setDisplayName("§3Crystals §9Leggings");
        CrystalsLeggM.addEnchant(Enchantment.DURABILITY, 5, true);
        CrystalsLeggM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 7, true);
        CrystalsLeggM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        CrystalsLeggM.setLore(Arrays.asList("§9--------------------",
                "§e⭐⭐⭐⭐⭐⭐⭐⭐",
                "§3Item Crystal : Leggings",
                "§3Ceci est un pièce de l'armure en :",
                "§9Crystals",
                "§9--------------------"));
        CrystalsLegg.setItemMeta(CrystalsLeggM);

        ItemStack CrystalsBoot = new ItemStack(Material.CHAINMAIL_BOOTS);
        ItemMeta CrystalsBootM = CrystalsBoot.getItemMeta();
        CrystalsBootM.setDisplayName("§3Crystals §9Boots");
        CrystalsBootM.addEnchant(Enchantment.DURABILITY, 5, true);
        CrystalsBootM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 7, true);
        CrystalsBootM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        CrystalsBootM.setLore(Arrays.asList("§9--------------------",
                "§e⭐⭐⭐⭐⭐⭐⭐⭐",
                "§3Item Crystal : Boots",
                "§3Ceci est un pièce de l'armure en :",
                "§9Crystals",
                "§9--------------------"));
        CrystalsBoot.setItemMeta(CrystalsBootM);

        ItemStack stick = new ItemStack(Material.STICK);

        ItemStack Sharp = new ItemStack(Material.PRISMARINE_SHARD);

        checkCrat(new ItemStack(CrystalsIngot), ev.getInventory(), new HashMap<Integer, ItemStack>(){{

            put(0, CrystalsFrag);
            put(1, CrystalsFrag);
            put(2, CrystalsFrag);
            put(3, CrystalsFrag);
            put(4, CrystalsFrag);
            put(5, CrystalsFrag);
            put(6, CrystalsFrag);
            put(7, CrystalsFrag);
            put(8, CrystalsFrag);

        }});

        checkCrat(new ItemStack(CrystalsHelmet), ev.getInventory(), new HashMap<Integer, ItemStack>(){{

            put(0, CrystalsIngot);
            put(1, CrystalsIngot);
            put(2, CrystalsIngot);
            put(3, CrystalsIngot);
            put(5, CrystalsIngot);
        }});

        checkCrat(new ItemStack(CrystalsCHestplate), ev.getInventory(), new HashMap<Integer, ItemStack>(){{

            put(0, CrystalsIngot);
            put(2, CrystalsIngot);
            put(3, CrystalsIngot);
            put(4, CrystalsIngot);
            put(5, CrystalsIngot);
            put(6, CrystalsIngot);
            put(7, CrystalsIngot);
            put(8, CrystalsIngot);
        }});

        checkCrat(new ItemStack(CrystalsLegg), ev.getInventory(), new HashMap<Integer, ItemStack>(){{

            put(0, CrystalsIngot);
            put(1, CrystalsIngot);
            put(2, CrystalsIngot);
            put(3, CrystalsIngot);
            put(5, CrystalsIngot);
            put(6, CrystalsIngot);
            put(8, CrystalsIngot);
        }});

        checkCrat(new ItemStack(CrystalsBoot), ev.getInventory(), new HashMap<Integer, ItemStack>(){{

            put(3, CrystalsIngot);
            put(5, CrystalsIngot);
            put(6, CrystalsIngot);
            put(8, CrystalsIngot);

        }});
    }

    public void checkCrat(ItemStack result, CraftingInventory inv, HashMap<Integer, ItemStack> ingredients){
        ItemStack[] matrix = inv.getMatrix();
        for(int i = 0; i < 9; i++){
            if(ingredients.containsKey(i)){
                if(matrix[i] == null || !matrix[i].equals(ingredients.get(i))){
                    return;
                }
            } else {
                if(matrix[i] != null){
                    return;
                }
            }
        }
        inv.setResult(result);
    }
}