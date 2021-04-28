
package example.com.mvvmmoviedb.data.model

import com.google.gson.annotations.SerializedName


data class Movies constructor(
        @SerializedName("page")
        var page: Int,
        @SerializedName("results")
        var movies: List<Movie>
) {

}