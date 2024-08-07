package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import com.axperty.storagedelight.block.entity.DrawerBlockEntity;
import com.axperty.storagedelight.block.entity.DrawerDoorBlockEntity;
import com.axperty.storagedelight.block.entity.GlassCabinetBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntityTypes {
    public static final DeferredRegister<BlockEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, StorageDelight.MOD_ID);

    public static final RegistryObject<BlockEntityType<DrawerBlockEntity>> DRAWER = TILES.register("drawer",
            () -> BlockEntityType.Builder.of(DrawerBlockEntity::new,
                            ModBlocks.OAK_DRAWER.get(),
                            ModBlocks.BIRCH_DRAWER.get(),
                            ModBlocks.SPRUCE_DRAWER.get(),
                            ModBlocks.JUNGLE_DRAWER.get(),
                            ModBlocks.ACACIA_DRAWER.get(),
                            ModBlocks.DARK_OAK_DRAWER.get(),
                            ModBlocks.BAMBOO_DRAWER.get(),
                            ModBlocks.CHERRY_DRAWER.get(),
                            ModBlocks.MANGROVE_DRAWER.get(),
                            ModBlocks.CRIMSON_DRAWER.get(),
                            ModBlocks.WARPED_DRAWER.get())
                    .build(null));

    public static final RegistryObject<BlockEntityType<DrawerDoorBlockEntity>> DRAWER_DOOR = TILES.register("drawer_door",
            () -> BlockEntityType.Builder.of(DrawerDoorBlockEntity::new,
                            ModBlocks.OAK_DRAWER_WITH_DOOR.get(),
                            ModBlocks.BIRCH_DRAWER_WITH_DOOR.get(),
                            ModBlocks.SPRUCE_DRAWER_WITH_DOOR.get(),
                            ModBlocks.JUNGLE_DRAWER_WITH_DOOR.get(),
                            ModBlocks.ACACIA_DRAWER_WITH_DOOR.get(),
                            ModBlocks.DARK_OAK_DRAWER_WITH_DOOR.get(),
                            ModBlocks.BAMBOO_DRAWER_WITH_DOOR.get(),
                            ModBlocks.CHERRY_DRAWER_WITH_DOOR.get(),
                            ModBlocks.MANGROVE_DRAWER_WITH_DOOR.get(),
                            ModBlocks.CRIMSON_DRAWER_WITH_DOOR.get(),
                            ModBlocks.WARPED_DRAWER_WITH_DOOR.get())
                    .build(null));

    public static final RegistryObject<BlockEntityType<GlassCabinetBlockEntity>> GLASS_CABINET = TILES.register("glass_cabinet",
            () -> BlockEntityType.Builder.of(GlassCabinetBlockEntity::new,
                            ModBlocks.GLASS_OAK_CABINET.get(),
                            ModBlocks.GLASS_BIRCH_CABINET.get(),
                            ModBlocks.GLASS_SPRUCE_CABINET.get(),
                            ModBlocks.GLASS_JUNGLE_CABINET.get(),
                            ModBlocks.GLASS_ACACIA_CABINET.get(),
                            ModBlocks.GLASS_DARK_OAK_CABINET.get(),
                            ModBlocks.GLASS_BAMBOO_CABINET.get(),
                            ModBlocks.GLASS_CHERRY_CABINET.get(),
                            ModBlocks.GLASS_MANGROVE_CABINET.get(),
                            ModBlocks.GLASS_CRIMSON_CABINET.get(),
                            ModBlocks.GLASS_WARPED_CABINET.get())
                    .build(null));

    public static final RegistryObject<BlockEntityType<GlassCabinetBlockEntity>> CABINET_VARIANT = TILES.register("cabinet_variant",
            () -> BlockEntityType.Builder.of(GlassCabinetBlockEntity::new,
                            ModBlocks.OAK_CABINET_WITH_GLASS_DOORS.get(),
                            ModBlocks.BIRCH_CABINET_WITH_GLASS_DOORS.get(),
                            ModBlocks.SPRUCE_CABINET_WITH_GLASS_DOORS.get(),
                            ModBlocks.JUNGLE_CABINET_WITH_GLASS_DOORS.get(),
                            ModBlocks.ACACIA_CABINET_WITH_GLASS_DOORS.get(),
                            ModBlocks.DARK_OAK_CABINET_WITH_GLASS_DOORS.get(),
                            ModBlocks.BAMBOO_CABINET_WITH_GLASS_DOORS.get(),
                            ModBlocks.CHERRY_CABINET_WITH_GLASS_DOORS.get(),
                            ModBlocks.MANGROVE_CABINET_WITH_GLASS_DOORS.get(),
                            ModBlocks.CRIMSON_CABINET_WITH_GLASS_DOORS.get(),
                            ModBlocks.WARPED_CABINET_WITH_GLASS_DOORS.get(),
                            ModBlocks.OAK_SINGLE_DOOR_CABINET.get(),
                            ModBlocks.BIRCH_SINGLE_DOOR_CABINET.get(),
                            ModBlocks.SPRUCE_SINGLE_DOOR_CABINET.get(),
                            ModBlocks.JUNGLE_SINGLE_DOOR_CABINET.get(),
                            ModBlocks.ACACIA_SINGLE_DOOR_CABINET.get(),
                            ModBlocks.DARK_OAK_SINGLE_DOOR_CABINET.get(),
                            ModBlocks.BAMBOO_SINGLE_DOOR_CABINET.get(),
                            ModBlocks.CHERRY_SINGLE_DOOR_CABINET.get(),
                            ModBlocks.MANGROVE_SINGLE_DOOR_CABINET.get(),
                            ModBlocks.CRIMSON_SINGLE_DOOR_CABINET.get(),
                            ModBlocks.WARPED_SINGLE_DOOR_CABINET.get())
                    .build(null));
}
