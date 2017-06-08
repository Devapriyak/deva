package com.testexamples

import com.services.groovy.PrintRandomNumber

import spock.lang.*

//Shared Example
class SharedSpockExample extends Specification{

	@Shared obj = new PrintRandomNumber();
	
	def "First method"(){
		given:
		obj
	}
	def "Second method"(){
		given:
		obj
	}

}
