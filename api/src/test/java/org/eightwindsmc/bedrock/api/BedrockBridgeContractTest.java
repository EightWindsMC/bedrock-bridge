package org.eightwindsmc.bedrock.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/** Verifies that BedrockBridge is on the classpath. */
class BedrockBridgeContractTest {

    @Test
    void interfaceIsAccessible() {
        assertNotNull(BedrockBridge.class.getName());
    }
}