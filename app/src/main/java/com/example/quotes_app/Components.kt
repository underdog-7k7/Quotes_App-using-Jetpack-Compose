package com.example.quotes_app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quotes_app.data.stored_quotes
import com.example.quotes_app.myquotes_model_of_quote.Quotes

val thelistobject = stored_quotes()
val thelist = thelistobject.loadthequotes()


@Composable
fun Quote_Card(thequote:Quotes,modifier: Modifier=Modifier){
    Card(modifier = Modifier) {
        Column(modifier = Modifier) {
            Image(painter = painterResource(id = thequote.imageResourceID), contentDescription = null,modifier = Modifier
                .fillMaxWidth()
                .height(194.dp),
                contentScale = ContentScale.Crop)
            Text(text = stringResource(id= thequote.stringresourceID),modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall)
        }
    }
}

@Preview
@Composable
fun test(){
    /*Quote_Card(thequote = thelist[0] )*/
    display_page(listofquotestobedisplayed = thelist)
}

@Composable
fun display_page(listofquotestobedisplayed:List<Quotes>,modifier: Modifier=Modifier){
    LazyColumn(modifier = Modifier){
        items(listofquotestobedisplayed){
            singlequoteinthelist->
            Quote_Card(
                thequote = singlequoteinthelist,
                modifier=Modifier.padding(8.dp))
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}
