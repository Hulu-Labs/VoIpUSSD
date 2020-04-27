package com.romellfudi.ussd.main.view

import com.romellfudi.ussdlibrary.USSDApi

/**
 * @version 1.0
 * @autor Romell Domínguez
 * @date 2020-04-26
 */
interface MainMVPView {
    var ussdNumber: String
    fun setResult(data: String)
    fun appendResult(string: String)
    var ussdApi: USSDApi
    var accessability: Boolean
    fun showOverlay()
    fun dismissOverlay()
}