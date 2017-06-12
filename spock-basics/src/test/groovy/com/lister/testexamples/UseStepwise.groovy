package com.lister.testexamples

import spock.lang.Specification
import spock.lang.Stepwise

@Stepwise
class UseStepwise extends Specification {
    def "step 1"() {
		println ("Step 1")
        expect: true
    }

    def "step 2"() {
		println ("Step 2")
        expect: true
    }

    def "step 3"() {
		println ("Step 3")
        expect: true
    }
}
