package com.testexamples

import spock.lang.Specification
// Mock Example
class Publisher {

	def subcribers=[]

	def send(event){
		subcribers.each {
			try{
				it.receive(event)
			}catch(Exception e){}
		}
	}
}
	interface Subscriber{
		def receive(event)
	}

class PublisherSpec extends Specification{
	def pub = new Publisher()
	def sub1 = Mock(Subscriber)
	def sub2 = Mock(Subscriber)

	def setup(){
		pub.subcribers << sub1 << sub2
	}

	def "deliver to all subscribers"(){
		when:
		pub.send("event")
		
		then:
		1 * sub1.receive("event")
		1 * sub2.receive("event")
		
	}
	

}

