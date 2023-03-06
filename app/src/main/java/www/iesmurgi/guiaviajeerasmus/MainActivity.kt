package www.iesmurgi.guiaviajeerasmus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import www.iesmurgi.guiaviajeerasmus.databinding.ActivityMainBinding
import www.iesmurgi.guiaviajeerasmus.databinding.ActivitySignInBinding
import www.iesmurgi.guiaviajeerasmus.databinding.ActivitySignUpBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }

        binding.btnSignin.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}