package hyperdefined.dgr2.init;

import hyperdefined.dgr2.Reference;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;


public class Message {
	String startMsg = EnumChatFormatting.GRAY + "Running version " + Reference.VERSION + " of Dark Gems Reborn 2.";
	@SubscribeEvent
	public void PlayerLoginEvent(PlayerEvent.PlayerLoggedInEvent event) {
		event.player.addChatComponentMessage(new ChatComponentText(startMsg));
	}
}