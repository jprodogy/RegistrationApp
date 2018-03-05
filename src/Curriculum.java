import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Curriculum{
    private ArrayList<String> classType;
    private ArrayList<String> classId;
    private ArrayList<String> credits;
    static String fn = "curriculum.dat";

    public Curriculum(){
        
    }

    //read and store data in a curriculum
    public void CurriculumFile() throws FileNotFoundException {
        Scanner curriculumScan = new Scanner(new File(fn));
        while(curriculumScan.hasNextLine()) {
            String info = curriculumScan.next();
            if (info == "*"){
                System.out.println("d");
            }else {
                int num = curriculumScan.nextInt();
                int num2 = curriculumScan.nextInt();
                System.out.println(info + num + num2);
            }

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
