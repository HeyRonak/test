package com.test;
import static com.test.Main.isValid;
import org.junit.*;
import static org.junit.Assert.*;
public class AppTest {

    @Test
    public void CheckString(){

          String EmptyString = "";
          String oneDigit = "1";
          String twoDigit = "1,2";
//          String InvalidString = "1,2,3";


          assertTrue(isValid(EmptyString));
          assertTrue(isValid(oneDigit));
          assertTrue(isValid(twoDigit));
//          assertFalse(isValid(InvalidString));

    }



}
