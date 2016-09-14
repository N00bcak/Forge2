package com.modapt.adventure.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionHelper;
import net.minecraft.world.World;
import net.minecraft.item.Item;
public class ItemTntStick extends Item {
    public ItemTntStick(){
        this.setFull3D();
        this.setMaxStackSize(16);
    }
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer){

        /* This method in World spawn in an entity,
        * You can use with anything that extends
        * the Entity class, in this case it's
        * the EntityGrenade class
        */
        par2World.spawnEntityInWorld(new EntityGrenade(par2World, par3EntityPlayer));
        //Decrease an item from the stack because you used it!
            --par1ItemStack.stackSize;
        return par1ItemStack;
    }
    public boolean hasEffect(ItemStack par1ItemStack, int pass)
    {
        //This means it will look "special" in the inventory
        return true;
    }
}
