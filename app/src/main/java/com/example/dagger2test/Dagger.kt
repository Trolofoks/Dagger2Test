package com.example.dagger2test

import dagger.Component
import dagger.Module
import dagger.Provides

//указываем компонент и передаем модули
@Component(modules = [AppModule::class])
interface AppComponent {

    //показывает куда надо доставить
    fun inject(activity: MainActivity)

    val computer: Computer
}

//тот самый модуль который делает то что нам нужно
@Module
object AppModule {

    @Provides
    fun provideComputer(
        processor: Processor,
        motherboard: Motherboard,
        ram: RAM
    ):Computer {
        return Computer(
            processor = processor,
            ram = ram,
            motherboard = motherboard
        )
    }

    @Provides
    fun provideProcessor(): Processor{
        return Processor()
    }

    @Provides
    fun provideMotherboard():Motherboard{
        return Motherboard()
    }

    @Provides
    fun provideRAM():RAM{
        return RAM()
    }
}