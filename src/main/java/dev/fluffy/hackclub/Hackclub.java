package dev.fluffy.hackclub;

import net.fabricmc.api.ModInitializer;

public class Hackclub implements ModInitializer {

    @Override
    public void onInitialize() {
        ModItems.initialize();
    }
}
