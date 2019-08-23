package jp.edainc.shogunnameapp.model.entities

data class ShogunListEntity(val items: List<ShogunEntity>) : List<ShogunEntity> by items

fun List<ShogunEntity>.toListEntity(): ShogunListEntity = ShogunListEntity(this)