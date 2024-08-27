// The syntax is weird ~.
// def [func_name]((param: type)s): [return_type] = {}
def square(x: Int): Int = {
  x * x
}

def cube(x: Int): Int = {
  x * x * x
}

println(square(12))
println(cube(8))

def transformInt(x: Int, f: Int => Int): Int = {
  f(x)
}

println(transformInt(12, square))
println(transformInt(8, cube))

transformInt(10, x => x / 3)
transformInt(10, x => x * x * x)
transformInt(10, x => {
  val y = x * 2
  y * 2
})

def toUpperCaseUDF(s: String): String = {

  var result: String = ""
  for (char <- s) {
    result += char.toUpper
  }
  result
}

toUpperCaseUDF("nom :3")
toUpperCaseUDF("chanh ( >3<)q")

def transformString(s: String, func: String => String): String = {
  func(s)
}

transformString("nom :3", s => {
  var result: String = ""
  for (char <- s) {
    result += char.toUpper
  }
  result
})

def multiplyUDF(a: Int, b: Int): Int = {
  a * b
}

def testUDF(a: Int, b: Int, func: (Int, Int) => Int): Int = {
  func(a, b)
}

testUDF(3, 4, multiplyUDF)