# bedrock-bridge

Bedrock bridge for [Eightwinds](https://github.com/EightWindsMC/docs) — connects Bedrock players
to the Java server via [Geyser](https://geysermc.org), with routing on [Velocity](https://papermc.io/software/velocity).

Java 25 · Gradle multi-module.

## Modules

| Module | Purpose |
|--------|---------|
| `api` | Public interfaces and data types; no server runtime dependency |
| `common` | Shared platform-agnostic logic; defines G0a-5 load stats |
| `bedrock` | Geyser plugin implementation |
| `velocity` | Velocity proxy plugin — routes Bedrock players to the right backend |

## G0a-5 gate

This repository is the scope of **G0a-5 — Bedrock bot parity** (`BedRockTickTest`).
Work on G0a-5 starts only after `shipyard` exists and G0a-1 through G0a-4, G0a-6 and G0a-7 pass.
See [decisions/phase-gate-roadmap.md](https://github.com/EightWindsMC/docs/blob/main/decisions/0001-phase-gate-roadmap.md).

## Build

```
./gradlew build
```

Requires Java 25.