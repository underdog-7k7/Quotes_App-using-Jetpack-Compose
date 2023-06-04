package com.example.quotes_app.data

import com.example.quotes_app.R
import com.example.quotes_app.myquotes_model_of_quote.Quotes

class stored_quotes() { //a class named stored_quotes
    fun loadthequotes(): List<Quotes>{ //that class with a method that loads the quotes, returns a list of quotes
        return  listOf<Quotes>( //we are now creating that list of quotes passing them as an argument in the list of function
            Quotes(R.string.quote1,R.drawable.image1),
            Quotes(R.string.quote2,R.drawable.image2),
            Quotes(R.string.quote3,R.drawable.image3),
            Quotes(R.string.quote4,R.drawable.image4),
            Quotes(R.string.quote5,R.drawable.image5),
            Quotes(R.string.quote6,R.drawable.image6),
            Quotes(R.string.quote7,R.drawable.image7),
            Quotes(R.string.quote8,R.drawable.image8),
            Quotes(R.string.quote9,R.drawable.image9),
            Quotes(R.string.quote10,R.drawable.image10)
        )
    }
}