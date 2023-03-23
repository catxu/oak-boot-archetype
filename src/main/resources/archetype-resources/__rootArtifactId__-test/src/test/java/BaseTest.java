#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import com.oak.root.common.env.Env;
import com.oak.root.common.util.StringUtils;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.oak.boot.init.Apps.SPRING_PROFILE_ACTIVE;

/**
 * @author catxu
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Main.class})
public class BaseTest {
    protected static final String ENV = "dev";

    static {
        if (StringUtils.isBlank(System.getProperty(SPRING_PROFILE_ACTIVE))) {
            System.setProperty(SPRING_PROFILE_ACTIVE, ENV);
        }
    }

    @Test
    public void assertEnv() {
    }
}
