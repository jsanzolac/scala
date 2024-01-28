package recfun

object RecFun extends RecFunInterface {

  def main(args: Array[String]): Unit = {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(s"${pascal(col, row)} ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
      if (c == 0 || c == r || r == 0 ) 1 
      else pascal(c -1, r-1) + pascal(c, r-1)
  }
    

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def helper(index: Int, openCount: Int): Boolean = {
      if (index == chars.length) {
        openCount == 0
      } else if (chars(index) == '(') {
        helper(index + 1, openCount + 1)
      } else if (chars(index) == ')') {
        openCount > 0 && helper(index + 1, openCount - 1)
      } else {
        helper(index + 1, openCount)
      }
    }
    helper(0, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
      if (money == 0) {
      // If the amount is 0, there is only one way (no change)
      1
    } else if (money < 0 || coins.isEmpty) {
      // If the amount is negative or there are no coins, there are no ways to make change
      0
    } else {
      // Recursive case: countChange(money, coins) = countChange(money - coins.head, coins) + countChange(money, coins.tail)
      countChange(money - coins.head, coins) + countChange(money, coins.tail)
    }
  }
}
