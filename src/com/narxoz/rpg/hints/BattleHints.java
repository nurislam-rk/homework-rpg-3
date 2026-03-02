package com.narxoz.rpg.hints;

public class BattleHints {

    public static void printHints() {
        System.out.println("=== RPG Battle System Hints ===");
        System.out.println("1. Game uses Singleton BattleEngine.");
        System.out.println("2. Heroes and Enemies are unified using Adapter pattern.");
        System.out.println("3. Battle is round-based.");
        System.out.println("4. Dead combatants are removed from battle.");
    }
}