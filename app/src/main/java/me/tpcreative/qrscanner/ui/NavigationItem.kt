package me.tpcreative.qrscanner.ui

import me.tpcreative.qrscanner.R

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Scan : NavigationItem("Scan", R.drawable.ic_qr_code_scanner, "Scan")
    object History : NavigationItem("music", R.drawable.ic_history, "History")
    object MyCodes : NavigationItem("movies", R.drawable.ic_qr_code, "My codes")
    object Settings : NavigationItem("books", R.drawable.ic_settings, "Settings")
}