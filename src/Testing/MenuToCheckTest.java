package Testing;


import Model.MenuToCheck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuToCheckTest {
    MenuToCheck schedule2;
    @BeforeEach
    public void init(){
        schedule2 = new MenuToCheck("schedule2","500","tab");
    }
    @Test
    public void testName(){
        schedule2.setName("name");
        assertEquals("name",schedule2.getName());
    }
    @Test
    public void testPrice(){
        schedule2.setPrice("100");
        assertEquals("100",schedule2.getPrice());
    }
    @Test
    public void testTable(){
        schedule2.setTable("table");
        assertEquals("table",schedule2.getTable());
    }
}