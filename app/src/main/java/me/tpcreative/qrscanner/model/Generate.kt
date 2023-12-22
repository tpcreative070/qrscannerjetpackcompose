package me.tpcreative.qrscanner.model

import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey
import org.mongodb.kbson.ObjectId

class Generate() : RealmObject {
    @PrimaryKey
    var _id: ObjectId = ObjectId()
    var email: String? = null
    var subject: String? = null
    var message: String? = null
    var phone: String? = null
    var lat: Double? = 0.0
    var lon: Double? = 0.0
    var query: String? = null
    var title: String? = null
    var location: String? = null
    var _description: String? = null
    var startEvent: String? = null
    var endEvent: String? = null
    var startEventMilliseconds: Long = 0
    var endEventMilliseconds: Long = 0
    var fullName: String? = null
    var address: String? = null
    var text: String? = null
    var ssId: String? = null
    var hidden: Boolean = false
    var password: String? = null
    var url: String? = null
    var createType: String? = null
    var networkEncryption: String? = null
    var createDatetime: String? = null
    var barcodeFormat: String? = null
    var favorite: Boolean = false
    var updatedDateTime: String? = null
    var contentUnique: String? = null
    var isSynced : Boolean = false
    var uuId: String? = null
    var noted : String? = null
    var code : String? = null
    var hiddenDatetime: String? = null
    var typeSave: String? = EnumTypeSave.GENERATE.name
}