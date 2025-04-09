package com.example.fit5046a3



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Home(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            Text(
                text = "Home",
                style = MaterialTheme.typography.headlineMedium
            )

            // Card for today's log status
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                elevation = CardDefaults.cardElevation(6.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text("Today's Log Status", fontSize = 20.sp, style = MaterialTheme.typography
                        .titleMedium)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(" Entry submitted at 8:45 AM", style = MaterialTheme.typography.bodyMedium)
                }
            }

            // Quick Access Buttons
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Button(onClick = {
                    navController.navigate("data_entry")
                }) {
                    Text("Data Entry")
                }

                Button(onClick = {
                    navController.navigate("progress_report")
                }) {
                    Text("Progress Report")
                }
            }
        }
    }
}
