package scala


/**
  * To sort array of integers with duplicates in ascending order
  * Created by Ujjwal on 29/11/17.
  */
object QuickSort {

  def sort(a: Array[Int]): Array[Int] =
    if (a.length < 2) a
    else {
      val pivot = a(a.length / 2)
      // ::: or concat or ++ operator two merge two lists
      sort(a.filter(pivot > _)) ++ a.filter(pivot == _) ++ sort(a.filter(pivot < _))
    }

  def main(args: Array[String]) = {
    val a = Utils.n_rands(100).toArray
    sort(a).foreach(n => (print(n), print(" ")))
  }
}
