package hyperdefined.dgr2.init;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import hyperdefined.dgr2.Reference;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class Message {
	String startMsg = EnumChatFormatting.GRAY + "Running version " + Reference.VERSION + " of Dark Gems Reborn 2.";
	@SubscribeEvent
	public void PlayerLoginEvent(PlayerEvent.PlayerLoggedInEvent event) {
		event.player.addChatComponentMessage(new ChatComponentText(startMsg));
	}
}