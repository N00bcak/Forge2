package com.modapt.adventure.main;

import com.modapt.adventure.tutorialMod;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
/**
 * Created by YangYang on 28/8/2016.
 */
public class TutorialEventHandler {
    public static class GUIRenderEventClass {

        @SubscribeEvent
        public void playerKilledChicken(LivingDropsEvent event)
        {
            if(event.entityLiving instanceof EntityPig)
            {

                ItemStack itemStackToDrop = new ItemStack(tutorialMod.Fat, 1);
                event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX,
                        event.entity.posY, event.entity.posZ, itemStackToDrop));



            }

        }
        public Object instance;
        public GUIRenderEventClass(){}
    }
}
