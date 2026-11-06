package org.eightwindsmc.bedrock.velocity;

/**
 * Velocity proxy plugin: routes Bedrock players from Floodgate to the correct
 * backend server.
 *
 * <p>Placeholder during G0a infrastructure phase. Bedrock Lead: add the
 * Velocity API dependency and implement real routing logic when G0a-5 begins.
 */
public class BedrockRoutingPlugin {

    private boolean registered = false;

    public void register() {
        registered = true;
    }

    public boolean isRegistered() {
        return registered;
    }
}