package labsheet10

import scala.io.StdIn.readLine

object Q1 {
  def fahrenheit(c: Double): Double = {
    (c*9/5) + 32
  }

  def main(args: Array[String]): Unit = {

    val temperature = readLine("Enter temperatures: ").split(" ").map(_.toDouble).toList

    println("Average Temperature: " + calculateAverage(temperature))
  }

  def calculateAverage (temp: List[Double]): Double = {
    val new_temperature = temp.map(fahrenheit)

    val temperatureSum = new_temperature.reduce(_+_)

    val average = temperatureSum / new_temperature.length

    average

  }
}
