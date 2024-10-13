package net.lettuce.missinghorsearmors.core;

import net.minecraft.world.item.AnimalArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MHAItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MissingHorseArmors.MOD_ID);

    public static final RegistryObject<Item> CHAINMAIL_HORSE_ARMOR = ITEMS.register(
            "chainmail_horse_armor", () -> new AnimalArmorItem(
                    ArmorMaterials.CHAIN,
                    AnimalArmorItem.BodyType.EQUESTRIAN,
                    false,
                    new Item.Properties().stacksTo(1)
            )
    );

    public static final RegistryObject<Item> NETHERITE_HORSE_ARMOR = ITEMS.register(
            "netherite_horse_armor", () -> new AnimalArmorItem(
                    ArmorMaterials.NETHERITE,
                    AnimalArmorItem.BodyType.EQUESTRIAN,
                    false,
                    new Item.Properties().stacksTo(1)
            )
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}