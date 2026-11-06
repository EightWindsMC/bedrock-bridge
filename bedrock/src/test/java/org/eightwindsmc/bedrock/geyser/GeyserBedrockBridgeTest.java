package org.eightwindsmc.bedrock.geyser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeyserBedrockBridgeTest {

    @Test
    void startsAndStops() {
        var bridge = new GeyserBedrockBridge();
        assertFalse(bridge.isRunning());
        bridge.start();
        assertTrue(bridge.isRunning());
        bridge.stop();
        assertFalse(bridge.isRunning());
    }

    @Test
    void sessionCountResetOnStop() {
        var bridge = new GeyserBedrockBridge();
        bridge.start();
        assertEquals(0, bridge.getSessionCount());
        bridge.stop();
        assertEquals(0, bridge.getSessionCount());
    }
}