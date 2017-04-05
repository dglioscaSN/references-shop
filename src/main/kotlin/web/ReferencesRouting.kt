import org.wasabifx.wasabi.app.AppServer

object ReferencesRouting {

    val server = AppServer()

    init {
        server.get("/", { response.send("Hello World!") })
    }

    @JvmStatic
    fun main(args: Array<String>) {
        server.start()
    }
}
