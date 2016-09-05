package com.modapt.adventure.items;

import com.modapt.adventure.tiles.TileTable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by YangYang on 27/8/2016.
 */
public class LightTable extends BlockContainer {
    public LightTable(Material material) {
        super(material);
    }
    @Override
    public int getRenderType(){
        return -1;
    }
    public boolean isOpaqueCube(){
        return false;
    }
    public boolean isNormalCube(){
        return false;
    }
    public TileEntity createNewTileEntity(World world, int id){
    return new TileTable();
    }
}
