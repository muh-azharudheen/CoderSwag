package com.azharudhen.coderswag.Services

import com.azharudhen.coderswag.Model.Category
import com.azharudhen.coderswag.Model.Product

/**
 * Created by mac on 11/22/17.
 */
object DataService {
    val categories = listOf(
            Category("SHIRTS","shirtimage"),
            Category("HOODIES","hoodieimage"),
            Category("HATS","hatimage"),
            Category("DIGITAL","digitalgoodsimage"),
            Category("SHIRTS","shirtimage"),
            Category("HOODIES","hoodieimage"),
            Category("HATS","hatimage"),
            Category("DIGITAL","digitalgoodsimage"),
            Category("SHIRTS","shirtimage"),
            Category("HOODIES","hoodieimage"),
            Category("HATS","hatimage"),
            Category("DIGITAL","digitalgoodsimage")


    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18","hat1"),
            Product("Devslopes Hat Black", "$20","hat2"),
            Product("Devslopes Hat White", "$18","hat3"),
            Product("Devslopes Hat snapback", "$22","hat4")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28","hoodie01"),
            Product("Devslopes Hoodie Red", "$32","hoodie02"),
            Product("Devslopes Gray Hoodie", "$28","hoodie03"),
            Product("Devslopes Black Hoodie", "$32","hoodie04")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "$18","shirt01"),
            Product("Devslopes Badge Light Gray", "$20","shirt02"),
            Product("Devslopes Logo Shirt Red", "$22","shirt03"),
            Product("Devslopes Hustle", "$22","shirt04"),
            Product("Kicklip Studios", "$18","shirt05")
    )

}