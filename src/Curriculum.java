import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Curriculum{
    private ArrayList<Course> curriculum;
    static String fn = "curriculum.dat";

    public Curriculum(){
        curriculum = new ArrayList<>();
    }



    //read and store data in a curriculum
    public void CurriculumFile() throws FileNotFoundException {
        Scanner curriculumScan = new Scanner(new File(fn));
        while(curriculumScan.hasNextLine()) {
            String[] sArray = curriculumScan.nextLine().split(" ");
            StringBuilder str = new StringBuilder();

            int classCre = Integer.parseInt(sArray[sArray.length - 1]);
            for (int i = 0; i < sArray.length - 1; i++) {
                str.append(sArray[i]);
            }

            curriculum.add(new Course(str.toString(), classCre));
        }
    }

    public ArrayList<Course> getCurriculum() throws FileNotFoundException {
        CurriculumFile();
        return curriculum;
    }

    public void CurriulumEdit() throws FileNotFoundException {
        Scanner keyb = new Scanner(System.in);
        PrintWriter pw = new PrintWriter("curriculum.dat");

        pw.close();
    }

    public int DeptCourseCount(){
        int count = 0;
        for (Course classes: curriculum){
            count++;
        }
        return count;
    }

    public int CurriculumHours(){
        int hours = 0;
        for (Course co: curriculum){
            hours += co.getCredit();
        }
        return hours;
    }

    public boolean CourseExist(String course){
        if (curriculum.contains(course)){
            return true;
        }else {
            return false;
        }
    }




}
