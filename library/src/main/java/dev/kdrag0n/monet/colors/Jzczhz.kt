package dev.kdrag0n.monet.colors

import dev.kdrag0n.monet.colors.Lch.Companion.calcLabA
import dev.kdrag0n.monet.colors.Lch.Companion.calcLabB
import dev.kdrag0n.monet.colors.Lch.Companion.calcLchC
import dev.kdrag0n.monet.colors.Lch.Companion.calcLchH

data class Jzczhz(
    override val L: Double,
    override val C: Double,
    override val h: Double,
) : Lch {
    override fun toLinearSrgb() = toJzazbz().toLinearSrgb()

    fun toJzazbz(): Jzazbz {
        return Jzazbz(
            L = L,
            a = calcLabA(),
            b = calcLabB(),
        )
    }

    companion object {
        fun Jzazbz.toJzczhz(): Jzczhz {
            return Jzczhz(
                L = L,
                C = calcLchC(),
                h = calcLchH(),
            )
        }
    }
}
