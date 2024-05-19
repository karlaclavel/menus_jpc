package uam.practica.menusjpc

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TipoTopBar() {

    Scaffold (
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = Color(0xFF79E0F1),
                    titleContentColor = Color(0xFF2C333C)
                ),
                title = { Text(text = "TopAppBar") },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Icono de regresar")
                    }
                },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Filled.Favorite,
                            contentDescription = "Icono de la derecha"
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Filled.Share,
                            contentDescription = "Icono de la derecha"
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Icono de la derecha"
                        )
                    }
                }
            )
        },
    ) {
            innerPadding ->
        Column (
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Text(
                modifier = Modifier
                    .padding(16.dp),
                text = "Probando Scaffold con TopAppBar y sus componente en Jetpack Compose con Kotlin en Android Studio"
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TipoBottomBar() {

    Scaffold(
        bottomBar = {
            BottomAppBar(
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Filled.Check,
                            contentDescription = "Icono")
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            Icons.Filled.Edit,
                            contentDescription = "Icono",
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            Icons.Filled.MailOutline,
                            contentDescription = "Icono",
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            Icons.Filled.AccountBox,
                            contentDescription = "Icono",
                        )
                    }
                },
                containerColor = Color(0xFF79E0F1),
                contentColor= Color(0xFF2C333C),
                floatingActionButton = {
                    FloatingActionButton(
                        onClick = { /* do something */ },
                        containerColor = Color(0xFFCCF2F8),
                        elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
                    ) {
                        Icon(Icons.Filled.Add, "FloatButton")
                    }
                }
            )
        },
    ) {
            innerPadding ->
        Column (
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Text(
                modifier = Modifier
                    .padding(16.dp),
                text = "Probando Scaffold y sus componente en Jetpack Compose con Kotlin en Android Studio"
            )
        }
    }
}