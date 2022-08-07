package developer.abdulaziz.navigate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import developer.abdulaziz.navigate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}