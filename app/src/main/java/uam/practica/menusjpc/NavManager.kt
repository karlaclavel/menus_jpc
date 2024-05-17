package uam.practica.menusjpc

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavManager() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "inicio"
    ) {
        composable("Pantalla1") {
//            Pantalla1(bavController = navController)
        }
        composable("Pantalla2") {
//            Pantalla2( navController = navController)
            //sharedPreferencesManager = sharedPreferencesManager, navController = navController
        }
        composable("Pantalla3") {
//           Pantalla3( navController = navController)
        }
    }
}


