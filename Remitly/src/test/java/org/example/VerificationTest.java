package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * JUnit test class to verify the correctness of the Verification.verify() method under various scenarios
 */
class VerificationTest {
    @Test
    void check_verify() {
        Assertions.assertEquals(Verification.verify("/home/alicja/project/JAVA/Remitly/src/main/resources/test1.json"), false);
        Assertions.assertEquals(Verification.verify("/home/alicja/project/JAVA/Remitly/src/main/resources/test2.json"), true);
        Assertions.assertEquals(Verification.verify("/home/alicja/project/JAVA/Remitly/src/main/resources/test3.json"), true);
        Assertions.assertEquals(Verification.verify("/home/alicja/project/JAVA/Remitly/src/main/resources/test4.json"), true);
        Assertions.assertEquals(Verification.verify("/home/alicja/project/JAVA/Remitly/src/main/resources/test5.json"), true);
        Assertions.assertEquals(Verification.verify("/home/alicja/project/JAVA/Remitly/src/main/resources/test7.json"), true);
    }

}