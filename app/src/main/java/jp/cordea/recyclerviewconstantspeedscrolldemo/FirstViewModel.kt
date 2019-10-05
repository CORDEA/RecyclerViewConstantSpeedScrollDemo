package jp.cordea.recyclerviewconstantspeedscrolldemo

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder

class FirstViewModel : ViewModel() {
    val adapter = GroupAdapter<GroupieViewHolder>()
    private val _scrollTo = MutableLiveData<Int>()
    val scrollTo: LiveData<Int> = _scrollTo

    fun init() {
        adapter.addAll((0 until 20).map { MainListItem() })
    }

    fun scrollToTop(view: View) {
        _scrollTo.value = 0
    }

    fun scrollToBottom(view: View) {
        _scrollTo.value = adapter.itemCount - 1
    }
}
