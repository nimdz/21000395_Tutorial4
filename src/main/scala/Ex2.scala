import scala.io.StdIn

object Ex2 extends App {
  println("Enter a number: ")
  var x=scala.io.StdIn.readInt()

  def patternMatch(x:Int):Unit =x match {
    case x if x<0 => print("Negative Number ")
    case x if x==0 => println("Zero")
    case x if x%2 == 0 => println("Even Number")
    case x if x%2 !=0 =>println("Odd Number")

  }
 patternMatch(x)

}
