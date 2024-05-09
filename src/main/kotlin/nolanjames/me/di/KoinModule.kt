package nolanjames.me.di

import nolanjames.me.repository.HeroRepository
import nolanjames.me.repository.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}