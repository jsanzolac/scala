object Main extends App {

  def abs(x:Double) = if (x < 0) -x else x

  def sqrIter(guess: Double, x: Double): Double = 
    if (isGoodEnough(guess, x)) guess
    else sqrIter(improve(guess, x), x)

  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) / x < 0.001

  def improve(guess: Double, x:Double) = 
   (guess + x / guess ) / 2 

  def sqrtRoot(x:Double) = sqrIter(1.0, x)

  var result = sqrtRoot(4)

  println( result )
}