object LearningFunctional{

  def isGoodGuess(guess: Double, x: Double) =
    math.abs((guess * guess - x) / x) < 0.001

  def improveGuess(guess: Double, x: Double): Double =
    (guess + x / guess) / 2

  def squareRoot(guess: Double, x: Double) : Double = {
    if(isGoodGuess(guess, x)) guess
    else squareRoot(improveGuess(guess, x), x)
  }

  squareRoot(1,4)
}