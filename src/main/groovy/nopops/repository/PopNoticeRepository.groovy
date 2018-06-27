package nopops.repository

import nopops.domain.PopNotice
import org.springframework.data.repository.CrudRepository


interface PopNoticeRepository extends CrudRepository<PopNotice, long>{
}
