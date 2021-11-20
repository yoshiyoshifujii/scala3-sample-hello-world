package scala3_features.structual_types

object Sample1:
  class Record(elems: (String, Any)*) extends Selectable:
    private val fields: Map[String, Any] = elems.toMap
    def selectDynamic(name: String): Any = fields(name)

  type Person = Record {
    val name: String
    val age: Int
  }

  type Book = Record {
    val title: String
    val author: String
    val year: Int
    val rating: Double
  }
