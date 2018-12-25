package Testing;

import Model.MenuToKitchen;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuToKitchenTest {
    MenuToKitchen schedule3;
    @BeforeEach
    public void init(){
        schedule3 = new MenuToKitchen("schedule3","table");
    }
    @Test
    public void testName(){
        schedule3.setName("name");
        assertEquals("name",schedule3.getName());
    }
    @Test
    public void testTable(){
        schedule3.setTable("100");
        assertEquals("100",schedule3.getTable());
    }
}