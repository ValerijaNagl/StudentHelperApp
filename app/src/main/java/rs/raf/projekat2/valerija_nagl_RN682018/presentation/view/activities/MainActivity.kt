package rs.raf.projekat2.valerija_nagl_RN682018.presentation.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import rs.raf.projekat2.valerija_nagl_RN682018.R
import rs.raf.projekat2.valerija_nagl_RN682018.presentation.view.adapters.MainPagerAdapter

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    private fun init() {
        initUi()
    }

    private fun initUi() {
        viewPager.adapter =
            MainPagerAdapter(
                supportFragmentManager,
                this
            )
        tabLayout.setupWithViewPager(viewPager)
    }
}
