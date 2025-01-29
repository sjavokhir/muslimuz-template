package uz.muslim.islom.namoz

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import muslimuz_template.composeapp.generated.resources.Res
import muslimuz_template.composeapp.generated.resources.bold
import muslimuz_template.composeapp.generated.resources.ic_appstore
import muslimuz_template.composeapp.generated.resources.ic_logo
import muslimuz_template.composeapp.generated.resources.ic_playstore
import muslimuz_template.composeapp.generated.resources.ic_telegram
import muslimuz_template.composeapp.generated.resources.image_background
import muslimuz_template.composeapp.generated.resources.image_frame
import muslimuz_template.composeapp.generated.resources.medium
import muslimuz_template.composeapp.generated.resources.regular
import muslimuz_template.composeapp.generated.resources.semibold
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.painterResource
import uz.muslim.islom.namoz.theme.AppTheme

@Composable
internal fun App() = AppTheme {
    val uriHandler = LocalUriHandler.current

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(Res.drawable.image_background),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
        )

        Row(
            modifier = Modifier.fillMaxSize(),
        ) {
            Spacer(Modifier.fillMaxWidth(0.12f))

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(vertical = 20.dp)
            ) {
                Image(
                    painter = painterResource(Res.drawable.ic_logo),
                    contentDescription = null,
                    modifier = Modifier.size(64.dp)
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(48.dp)
                ) {
                    Column(
                        modifier = Modifier.weight(1f),
                        verticalArrangement = Arrangement.spacedBy(20.dp)
                    ) {
                        Text(
                            text = "MUSLIM UZ",
                            style = MaterialTheme.typography.displayLarge,
                            fontFamily = FontFamily(Font(Res.font.bold)),
                            color = Color.White,
                        )

                        Text(
                            text = "Namoz, Azon, Qur'on, Duo va Zikrlar, Qibla, Islomiy arkonlar, Video darslar va boshqalar.",
                            style = MaterialTheme.typography.titleLarge,
                            fontFamily = FontFamily(Font(Res.font.medium)),
                            color = Color.White,
                        )

                        Spacer(Modifier)

                        Text(
                            text = "Bu ilovaning maqsadi ahli sunna val-jamoa mazhabi asosida pok aqiyda va musaffo Islomga intilish, Qur’on va sunnatni o‘rganib, amal qilish, islomiy ma’rifat taratish, salafi solih – ulug‘ mujtahidlarga ergashish, kengbag‘irlik va birodarlik ruhini tarqatishdan iboratdir.",
                            style = MaterialTheme.typography.bodyLarge,
                            fontFamily = FontFamily(Font(Res.font.regular)),
                            color = Color.White,
                        )

                        Spacer(Modifier)

                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(20.dp),
                        ) {
                            Image(
                                painter = painterResource(Res.drawable.ic_appstore),
                                contentDescription = null,
                                modifier = Modifier.clickable {
                                    uriHandler.openUri("https://apps.apple.com/us/app/muslim-uz-namoz-azon-duolar/id6739873570")
                                }
                            )

                            Image(
                                painter = painterResource(Res.drawable.ic_playstore),
                                contentDescription = null,
                                modifier = Modifier.clickable {
                                    uriHandler.openUri("https://play.google.com/store/apps/details?id=uz.muslim.islom.namoz")
                                }
                            )
                        }
                    }

                    Box(
                        modifier = Modifier.weight(1f),
                        contentAlignment = Alignment.Center,
                    ) {
                        Image(
                            painter = painterResource(Res.drawable.image_frame),
                            contentDescription = null,
                            modifier = Modifier.scale(scale = 0.8f),
                            contentScale = ContentScale.FillWidth
                        )
                    }
                }

                Box(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier.align(Alignment.Center),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Text(
                            text = "© 2019-2025 MUSLIM APPS. Barcha huquqlar himoyalangan.",
                            style = MaterialTheme.typography.bodyLarge,
                            fontFamily = FontFamily(Font(Res.font.regular)),
                            fontSize = 15.sp,
                            color = Color.White,
                        )

                        Row(
                            modifier = Modifier.padding(top = 8.dp),
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                        ) {
                            Text(
                                text = "Foydalanish shartlari",
                                modifier = Modifier
                                    .clickable {
                                        uriHandler.openUri("https://muslimuzapp.github.io/terms")
                                    }
                                    .padding(8.dp),
                                style = MaterialTheme.typography.bodyMedium,
                                fontFamily = FontFamily(Font(Res.font.regular)),
                                color = Color.White,
                            )

                            Text(
                                text = "Maxfiylik siyosati",
                                modifier = Modifier
                                    .clickable {
                                        uriHandler.openUri("https://muslimuzapp.github.io/privacy")
                                    }
                                    .padding(8.dp),
                                style = MaterialTheme.typography.bodyMedium,
                                fontFamily = FontFamily(Font(Res.font.regular)),
                                color = Color.White,
                            )
                        }
                    }

                    TextButton(
                        modifier = Modifier.align(Alignment.CenterEnd),
                        onClick = {
                            uriHandler.openUri("https://t.me/MuslimSupportBot")
                        }
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                        ) {
                            Text(
                                text = "Telegram",
                                style = MaterialTheme.typography.bodyLarge,
                                fontFamily = FontFamily(Font(Res.font.semibold)),
                                color = Color.White,
                            )

                            Image(
                                painter = painterResource(Res.drawable.ic_telegram),
                                contentDescription = null,
                                modifier = Modifier.size(20.dp)
                            )
                        }
                    }
                }
            }

            Spacer(Modifier.fillMaxWidth(0.12f))
        }
    }
}
