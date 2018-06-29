package nopops.domain

import nopops.common.PopsConstants
import javax.persistence.Id

import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.OneToMany

/**
 * Created by Riley, 6/27/2018.
 *
 * Keeps basic info on a reporter for abuse tracking purposes.
 */

@Entity
class Reporter {

    @Id
    String reporterId //電話番号とか景帝番号とか

    String city

    String state

    // What if a reporter is from another country?
    String country

    String zipCode

    Boolean isUsian

    //Done by automatic conversion
    String latitude

    String longitude

    // Can = 'verified', 'unverified', 'Not In US' or 'suspicious' for now.
    String tag

    // TODO: Create bidirectional relationship between PopReports and Reporters?
    @OneToMany
    @JoinColumn(name = 'reporterId')
    List<PopReport> popReports

    // For Spring JPA usage
    protected Reporter(){}

    // For local reporters
    Reporter(String repId, String city, String state, String zip) {
        this.reporterId = repId
        this.city = city
        this.state = state
        this.zipCode = zip
        isUsian = true
        tag = PopsConstants.UNVERIFIED
    }

    // What do we do for foreign reporters?
    Reporter(String repId, String country) {
        this.reporterId = repId
        this.country = country
        isUsian = false
        tag = PopsConstants.NOTINUS
    }

    void setLatLong(String zip) {

    }

    void setLatLong(String city, String state) {

    }
}
