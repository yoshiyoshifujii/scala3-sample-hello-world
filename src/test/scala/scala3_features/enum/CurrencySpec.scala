package scala3_features.`enum`

import org.junit.Test
import org.junit.Assert.*
import Currency.*

class CurrencySpec:
  @Test def t1(): Unit =
    val c: Currency = JPY
    c match
      case JPY => assert(true)
      case USD => fail(s"not $c")
      case EUR => fail(s"not $c")
