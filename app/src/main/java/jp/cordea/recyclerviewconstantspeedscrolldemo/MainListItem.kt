package jp.cordea.recyclerviewconstantspeedscrolldemo

import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item

class MainListItem : Item<GroupieViewHolder>() {
    override fun getLayout(): Int = R.layout.list_item_main

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
    }
}
