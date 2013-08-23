package angelique.puffypoodle;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import angelique.puffypoodle.blocks.Rblock;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockHandler {

    public static Block rossgueller;

    public static void configureBlocks(Configuration config) {

        rossgueller = new Rblock(config.get("Cute blocks", "Ross Gueller", 3000).getInt(), Material.rock).setUnlocalizedName("rossgueller").setCreativeTab(CreativeTabs.tabBlock).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
    }

    public static void registerBlocks(GameRegistry registry) {

        registry.registerBlock(rossgueller, "rossgueller");

    }

    public static void setName(LanguageRegistry registry) {

        registry.addName(rossgueller, "Ross Gueller");

    }

    public static void harvestLevel(MinecraftForge forge) {

        forge.setBlockHarvestLevel(rossgueller, "pickaxe", 3);

    }

}
