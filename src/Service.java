import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Service {

    public LocalDate convertStringToLocalDate(String dateOfBirth){
        LocalDate resultDateOfBirth = null;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try{
            resultDateOfBirth = LocalDate.parse(dateOfBirth,dateTimeFormatter);
        }catch (DateTimeParseException error){
            System.out.println("Введен неверный формат даты");
        }
        return resultDateOfBirth;
    }

}
