package nopops.controller

import nopops.domain.PopReport
import nopops.service.PopReportService

import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('/report')
class PopReportController {

    protected PopReportService service

    //TODO: Determine what the JSON should look like
    //Does this need to return a response entity?
    @RequestMapping(value = "/create", method = RequestMethod.POST,
            consumes = 'application/json')
    String create(@RequestBody Map<String, Object> payload) throws Exception {
        //Split the payload into a map for Reporter and a map for Report itself
        Map<String, String> reporter = new HashMap<>()
        Map<String, String> report = new HashMap<>()
        service.createNewReport(reporter, report)

        'Successfully created report'
    }

    @RequestMapping(value = "/retrieve", method = RequestMethod.GET,
            consumes = 'application/json')
    List<PopReport> retrieve(@RequestBody Map<String, Object> payload) throws Exception {
        //Split the payload into a map for Reporter and a map for Report itself
        service.getAllReports(payload)
    }

}
