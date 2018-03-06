import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class Curriculum{
    private Map<StringBuilder, Integer> curMap;
    static String fn = "curriculum.dat";

    public Curriculum(){

    }

    //read and store data in a curriculum
    public void CurriculumFile() throws FileNotFoundException {
        Scanner curriculumScan = new Scanner(new File(fn));
        while(curriculumScan.hasNextLine()) {
            StringBuilder str = new StringBuilder();
            String[] sArray = curriculumScan.nextLine().split(" ");
            int classCre = Integer.parseInt(sArray[sArray.length - 1]);
            for (int i = 0; i < sArray.length - 1; i++) {
                str.append(sArray[i]);
            }
            System.out.println(str);
            curMap.put(str, classCre);
        }
    }

    public void curriulumEdit(){

    }


}
