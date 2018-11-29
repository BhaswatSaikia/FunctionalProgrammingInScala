 object ex2_1 {
// a few assumptions : index starts from 0, so there exists something called zeroth number in this case.
//when the answer is in negative, it is to be automatically assumed that index is out of bound.
  def fib(n: Int): Int = {
  @annotation.tailrec
  def loop(n: Int, prev: Int, cur: Int): Int =
    if(n <0 ) -1
    else if (n == 0) prev 
    else loop(n - 1, cur, prev + cur)
  loop(n, 0, 1)
}
 def main(args :Array[String]):Unit ={
 println(fib(4))
 println(fib(0))
 println(fib(-1))
 println(fib(2))
 }
}
