package jp.edainc.shogunnameapp.data.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * http://hogehoge.hogehoge.shogun.com/shogun
 * というAPIを実行する
 *
 * ・・・が、そんなサーバは存在しないので動かない
 */
interface ShogunApi {
    @GET("/shogun")
    fun getShogun(@Query("bakufu") bakuhu: String): Call<GetShogunNamesResponse>

    data class GetShogunNamesResponse(
        val names: List<String>
    )
}