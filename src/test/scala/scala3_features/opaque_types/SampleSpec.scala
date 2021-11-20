package scala3_features.opaque_types

import org.scalatest.freespec.AnyFreeSpec

class SampleSpec extends AnyFreeSpec:
  "sample test" - {
    "t1" in {
      import scala3_features.opaque_types.Sample1.*
      val l2 = Logarithm(2.0)
      val l3 = Logarithm(3.0)
      assert((l2 * l3).toDouble === 6.0)
      assert((l2 + l3).toDouble < 5.0)
    }

    "t3" in {
      import scala3_features.opaque_types.Sample3.Logarithms.*
      val l2 = Logarithm(2.0)
      val l3 = Logarithm(3.0)
      assert((l2 * l3).toDouble === 6.0)
      assert((l2 + l3).toDouble < 5.0)
    }
  }
