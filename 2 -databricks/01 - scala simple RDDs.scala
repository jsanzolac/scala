// Databricks notebook source
val largeList: List[String] = List(
  "apple", "banana", "cherry", "date", "elderberry",
  "fig", "grape", "honeydew", "kiwi", "lemon",
  "mango", "nectarine", "orange", "pear", "quince",
  "raspberry", "strawberry", "tangerine", "uva", "watermelon"
)

// COMMAND ----------

val wordsRDD = sc.parallelize(largeList) //Lazy

// COMMAND ----------

val lengthsRDD = wordsRDD.map(_.length) //Lazy
lengthsRDD.collect() // Action

// COMMAND ----------

val totalChars = lengthsRDD.reduce(_+_) // Action: execute computacion

// COMMAND ----------


