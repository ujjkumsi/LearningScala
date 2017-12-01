object LearningFunctional{

  def sqrt(x: Double) {

    def isGoodGuess(guess: Double) =
      math.abs((guess * guess - x) / x) < 0.001

    def improveGuess(guess: Double): Double =
      (guess + x / guess) / 2

    def squareRoot(guess: Double): Double = {
      if (isGoodGuess(guess)) guess
      else squareRoot(improveGuess(guess))
    }

    print(squareRoot(1))
  }

  def gcd(x: Int, y: Int): Int =
    if(y == 0) x else gcd(y, x%y)

  sqrt(4)

  gcd(14, 21)
}