package org.eightwindsmc.bedrock.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BotLoadStatsTest {

    @Test
    void meetsG0a5_whenBotCountAndTickBudgetAreSatisfied() {
        assertTrue(new BotLoadStats(100, 20L).meetsG0a5());
    }

    @Test
    void fails_whenBotCountIsTooLow() {
        assertFalse(new BotLoadStats(50, 20L).meetsG0a5());
    }

    @Test
    void fails_whenTickBudgetExceeded() {
        assertFalse(new BotLoadStats(100, 50L).meetsG0a5());
    }

    @Test
    void constants_matchG0aSpec() {
        assertEquals(100, BotLoadStats.TARGET_BOT_COUNT);
        assertEquals(40L, BotLoadStats.BUDGET_MS);
    }
}