package steps;

import core.BaseTest;
import io.cucumber.java.Before;

public class Hook {
    @Before
    public void init(){
        BaseTest.setup();
    }
}
