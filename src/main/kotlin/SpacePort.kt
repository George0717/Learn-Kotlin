object SpacePort {

    fun investigateSpace(spaceCraft: SpaceCraft) {
        spaceCraft.sendMessageToEarth("SpacePort: Checking spacecraft status...")

        spaceCraft.refuel()
        spaceCraft.repairEngine()
        spaceCraft.fixConnection()

        try {
            spaceCraft.launch()
        } catch (e: Exception) {
            spaceCraft.sendMessageToEarth("Launch failed: ${e.localizedMessage}")
            spaceCraft.sendMessageToEarth("SpacePort: Fixing issues...")

            spaceCraft.refuel()
            spaceCraft.repairEngine()
            spaceCraft.fixConnection()

            spaceCraft.launch()
        }

        spaceCraft.investigateSpace(spaceCraft)
    }
}
