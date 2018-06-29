package nopops.repository

import nopops.domain.PopReport

import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by Riley, 6/29/2018.
 *
 * Sets up needed methods for the repo.
 */

interface PopReportRepository extends JpaRepository<PopReport, Long>{

    // TODO: How to implement finding by distance?


    // Already implemented through Spring JPA
    List<PopReport> findByZipCode(String zip)
    List<PopReport> findByCityAndState(String city, String state)

    // Just in case
    // Already implemented through Spring JPA
    List<PopReport> findByZipCodeOrderByDateDesc(String zip)
    List<PopReport> findByCityAndStateOrderByDateDesc(String city, String state)

    // Will be used for abuse management and to find stale reports.
    List<PopReport> findByReporterId(String reporterId)
    List<PopReport> findByDateOrderByDateDesc(Date date)

    //Saving functions already included here.
}
