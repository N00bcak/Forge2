package com.modapt.adventure;

import com.modapt.adventure.items.*;
import com.modapt.adventure.main.ClientProxy;
import com.modapt.adventure.main.TutorialEventHandler;
import com.modapt.adventure.tiles.TileTable;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = "apt",name = "apertureMod",version = "1.0")
public class tutorialMod {
    public static Item itemNew;
    public static Item Mash;
    public static Item HotMash;
    public static Item TerranMultiTool;
    public static Item TerranBlade;
    public static Item StringLashing;
    public static com.modapt.adventure.items.Fat Fat;
    public static Block LightTable;
    TutorialEventHandler events = new TutorialEventHandler();

public static final Item.ToolMaterial territe = EnumHelper.addToolMaterial("Territe",2,2000,4.7F,2.5F,20);
 @EventHandler
    public void preInit(FMLPreInitializationEvent event){
//Item/Block init and registering
    //Config
     //Items
    Fat = (com.modapt.adventure.items.Fat) new Fat().setUnlocalizedName("Fat").setCreativeTab(tabaperture);
    itemNew = new itemNew().setUnlocalizedName("itemNew").setTextureName("apt:itemNew").setCreativeTab(tabaperture);
     //Foods
    Mash = new ItemFood(4,0.4F,false).setUnlocalizedName("Mash").setTextureName("apt:Mash").setCreativeTab(tabaperture);
    HotMash = new ItemFood(8,1.0F,false).setUnlocalizedName("HotMash").setTextureName("apt:Cooked Mash").setCreativeTab(tabaperture);
    //Blocks
   LightTable = new LightTable(Material.iron).setBlockName("LightTable").setBlockTextureName("apt:LightTable").setCreativeTab(tabaperture);
//Tools
    TerranMultiTool= new TerranMultiTool(territe).setUnlocalizedName("TerranMultiTool").setCreativeTab(tabaperture);
     TerranBlade= new TerranBlade(territe).setUnlocalizedName("TerranBlade").setTextureName("apt:TerranBlade").setCreativeTab(tabaperture);
//Registering Items
    GameRegistry.registerItem(itemNew,itemNew.getUnlocalizedName().substring(5));
     GameRegistry.registerItem(Fat,Fat.getUnlocalizedName().substring(5));
     //Food
    GameRegistry.registerItem(Mash,Mash.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(HotMash,HotMash.getUnlocalizedName().substring(5));
     //Tools
    GameRegistry.registerItem(TerranMultiTool,TerranMultiTool.getUnlocalizedName().substring(5));
     GameRegistry.registerItem(TerranBlade,TerranBlade.getUnlocalizedName().substring(5));
     //Blocks
    GameRegistry.registerBlock(LightTable,LightTable.getUnlocalizedName());
    GameRegistry.addSmelting(Mash,new ItemStack(HotMash),3.5F);
     //Registering Techne Models
     ClientProxy.RegisterRenderers();
}
    @EventHandler
    public void Init(FMLInitializationEvent event) {
//Proxy,TileEntity,entity,GUI & Packet Register
        GameRegistry.registerTileEntity(TileTable.class, "TileTable");
        GameRegistry.addRecipe(new ItemStack(itemNew), new Object[]{" R ", " R ", "RSR",
                'R', Items.redstone, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(LightTable), new Object[]{"WWW", "GWG", "WWW", 'W', Blocks.wooden_slab, 'G', Items.flint});
        MinecraftForge.EVENT_BUS.register(new TutorialEventHandler.GUIRenderEventClass());
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
    public static final CreativeTabs tabaperture= new CreativeTabs("tabaperture") {
        @Override
        public Item getTabIconItem() {
            return new ItemStack(LightTable).getItem();
        }
    };
}