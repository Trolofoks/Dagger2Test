package com.example.dagger2test

class Processor {

    override fun toString() = "xd dude processor"
}

class Motherboard {

    override fun toString() = "xd dude motherboard"
}

class RAM {

    override fun toString() = "xd dude RAM"
}

data class Computer(
    val processor: Processor,
    val motherboard: Motherboard,
    val ram: RAM
)