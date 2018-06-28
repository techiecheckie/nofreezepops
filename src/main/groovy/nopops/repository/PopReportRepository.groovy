package nopops.repository

import nopops.domain.PopReport
import nopops.domain.PopReportAlert
import org.springframework.data.repository.CrudRepository


interface PopReportRepository extends CrudRepository<PopReport, Long>{

    List<PopReport> findAllInArea(String city, String state)
    List<PopReport> findAllInArea(String zip)

    // TODO: How to implement finding by distance?

    // Will be used for abuse management and to find stale reports.
    List<PopReportAlert> findByReporter(long reporterId)
    List<PopReportAlert> findByDate(Date date)

}
