package org.eightwindsmc.bedrock.common;

/**
 * Load statistics for the Bedrock bot session, used by BedRockTickTest (G0a-5).
 *
 * @param sessionCount number of active Bedrock bot sessions in the load test.
 * @param avgTickMs    average tick latency measured across those sessions.
 */
public record BotLoadStats(int sessionCount, long avgTickMs) {

    /** G0a-5 target: 100 Bedrock bots in the same load test. */
    public static final int TARGET_BOT_COUNT = 100;

    /** G0a tick budget (same as G0a-1): average tick must stay below this threshold. */
    public static final long BUDGET_MS = 40L;

    /** @return true when this sample meets the G0a-5 criteria. */
    public boolean meetsG0a5() {
        return sessionCount >= TARGET_BOT_COUNT && avgTickMs < BUDGET_MS;
    }
}