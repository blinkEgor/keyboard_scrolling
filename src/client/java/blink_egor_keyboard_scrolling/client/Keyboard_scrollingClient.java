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
// for detecting mod identifer
import net.minecraft.resources.Identifier;

public class Keyboard_scrollingClient implements ClientModInitializer {
    public static final KeyMapping.Category CATEGORY = KeyMapping.Category.register( Identifier.fromNamespaceAndPath( "keyboard_scrolling", "main" ) );

    public static final KeyMapping SCROLL_KEY = new KeyMapping( "key.keyboard_scrolling.scroll", InputConstants.Type.KEYSYM, InputConstants.KEY_N, CATEGORY );

	@Override
	public void onInitializeClient()
    {
        KeyBindingHelper.registerKeyBinding( SCROLL_KEY );

        ClientTickEvents.END_CLIENT_TICK.register( client ->
        {
            if ( client.player == null ) return;

            Inventory inv = client.player.getInventory(  );

            while ( SCROLL_KEY.consumeClick(  ) )
            {
                int current = inv.getSelectedSlot(  );
                int next_slot;

                if ( client.hasShiftDown(  ) )
                {
                    next_slot = ( current - 1 + 9 ) % 9;
                }
                else
                {
                    next_slot = ( current + 1 ) % 9;
                }

                inv.setSelectedSlot( next_slot );
            }
        });
	}
}
