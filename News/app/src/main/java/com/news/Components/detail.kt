package com.news.Components

import android.annotation.SuppressLint
import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.*
import androidx.compose.material3.DividerDefaults.color
import androidx.compose.material3.SnackbarDefaults.color
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextAlign.Companion.Center
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.news.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun detail(newsdata: newsdata,navController: NavController)
{
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        header(navController)
            Column{

                Image(painter = painterResource(id = newsdata.image), null)
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    info(Icons.Filled.Edit,newsdata.author,Icons.Filled.DateRange,newsdata.pusblishedAt)
                }
                Card(
                    modifier = Modifier.fillMaxWidth()
                        .
                ) {

                    Text(
                        text = newsdata.title, fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 16.dp, start = 130.dp)
                    )
                    Text(
                        text = newsdata.description,
                        modifier = Modifier.padding(top = 20.dp, start = 4.dp)
                    )
                }
            }

            }

    }


@Composable
fun info(icon : ImageVector , info:String , icone:ImageVector , time:String)
{
    Box(
        modifier = Modifier.padding(10.dp)
    )
    {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .requiredHeight(50.dp),
            elevation = CardDefaults.elevatedCardElevation(
                defaultElevation = 6.dp),
            shape = RoundedCornerShape(50.dp)

        )
        {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxSize()
            ) {
                Icon(
                    icon, "Auhor",
                    modifier = Modifier
                        .padding(end = 8.dp)
                )
                Text(text = info)

                Icon(icone,"date",
                modifier = Modifier.padding(start=149.dp,end=8.dp))

                Text(text = time)
            }
        }
    }
}
