object Q2 {

  def patternMatch(x: Int): String = x match {
    case x if x < 0 => "Negative Number "
    case x if x == 0 => "Zero"
    case x if x % 2 == 0 => "Even Number"
    case x if x % 2 != 0 => "Odd Number"

  }

  def main(args: Array[String]): Unit = {

    val num = args(0).toInt
    println( "The Number is "+ patternMatch(num))
  }
}

