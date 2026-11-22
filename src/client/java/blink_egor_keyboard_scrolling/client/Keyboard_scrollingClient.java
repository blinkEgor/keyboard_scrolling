package blink_egor_keyboard_scrolling.client;

import net.fabricmc.api.ClientModInitializer;

// for KeyBindingHelper, allow me to add keybinding in minecraft setting menu
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
// it need for checking if the key pressed
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
// need for: KeyMapping.consumeClick(  ) it returns true if key pressed once; KeyMapping.Category add category settings in menu
import net.minecraft.client.KeyMapping;
// it need for access to all key constants
import com.mojang.blaze3d.platform.InputConstants;
// for controlling player's hotbar slots e.g.: client.player.getInventory().setSelectedSlot(int)
import net.minecraft.world.entity.player.Inventory;

public class Keyboard_scrollingClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
	}
}
