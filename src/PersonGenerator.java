import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;
import java.sql.SQLOutput;

import static java.nio.file.StandardOpenOption.CREATE;

public class PersonGenerator
{
    public static void main(String[] args)
    {
        //Set up the data or the person fields

    /*  a. ID (a String)
    b. FirstName
    c. LastName
    d. Title (a string like Mr., Mrs., Ms., Dr., etc.)
    e. YearOfBirth (an int)
  */

        ArrayList<Person> personCSVData = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String ID = "";
        String FirstName = "";
        String LastName = "";
        String Title = "";
        int YearOfBirth = 0;

        boolean gotMore = true;

        boolean done = false;

        //Get the data for each person

        do {


            ID = SafeInput.getNonZeroLenString(in, "Enter the ID as 6 digits");
            FirstName = SafeInput.getNonZeroLenString(in, "Enter the first name");
            LastName = SafeInput.getNonZeroLenString(in, "Enter the last name");
            Title = SafeInput.getNonZeroLenString(in, "Enter the title");
            YearOfBirth = SafeInput.getRangedInt(in, "Enter the year of birth as 4 digits", 0000, 9999);

            Person CSVPersonRecord = new Person (FirstName, LastName, Title, ID, YearOfBirth);
            personCSVData.add(CSVPersonRecord);

            done = SafeInput.getYNConfirm(in, "Are you done entering Person Data ?");

        }while(!done);


        File workingDirectory = new File(System.getProperty("user.dir"));
        Path file = Paths.get(workingDirectory.getPath() + "\\src\\data.csv");

        try
        {

            OutputStream out =
                    new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer =
                    new BufferedWriter(new OutputStreamWriter(out));



            for(Person rec : personCSVData)
            {
                writer.write(rec.toString());

                writer.newLine();

            }
            writer.close();
            System.out.println("Data file written!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        }
    }
