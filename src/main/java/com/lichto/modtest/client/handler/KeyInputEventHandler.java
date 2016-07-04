package com.lichto.modtest.client.handler;

import com.lichto.modtest.client.settings.KeyBindings;
import com.lichto.modtest.reference.Key;
import com.lichto.modtest.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.client.settings.KeyBinding;

/**
 * Created by Noah Lichtenstein on 7/3/2016.
 */
public class KeyInputEventHandler
{
    private static Key getPressedKeyBinding()
    {
        if(KeyBindings.charge.isPressed())
        {
            return Key.CHARGE;
        }
        else if(KeyBindings.release.isPressed())
        {
            return Key.RELEASE;
        }
        else return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
    {
        LogHelper.info(getPressedKeyBinding());
    }
}
