package com.kieronquinn.monetcompat.extensions

import dev.kdrag0n.monet.theme.ZcamDynamicColorScheme

/**
 *  To avoid editing the core Monet code by kdrag0n, these are extensions instead
 */
fun ZcamDynamicColorScheme.isSameAs(other: Any?): Boolean {
    if(other !is ZcamDynamicColorScheme) return false
    this.accentColors.forEachIndexed { index, map ->
        if(!map.values.toList().deepEquals(other.accentColors[index].values.toList())) return false
    }
    this.neutralColors.forEachIndexed { index, map ->
        if(!map.values.toList().deepEquals(other.neutralColors[index].values.toList())) return false
    }
    return true
}