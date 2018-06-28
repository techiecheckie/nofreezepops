package nopops.domain

/**
 * Created by Riley, 6/27/2018.
 *
 * Defines the tagging class for reports.
 */

class PopReportTag{

    String tagName

    String tagType

    String tagMeaning

    PopReportTag(String name, String type, String meaning){
        this.tagName = name
        this.tagType = type
        this.tagMeaning = meaning
    }
}
