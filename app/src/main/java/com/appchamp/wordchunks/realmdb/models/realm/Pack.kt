package com.appchamp.wordchunks.realmdb.models.realm

import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.Required


open class Pack : RealmObject() {

    @PrimaryKey
    @Required
    var id: String = ""
    @Required
    var title: String = ""
    @Required
    var color: String = ""
    var state: Int = 0  // 0 = locked, 1 = current, 2 = finished
    var levels: RealmList<Level> = RealmList()

}