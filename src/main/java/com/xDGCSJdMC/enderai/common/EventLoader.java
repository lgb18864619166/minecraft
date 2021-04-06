package com.xDGCSJdMC.enderai.common;

import com.xDGCSJdMC.enderai.achievement.AchievementLoader;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.Cancelable;
import net.minecraftforge.fml.common.eventhandler.EventBus;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventLoader {
	
    public static final EventBus EVENT_BUS = new EventBus();
	
	public EventLoader()
    {
        MinecraftForge.EVENT_BUS.register(this);
    }
	
	@Cancelable
    public static class PlayerKillWisdomEndermanEvent extends net.minecraftforge.event.entity.player.PlayerEvent
    {
        public final BlockPos pos;
        public final World world;

        public PlayerKillWisdomEndermanEvent(EntityPlayer player, BlockPos pos, World world)
        {
            super(player);
            this.pos = pos;
            this.world = world;
        }
    }
	
	public boolean killWisdomEnderman(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
            EnumFacing side, float hitX, float hitY, float hitZ)
    {
        EventLoader.PlayerKillWisdomEndermanEvent event;
        event = new PlayerKillWisdomEndermanEvent(playerIn, pos, worldIn);
        EventLoader.EVENT_BUS.post(event);
        if (!event.isCanceled() && !worldIn.isRemote)
        {
            return true;
        }
        return false;
    }
	
	@SubscribeEvent
    public void PlayerKillWisdomEnderman(PlayerKillWisdomEndermanEvent event)
    {
        if (!event.world.isRemote)
        {
            BlockPos pos = event.pos;
            Entity Enderman = new EntityEnderman(event.world);
            event.world.spawnEntityInWorld(Enderman);
            event.entityPlayer.triggerAchievement(AchievementLoader.beAnEnderman);
        }
    }
	

}
