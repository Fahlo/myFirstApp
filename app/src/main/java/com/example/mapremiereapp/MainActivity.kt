package com.example.mapremiereapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.BoxScopeInstance.align
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.windowInsetsBottomHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mapremiereapp.ui.theme.MaPremiereAppTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaPremiereAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Yohan")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    accueil()
}

//Apprendre les textes
@Composable
fun MyText() {
    Text(
            text = stringResource(id = R.string.hello)
        ,   color = Color.Red
        ,   fontWeight = FontWeight.Black
        ,   modifier = Modifier
        //    .padding(start = 25.dp)
        , fontStyle = FontStyle.Italic
        , fontFamily = FontFamily.Cursive
        , textAlign = TextAlign.Center
        , fontSize = 30.sp
        , lineHeight = 50.sp
    )

}

//Apprendre les textes
@Composable
fun MyTextName() {
    Text(
        text = stringResource(id = R.string.Name)
        ,   color = Color.Blue
        ,   fontWeight = FontWeight.Black
        ,   modifier = Modifier
            .padding(start = 50.dp).height(130.dp)
        , textAlign = TextAlign.Center
        , fontSize = 30.sp
    )

}

//Apprendre les surfaces
@Composable
fun mySurface(){
        Surface(color = MaterialTheme.colorScheme.primary
           // ,shape= RoundedCornerShape(25.dp)
            , modifier = Modifier.fillMaxSize())
            {
            MyText()
            }
}


@Composable
fun myImageFont() {
    Image(painter = painterResource(id = R.drawable.capture_d_cran_2022_08_09_223039),
        contentDescription="Photo de couverture"
        , contentScale = ContentScale.Fit)
}

@Composable
fun myImageProfil( ) {
    Image(painter = painterResource(id = R.drawable.profil_facebook)
        , contentDescription="Photo de couverture"
        , modifier = Modifier
            .size(100.dp)
            .border(BorderStroke(2.dp, Color.White), CircleShape)
            .clip(CircleShape)
    , contentScale = ContentScale.FillHeight)
}



@Composable
fun accueil(){

    Column(modifier = Modifier.fillMaxSize()) {
        Box(contentAlignment = Alignment.BottomStart) {
            myImageFont()

            Surface(color = Color.White,
                 shadowElevation = 50.dp,
                modifier = Modifier
                    .clip(CircleShape)
                    .padding(1.dp))
                 {
                myImageProfil()
            }
        }
        MyTextName()
        Divider( thickness = 8.dp, color = Color.Gray,
            modifier= Modifier.padding(start=10.dp, end=10.dp ))
        mySurface()


    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MaPremiereAppTheme {
        Greeting("Yohan")
    }
}