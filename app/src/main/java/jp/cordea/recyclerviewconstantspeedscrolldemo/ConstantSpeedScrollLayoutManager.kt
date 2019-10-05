package jp.cordea.recyclerviewconstantspeedscrolldemo

import android.content.Context
import android.util.DisplayMetrics
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSmoothScroller
import androidx.recyclerview.widget.RecyclerView

class ConstantSpeedScrollLayoutManager(
    private val context: Context
) : LinearLayoutManager(context) {
    override fun smoothScrollToPosition(
        recyclerView: RecyclerView?,
        state: RecyclerView.State?,
        position: Int
    ) {
        val scroller = object : LinearSmoothScroller(context) {
            override fun calculateSpeedPerPixel(displayMetrics: DisplayMetrics): Float =
                MILLISECONDS_PER_INCH / displayMetrics.densityDpi
        }
        scroller.targetPosition = position
        startSmoothScroll(scroller)
    }

    companion object {
        private const val MILLISECONDS_PER_INCH = 1000f
    }
}
