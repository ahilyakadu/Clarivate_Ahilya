import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.Map;

public class ObjectManager {
    static class account{
        //locators
        String s;
        @FindBy (xpath = "")
        WebElement ele;

        Map <String,String>map=new HashMap();
        public void add(){
            map.put("accountbtn","//xpath");
        }

    }
    static class contact{
        //locators
    }

}
