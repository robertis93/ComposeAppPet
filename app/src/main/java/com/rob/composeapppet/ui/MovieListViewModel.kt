package com.rob.composeapppet.ui

import androidx.lifecycle.ViewModel

class MovieListViewModel(
   // private val repository: SomeRepository
) : ViewModel() {

    val filmList =
        mutableListOf("India", "Pakistan", "China", "United States",  "Albania", "Algeria", "Andorra", "Angola", "Antigua", "Barbuda", "Argentina", "Armenia")
}
