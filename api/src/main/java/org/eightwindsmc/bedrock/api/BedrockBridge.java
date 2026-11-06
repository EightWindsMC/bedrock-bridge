package org.eightwindsmc.bedrock.api;

/**
 * Contract for the Bedrock bridge: connects Bedrock players to the Java server
 * via Geyser, with routing managed by the Velocity proxy.
 *
 * <p>This interface is the boundary that G0a-5 (BedRockTickTest) is tested against.
 * Implementations live in {@code :bedrock} and {@code :velocity}.
 */
public interface BedrockBridge {

    /** Start the bridge and begin accepting Bedrock player connections. */
    void start();

    /** Stop the bridge and disconnect all Bedrock sessions. */
    void stop();

    /** @return true if the bridge is currently accepting Bedrock connections. */
    boolean isRunning();

    /** @return the number of Bedrock sessions currently connected. */
    int getSessionCount();
}