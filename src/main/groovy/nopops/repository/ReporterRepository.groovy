package nopops.repository

import nopops.domain.Reporter
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ReporterRepository extends CrudRepository<Reporter, String> {

    List<Reporter> findByTag(String tag)
}
