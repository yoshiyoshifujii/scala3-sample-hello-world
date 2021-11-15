package scala3_features.high_level_features

import org.junit.Test
import org.junit.Assert.*

class SampleSpec:
  @Test def t1(): Unit =
    val oldNumbers = List.empty
    val numbers    = double(oldNumbers)
    assertEquals(numbers.length, 0)
