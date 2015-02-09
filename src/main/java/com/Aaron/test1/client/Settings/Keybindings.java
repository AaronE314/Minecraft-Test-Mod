package com.Aaron.test1.client.Settings;

import com.Aaron.test1.reference.Names;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public class Keybindings {
    public static KeyBinding charge = new KeyBinding(Names.Keys.CHARGE, Keyboard.KEY_C, Names.Keys.CATEGORY);
    public static KeyBinding release = new KeyBinding(Names.Keys.RElEASE, Keyboard.KEY_R, Names.Keys.CATEGORY);
}
