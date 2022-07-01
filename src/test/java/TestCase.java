import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.net.MalformedURLException;

import static org.aspectj.bridge.Version.getText;

public class TestCase extends BasePage {

//

    public TestCase() throws IOException, InterruptedException {
        {
            PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        }
    }

    public String openApp() throws InterruptedException, MalformedURLException {



        return getText();
    }

}
