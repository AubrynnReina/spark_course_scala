// Match - Case
val number = 4
number match {
  case 1 => println("One")
  case 2 => println("Two")
  case 3 => println("Three")
  case 4 => println("FOUR!")
  case _ => println("Not yet implemented")
}

// For loop
for (x <- 10 to 4 by -2) {
  val xSquared = x * x
  println(xSquared)
}

// While loop and DO - WHILE (/ >w<)/ loop
var x = 10
while (x >= 4) {
  println(x)
  x -= 2
}

var x = 10
do {
  println(x)
  x -= 2
} while (x >= 4)

// Fibonacci Exercise
var temp_1 = 0
var temp_2 = 1
for (x <- 1 to 10) {
  if (x % 2 == 1) {
    println(temp_1)
    temp_1 += temp_2
  }
  else {
    println(temp_2)
    temp_2 += temp_1
  }
}