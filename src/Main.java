import java.io.FileNotFoundException;

public class Main {
    static String fn = "curriculum.dat";
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("\n\nHello, RegistrationApp!\n");

         Curriculum curri = new Curriculum();
        System.out.println(curri.toString());
    }


}
