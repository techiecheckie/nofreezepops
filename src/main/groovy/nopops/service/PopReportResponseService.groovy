package nopops.service

import nopops.domain.PopReport
import nopops.repository.PopReportRepository
import org.springframework.beans.factory.annotation.Autowired

/**
 * Created by Riley, 6/28/2018.
 *
 * A service to return responses to the user who requested them.
 */


class PopReportResponseService {

    @Autowired
    PopReportRepository popRepo

    // Pass some kind of response object? Exchange? How do?
    List<PopReport> draftReportListResponse() {
        //Get zip or city state from response

        //Do check
        popRepo.findAllInArea()
    }
}
