def compose[A,B,C](f: B => C, g: A => B): A => C ={
 f(g(a))
}

//easy peasy here assume a:A and so on!!
