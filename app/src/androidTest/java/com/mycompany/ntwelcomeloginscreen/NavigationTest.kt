package com.mycompany.ntwelcomeloginscreen

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsSelected
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.isSelectable
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.mycompany.ntwelcomeloginscreen.ui.theme.NTWelcomeLoginScreenTheme
import org.junit.Rule
import org.junit.Test

class NavigationTest {
    @get:Rule
    val compose = createComposeRule()

    @Test
    fun previewOpensEveryDestinationAndReturnsToWelcome() {
        compose.setContent { NTWelcomeLoginScreenTheme { WelcomeLoginApp() } }
        compose.onNodeWithText("Preview app").performClick()
        AppTab.entries.forEach { tab ->
            compose.onNode(hasText(tab.label) and isSelectable()).performClick().assertIsSelected()
            val message = when (tab) {
                AppTab.Profile -> "Your profile will appear here once accounts are connected."
                AppTab.Reminders -> "Your reminders will appear here once this feature is connected."
                AppTab.Chat -> "Chat will be available here once messaging is connected."
                AppTab.Tips -> "Tips will appear here once content is added."
                AppTab.Trivia -> "Trivia will be available here once questions are added."
            }
            compose.onNodeWithText(message).assertIsDisplayed()
        }
        compose.onNodeWithText("Exit preview").performClick()
        compose.onNodeWithText("Preview app").assertIsDisplayed()
    }
}
