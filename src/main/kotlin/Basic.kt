import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking { // this: CoroutineScope
    doWorld()
}

private suspend fun doWorld() = coroutineScope {
    launch {
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }
    println("Hello") // main coroutine continues while a previous one is delayed
}

//launch is a coroutine builder. It launches a new coroutine concurrently, work independently
//delay is suspending function does not block the underlying thread but allows other coroutines to run and use the underlying thread
//runblocking is also a coroutine builder that bridges the non-coroutine to coroutine.