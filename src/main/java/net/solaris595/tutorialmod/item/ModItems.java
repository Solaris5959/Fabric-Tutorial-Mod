package net.solaris595.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.solaris595.tutorialmod.TutorialMod;
import net.solaris595.tutorialmod.item.custom.MetalDetectorItem;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));

    public static final Item METAL_DETECTOR = registerItem("metal_detector", new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));

    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
    public static final Item COAL_NUGGET = registerItem("coal_nugget", new Item(new FabricItemSettings()));

    public static final Item RUBY_STAFF = registerItem("ruby_staff", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new PickaxeItem(ModToolMaterial.RUBY, 2, 1.5f, new FabricItemSettings()));
    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new AxeItem(ModToolMaterial.RUBY, 7, 1f, new FabricItemSettings()));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterial.RUBY, 1, 1.5f, new FabricItemSettings()));
    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(ModToolMaterial.RUBY, 5, 2f, new FabricItemSettings()));
    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new HoeItem(ModToolMaterial.RUBY, 1, 1.5f, new FabricItemSettings()));


//    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
//        entries.add(RUBY);
//        entries.add(RAW_RUBY);
//    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}

