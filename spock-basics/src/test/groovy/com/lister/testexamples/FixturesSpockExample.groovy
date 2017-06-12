package com.lister.testexamples

import spock.lang.*

class FixturesSpockExample extends Specification{
	
	def setup(){
		println("Hey!!! I am one executed first")
	}
	def "First method"(){
		given:
		println("Executing First method")
	}
	def "Second method"(){
		given:
		println("Executing Second method")
	}
	def cleanup(){
		println("Wait... I am cleaning it")
	}
}
