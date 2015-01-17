package com.R3ap3rG.gcraft.gui;

import com.R3ap3rG.gcraft.reference.Reference;
import com.R3ap3rG.gcraft.tileentity.TileEntityCompressor;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class CompressorGui extends GuiContainer{

    public TileEntityCompressor compressor;

    public static final ResourceLocation bkGround = new ResourceLocation(Reference.MOD_ID, "/textures/gui/" + Reference.GUI_COMPRESSOR);

    public CompressorGui(InventoryPlayer inventoryPlayer, TileEntityCompressor entity) {
        super(ContainerCompressor(inventoryPlayer, entity));

        this.compressor = entity;

        this.xSize = 176;
        this.ySize = 166;
    }

    public void drawGuiContainerForegroundLayer(int r1, int r2){
        String name = this.compressor.hasCustomInventoryName()? this.compressor.getInventoryName() : I18n.format(this.compressor.getInventoryName(),new Object[0]);
        this.fontRendererObj.drawString(name, this.xSize/2 - this.fontRendererObj.getStringWidth(name)/2, 6 ,4210752);
        this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]),8,this.ySize - 96 + 2, 4210752);
    }


    @Override
    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {

    }
}
