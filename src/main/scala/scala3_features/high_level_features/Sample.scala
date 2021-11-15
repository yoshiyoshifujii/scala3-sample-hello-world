package scala3_features.high_level_features

import scala.collection.mutable.ListBuffer

def double(ints: List[Int]): List[Int] =
  val buffer = new ListBuffer[Int]()
  for (i <- ints)
    buffer += i * 2
  buffer.toList
