package de.check24.huawei.maps

import android.view.View
import android.webkit.WebView
import androidx.recyclerview.widget.RecyclerView
import net.kibotu.android.recyclerviewpresenter.Presenter
import net.kibotu.android.recyclerviewpresenter.PresenterViewModel

class MapsPresenter : Presenter<LatLng>(R.layout.map_presenter_item) {

    private val View.webView: WebView
        get() = findViewById(R.id.webview)

    override fun bindViewHolder(viewHolder: RecyclerView.ViewHolder, item: PresenterViewModel<LatLng>, payloads: MutableList<Any>?) = with(viewHolder.itemView) {

        with(webView.settings) {
            javaScriptEnabled = true
        }

        val latLng = item.model
        webView.loadUrl("file:///android_asset/maps.html")
        // webView.loadUrl("https://www.google.com/maps/@${latLng.lat},${latLng.lng},${latLng.zoom}")
    }
}