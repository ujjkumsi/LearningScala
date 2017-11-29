/**
  * Given two words A and B, find the minimum number of steps required to convert A to B. (each operation is counted as 1 step.)
  * You have the following 3 operations permitted on a word:
  * Insert a character
  * Delete a character
  * Replace a character
  * Created by Ujjwal on 29/11/17.
  */
object EditDistance {

  def calculateEditDistance(a: String, b: String): Int ={
    val m = a.length
    val n = b.length
    val dp = Array.fill(m+1,n+1)(0)
    for(i <- 0 to m){
      for(j <- 0 to n){
        if(i == 0) dp(i)(j) = j
        else if(j == 0) dp(i)(j) = i
        else if (a(i-1) == b(j-1)) dp(i)(j) = dp(i-1)(j-1)
        else dp(i)(j) = 1 + List(dp(i-1)(j), dp(i)(j-1), dp(i-1)(j-1)).min
      }
    }
    dp(m)(n)
  }

  def main(args: Array[String]) = {
    val str1 = "aaa"
    val str2 = "aa"
    print(calculateEditDistance(str1, str2))
  }

}
