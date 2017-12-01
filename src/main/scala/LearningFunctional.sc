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

  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int = {
    if(a >  b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a+1, b))
  }

  def product(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x,y) => x*y, 1)(a,b)

  def fact(n: Int) = product(x => x)(1,n)

  fact(5)


}