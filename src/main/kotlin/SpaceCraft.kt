import kotlin.math.PI

class SpaceCraft {
    private var isConnectionAvailable: Boolean = false
    private var isEngineInOrder: Boolean = false
    private var fuel: Int = 0
    var isInSpace: Boolean = false

    fun launch() {
        if (fuel < 5) {
            throw Exception("Out Of Fuel, Can't take off")
        }

        if (!isEngineInOrder) {
            throw Exception("The engine is broken. Can't take off")
        }

        if (!isConnectionAvailable) {
            throw Exception("No Connection with Earth")
        }

        sendMessageToEarth("Trying to launch....")
        fuel -= 5
        isInSpace = true
        sendMessageToEarth("I'm in Space")
        sendMessageToEarth("I've found some extraterrestrials")
    }

    fun refuel() {
        fuel += 5
        sendMessageToEarth("The fuel tank is filled")
    }

    fun repairEngine() {
        isEngineInOrder = true
        sendMessageToEarth("The engine is in order")
    }

    fun fixConnection() {
        isConnectionAvailable = true
        sendMessageToEarth("Hello Earth, can you hear me?")
        sendMessageToEarth("Connection is established")
    }

    fun land() {
        sendMessageToEarth("Landing...")
        isInSpace = false
    }

    fun investigateSpace(spaceCraft: SpaceCraft) {
        try {
            spaceCraft.launch()
        } catch (exception: Exception) {
            spaceCraft.sendMessageToEarth(exception.localizedMessage)
        } finally {
            if (spaceCraft.isInSpace) {
                spaceCraft.land()
            }
        }
    }

    fun sendMessageToEarth(message: String) =
        println("Spacecraft To Earth: $message")
}
