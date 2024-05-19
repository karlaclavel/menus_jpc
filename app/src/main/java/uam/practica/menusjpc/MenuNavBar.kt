package uam.practica.menusjpc

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TipoNavigationBar() {

    var itemIndex by remember { mutableIntStateOf(0) }
    val items = listOf("Inicio", "Música", "Recomendados")
    val icons = listOf(Icons.Default.Home, Icons.Default.Favorite, Icons.Default.ThumbUp)


    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = itemIndex == index,
                onClick = { itemIndex = index },
                label = { Text(text = item)},
                icon = { Icon(icons[index], contentDescription = item) }
            )
        }
    }

}