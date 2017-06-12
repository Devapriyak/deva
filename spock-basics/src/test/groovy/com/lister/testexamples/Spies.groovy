package com.lister.testexamples

import com.lister.groovy.Person
import spock.lang.Specification

// Spy has the ability to track to the original object and it can even change the
// original value returned.
class Spies extends Specification {

    def "spies"() {
        def person = Spy(Person, constructorArgs: ["Fred", 42])

        expect:
        // calls through to real person
        person.name == "Fred"

        when:
        def text = person.sing()

        then:
        // can selectively stub and/or mock as required
        1 * person.sing() >> { callRealMethod() * 2 }
        text == "tra-la-latra-la-la"
    }

    def "half-mocks"() {
        def person = Spy(Person, constructorArgs: ["Fred", 42])

        when:
        person.singRepeatedly()

        then:
        3 * person.sing()
    }
}


