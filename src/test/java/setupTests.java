import SetUp.SetUps;
import org.testng.annotations.Test;


public class setupTests extends SetUps {

    @Test
    public void testSetUp (){
        String pageURL = "";
        if(pageURL.equalsIgnoreCase(""))

            System.out.println("The webpage URL Is = pageURL");
        else {
            System.out.println("invalid URL Actual webpage URL is = pageURL");

        }


    }

}
