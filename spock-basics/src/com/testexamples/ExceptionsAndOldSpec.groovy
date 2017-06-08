package com.testexamples

import com.services.java.Account
import com.services.java.NegativeAmountWithdrawnException

import spock.lang.Specification

class ExceptionsAndOldSpec extends Specification {
    def "can't withdraw a negative amount"() {
        given:
        def account = new Account(5.0)

        when:
        account.withdraw(-1.0)

        then:
        NegativeAmountWithdrawnException e = thrown()
        e.amount == -1.0
    }
    
    def "withdrawing some amount decreases the balance by exactly that amount"() {
        def account = new Account(5.0)
        
        when:
        account.withdraw(2.0)
        
        then:
		println(old(account.balance)) // old retains the previous value of a variable or object.
        account.balance == old(account.balance) - 2.0
    }
}
