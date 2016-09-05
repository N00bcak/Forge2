package com.modapt.adventure.model.tileentities;

import com.modapt.adventure.model.ModelLightTable;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by YangYang on 4/9/2016.
 */
public class RenderLightTable extends TileEntitySpecialRenderer{
    ModelLightTable model;
    private ResourceLocation texture =new ResourceLocation("apt:textures/blocks/LightTable");
     public RenderLightTable(){
        model = new ModelLightTable();
    }
    @Override
    public void renderTileEntityAt(TileEntity tile, double x,
                                   double y, double z, float scale) {
        GL11.glPushMatrix();
        GL11.glTranslated(x+0.5,y+1.5,z+0.5);
        GL11.glRotated(180,0,0,1);
        this.bindTexture(texture);
        this.model.render((Entity)null,0,-0.1F,0,0,0,0.0625F);
        GL11.glPopMatrix();


    }
}
