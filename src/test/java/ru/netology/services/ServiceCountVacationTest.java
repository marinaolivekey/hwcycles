package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ServiceCountVacationTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vacation.csv")
    public void TestOne(int expected, int income, int expenses, int threshold) {
        ServiceCountVacation countVacation = new ServiceCountVacation();

        int actual = countVacation.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
