package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'amount square between 200 and 300', 200, 300, 3",
            "amount square between 200 and 400', 200, 400, 6"})
    void sqrCalculate(String testName, long lower, long upper, int expected) {
        SQRService service = new SQRService();

        long actual = service.sqrCalculate(lower, upper);

        assertEquals(expected, actual);
    }
}