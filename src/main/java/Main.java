import ru.netology.services.ServiceCountVacation;

public class Main {
    public static void main(String[] args) {
        ServiceCountVacation countVacation = new ServiceCountVacation();
        int numberOfVacations = countVacation.calculate(10_000, 3_000, 20_000);
        System.out.println(numberOfVacations);
    }
}

