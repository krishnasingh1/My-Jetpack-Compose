 package com.coderkprathore.jetpackcompose.MoneyCounterApp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coderkprathore.jetpackcompose.ui.theme.JetpackComposeTheme

 // Main Activity Function  There Will Be All Code Working
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = MaterialTheme.colors.background,

                ) {
                    MyApp()



                }
            }
        }
    }
}

 // My App Composable Fuction
 @Composable
 fun MyApp() {
     // State Hosting Value
     val moneyCounter = remember {
         mutableStateOf(0)
     }
     Surface(modifier = Modifier
         .fillMaxWidth()
         .fillMaxHeight(),
         color = Color(0xFF546E7A)) {

         Column(
             verticalArrangement = Arrangement.Center,
             horizontalAlignment = Alignment.CenterHorizontally
         ) {
              
             Text(text = "$${moneyCounter.value}", style = TextStyle(
                 color = Color.White,
                 fontSize = 35.sp,
                 fontWeight = FontWeight.ExtraBold
             ))
             
             Spacer(modifier = Modifier.height(130.dp))
             CreateCircle(moneyCounter = moneyCounter.value) {  newValue ->
                 moneyCounter.value = newValue
             }

             if (moneyCounter.value >100) {
                 Text("Lots Of Money!")
             }
         }


     }
 }


 //@Preview
 @Composable
 fun CreateCircle(moneyCounter : Int = 0, updateMoneyCounter : (Int) -> Unit) {

     /*var moneyCounter by remember {
           mutableStateOf(0)
     }

     */
     Card(modifier = Modifier
         .padding(3.dp)
         .size(105.dp)
         .clickable {

             updateMoneyCounter(moneyCounter + 1)
           //  moneyCounter.value += 1
             Log.d("Counter", "CreateCircle: $moneyCounter")
         },
         shape = CircleShape, elevation = 4.dp
     ) {
         
         Box(contentAlignment = Alignment.Center) {
             Text(text = "Tap" , modifier = Modifier )
         }

     }
 }



// Main Priview Fuction
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeTheme {
       MyApp()
    }
}