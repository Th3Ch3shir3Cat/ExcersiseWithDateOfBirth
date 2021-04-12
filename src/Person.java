import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class Person {

    private LocalDate dateOfBirth;

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void printDaysLeft(){
        LocalDate timeNow = LocalDate.now();
        LocalDate dateOfBirthInThisYear = LocalDate.of(timeNow.getYear(), this.dateOfBirth.getMonth(), this.dateOfBirth.getDayOfMonth());
        System.out.print("Дней осталось: " + DAYS.between(timeNow,dateOfBirthInThisYear));
    }
}
