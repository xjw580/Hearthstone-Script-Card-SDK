package club.xiaojiawei.hsscriptcardsdk.enums

/**
 * @author 肖嘉威
 * @date 2022/11/27 19:17
 */
enum class CardTypeEnum {
    /**
     * 随从
     */
    MINION,

    /**
     * 地标
     */
    LOCATION,

    /**
     * 法术
     */
    SPELL,

    /**
     * 英雄
     */
    HERO,

    /**
     * 武器
     */
    WEAPON,

    /**
     * 技能
     */
    HERO_POWER,

    /**
     * 效果
     */
    ENCHANTMENT,

    /**
     * 游戏
     */
    GAME,

    /**
     * 玩家
     */
    PLAYER,

    /**
     * 无效
     */
    INVALID,

    /**
     * 未知
     */
    UNKNOWN,
    ;

    companion object {
        fun fromString(str: String?): CardTypeEnum {
            if (str.isNullOrBlank()) return UNKNOWN
            return try {
                valueOf(str.uppercase())
            }catch (_:Exception){
                UNKNOWN
            }
        }
    }
}
