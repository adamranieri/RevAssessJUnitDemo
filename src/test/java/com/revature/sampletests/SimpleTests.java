package com.revature.sampletests;

import com.revature.assessors.RevAssess;
import com.revature.assessors.RevaConfig;
import com.revature.assessors.RevaTest;
import com.revature.sample.Example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(RevAssess.class)
@RevaConfig(exerciseId = 101, email = "billy.smith@revature.net", server = "http://localhost:5000/upload", path = "C:\\Users\\AdamRanieri\\Desktop\\tmp")
public class SimpleTests {

    @RevaTest(points = 10)
    public void addition(){
        int result = Example.add(2,2);
        Assertions.assertEquals(4,result);
    }
    @RevaTest(points = 50)
    public void subtraction(){
        int result = Example.subtract(2,2);
        Assertions.assertEquals(0,result);

    }

}
