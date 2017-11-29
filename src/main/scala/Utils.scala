package scala

/**
  * Utils singleton class with various utility functions
  * Created by Ujjwal on 29/11/17.
  */
object Utils {

  /**
    * Returns list of n random integers
    */
  def n_rands(n : Int) = {
    val r = new scala.util.Random
    1 to n map { _ => r.nextInt(100) }
  }
}
