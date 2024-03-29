package dev.kirillzhelt.androidacademyapp.movies


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import dev.kirillzhelt.androidacademyapp.R
import dev.kirillzhelt.androidacademyapp.model.Movie

/**
 * A simple [Fragment] subclass.
 */
class MoviesFragment : Fragment() {

    private lateinit var moviesViewModel: MoviesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_movies, container, false)

        moviesViewModel = activity?.run {
            ViewModelProviders.of(this).get(MoviesViewModel::class.java)
        } ?: throw Exception("Invalid Activity")

        val adapter = MoviesAdapter(activity ?: throw Exception("Invalid activity")) { position ->
            moviesViewModel.onNavigateDetails(position)
        }

        val moviesRecyclerView: RecyclerView = view.findViewById(R.id.fragment_movies_movies_rv)
        moviesRecyclerView.adapter = adapter

        moviesViewModel.movies.observe(this, Observer { movies ->
            adapter.movies = movies
        })

        moviesViewModel.loadingFinishEvent.observe(this, Observer { event ->
            if (event) {
                view.findViewById<RelativeLayout>(R.id.fragment_movies_loader_rl).visibility = View.GONE
            }
        })

        return view
    }

}
