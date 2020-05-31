package sample.my.force_version_up.speksample

import junit.framework.Assert.assertEquals
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import sample.my.force_version_up.speksample.ui.main.Calculator
import sample.my.force_version_up.speksample.ui.main.MainViewModel

object ExampleSpekUnitTest: Spek({

    describe("A Calculator") {
        val calculator by memoized { Calculator() }

        it("should return 4") {
            assertEquals(4, calculator.add(2, 2))
        }

        it("should return 10") {
            assertEquals(10, calculator.add(5, 5))
        }

        it("should return 12") {
            assertEquals(12, calculator.add(6, 6))
        }
    }

    describe("view model verify") {
        val viewModel by memoized { MainViewModel() }

        it("should return text MainViewModel") {
            assertEquals("MainViewModel", viewModel.getText())
        }
    }
})