import com.github.ajalt.clikt.core.CliktCommand
import io.ktor.application.*
import io.ktor.http.HttpStatusCode.Companion.OK
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main(args: Array<String>) = object : CliktCommand("Application description here") {

  override fun run() {
    /**
     * Your code here
     */
    mockHealthyChecks()
  }


}.main(args)