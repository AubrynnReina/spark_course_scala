package com.sundogsoftware.spark

import org.apache.spark._
import org.apache.log4j._
import org.apache.spark.sql.SparkSession

object HelloWorld {
  def main(args: Array[String]): Unit = {

    Logger.getLogger("org").setLevel(Level.ERROR)

//    val sc = new SparkContext("local[*]", "HelloWorld")
    val spark = SparkSession.builder().appName("Trieu").master("local[*]").getOrCreate()
//    val lines = sc.textFile("data/ml-100k/u.data")
//    val numLines = lines.count()
    val df = spark.read.format("csv")
      .option("header","true")
      .option("inferSchema","true")
      .load("data/1800.csv")

    df.show(truncate=false)
//    println("Hello world! The u.data file has " + numLines + " lines.")
//
//    sc.stop()
  }
}
