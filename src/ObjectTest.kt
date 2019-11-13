class ObjectTest() {
    object OneObject {
        fun bar() {
            println("Object's bar is called")
        }
    }
}

fun main() {
    ObjectTest.OneObject.bar()
}

