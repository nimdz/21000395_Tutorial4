object Ex3 extends App {
  def toUpper(s:String):String=s.toUpperCase()

  def toLower(s:String):String=s.toLowerCase()

  def formatNames(name: String,formatter: String => String): String = formatter(name)

  var list1=Array("Benny", "Niroshan", "Saman","Kumara")

  println(formatNames(list1(0),toUpper))
  println(list1(1).charAt(0)+formatNames(list1(1).charAt(1).toString,toUpper)+list1(1).substring(2,8))
  println(formatNames(list1(2),toLower))
  println(list1(3).substring(0,5)+formatNames(list1(3).charAt(5).toString,toUpper))





}
