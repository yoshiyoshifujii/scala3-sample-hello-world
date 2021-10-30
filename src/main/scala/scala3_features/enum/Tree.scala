package scala3_features.`enum`

enum Tree[+A]:
  case Leaf(value: A)
  case Branch(left: Tree[A], right: Tree[A])

object Tree:
  def depth[A](t: Tree[A]): Int =
    t match
      case Leaf(_) => 0
      case Branch(l, r) => 1 + (depth(l) max depth(r))