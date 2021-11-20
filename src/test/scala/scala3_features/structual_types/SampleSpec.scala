package scala3_features.structual_types

import org.scalatest.freespec.AnyFreeSpec

class SampleSpec extends AnyFreeSpec:
  "strctual types" - {
    "t1" in {
      import Sample1.*
      val person = Record(
        "name" -> "Emma",
        "age"  -> 42
      ).asInstanceOf[Person]

      assert(s"${person.name} is ${person.age} years old." === "Emma is 42 years old.")
    }

    "t2" in {
      import Sample1.*
      val book = Record(
        "title" -> "The Catcher in the Rye",
        "author" -> "J. D. Salinger",
        "year" -> 1951,
        "rating" -> 4.5
      ).asInstanceOf[Book]
      assert(s"${book.title}" === "The Catcher in the Rye")
    }
  }

