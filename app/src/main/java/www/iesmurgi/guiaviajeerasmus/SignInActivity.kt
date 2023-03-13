package www.iesmurgi.guiaviajeerasmus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import www.iesmurgi.guiaviajeerasmus.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignInBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()
        binding.textView.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        iniciarSesion(binding.emailEt.text.toString(), binding.passET.text.toString())
    }

    fun iniciarSesion(email: String, pass: String) {
        val email = binding.emailEt.text.toString()
        val pass = binding.passET.text.toString()

        if (email.isNotEmpty() && pass.isNotEmpty()) {
            binding.button.setOnClickListener {
                println(email)
                FirebaseAuth.getInstance().signInWithEmailAndPassword(
                    email,
                    pass
                ).addOnCompleteListener{
                    if (it.isSuccessful) {
                        println("aqui entra")
                        abrirPerfil()
                    } else {
                        error()
                        Toast.makeText(this, it.exception.toString(), Toast.LENGTH_LONG).show()
                    }
                }
            }
        }
    }

    fun error() {
        Toast.makeText(this, "Ha habido un error", Toast.LENGTH_LONG).show()
    }

    fun abrirPerfil() {
        val intent = Intent(this, CiudadesActivity::class.java)
        startActivity(intent)
    }
}