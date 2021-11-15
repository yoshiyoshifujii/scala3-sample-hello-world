package scala3_features.`enum`

import org.junit.Test
import org.junit.Assert.*
import Tree.*

class TreeSpec:
  @Test def t1(): Unit =
    val branch = Branch(
      Branch(Leaf("abc"), Leaf("def")),
      Leaf("ghi")
    )
    val result = depth(branch)
    assertEquals(2, result)
