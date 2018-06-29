package nopops.repository

import nopops.domain.Reporter
import org.springframework.data.repository.CrudRepository

interface ReporterRepository extends CrudRepository<Reporter, Long> {

    Reporter findById(String id)
    List<Reporter> findByTag(String tag)
}
