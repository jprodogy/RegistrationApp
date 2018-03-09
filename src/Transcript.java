import java.io.File;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

public class Transcript {

    public Transcript(){

    }

    public void TransCreate(String fname) throws IOException {
        File transcript = new File(fname);
        PrintWriter transcriptWriter = new PrintWriter(transcript);
        Curriculum curi = new Curriculum();
        Random rand = new Random();
        ArrayList<Course> classes = curi.getCurriculum();



        System.out.println(classes);
        for (Course co: classes){
            transcriptWriter.println(co.getClassId());


        }

        transcriptWriter.close();
    }



}
