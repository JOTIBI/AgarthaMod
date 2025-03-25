
package de.jotibi.agarthamod.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class UFOcontrolBlock extends Block {
	public UFOcontrolBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.ANVIL).strength(1f, 10f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}