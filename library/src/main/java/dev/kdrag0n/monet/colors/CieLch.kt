package dev.kdrag0n.monet.colors

import dev.kdrag0n.monet.colors.Lch.Companion.calcLabA
import dev.kdrag0n.monet.colors.Lch.Companion.calcLabB
import dev.kdrag0n.monet.colors.Lch.Companion.calcLchC
import dev.kdrag0n.monet.colors.Lch.Companion.calcLchH

data class CieLch(
    override val L: Double,
    override val C: Double,
    override val h: Double,
) : Lch {
    override fun toLinearSrgb() = toCieLab().toLinearSrgb()

    fun toCieLab(): CieLab {
        return CieLab(
            L = L,
            a = calcLabA(),
            b = calcLabB(),
        )
    }

    companion object {
        fun CieLab.toCieLch(): CieLch {
            return CieLch(
                L = L,
                C = calcLchC(),
                h = calcLchH(),
            )
        }
    }
}
