package keepcalm.mods.blockbreaksample;

import keepcalm.mods.blockbreak.BlockBreakEvent;
import net.minecraftforge.event.ForgeSubscribe;


public class BlockBreakHandler {

	@ForgeSubscribe
	public void blockBreak(BlockBreakEvent ev) {
		
		BlockBreakMain.logger.info(String.format("%s broke a block (%s:%s) at %s,%s,%s in dimension %s", new Object[] { 
				ev.player.username, 
				ev.block.blockID, 
				ev.blockMeta, 
				ev.blockX, 
				ev.blockY, 
				ev.blockZ, 
				ev.world.getWorldInfo().getDimension()
		} ));
	}
	
}
