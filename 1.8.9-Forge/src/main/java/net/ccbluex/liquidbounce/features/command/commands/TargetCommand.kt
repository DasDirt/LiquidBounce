package net.ccbluex.liquidbounce.features.command.commands

import net.ccbluex.liquidbounce.features.command.Command
import net.ccbluex.liquidbounce.utils.EntityUtils

/**
 * LiquidBounce Hacked Client
 * A minecraft forge injection client using Mixin
 *
 * @game Minecraft
 * @author CCBlueX
 */
class TargetCommand : Command("target", emptyArray()) {

    override fun execute(args: Array<String>) {
        if (args.size > 1) {
            when {
                args[1].equals("players", ignoreCase = true) -> {
                    EntityUtils.targetPlayer = !EntityUtils.targetPlayer
                    chat("§7Target player toggled ${if (EntityUtils.targetPlayer) "on" else "off"}.")
                    playEdit()
                    return
                }

                args[1].equals("mobs", ignoreCase = true) -> {
                    EntityUtils.targetMobs = !EntityUtils.targetMobs
                    chat("§7Target mobs toggled ${if (EntityUtils.targetMobs) "on" else "off"}.")
                    playEdit()
                    return
                }

                args[1].equals("animals", ignoreCase = true) -> {
                    EntityUtils.targetAnimals = !EntityUtils.targetAnimals
                    chat("§7Target animals toggled ${if (EntityUtils.targetAnimals) "on" else "off"}.")
                    playEdit()
                    return
                }

                args[1].equals("invisible", ignoreCase = true) -> {
                    EntityUtils.targetInvisible = !EntityUtils.targetInvisible
                    chat("§7Target Invisible toggled ${if (EntityUtils.targetInvisible) "on" else "off"}.")
                    playEdit()
                    return
                }
            }
        }

        chatSyntax("target <players/mobs/animals/invisible>")
    }

}