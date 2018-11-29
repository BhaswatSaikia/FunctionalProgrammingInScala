object ex02_2 {
// a bit of modification in the code , we assumed that a list to be checked instead of an Array, anyway it is one line code difference when .toList comes in built iwth scala :)
 def isSorted[A](as: List[A], ordered: (A,A) => Boolean): Boolean={
  as match{
   case h::Nil => true
   case h::t => ordered(h,t.head) && isSorted(t,ordered)
   case Nil => true
 }
}
 def main(args :Array[String]):Unit ={
 println(isSorted(List(8,4,6,7),(a:Int,b:Int)=>a<=b))
 println(isSorted(List(-1,4,6,7),(a:Int,b:Int)=>a<=b))
 println(isSorted(List(4,4,4,4),(a:Int,b:Int)=>a<=b))
 println(isSorted(List(-21,-2,-1,0),(a:Int,b:Int)=>a<=b))
}
}
