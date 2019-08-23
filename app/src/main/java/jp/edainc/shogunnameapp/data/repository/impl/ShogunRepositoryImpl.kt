package jp.edainc.shogunnameapp.data.repository.impl

import jp.edainc.shogunnameapp.data.api.ShogunApi
import jp.edainc.shogunnameapp.data.repository.ShogunRepository
import jp.edainc.shogunnameapp.model.entities.ShogunEntity
import jp.edainc.shogunnameapp.model.entities.ShogunListEntity
import jp.edainc.shogunnameapp.model.entities.toListEntity

class ShogunRepositoryImpl(
    private val api: ShogunApi
) : ShogunRepository {
    // どうせ動かないのでいい加減に作っています
    override val edoShogunate: ShogunListEntity
        get() = api.getShogun("edo").execute().body()!!.names.mapIndexed { index, name ->
            ShogunEntity(index, name)
        }.toListEntity()
}