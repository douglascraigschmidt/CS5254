package edu.vandy.app.extensions

import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetBehavior.*
import android.view.View

/**
 * Use for getting and setting the BottomSheetBehavior state
 * for a view that implements BottomSheetBehavior.
 */
var View.bottomSheetState
    get() = from(this).state
    set(state) {
        from(this).state = state
    }

/**
 * Shows or hides a BottomSheet style view by
 * settings it's BottomSheetBehavior state.
 */
fun View.showBottomSheet(show: Boolean) {
    bottomSheetState = if (show) {
        STATE_EXPANDED
    } else {
        STATE_HIDDEN
    }
}

/**
 * Toggles the visibility state of a bottom sheet style
 * view setting it's BottomSheet state.
 */
fun View.toggleBottomSheetVisibility() {
    bottomSheetState =
            with(from(this)) {
                when (state) {
                    STATE_HIDDEN,
                    STATE_COLLAPSED ->
                        STATE_EXPANDED
                    else ->
                        STATE_HIDDEN
                }
            }
}

/**
 * Peeks a bottom sheet for the specified [peekTime] millisecond
 * value using the optional [peekHeight] distance. If [peekHeight]
 * is not specified, the BottomSheetBehavior's default peek
 * height will be used. If [peekTime] is not specified, a default
 * value of 1500 milliseconds is used.
 */
fun View.peekBottomSheet(peekHeight: Int = 0, peekTime: Long = 1500) {

    // Ensure that receiver view supports BottomSheetBehavior.
    try {
        from(this)
    } catch (e: Exception) {
        error("View.peekBottomSheet extension: " +
              "view does not support BottomSheetBehaviour: $e")
    }

    with(from(this)) {
        when (state) {
            STATE_HIDDEN -> {
                val oldPeekHeight = this.peekHeight
                val newPeekHeight = if (peekHeight > 0) peekHeight else this.peekHeight

                if (this.peekHeight != newPeekHeight) {
                    this.peekHeight = newPeekHeight
                }

                state = STATE_COLLAPSED

                postDelayed(peekTime) {
                    // If the app has not changed the peek height
                    // during this peek operation, then restore
                    // the old peek height.
                    if (this.peekHeight == newPeekHeight &&
                        newPeekHeight != oldPeekHeight) {
                        this.peekHeight = oldPeekHeight
                    }

                    state = STATE_HIDDEN
                }

                // postDelayed returns Boolean so this stops the compiler
                // from thinking that this when requires Boolean return
                // values.
                Unit
            }

            STATE_COLLAPSED -> {
                val newPeekHeight = if (peekHeight > 0) peekHeight else this.peekHeight
                val oldPeekHeight = this.peekHeight

                if (this.peekHeight > newPeekHeight) {
                    this.peekHeight = newPeekHeight

                    // Force the view to the new larger collapsed size.
                    this.state = STATE_HIDDEN
                    this.state = STATE_COLLAPSED

                    postDelayed(peekTime) {
                        // If the app has not changed the peek height
                        // during this peek operation, then restore
                        // the old peek height.
                        if (this.peekHeight == newPeekHeight &&
                            newPeekHeight != oldPeekHeight) {
                            this.peekHeight = oldPeekHeight

                            // Force the view back to it's original peek height.
                            this.state = STATE_HIDDEN
                            this.state = STATE_COLLAPSED
                        }
                    }
                }
            }

            else -> {
            }
        }
    }
}
