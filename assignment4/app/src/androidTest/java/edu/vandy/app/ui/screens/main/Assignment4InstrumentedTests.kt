package edu.vandy.app.ui.screens.main

import edu.vandy.simulator.managers.beings.BeingManager.Factory.Type.COMMON_FORK_JOIN_POOL
import edu.vandy.simulator.managers.beings.BeingManager.Factory.Type.COMPLETION_SERVICE
import edu.vandy.simulator.managers.palantiri.PalantiriManager.Factory.Type.FAIR_STAMPED_LOCK

class Assignment4InstrumentedTests : InstrumentedTests() {
    override val beingManager = COMPLETION_SERVICE
    override val palantirManager = FAIR_STAMPED_LOCK
}