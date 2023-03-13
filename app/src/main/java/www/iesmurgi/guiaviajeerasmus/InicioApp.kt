package www.iesmurgi.guiaviajeerasmus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class InicioApp: AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onStart() {
        super.onStart()
        firebaseAuth = FirebaseAuth.getInstance()
        if(firebaseAuth.currentUser != null){
            val intent = Intent(this, CiudadesActivity::class.java)
            startActivity(intent)
        }else{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}