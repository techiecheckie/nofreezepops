package nopops.domain

import nopops.common.PopsConstants
import nopops.util.FormatUtil

import javax.persistence.Id
import javax.persistence.Entity
import javax.persistence.GeneratedValue

/**
 * Created by Riley, 6/26/2018.
 *
 * A class that defines what a notice looks like from the API.
 */

@Entity
class PopReport {

    @Id
    @GeneratedValue
    Long id

    Date date

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

    // Assigned at creation.
    String reporterId

    String latitude

    String longitude

    // Will just use one tag for now, will have lists later
    String tag = PopsConstants.UNVERIFIED

    int amtReported = 0

    // For Spring JPA to use.
    protected PopReport(){
    }

    // For testing purposes.
    PopReport(long id, Date date, String city, String state, String time, String str1n,
                     String str1e, String str2n, String str2e, String zip,
              String repId){

        this.id = id
        this.date = date
        this.city = city
        this.state = state
        this.time = time
        this.street1Name = FormatUtil.stripSpecialCharacters(str1n)
        this.street1Ending = str1e
        this.street2Name = FormatUtil.stripSpecialCharacters(str2n)
        this.street2Ending = str2e
        this.zipCode = zip
        this.reporterId = repId
        tag = PopsConstants.UNVERIFIED
        amtReported = 1
    }

    void verifyReport() {
        if (tag != PopsConstants.VOLUNTEERVERIFIED) {
            tag = PopsConstants.VOLUNTEERVERIFIED
        }
    }

    void markSuspicious() {
        if (tag != PopsConstants.SUSPICIOUS) {
            tag = PopsConstants.SUSPICIOUS
        }
    }

    void addReporter() {
        amtReported++
    }

    // Just in case scenario
    void removeReporter(){
        amtReported--
    }

}
