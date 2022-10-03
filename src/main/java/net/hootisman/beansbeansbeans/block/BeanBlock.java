package net.hootisman.beansbeansbeans.block;

import net.hootisman.beansbeansbeans.registry.BeansItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BeanBlock extends Block
{
    public BeanBlock(AbstractBlock.Settings settings)
    {
        super(settings);
        
    }
    
    @Override
    @Deprecated
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit)
    {
        if(!world.isClient)
        {
            player.sendMessage(Text.of("hi"), false);
            
            ItemEntity droppedBeans = new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(BeansItems.BEAN_ITEM, 3));
            
            world.spawnEntity(droppedBeans);
            
            
        }
        return ActionResult.SUCCESS;
    }
}
