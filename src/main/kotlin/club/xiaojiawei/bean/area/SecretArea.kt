package club.xiaojiawei.bean.area

import club.xiaojiawei.bean.Card
import club.xiaojiawei.bean.Player

/**
 * 奥秘区
 *
 * @author 肖嘉威
 * @date 2022/11/28 20:02
 */
class SecretArea(allowLog: Boolean = false, player: Player) : Area(allowLog = allowLog, maxSize = 5, player = player) {

    override fun addZeroCard(card: Card?) {
        add(card)
    }

}
