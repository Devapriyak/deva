package com.testexamples

import spock.lang.Specification

class DetailedDescSpockExample extends Specification {

	def "Compare Sets"(){
		expect:
		["foo","bar"] as Set == ["foo"] as Set	
	}
	
	def "Compare Strings"(){
		expect:
		getLengthyString() == """Spock is a fictional character in the Star Trek media franchise.
								Spock was first portrayed by Leonard Nimoy in the original Star Trek series,
								and also appears in the animated Star Trek series, a two-part episode of Star Trek:
								The Next Generation, eight of the Star Trek feature films, and numerous Star Trek novels,
								comics, and video games.[1][2] In addition, numerous actors portrayed the various stages of Spock's rapid growth,
								due to the effects of the Genesis Planet, in the 1984 Star Trek film Star Trek III: The Search for Spock.
								In the 2009 film Star Trek, Nimoy reprised his role with Zachary Quinto, who depicted a younger version of the character,
								existing within an alternate timeline """
	}
	private getLengthyString(){
		"""Spock is a fictional character in the Star Trek media franchise.
		Spock was first portrayed by Leonard Nimoy in the original Star Trek series,
		and also appears in the animated Star Trek series, a two-part episode of Star Trek:
		The Next Generation, eight of the Star Trek feature films, and numerous Star Trek novels,
		comics, and video games.[1][2] In addition, numerous actors portrayed the various stages of Spock's rapid growth,
		due to the effects of the GenesisPlanet, in the 1984 Star Trek film Star Trek III: The Search for Spock.
		In the 2009 film Star Trek, Nimoy reprised his role with Zachary Quinto, who depicted a younger verson of the character,
		existing within an alternate timeline """
	}
}
