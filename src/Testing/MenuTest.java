package Testing;

import Model.Menu;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {
    private Menu menu;
    @BeforeEach
    public void init(){
        menu = new Menu("name","400","ต้ม");
    }
    @Test
    public void getNameTest(){
        assertEquals("name",menu.getName());
    }
    @Test
    public void getPriceTest(){
        assertEquals("400",menu.getPrice());
    }
    @Test
    public void getTypeTest(){
        assertEquals("ต้ม",menu.getType());
    }
}
