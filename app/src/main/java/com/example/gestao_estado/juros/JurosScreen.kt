package com.example.gestao_estado.juros

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun JurosScreen(modifier: Modifier = Modifier) {

    var capital by remember {
        mutableStateOf("")
    }
}