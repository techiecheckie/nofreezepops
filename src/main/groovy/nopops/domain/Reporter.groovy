package nopops.domain

import org.springframework.data.annotation.Id
import org.springframework.stereotype.Component

/**
 * Created by Riley, 6/27/2018.
 *
 * Keeps basic info on a reporter for abuse tracking purposes.
 */

@Component
class Reporter {

    @Id
    String phoneNum

    String city

    String state

    String zipCode

    //Done by automatic conversion
    String latitude

    String longitude
}
