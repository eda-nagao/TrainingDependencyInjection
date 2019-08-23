package jp.edainc.shogunnameapp.data.repository

import jp.edainc.shogunnameapp.model.entities.ShogunListEntity

/**
 * 将軍の名前データを取得するためのリポジトリ
 */
interface ShogunRepository {
    val edoShogunate: ShogunListEntity
}