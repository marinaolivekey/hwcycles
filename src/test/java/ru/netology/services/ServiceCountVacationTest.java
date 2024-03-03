package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.ServiceCountVacation;

public class ServiceCountVacationTest {

    @Test
    public void TestOne() {
        ServiceCountVacation countVacation = new ServiceCountVacation();
        int expected =3;
        int actual = countVacation.calculate(10000,3000,20000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestTwo() {
        ServiceCountVacation countVacation = new ServiceCountVacation();
        int expected =2;
        int actual = countVacation.calculate(100000,60000,150000);
        Assertions.assertEquals(expected, actual);
    }

}
