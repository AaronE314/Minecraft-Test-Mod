package com.Aaron.test1.client.handler;

import com.Aaron.test1.client.Settings.Keybindings;
import com.Aaron.test1.reference.Key;
import com.Aaron.test1.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;


public class KeyInputEventHandler {

    private static Key getPressedKeyBinding(){
        if (Keybindings.charge.isPressed())
        {
            return Key.CHARGE;
        }
        else if (Keybindings.release.isPressed())
        {
            return Key.RELEASE;
        }

        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event) {
        //LogHelper.info(getPressedKeyBinding());
    }
}
