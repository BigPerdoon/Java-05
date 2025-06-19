package ru.netology.services;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationServiceTest {
    @Test
    public void VacationTimes1() {
        VacationService service = new VacationService();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VacationTimes2() {
        VacationService service = new VacationService();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "resources/vacation.csv")
    public void VacationTimes(int expected, int income, int expenses, int threshold) {
        VacationService service = new VacationService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}