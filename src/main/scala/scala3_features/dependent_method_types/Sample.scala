package scala3_features.dependent_method_types

object Sample1:
  trait Key:
    type Value

  trait DB:
    def get(k: Key): Option[k.Value]

  object Name extends Key:
    override type Value = String

  object Age extends Key:
    override type Value = Int


  val db: DB = ???
  val res1: Option[String] = db.get(Name)
  val res2: Option[Int] = db.get(Age)

  type DB2 = (k: Key) => Option[k.Value]

object Sample2:
  trait Nums:
    type Num

    def lit(d: Double): Num
    def add(l: Num, r: Num): Num
    def mul(l: Num, r: Num): Num

  type Prog = (n: Nums) => n.Num => n.Num

  val ex: Prog = nums => x => nums.add(nums.lit(0.8), x)

  def derivative(input: Prog): Double = ???
