import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Дата рождения в формате dd.MM.yyyy: ");
        String inputDateOfBirth = input.nextLine();

        Service service = new Service();
        LocalDate dateOfBirth = service.convertStringToLocalDate(inputDateOfBirth);
        if(dateOfBirth == null){
            return;
        }
        Person person = new Person();
        person.setDateOfBirth(dateOfBirth);
        person.printDaysLeft();
    }
}
