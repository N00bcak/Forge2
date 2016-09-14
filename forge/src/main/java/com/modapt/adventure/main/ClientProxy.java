package com.modapt.adventure.main;
import com.modapt.adventure.items.EntityGrenade;
import com.modapt.adventure.model.tileentities.GenericBlockItemRenderer;
import com.modapt.adventure.model.tileentities.RenderLightTable;
import com.modapt.adventure.tiles.TileTable;
import com.modapt.adventure.tutorialMod;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

/**
 * Created by YangYang on 4/9/2016.
 */
public class ClientProxy extends CommonProxy{
    public static void RegisterRenderers(){
        ClientRegistry.bindTileEntitySpecialRenderer(TileTable.class,new RenderLightTable());
        RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class, new RenderSnowball(tutorialMod.tntStick));
        RegisterItemRenderers();
    }
 public static void RegisterItemRenderers(){
     MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(tutorialMod.LightTable),
             new GenericBlockItemRenderer(new TileTable(),new RenderLightTable()));
 }
}
