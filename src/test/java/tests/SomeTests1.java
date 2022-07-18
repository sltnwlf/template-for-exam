package tests;

import base.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SomeTests1 extends TestBase {

    @Test
    @DisplayName("")
    public void testSome1() {
        somePage1.popupKiller();
        String actual = somePage1.method1();
        String expected = "Selenium Easy";
        Assertions.assertEquals(actual,expected);
    }
    @Test
    @DisplayName("")
    public void testSome2() {
        somePage1.popupKiller();
    }
    @Test
    @DisplayName("")
    public void testSome3() {
        somePage1.popupKiller();
    }

}
