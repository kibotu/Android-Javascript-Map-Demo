package de.check24.huawei.maps

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import de.check24.huawei.maps.misc.createRandomImageUrl
import net.kibotu.android.recyclerviewpresenter.PresenterAdapter
import net.kibotu.android.recyclerviewpresenter.PresenterViewModel

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val list: RecyclerView
        get() = findViewById(R.id.list)

    private val swipeRefresh: SwipeRefreshLayout
        get() = findViewById(R.id.swipeRefresh)

    private val adapter = PresenterAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // list.layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        list.adapter = adapter
        adapter.registerPresenter(PhotoPresenter())
        adapter.registerPresenter(MapsPresenter())

        val items = createItems()

        adapter.submitList(items)

        swipeRefresh.setOnRefreshListener {
            items.shuffle()
            adapter.submitList(items)
            swipeRefresh.isRefreshing = false
        }

    }

    private fun createItems() = mutableListOf<PresenterViewModel<*>>().apply {

        repeat(100) {
            add(PresenterViewModel(createRandomImageUrl(), R.layout.photo_presenter_item))
            add(PresenterViewModel(LatLng(52.5111213, 13.4023262, 17), R.layout.map_presenter_item))
        }
    }

    override fun onDestroy() {
        adapter.clear()
        super.onDestroy()
    }
}