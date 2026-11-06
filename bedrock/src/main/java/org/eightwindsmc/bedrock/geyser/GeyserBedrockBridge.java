package org.eightwindsmc.bedrock.geyser;

import org.eightwindsmc.bedrock.api.BedrockBridge;

/**
 * Geyser-based implementation of {@link BedrockBridge}.
 *
 * <p>This is the placeholder used during the G0a infrastructure phase.
 * Bedrock Lead: replace with the real Geyser API calls when BedRockTickTest
 * (G0a-5) work begins.
 */
public class GeyserBedrockBridge implements BedrockBridge {

    private volatile boolean running = false;
    private volatile int sessionCount = 0;

    @Override
    public void start() {
        running = true;
    }

    @Override
    public void stop() {
        running = false;
        sessionCount = 0;
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public int getSessionCount() {
        return sessionCount;
    }
}