import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking { // this: CoroutineScope
    launch { doWorld() }
    println("Hello") // main coroutine continues while a previous one is delayed
}

private suspend fun doWorld() {
    delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
    println("World!") // print after delay
}
