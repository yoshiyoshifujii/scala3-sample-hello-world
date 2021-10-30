package scala3_features.`implicit`

class C(value: String):
  val name: String = s"$value"

extension [A](seq: Seq[A])
  def tailOption: Option[Seq[A]] =
    if seq.nonEmpty then Some(seq.tail) else None
  def secondOption: Option[A] =
    tailOption.flatMap(_.headOption)
