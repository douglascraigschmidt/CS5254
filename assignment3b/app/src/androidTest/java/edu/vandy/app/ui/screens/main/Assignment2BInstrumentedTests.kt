package edu.vandy.app.ui.screens.main

import edu.vandy.simulator.managers.beings.BeingManager.Factory.Type.EXECUTOR_SERVICE
import edu.vandy.simulator.managers.palantiri.PalantiriManager.Factory.Type.REENTRANT_LOCK_HASH_MAP_SIMPLE_SEMAPHORE

class Assignment2BInstrumentedTests : InstrumentedTests() {
    override val beingManager = EXECUTOR_SERVICE
    override val palantirManager = REENTRANT_LOCK_HASH_MAP_SIMPLE_SEMAPHORE
}