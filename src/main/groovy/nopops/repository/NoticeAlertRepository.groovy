package nopops.repository

import nopops.domain.NoticeAlert
import org.springframework.data.repository.CrudRepository

interface NoticeAlertRepository extends CrudRepository<NoticeAlert, Long> {

}
