package nolanjames.me.plugins

import io.ktor.server.application.*
import nolanjames.me.di.koinModule
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger

fun Application.configureKoin() {
    install(Koin) {
        slf4jLogger()
        modules(koinModule)
    }
}