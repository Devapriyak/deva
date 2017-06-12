package com.lister.testexamples

import com.lister.groovy.AddNumbers

import spock.lang.Specification

class FeatureSpockExample extends Specification{

	def "We are going to add 2 numbers"(){
		given:
		def obj = new AddNumbers()
		
		when:"when we are going to call adder()"
		def sum = obj.adder(4, 8)
		
		then:
		sum == 12;
		
	}
}
