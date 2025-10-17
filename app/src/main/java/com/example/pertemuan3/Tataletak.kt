package com.example.pertemuan3

import android.graphics.Paint
import android.text.Layout
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp


@Composable
fun TataletakColumn(modifier: Modifier) {
    Column (modifier = modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)){
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun TataletakRow(modifier: Modifier) {
    Row (modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly){
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun TataletakBox(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(), contentAlignment = Alignment.Center
    ) {
        Text(text = "Box 1")
        Text(text = "Column 1")
        Text(text = "Row 1")
        Text(text = "Box 2")
        Text(text = "Column 2")
    }
}

@Composable
fun TataletakColumnRow(modifier: Modifier) {
    Column (){
        //Baris ke 1
        Row(modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "Komponen1Baris1")
            Text(text = "Komponen2Baris1")
            Text(text = "Komponen3Baris1")
        }
        //Baris ke 2
        Row (modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "Komponen1Baris2")
            Text(text = "Komponen2Baris2")
            Text(text = "Komponen3Baris2")
        }
    }
}

@Composable
fun TataletakRowColumn(modifier: Modifier) {
    Row (modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
        //Kolom 1
        Column (){
            Text(text = "Komponen1Kolom1")
            Text(text = "Komponen2Kolom1")
            Text(text = "Komponen3Kolom1")
        }
        //kolom ke 2
        Column (){
            Text(text = "Komponen1Kolom2")
            Text(text = "Komponen2Kolom2")
            Text(text = "Komponen3Kolom2")
        }
    }
}

@Composable
fun TataletakBoxColumnRow(modifier: Modifier){
    val gambar = painterResource(id = R.drawable.asd)
    Column {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height( height = 110.dp)
                .background(color = Color.Yellow),
            contentAlignment = Alignment.Center
        ){
            Column (){
                Row (
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Text(text = "Col1_Row1_Komponen1")
                    Text(text = "Col1_Row1_Komponen2")
                    Text(text = "Col1_Row1_Komponen3")
                }
                Row (
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Text(text = "Col1_Row2_Komponen1")
                    Text(text = "Col1_Row2_Komponen2")
                    Text(text = "Col1_Row2_Komponen3")
                }
            }
        }
        Spacer(modifier = Modifier.height( height = 10.dp))
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(height = 300.dp)
                .background(color = Color.Cyan),
            contentAlignment = Alignment.Center
        ){

        }
    }
}