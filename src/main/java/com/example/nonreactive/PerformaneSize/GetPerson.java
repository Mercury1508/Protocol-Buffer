package com.example.nonreactive.PerformaneSize;

import com.example.proto.Person;
import java.io.FileInputStream;
import java.io.IOException;

public class GetPerson {

    public void get() throws IOException {
        try (FileInputStream input = new FileInputStream("/Users/hriday/Downloads/nonreactive/src/main/java/com/example/nonreactive/PerformaneSize/Data")) {
            int i=1;
            while(true){
                Person p9 = Person.parseDelimitedFrom(input);
                if(p9==null)
                    break;
                System.out.println("Person #"+i);
                System.out.println(p9);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

