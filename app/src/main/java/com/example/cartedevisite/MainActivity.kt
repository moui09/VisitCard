package com.example.cartedevisite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarteDeVisite()
        }
    }
}

@Composable
fun CarteDeVisite() {
    // Organisation principale en colonne
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Section En-tête : Logo + Nom + Fonction
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Logo Android",
            modifier = Modifier.size(100.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Oyekunlé Mouizah",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Développeuse Android",
            fontSize = 18.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Section Coordonnées
        Coordonnees(
            icone = Icons.Filled.Phone,
            texte = "+225 01 53 50 74 89"
        )
        Coordonnees(
            icone = Icons.Filled.Email,
            texte = "mouizah2609@gmail.com"
        )
        Coordonnees(
            icone = Icons.Filled.LocationOn,
            texte = "Abidjan, Côte d'Ivoire"
        )
    }
}

@Composable
fun Coordonnees(icone: ImageVector, texte: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(8.dp)
    ) {
        Icon(
            imageVector = icone,
            contentDescription = null,
            modifier = Modifier.size(24.dp),
            tint = Color(0xFF3DDC84) // Vert Android
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = texte, fontSize = 16.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun CarteDeVisitePreview() {
    CarteDeVisite()
}