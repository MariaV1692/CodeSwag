package com.mariav.codeswag.Services

import com.mariav.codeswag.Model.Category
import com.mariav.codeswag.Model.Product

object DataService {
    val categories = listOf(
        Category("Shirts","shirtimage"),
        Category("Hoodies","hoodieimage"),
        Category("Hats","hatimage"),
        Category("Digital","digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie","18$","hat1"),
        Product("Devslopes Hat white","21$","hat2"),
        Product("Devslopes Hat black","14$","hat3"),
        Product("Devslopes Hat Snapback","51$","hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodies Gray","18$","hoodies1"),
        Product("Devslopes Hoodies white","20$","hoodies2"),
        Product("Devslopes Hoodies black","138$","hoodies3")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Beanie","18$","shirt1"),
        Product("Devslopes Shirt white","21$","shirt2"),
        Product("Devslopes Shirt black","14$","shirt3"),
        Product("Devslopes Shirt X","51$","shirt4"),
        Product("Devslopes Shirt Y","77$","shirt5")
    )
}