import java.io.*;
import javax.swing.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class PersonReader
{
    public static void main(String[] args) throws IOException {
        JFileChooser chooser = new JFileChooser();
        File selectedFile;
        String person;
        String sFormat;
        ArrayList<Person> personList = new ArrayList<>();

        String idString;
        String firstName;
        String lastName;
        String inputTitle;
        int yearOfBirth;

        String ID = "";
        String FirstName = "";
        String LastName = "";
        String Title = "";
        int YearOfBirth = 0;

        File workingDirectory = new File(System.getProperty("user.dir"));
        chooser.setCurrentDirectory(workingDirectory);

        BufferedReader reader;
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

            selectedFile = chooser.getSelectedFile();
            Path file = selectedFile.toPath();

            InputStream in = new BufferedInputStream(Files.newInputStream(file, StandardOpenOption.CREATE));
            reader = new BufferedReader(new InputStreamReader(in));

            String[] fields;
            while (reader.ready()) {
                person = reader.readLine();
                String[] arrOfperson = person.split(", ", 6);

                ID = arrOfperson[0];
                FirstName = arrOfperson[1];
                LastName = arrOfperson[2];
                Title = arrOfperson[3];
                YearOfBirth = Integer.parseInt(arrOfperson[4]);

                Person CSVPersonRecord = new Person (FirstName, LastName, Title, ID, YearOfBirth);
                personList.add(CSVPersonRecord);

            }
            sFormat = String.format("%3s%15s%13s%9s%7s", "ID#", "Firstname", "Lastname", "Title", "YOB");
            System.out.println(sFormat);

            sFormat = String.format("%48s", "================================================");
            System.out.println(sFormat);

            for (Person p : personList) {




                    sFormat = String.format("%3s%12s%13s%9s%7d", p.getID(), p.getFirstName(), p.getLastName(), p.getTitle(), p.getYearOfBirth());
                    System.out.println(sFormat);




            }
            reader.close();
        }
    }
}