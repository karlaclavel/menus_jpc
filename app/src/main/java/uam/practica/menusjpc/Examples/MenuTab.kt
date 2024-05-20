package uam.practica.menusjpc.Examples

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OverFlowTopAppBar() {

    var showMenu by remember { mutableStateOf(false) }

    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color(0xFFABE0C3),
            titleContentColor = Color(0xFF2C333C)
        ),
        title = { Text(text = "Overflow") },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Default.Favorite , contentDescription = "Icono")
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Default.Notifications , contentDescription = "Icono")
            }
            IconButton(onClick = { showMenu = !showMenu }) {
                Icon(Icons.Default.MoreVert , contentDescription = "Icono")
            }
            DropdownMenu(
                expanded = showMenu,
                onDismissRequest = { showMenu = false },
                modifier = Modifier
                    .background(Color(0xFFF3E8DB))
                    .padding(10.dp)
            ) {
                DropdownMenuItem(
                    leadingIcon = { Icon(Icons.Filled.AccountBox, contentDescription = null) },
                    text = { Text(text="Cuenta")  },
                    onClick = { showMenu = !showMenu }
                )
                DropdownMenuItem(
                    leadingIcon = { Icon(Icons.Filled.Settings, contentDescription = null) },
                    text = { Text(text="Configuración")  },
                    onClick = { showMenu = !showMenu }
                )

            }
        }

    )
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TabRowTopBar() {
    var tabIndex  by remember { mutableIntStateOf(0) }
    val tabs = listOf ("Home", "Cuenta", "Configuracion")

    Column(modifier = Modifier.fillMaxWidth()) {
        TabRow(
            selectedTabIndex = tabIndex,
            modifier = Modifier,
            contentColor = Color(0xFF20152C),
            containerColor = Color(0xFFB8ACF0),
            indicator = { tabPositions ->
                TabRowDefaults.apply {
                    Divider(
                        Modifier
                            .height(2.dp)
                            .padding(horizontal = 10.dp)
                            .tabIndicatorOffset(tabPositions[tabIndex]),
                        color = Color(0xFFE91E63)
                    )
                }
            },
            divider = {}
        ) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    selected = tabIndex == index,
                    onClick = { tabIndex = index },
                    content = {
                        when (index) {
                            0 ->
                                Column (
                                    modifier = Modifier.padding(7.dp),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Icon(imageVector = Icons.Default.Home, contentDescription = null)
                                }
                            1 ->
                                Column (
                                    modifier = Modifier.padding(7.dp),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Icon(imageVector = Icons.Default.Person, contentDescription = null)
                                }
                            2 ->
                            Column (
                                modifier = Modifier.padding(7.dp),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Icon(imageVector = Icons.Default.Settings, contentDescription = null)
                            }
                        }
                    }
                )
            }
        }

       /* when (tabIndex) {
            0 -> HomeScreen()
            1 -> CuentaScreen()
            2 -> ConfiguracionScreen()
        }*/
    }
}

@Composable
fun HomeScreen() {
    Column(
        Modifier.fillMaxSize().background(Color(0xFFE0B0C7)).padding(20.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Home", fontSize = 25.sp)
    }
}

@Composable
fun CuentaScreen() {
    Column(
        Modifier.fillMaxSize().background(Color(0xFFB7D39C)).padding(20.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Cuenta", fontSize = 25.sp)
    }
}

@Composable
fun ConfiguracionScreen() {
    Column(
        Modifier.fillMaxSize().background(Color(0xFFB2CBD8)).padding(20.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Configuración", fontSize = 25.sp)
    }
}