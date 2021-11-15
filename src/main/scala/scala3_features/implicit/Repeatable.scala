package scala3_features.`implicit`

trait Repeatable[A]:
  extension (a: A) def repeat(count: Int): String

object Repeatable:
  given Repeatable[String] with
    extension (s: String) def repeat(count: Int): String = s * count
  given Repeatable[Int] with
    extension (i: Int) def repeat(count: Int): String = i.toString * count
