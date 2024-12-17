package com.matheus.juan.nearby.ui.screen

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.matheus.juan.nearby.R
import com.matheus.juan.nearby.ui.component.button.NearbyButton
import com.matheus.juan.nearby.ui.theme.Gray500
import com.matheus.juan.nearby.ui.theme.RedBase
import com.matheus.juan.nearby.ui.theme.Typography

@Composable
fun WelcomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(Color.White)
            .fillMaxSize()
            .padding(horizontal = 40.dp, vertical = 40.dp)
            .verticalScroll(state = rememberScrollState()),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        WelcomeHeader()
        WelcomeContent()
        NearbyButton(
            modifier = Modifier.fillMaxWidth(),
            text = stringResource(R.string.start),
            onClick = {}
        )
    }
}

@Composable
fun WelcomeHeader(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_logo_logo_icon),
            contentDescription = stringResource(
                R.string.nearby_app_logo
            )
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(text = stringResource(R.string.welcome_nearby), style = Typography.headlineLarge)
        Text(text = stringResource(R.string.welcome_description), style = Typography.bodyLarge)
    }
}

@Composable
fun WelcomeContent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Text(text = stringResource(R.string.see_how_it_works), style = Typography.bodyLarge)
        WelcomeHowItWorksTip(
            modifier = Modifier.fillMaxWidth(),
            title = stringResource(R.string.find_markets),
            subtitle = stringResource(R.string.find_markets_description),
            iconRes = R.drawable.ic_map_pin
        )
        WelcomeHowItWorksTip(
            modifier = Modifier.fillMaxWidth(),
            title = stringResource(R.string.activate_coupon_qrcode),
            subtitle = stringResource(R.string.activate_coupon_qrcode_description),
            iconRes = R.drawable.ic_qrcode
        )
        WelcomeHowItWorksTip(
            modifier = Modifier.fillMaxWidth(),
            title = stringResource(R.string.guarantee_advantages),
            subtitle = stringResource(R.string.guarantee_advantages_description),
            iconRes = R.drawable.ic_ticket
        )
    }
}

@Composable
fun WelcomeHowItWorksTip(
    modifier: Modifier = Modifier,
    title: String,
    subtitle: String,
    @DrawableRes iconRes: Int
) {
    Row(
        modifier = modifier, horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Icon(
            modifier = Modifier.size(32.dp),
            painter = painterResource(id = iconRes),
            tint = RedBase,
            contentDescription = stringResource(R.string.how_it_works_icon)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(text = title, style = Typography.headlineSmall)
            Text(text = subtitle, color = Gray500, style = Typography.bodyLarge)
        }
    }
}

@Preview
@Composable
private fun WelcomeScreenPreview() {
    WelcomeScreen()
}