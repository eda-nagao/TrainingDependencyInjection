package jp.edainc.shogunnameapp.presentation

import android.os.Bundle
import android.widget.TextView
import dagger.android.support.DaggerAppCompatActivity
import jp.edainc.shogunnameapp.R
import jp.edainc.shogunnameapp.data.repository.ShogunRepository
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {
    @Inject
    lateinit var repository: ShogunRepository
    // @Injectというアノテーションが重要。Daggerはこのアノテーションを目印にしてインスタンスを注入する
    // 何のインスタンスを注入するか？　は以下の方法で指定することができる
    //
    // A) コンストラクタに@Injetをつける
    // B) @Providesというアノテーションをつけたメソッドの戻り値にする

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.firstShogun)?.apply {
            text = getShogunName(0)
        }
        findViewById<TextView>(R.id.secondShogun)?.apply {
            text = getShogunName(1)
        }
        findViewById<TextView>(R.id.thirdShogun)?.apply {
            text = getShogunName(2)
        }
    }

    private fun getShogunName(index: Int): String {
        return repository.edoShogunate.items.find {
            it.index == index
        }?.name ?: ""
    }
}
