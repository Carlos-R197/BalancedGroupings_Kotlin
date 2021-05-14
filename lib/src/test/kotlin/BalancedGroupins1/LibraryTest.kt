/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package BalancedGroupins1

import kotlin.test.Test
import kotlin.test.assertEquals

class BalancedGroupingTest {
    val classUnderTest = BalancedGroupingProblem()

    @Test fun EmptyStringTest() {
        assertEquals(true, classUnderTest.isBalanced(" "))
    }

    @Test fun NoGrupingsTest() {
        assertEquals(true, classUnderTest.isBalanced("a + b"))
    }

    @Test fun OneGroupinTest() {
        assertEquals(true, classUnderTest.isBalanced("(a + b)"))
    }

    @Test fun UnMatchingGroupingTest() {
        assertEquals(false, classUnderTest.isBalanced("[a + b)"))
    }
}
