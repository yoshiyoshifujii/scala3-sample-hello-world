package scala3_features.`implicit`

import org.junit.Test
import org.junit.Assert.*

class CSpec:
  @Test def t1(): Unit =
    def m(v: Int)(using c: C): String = s"$v, ${c.name}"
    given c: C                        = C("hoge")
    assertEquals("100, hoge", m(100))

  @Test def t2(): Unit =
    assertEquals(None, Seq.empty.secondOption)
    assertEquals(Some(2), Seq(1, 2, 3).secondOption)
