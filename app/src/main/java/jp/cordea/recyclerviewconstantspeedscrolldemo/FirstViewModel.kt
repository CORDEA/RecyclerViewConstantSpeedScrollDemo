package jp.cordea.recyclerviewconstantspeedscrolldemo

import androidx.lifecycle.ViewModel
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder

class FirstViewModel : ViewModel() {
    val adapter = GroupAdapter<GroupieViewHolder>()

    fun init() {
        adapter.addAll((0 until 20).map { MainListItem() })
    }
}
