package com.unsadanpbt.todoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.unsadanpbt.todoapp.ui.theme.ToDoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ToDoAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SegundoEnunciado(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun SegundoEnunciado(modifier: Modifier = Modifier) {
    var mensajeVisible by remember { mutableStateOf(false) }
    var contador by remember { mutableStateOf(0) }

    Column(
        modifier = modifier
    ) {
        Text(
            text = "Título de la app",
            fontSize = 35.sp
        )
        Text(
            text = "Subtítulo de la app",
            fontSize = 20.sp
        )

        Button(
            onClick = {
                contador++
                mensajeVisible = !mensajeVisible
            }
        ) {
            Text("Presionado $contador veces")
        }
        if (mensajeVisible) {
            Text(
                text = "Botón presionado -> Contador: $contador",
                fontSize = 18.sp
            )
        }
    }
}