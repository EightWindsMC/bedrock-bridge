package org.eightwindsmc.bedrock.velocity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BedrockRoutingPluginTest {

    @Test
    void registersSuccessfully() {
        var plugin = new BedrockRoutingPlugin();
        assertFalse(plugin.isRegistered());
        plugin.register();
        assertTrue(plugin.isRegistered());
    }
}