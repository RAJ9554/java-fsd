package com.ecommerce.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@DisplayName("JUnit 5 Conditional Tests Example")
public class ConditionalTests {

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void runOnWindows() {
        System.out.println("This runs on Windows");
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    public void runOnLinux() {
        System.out.println("This runs on Linux");
    }

    @Test
    @DisabledIf("com.ecommerce.tests.ConditionalTests#shouldDisable")
    void mightNotBeExecuted() {
        System.out.println("This may or may not execute");
    }
    
    private static boolean shouldDisable() {
        return Math.random() < 0.314159;
    }
}
