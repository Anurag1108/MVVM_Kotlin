package example.com.mvvmmoviedb.data

import example.com.mvvmmoviedb.data.model.Movies


interface DataSource {

    interface GetMoviesCallback {

        fun onOperationComplete(movies: Movies)

        fun onOperationFailed(t: Throwable? = Throwable())
    }

    fun getMovies(page: Int = 1, withReleaseDate: Boolean, callback: GetMoviesCallback)
}