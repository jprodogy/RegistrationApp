import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Curriculum{
    private ArrayList<String> classType;
    private ArrayList<String> classId;
    private ArrayList<String> credits;
    static String fn = "curriculum.dat";

//read and store data in a curriculum
    public Curriculum() throws FileNotFoundException {
        Scanner curriculumScan = new Scanner(new File(fn));
        while(curriculumScan.hasNextLine()) {
            String info = curriculumScan.nextLine();
            String[] data = info.split(" ");
            classType.add(data[0]);
            classId.add(data[1]);
            credits.add(data[2]);
        }

    }

    @Override
    public String toString() {
        return "Curriculum{" +
                "classType=" + classType +
                ", classId=" + classId +
                ", credits=" + credits +
                '}';
    }


}
