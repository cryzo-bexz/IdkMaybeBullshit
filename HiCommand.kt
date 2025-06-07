package com.yourname.simplehi

import com.aliucord.api.CommandsAPI
import com.aliucord.entities.Context
import com.aliucord.plugins.Plugin
import com.discord.api.commands.ApplicationCommandType

class HiCommand : Plugin() {
    override fun start(ctx: Context) {
        CommandsAPI.registerCommand(
            "hi",
            "Say hi!",
            ApplicationCommandType.CHAT_INPUT,
            emptyList()
        ) { commandCtx ->
            commandCtx.respond("Hi!")
        }
    }

    override fun stop(ctx: Context) {
        CommandsAPI.unregisterCommand("hi")
    }
}
