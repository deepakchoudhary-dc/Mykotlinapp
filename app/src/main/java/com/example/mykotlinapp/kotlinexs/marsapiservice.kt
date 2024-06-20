import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

// 1. Define BASE_URL outside any object or companion object
private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com"

// 2. Create the Retrofit instance outside the MarsApi object
private val retrofit: Retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

// 3. Define the MarsApiService interface
interface MarsApiService {
    @GET("photos")
    suspend fun getPhotos(): String
}

// 4. Create the MarsApi object to hold the Retrofit service
object MarsApi {
    val retrofitService: MarsApiService = retrofit.create(MarsApiService::class.java)
    // No need for 'by lazy' here since 'retrofit' is already initialized
}