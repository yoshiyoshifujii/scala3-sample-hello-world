package scala3_features.`implicit`

import org.junit.Test
import org.junit.Assert.*

class RepeatableSpec:
  @Test def test1(): Unit =
    import Repeatable.given
    assertEquals("abcabcabc", "abc".repeat(3))
    assertEquals("123123", 123.repeat(2))
