package www.smktelkommlg.myfragment


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val splashHandler = Handler(mainLooper)

        splashHandler.postDelayed({
            val intent = Intent(this@SplashScreen,IntroSliderActivity::class.java)
            startActivity(intent)
        },5000)
    }
}