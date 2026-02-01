package edu.gvsu.cis.uiclone

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material3.HorizontalDivider
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.QueueMusic
import androidx.compose.material.icons.filled.LibraryMusic
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold


@Composable
fun MusicPageTop(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEEEFFE))
            .statusBarsPadding()

    ) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(bottom = 120.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically, // center the circle vertically with text

            ) {
                Text(
                    "Library",
                    fontSize = 32.sp,
                    fontWeight = Bold
                )

                Spacer(modifier = Modifier.weight(1f))

                Box(
                    contentAlignment = Alignment.Center,

                    modifier = Modifier
                        .size(40.dp)
                        .background(
                            color = Color.White,
                            shape = CircleShape
                        )


                ) {
                    Icon(
                        imageVector = Icons.Filled.MoreHoriz,
                        contentDescription = null,
                        tint = Color.Black,
                        modifier = Modifier.size(24.dp)
                    )
                }

                Spacer(modifier = Modifier.width(10.dp))

                Box(
                    contentAlignment = Alignment.Center,

                    modifier = Modifier
                        .size(40.dp)
                        .background(
                            color = MaterialTheme.colorScheme.tertiary,
                            shape = CircleShape
                        )

                ) {
                    Text(
                        text = "NB",
                        fontSize = 20.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        lineHeight = 16.sp,
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),

                verticalAlignment = Alignment.CenterVertically

            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.QueueMusic,
                    contentDescription = null,
                    tint = Color.Red,
                    modifier = Modifier
                        .size(28.dp)

                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    "Playlists"
                )
                Spacer(modifier = Modifier.weight(1f))

                Icon(
                    imageVector = Icons.Filled.ChevronRight,
                    contentDescription = null,
                    tint = Color.LightGray,
                    modifier = Modifier
                        .size(24.dp)

                )
            }
            HorizontalDivider(
                color = Color.LightGray,
                thickness = 1.dp,
                modifier = Modifier
                    .padding(start = 48.dp, end = 15.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),

                verticalAlignment = Alignment.CenterVertically

            ) {
                Icon(
                    imageVector = Icons.Filled.MusicNote,
                    contentDescription = null,
                    tint = Color.Red,
                    modifier = Modifier
                        .size(28.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    "Songs"
                )
                Spacer(modifier = Modifier.weight(1f))

                Icon(
                    imageVector = Icons.Filled.ChevronRight,
                    contentDescription = null,
                    tint = Color.LightGray,
                    modifier = Modifier
                        .size(24.dp)
                )
            }
            HorizontalDivider(
                color = Color.LightGray,
                thickness = 1.dp,
                modifier = Modifier
                    .padding(start = 48.dp, end = 15.dp, bottom = 10.dp)
            )
            Row( modifier = Modifier) {
                Text(
                    "Recently Added",
                    fontWeight = Bold,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(10.dp)
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.padding(10.dp)
            ) {
                AlbumCover(
                    img = R.drawable.download1,
                    title = "West Texas Degenerate",
                    artist = "Treaty Oak Revival",
                    modifier = Modifier.weight(1f)
                )
                AlbumCover(
                    img = R.drawable.download2,
                    title = "No Vacancy",
                    artist = "Treaty Oak Revival",
                    modifier = Modifier.weight(1f)
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.padding(10.dp)
            ) {
                AlbumCover(
                    img = R.drawable.download3,
                    title = "Bad State of Mind - Single",
                    artist = "Treaty Oak Revival",
                    modifier = Modifier.weight(1f)
                )
                AlbumCover(
                    img = R.drawable.download4,
                    title = "Old Boots, New Dirt",
                    artist = "Jason Aldean",
                    modifier = Modifier.weight(1f)
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.padding(10.dp)
            ) {
                AlbumCover(
                    img = R.drawable.download3,
                    title = "Bad State of Mind - Single",
                    artist = "Treaty Oak Revival",
                    modifier = Modifier.weight(1f)
                )
                AlbumCover(
                    img = R.drawable.download4,
                    title = "Old Boots, New Dirt",
                    artist = "Jason Aldean",
                    modifier = Modifier.weight(1f)
                )
            }
        }
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .navigationBarsPadding()
                .padding(vertical = 8.dp)
        ) {
            Row(
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(horizontal = 12.dp),
                verticalAlignment = Alignment.CenterVertically

            ) {
                GlassCircleButton(
                    icon = Icons.Filled.LibraryMusic,
                    color = Color.Red
                )

                Spacer(modifier = Modifier.width(15.dp))

                GlassPlayerBar(
                    modifier = Modifier.weight(1f)
                )

                Spacer(modifier = Modifier.width(15.dp))

                GlassCircleButton(
                    icon = Icons.Filled.Search,
                    color = Color.Black
                )

            }
        }
    }
}


@Composable
fun GlassCircleButton(icon: ImageVector, color: Color) {
    Box(
        modifier = Modifier
            .size(50.dp)
            .background(
                Color.White.copy(alpha = 0.75f),
                shape = CircleShape
            ),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = color,
            modifier = Modifier.size(30.dp)
        )
    }
}

@Composable
fun GlassPlayerBar(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .height(50.dp)
            .background(
                color = Color.White.copy(alpha = 0.75f),
                shape = RoundedCornerShape(25.dp)
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Spacer(modifier = Modifier.width(15.dp))
        Image(
            painter = painterResource(R.drawable.download2),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(30.dp)
                .clip(RoundedCornerShape(6.dp))
        )
        Spacer(modifier = Modifier.width(10.dp))

        Column {
            Text("Missed Call", fontWeight = FontWeight.SemiBold, maxLines = 1, fontSize = 12.sp, lineHeight = 14.sp)
            Text("Treaty Oak Revival", fontSize = 10.sp, color = Color.Gray, maxLines = 1, lineHeight = 10.sp)
        }

        Spacer(modifier = Modifier.width(40.dp))

        Icon(
            imageVector = Icons.Filled.Pause,
            contentDescription = null,
            modifier = Modifier.size(26.dp)
        )

        Spacer(modifier = Modifier.width(20.dp))
    }
}

@Composable
fun AlbumCover(img:Int, title:String, artist: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
                .clip(RoundedCornerShape(8.dp))
        )   {
            Image(
                painter = painterResource(img),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }

        Spacer(Modifier.height(6.dp))

        Text(
            text = title,
            color = Color.Black,
            fontSize = 14.sp,
            maxLines = 1
        )
        Text(
            text = artist,
            color = Color.Gray,
            fontSize = 12.sp,
            maxLines = 1
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMusicPageTop() {
    _root_ide_package_.edu.gvsu.cis.uiclone.ui.theme.UICloneTheme(dynamicColor = false) {
        MusicPageTop()
    }
}
