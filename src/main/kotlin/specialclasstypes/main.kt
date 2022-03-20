package specialclasstypes

fun executeOperation(x:Int, op:Operation) =
    when(op) {
        is Operation.Add -> x + op.value
        is Operation.Multiply -> x * op.value
    }

fun main() {
    println(executeOperation(10, Operation.Add(15)))
}