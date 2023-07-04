package com.ecommerce.tests;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("JUnit 5 Dynamic Tests Example")
@RunWith(JUnitPlatform.class)
public class DynamicTests {

    @TestFactory
    Collection<DynamicTest> dynamicTests() {
        return Arrays.asList(
            dynamicTest("simple dynamic test", () -> assertDoesNotThrow(() -> assertTrue(true))),
            dynamicTest("My Executable Class", this::executeMyExecutable),
            dynamicTest("Exception Executable", this::executeExceptionExecutable),
            dynamicTest("simple dynamic test-2", () -> assertDoesNotThrow(() -> assertTrue(true)))
        );
    }

    private void executeMyExecutable() {
        System.out.println("Hello World!");
    }

    private void executeExceptionExecutable() {
        Exception exception = assertThrows(Exception.class, () -> {
            throw new Exception("Exception Example");
        });

        // Handle the exception (e.g., log it or perform assertions)
        exception.printStackTrace();
    }
}
