package app.admin

import com.gs.collections.impl.block.procedure.FastListSelectProcedure
import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration
import org.springframework.context.ApplicationContext

class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }

    @Override
    protected boolean limitScanningToApplication() {
        return super.limitScanningToApplication()
    }

    @Override
    void setApplicationContext(ApplicationContext applicationContext) {
        super.setApplicationContext(applicationContext)
    }
}