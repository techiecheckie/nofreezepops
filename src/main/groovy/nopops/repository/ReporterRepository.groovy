package nopops.repository

import nopops.domain.PopReport
import nopops.domain.Reporter
import org.springframework.data.repository.CrudRepository

interface ReporterRepository extends CrudRepository<Reporter, Long> {

    //Find all reports for this specific reporter
    List<PopReport> findAllReports()
}
