package scala3_features.opaque_types

object Sample1:
  class Logarithm(protected val underlying: Double):
    def toDouble: Double = math.exp(underlying)
    def +(that: Logarithm): Logarithm = Logarithm(this.toDouble + that.toDouble)
    def *(that: Logarithm): Logarithm = new Logarithm(this.underlying + that.underlying)

  object Logarithm:
    def apply(d: Double): Logarithm = new Logarithm(math.log(d))

object Sample2:
  trait Logarithms:
    type Logarithm

    def add(x: Logarithm, y: Logarithm): Logarithm
    def mul(x: Logarithm, y: Logarithm): Logarithm

    def make(d: Double): Logarithm
    def extract(x: Logarithm): Double

    extension (x: Logarithm)
      def toDouble: Double = extract(x)
      def +(y: Logarithm): Logarithm = add(x, y)
      def *(y: Logarithm): Logarithm = mul(x, y)

  object LogarithmsImpl extends Logarithms:
    override type Logarithm = Double

    override def add(x: Logarithm, y: Logarithm): Logarithm = make(x.toDouble + y.toDouble)
    override def mul(x: Logarithm, y: Logarithm): Logarithm = x + y

    override def make(d: Double): Logarithm = math.log(d)
    override def extract(x: Logarithm): Double = math.exp(x)

object Sample3:
  object Logarithms:
    opaque type Logarithm = Double

    object Logarithm:
      def apply(d: Double): Logarithm = math.log(d)

    extension (x: Logarithm)
      def toDouble: Double = math.exp(x)
      def +(y: Logarithm): Logarithm = Logarithm(math.exp(x) + math.exp(y))
      def *(y: Logarithm): Logarithm = x + y
