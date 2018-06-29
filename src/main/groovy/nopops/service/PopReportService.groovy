package nopops.service

import nopops.domain.PopReport
import nopops.repository.PopReportRepository
import nopops.repository.ReporterRepository
import nopops.util.FormatUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
 * Created by Riley, 6/29/2018.
 *
 * Formats request and stops all malicious data before it can be queried in DB
 */

@Component
class PopReportService {

    @Autowired
    PopReportRepository popRepo

    @Autowired
    ReporterRepository repRepo


    // TODO: Create a processor class to manage the payload formatting or use FormatUtil functions
    void createNewReport(Map<String, String> reporter, Map<String, String> report) {
        // parse out JSON

        // use FormatUtil.strip function on everything relevant

        // create and save reporter object

        // create and save report object

    }

    // TODO: Set this up to accept a Map<String, String>
    List<PopReport> getAllReports(Map<String, Object> payload) {
        // Parse out zip code if it exists

        // Parse out city state if it exists

        // Return a list of reports in that zip code and that city state
    }

    List<String> parseReporterJson (Map<String, String> reporter) {
        List<String> vars = new ArrayList()

        vars
    }

    List<String> parseReportJson (Map<String, String> report) {
        List<String> vars = new ArrayList()

        vars
    }

    //TODO: Do we need JSON parsing or is there a way to automatically do that?
}
