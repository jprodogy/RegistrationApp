import java.io.*;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Transcript {

    public Transcript(){

    }

    public void TransCreate(String fname) throws IOException {
        File transcript = new File(fname);
        PrintWriter transcriptWriter = new PrintWriter(transcript);
        Curriculum curi = new Curriculum();
        Random rand = new Random();
        ArrayList<Course> classes = curi.getCurriculum();
        String [] str = {"A", "B", "C", "D", "F"};

        for (Course co: classes){
            transcriptWriter.println(co.getClassId() + str[rand.nextInt(5)]);

        }

        transcriptWriter.close();
    }

    public void TransEdit() throws FileNotFoundException {
        PrintWriter transcriptWriter = new PrintWriter("transcript.txt");
        Scanner keyb = new Scanner(System.in);

        String str = keyb.next();
        transcriptWriter.println(str);
        transcriptWriter.close();
    }

    public boolean inCurriculum(String str) throws FileNotFoundException {
        Curriculum curri = new Curriculum();
        curri.CurriculumFile();
        ArrayList<Course> curriList = curri.getCurriculum();
        if (curriList.contains(str)){
            return true;
        }else {
            return false;
        }

    }



}
