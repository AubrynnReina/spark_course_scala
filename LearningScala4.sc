// Data Structures in Scala

// Tuples: Immutable Lists

val numTuple = (4, 10, 323, -1)
val mixedTuple = (34, "Rynn", false)

// Accessing elements in a tuple (ONE-BASED)
println(numTuple._1)
println(numTuple._4)

// Key - value -> Tuple
// this kinda explains paired RDD in Spark

val sampleKV = "Nom :3" -> "Chanh"
println(sampleKV._2)

// List: pretty much like Tuple with more functions
// All elements must be of the same type
// ZERO-BASED (THANK YOU NATURE (OwO')\)

val numList = List(3, 4, 5, 7, 34, 123, -1)
println(numList(1))

// Head, Tail of a list, you shall be surprised
println(numList.head)
println(numList.tail)

// Iterate through a list
for (num <- numList){
  println(num)
}

// Transform each element in a list with Map
val negNumList = numList.map(
  (x: Int) => {-x}
)

// Aggregate all elements in a list with Reduce
val weirdList = numList.reduce(
  (x: Int, y: Int) => {x - y}
)

// Remove certain elements with Filter
val smollList = numList.filter(
  (x: Int) => x < 100
)
val beegList = numList.filter(_ >= 100)

// Concatenate Lists
val numList2 = List(-34, -7, 10, 12)
println(numList ++ numList2)

// Some other list operations
val reversed = numList.reverse
val sorted = reversed.sorted
val duplicated = numList ++ numList
val distincted = duplicated.distinct
val maxed = numList.max
val total = numList.sum
val hasFour = numList.contains(4)

// Map, as a data structure in Scala
// similar to dictionary in Python
val itemMap = Map(
  "Phone" -> "Used",
  "Lolipop" -> "Tasted",
  "Water" -> "Drank",
  "Dream" -> "Hanged onto",
  "Health" -> "Way less bad"
)
println(itemMap("Dream"))
println(itemMap.contains("Mouse"))

val mouseItem = util.Try(itemMap("Mouse")) getOrElse("Not here")

// Get numbers that are divisible by 7
val numList = (1 to 100)
println(numList.filter(_ % 7 == 0))
// The result above is a Vector in Scala
// Basically List but immutable, for calculation