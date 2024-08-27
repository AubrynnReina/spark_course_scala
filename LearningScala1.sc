import scala.util.matching.Regex

// VALUES are immutable
val hello: String = "Greetings!"

// VARIABLES are mutable
var hello_2: String = "Hey a'll"

hello_2 = hello_2 + " munchkins :3"

val another_hello = hello + " <EOF>"

// Data types
val numberOne: Int = 1
val truth: Boolean = true
val letterA: Char = 'A' // Scala uses single quotes for Char types
val pi: Double = 3.14159265
val piSinglePrecision: Float = 3.14159265f
val beegNumber: Long = 1231231231
val smollNumber: Byte = 127

// Println does not create space between pluses
println("Some vals: " + numberOne + truth + letterA)

// Can use println with formatting (C-alike)
println(f"Some vals: ${numberOne} $truth $letterA")
println(f"Pi is roughly: $pi%.2f")
println(f"Number with padding: $numberOne%04d")

// Expression in println can be put in ${}
println(f"Expression of simplicity: ${1 + numberOne}")

// Pattern look up in Scala using RegEx
// only gets the last value in the matched patterns
val someString: String = "123 is smoller than 132 " +
  "and any other number that can be constructed " +
  "using 1, 2 and 3 without using the same number twice."
val results = """\d+""".r.findAllIn(someString): Regex.MatchIterator

for (result <- results) print(result + " ")

// Boolean:
// - basically Python-alike
// - all lowercase true and false tho