package com.example.vitbatch1
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.vitbatch1.databinding.ActivityHomeBinding
import com.example.vitbatch1.network.MarsApi
import com.example.vitbatch1.network.MarsPhoto
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import okhttp3.Dispatcher

//wet code --- dry code -- repetative lines removed
class HomeActivity<ActivityHomeBinding> : AppCompatActivity(){
    var TAG = HomeActivity::class.java.simpleName    //"HomeActivity"

    lateinit var marsRecyclerView:RecyclerView
    private lateinit var binding: ActivityHomeBinding

    //lateinit var marsRecyclerView:RecyclerView
    lateinit var marsAdapter: MarsAdapter
    lateinit var photos:List<MarsPhoto>
    lateinit var imageView: ImageView
    //  lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        imageView = findViewById(R.id.imageView)
        marsRecyclerView = findViewById(R.id.recyclerViewUrls)
        marsRecyclerView.layoutManager = LinearLayoutManager(this)
        // setContentView(R.layout.activity_home)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // imageView = findViewById(R.id.imageView)
        // marsRecyclerView = findViewById(R.id.recyclerViewUrls)
        binding.recyclerViewUrls.layoutManager = LinearLayoutManager(this)
        photos = ArrayList()
        marsAdapter = MarsAdapter(photos)
        marsRecyclerView.adapter = marsAdapter
        binding.recyclerViewUrls.adapter = marsAdapter

        // marsAdapter = MarsAdapter(photos)

        @@ -60,6 +68,7 @@ class HomeActivity : AppCompatActivity(){
            marsAdapter.notifyDataSetChanged()
            //   var tvHome:TextView = findViewById(R.id.tvHome)
//            tvHome.setText(listMarsPhotos.get(1).imgSrc)
            //  binding.imageView.load()
            Log.i("homeactiviy",listMarsPhotos.size.toString())
            Log.i("homeactivity-url",listMarsPhotos.get(1).imgSrc)

        }
    }
    fun getJson(view: View) {
        getMarsPhotos()
    }
}