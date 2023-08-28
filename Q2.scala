package labsheet10

import scala.io.StdIn.readLine

object Q2 {

  def wordLength(s: String): Int = {
    s.length
  }

  def countLetterOccurrences(s: List[String]): Int = {
    val new_List = s.map(wordLength)

    val sum = new_List.reduce(_+_)

    sum
  }

  def main(args: Array[String]): Unit = {
    val words = readLine("Enter words for list: ").split(" ").toList

    println("Total count of letter occurrences: " + countLetterOccurrences(words))
  }

}
