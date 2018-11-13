package app.admin

import app.admin.jobsboard.Job
import grails.transaction.Transactional

@Transactional
class StatisticsService {


    def getTopPublishers() {
        Job.list().countBy{it.publisher}

    }
    def getTopTags() {
        Job.list().countBy{it.tags}

    }
    def getTopTypes(){
        Job.list().countBy {it.type}cd
    }
}
