package app

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import spock.lang.Specification

@RunWith(SpringRunner.class)
@SpringBootTest
class RegistrationServiceApplicationSpec extends Specification {

    @Test
    def "should load context"() {
        expect: true
    }
}
