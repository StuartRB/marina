package com.stuart.sandbox.service

import com.stuart.sandbox.model.Boat
import com.stuart.sandbox.model.Marina
import spock.lang.Specification
import spock.lang.Subject

class MarinaServiceSpec extends Specification {

    @Subject
    def marinaService = new MarinaService()

    def "Boats can be added to a marina that already has boats"() {
        given:
        def marina = Marina.builder()
                .boats([Boat.builder().build(),
                        Boat.builder().build()])
                .name("Bangor")
                .build()

        when:
        def result = marinaService.addBoatToMarina(marina, "Ploppy", 28)

        then:
        result.name == "Bangor"
        result.getBoats().size == 3
    }

    def "Boats can be added to a marina that has no boats"() {
        given:
        def marina = Marina.builder()
                .boats(null)
                .name("Bangor")
                .build()

        when:
        def result = marinaService.addBoatToMarina(marina, "Ploppy", 28)

        then:
        result.name == "Bangor"
        result.getBoats().size == 1
    }
}
