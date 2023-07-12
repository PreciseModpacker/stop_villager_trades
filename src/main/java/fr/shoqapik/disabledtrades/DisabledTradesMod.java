package fr.shoqapik.disabledtrades;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.npc.Villager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(DisabledTradesMod.MODID)
public class DisabledTradesMod
{
    public static final String MODID = "disabledtrades";

    public DisabledTradesMod()
    {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void playerInterractMob(PlayerInteractEvent.EntityInteract event){
        if(event.getTarget() instanceof Villager){
            event.setCanceled(true);
        }
    }
}
