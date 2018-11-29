def uncurry[A,B,C](f: A => B => C): (A, B) => C ={
(a,b) => f(a)(b)
}
//hey young fellas , not giving away this hint either!!
