import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    static String fn = "curriculum.dat";
    public static void main(String[] args) throws IOException {
        System.out.println("\n\nHello, RegistrationApp!\n");

        Curriculum curri = new Curriculum();
        curri.CurriculumFile();
        curri.CurriculumHours();

        Transcript trans = new Transcript();
        trans.TransCreate("transcript.txt");
    }



}
