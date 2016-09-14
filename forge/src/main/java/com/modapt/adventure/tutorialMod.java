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
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
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
    public static Item cookedFats;
    public static Item siewYuk;
    public static Item tntPickaxe;
    public static Item tntAxe;
    public static Item tntSword;
    public static Item tntHoe;
    public static Item tntSpade;
    public static Item tntStick;
    public static Item tntHelmet;
    public static Item tntChestplate;
    public static Item tntLeggings;
    public static Item tntBoots;
    public static Block blockFats;
    public static Block LightTable;
    TutorialEventHandler events = new TutorialEventHandler();
public static final Item.ToolMaterial tntToolMaterial = EnumHelper.addToolMaterial("tntToolMaterial", 4, 100, 10.0F, 9.0F, 30);
public static final ItemArmor.ArmorMaterial tntArmorMaterial = EnumHelper.addArmorMaterial("tntArmorMaterial", 4000, new int[]{10,14,8,8}, 30);
public static final Item.ToolMaterial territe = EnumHelper.addToolMaterial("Territe",2,2000,4.7F,2.5F,20);
 @EventHandler
    public void preInit(FMLPreInitializationEvent event){
//Item/Block init and registering
    //Config
     //Items
    Fat = (com.modapt.adventure.items.Fat) new Fat().setUnlocalizedName("Fat").setTextureName("apt:itemfats").setCreativeTab(tabaperture);
    itemNew = new itemNew().setUnlocalizedName("itemNew").setTextureName("apt:itemNew").setCreativeTab(tabaperture);
     cookedFats = new ItemFood(6, 0.9F, false).setUnlocalizedName("CookedFats").setTextureName("apt:cookedfats").setCreativeTab(tabaperture);
       siewYuk = new ItemFood(6, 0.9F, true).setUnlocalizedName("SiewYuk").setTextureName("apt:siewyuk").setCreativeTab(tabaperture);

       blockFats = new BlockFats(Material.glass).setBlockName("BlockFats").setBlockTextureName("apt:blockfats").setCreativeTab(tabaperture);

       tntPickaxe = new ItemTntPickaxe(tntToolMaterial).setUnlocalizedName("TntPickaxe").setTextureName("apt:tntpickaxe").setCreativeTab(tabaperture);
       tntAxe = new ItemTntAxe(tntToolMaterial).setUnlocalizedName("TntAxe").setTextureName("pat:tntaxe").setCreativeTab(tabaperture);
       tntSword = new ItemTntSword(tntToolMaterial).setUnlocalizedName("TntSword").setTextureName("at:tntsword").setCreativeTab(tabaperture);
       tntHoe = new ItemTntHoe(tntToolMaterial).setUnlocalizedName("TntHoe").setTextureName("apt:tnthoe").setCreativeTab(tabaperture);
       tntSpade = new ItemTntSpade(tntToolMaterial).setUnlocalizedName("TntSpade").setTextureName("apt:tntspade").setCreativeTab(tabaperture);
       tntStick = new ItemTntStick().setUnlocalizedName("TntStick").setTextureName("apt:tntstick").setCreativeTab(tabaperture);

       tntHelmet = new ItemTntArmor(tntArmorMaterial, 0, 0).setUnlocalizedName("TntHelmet").setTextureName("apt:tnthelmet").setCreativeTab(tabaperture);
       tntChestplate = new ItemTntArmor(tntArmorMaterial, 0, 1).setUnlocalizedName("TntChestplate").setTextureName("apt:tntchestplate").setCreativeTab(tabaperture);
       tntLeggings = new ItemTntArmor(tntArmorMaterial, 0, 2).setUnlocalizedName("TntLeggings").setTextureName("apt:tntleggings").setCreativeTab(tabaperture);
       tntBoots = new ItemTntArmor(tntArmorMaterial, 0, 3).setUnlocalizedName("TntBoots").setTextureName("apt:tntboots").setCreativeTab(tabaperture);
     //Foods
    Mash = new ItemFood(4,0.4F,false).setUnlocalizedName("Mash").setTextureName("apt:Mash").setCreativeTab(tabaperture);
    HotMash = new ItemFood(8,1.0F,false).setUnlocalizedName("HotMash").setTextureName("apt:Cooked Mash").setCreativeTab(tabaperture);
    //Blocks
   LightTable = new LightTable(Material.iron).setBlockName("LightTable").setBlockTextureName("apt:LightTable").setCreativeTab(tabaperture);
//Tools
    TerranMultiTool= new TerranMultiTool(territe).setUnlocalizedName("TerranMultiTool").setCreativeTab(tabaperture);
     TerranBlade= new TerranBlade(territe).setUnlocalizedName("TerranBlade").setTextureName("apt:TerranBlade").setCreativeTab(tabaperture);
//Registering Items
       GameRegistry.registerItem(cookedFats, cookedFats.getUnlocalizedName().substring(5));
       GameRegistry.registerItem(siewYuk, siewYuk.getUnlocalizedName().substring(5));
       GameRegistry.registerItem(tntPickaxe, tntPickaxe.getUnlocalizedName().substring(5));
       GameRegistry.registerItem(tntAxe, tntAxe.getUnlocalizedName().substring(5));
       GameRegistry.registerItem(tntSword, tntSword.getUnlocalizedName().substring(5));
       GameRegistry.registerItem(tntHoe, tntHoe.getUnlocalizedName().substring(5));
       GameRegistry.registerItem(tntSpade, tntSpade.getUnlocalizedName().substring(5));
       GameRegistry.registerItem(tntStick, tntStick.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(itemNew,itemNew.getUnlocalizedName().substring(5));
     GameRegistry.registerItem(Fat,Fat.getUnlocalizedName().substring(5));
     //Food
    GameRegistry.registerItem(Mash,Mash.getUnlocalizedName().substring(5));
    GameRegistry.registerItem(HotMash,HotMash.getUnlocalizedName().substring(5));
     //Tools
    GameRegistry.registerItem(TerranMultiTool,TerranMultiTool.getUnlocalizedName().substring(5));
     GameRegistry.registerItem(TerranBlade,TerranBlade.getUnlocalizedName().substring(5));
     //Blocks
     GameRegistry.registerBlock(blockFats, blockFats.getUnlocalizedName().substring(5));
    GameRegistry.registerBlock(LightTable,LightTable.getUnlocalizedName());
    //Smelting Recipes
    GameRegistry.addSmelting(Mash,new ItemStack(HotMash),3.5F);
    GameRegistry.addSmelting(Fat, new ItemStack(cookedFats), 3.0F);
     //Registering Techne Models
     ClientProxy.RegisterRenderers();
}
    @EventHandler
    public void Init(FMLInitializationEvent event) {
//Proxy,TileEntity,entity,GUI & Packet Register
        GameRegistry.registerTileEntity(TileTable.class, "TileTable");
         GameRegistry.addRecipe(new ItemStack(Fat, 4), new Object[]{"   ", "PPP", "   ", 'P', Items.porkchop});
       GameRegistry.addRecipe(new ItemStack(Fat, 9), new Object[]{"   ", " B ", "   ", 'B', blockFats});
       GameRegistry.addRecipe(new ItemStack(blockFats), new Object[]{"FFF", "FFF", "FFF", 'F', Fat});
       GameRegistry.addRecipe(new ItemStack(siewYuk), new Object[]{"   ", " C ", " P ", 'C', cookedFats, 'P', Items.cooked_porkchop});

        GameRegistry.addRecipe(new ItemStack(itemNew), new Object[]{" R ", " R ", "RSR",
                'R', Items.redstone, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(LightTable), new Object[]{"WWW", "GWG", "WWW", 'W', Blocks.wooden_slab, 'G', Items.flint});
       GameRegistry.addRecipe(new ItemStack(tntPickaxe), new Object[]{"TTT", " S ", " S ", 'T', Blocks.tnt, 'S', Items.stick});
       GameRegistry.addRecipe(new ItemStack(tntAxe), new Object[]{"TT ", "TS ", " S ", 'T', Blocks.tnt, 'S', Items.stick});
       GameRegistry.addRecipe(new ItemStack(tntSpade), new Object[]{" T ", " S ", " S ", 'T', Blocks.tnt, 'S', Items.stick});
       GameRegistry.addRecipe(new ItemStack(tntSword), new Object[]{" T ", " T ", " S ", 'T', Blocks.tnt, 'S', Items.stick});
       GameRegistry.addRecipe(new ItemStack(tntHoe), new Object[]{"TT ", " S ", " S ", 'T', Blocks.tnt, 'S', Items.stick});
       GameRegistry.addRecipe(new ItemStack(tntStick, 16), new Object[]{"   ", " T ", " S ", 'T', Blocks.tnt, 'S', Items.stick});
       EntityRegistry.registerModEntity(EntityGrenade.class, "Grenade", 4, this, 80, 3, true);
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
