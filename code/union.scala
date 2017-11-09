type ¬[A] = A => Nothing
type ¬¬[A] = ¬[¬[A]]
type ∨[T, U] = ¬[¬[T] with ¬[U]]
type |∨|[T, U] = { type λ[X] = ¬¬[X] <:< (T ∨ U) }
def size[T: (Int |∨| String)#λ](t: T) =
  t match {
    case i: Int => i
    case s: String => s.length
  }
size(34)
size("34")
case class Vaa(r:(Int |∨| String))
