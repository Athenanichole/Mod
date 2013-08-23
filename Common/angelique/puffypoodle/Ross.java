package angelique.puffypoodle;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_N, version = Reference.MOD_V)
@NetworkMod(serverSideRequired = false, clientSideRequired = true)
public class Ross {

    @Instance(Reference.MOD_N)
    public static Ross instance;

    @SidedProxy(clientSide = "angelique.puffypoodle.client.ClientProxy", serverSide = "angelique.puffypoodle.CommonProxy")
    public static CommonProxy proxy;

    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        BlockHandler.configureBlocks(config);
        config.save();
        
        BlockHandler.registerBlocks(new GameRegistry());
        BlockHandler.setName(new LanguageRegistry());
        BlockHandler.harvestLevel(new MinecraftForge());

    }

    @Init
    public void load(FMLInitializationEvent event) {

    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event) {

    }

}
