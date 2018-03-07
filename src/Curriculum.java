import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Curriculum{
    private Map<String, Integer> curMap;
    private Map<String, Integer> catMap;
    static String fn = "curriculum.dat";

    public Curriculum(){
        curMap = new HashMap<String, Integer>();
        catMap = new HashMap<String, Integer>();
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
            if (str.substring(0, 1).equals("*")){
                catMap.put(str.toString(), classCre);
            }else {
                curMap.put(str.toString(), classCre);
            }
        }
        System.out.println(catMap);
    }

    public void CurriulumEdit() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("curriculum.dat");
        
        pw.close();
    }

    public int CourseCount(){
        int count = 0;
        for (String classes: curMap.keySet()){
            count++;
        }
        return count;
    }

    public boolean CourseExist(Object o){
        if (curMap.containsValue(o)){
            return true;
        }else {
            return false;
        }
    }




}
