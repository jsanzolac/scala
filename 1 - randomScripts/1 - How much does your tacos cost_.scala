// Databricks notebook source
case class Taco(kind: String, price:Double)

// COMMAND ----------

val tacoOrder = List(
  Taco("Carnitas", 2.25),
  Taco("Maiz", 1.67),
  Taco("Barbacoa", 5.5),
  Taco("Chicken", 2.1)
)

// COMMAND ----------

val totalCost = tacoOrder.foldLeft(0.0)((sum, taco) => sum + taco.price)

// COMMAND ----------


