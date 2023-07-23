package day01.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccessModifierTest {

    @Test
    public void testSetAndGetFirst() {
        AccessModifier one = new AccessModifier();
         System.out.println("Susikumar");
        one.setFirst("Susikumar");
        
        if(one.getFirst().equals("Susikumar")) {
        	System.out.println("Pass");
        	
        }else {
          System.out.println("Fail");
        	
        }
        assertEquals("Susikumar", one.getFirst());
    }

    @Test
    public void testSetAndGetSecond() {
        AccessModifier one = new AccessModifier();
        System.out.println("Pitchaimani");
        one.setSecond("Pitchaimani");
        if(one.getSecond().equals("Pitchaimani")) {
        	System.out.println("Pass");
        	
        }else {
          System.out.println("Fail");
        	
        }
        assertEquals("Pitchaimani", one.getSecond());
    }

    @Test
    public void testSetAndGetThird() {
        AccessModifier one = new AccessModifier();
        System.out.println("Rajalakshmi");
        one.setThird("Rajalakshmi");
        if(one.getThird().equals("Rajalakshmi")) {
        	System.out.println("Pass");
        	
        }else {
          System.out.println("Fail");
        	
        }
        assertEquals("Rajalakshmi", one.getThird());
    }

    @Test
    public void testSetAndGetFourth() {
        AccessModifier one = new AccessModifier();
        System.out.println("Kanimozhi");
        one.setFourth("Kanimozhi");
        if(one.getFourth().equals("Kanimozhi")) {
        	System.out.println("Pass");
        	
        }else {
          System.out.println("Fail");
        	
        }
       
        assertEquals("Kanimozhi", one.getFourth());
    }
}
