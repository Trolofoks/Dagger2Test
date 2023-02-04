package com.example.dagger2test

fun main() {
    //этот класс сам генерируется, просто нажми зеленый молоточек
    val appComponent: AppComponent = DaggerAppComponent.create()
    print(appComponent.computer)
}