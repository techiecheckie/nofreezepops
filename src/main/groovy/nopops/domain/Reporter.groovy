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

    // What if a reporter is from another country?
    String country

    String zipCode

    Boolean isUsian

    //Done by automatic conversion
    String latitude

    String longitude

    // For Spring JPA usage
    protected Reporter(){}

    // For local reporters
    Reporter(String phone, String city, String state, String zip) {
        this.phoneNum = phone
        this.city = city
        this.state = state
        this.zipCode = zip
        isUsian = true
    }

    // What do we do for foreign reporters?
    Reporter(String phone, String country) {
        this.phoneNum = phone
        this.country = country
        isUsian = false
    }

    void setLatLong(String zip) {

    }

    void setLatLong(String city, String zip) {

    }
}
