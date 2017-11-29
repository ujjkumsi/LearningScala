package scala

/**
  * Created by Ujjwal on 29/11/17.
  */
object Utils {

  def n_rands(n : Int) = {
    val r = new scala.util.Random
    1 to n map { _ => r.nextInt(100) }
  }
}
