package nopops.domain

import org.springframework.data.annotation.Id
import org.springframework.stereotype.Component

/**
 * Created by Riley, 6/26/2018.
 *
 * A class that defines what a notice looks like from the API.
 */

@Component
class PopReport {

    @Id
    long id

    Date dateOfReport

    String city

    String state

    //TODO: Make time from date
    String time

    String street1Name

    //TODO: Limit this string to its possible options
    String street1Ending

    String street2Name

    String street2Ending

    String zipCode

    Reporter reporter

    String latitude

    String longitude

    // For Spring JPA to use.
    protected PopReport(){

    }

    // For testing purposes.
    PopReport(long id, Date date, String city, String state, String time, String str1n,
                     String str1e, String str2n, String str2e, String zip, Reporter rep,
                     String lat, String longit){

        this.id = id
        this.dateOfReport = date
        this.city = city
        this.state = state
        this.time = time
        this.street1Name = str1n
        this.street1Ending = str1e
        this.street2Name = str2n
        this.street2Ending = str2e
        this.zipCode = zip
        this.reporter = rep
        this.latitude = lat
        this.longitude = longit
    }

}
