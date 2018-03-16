package br.com.canaveze.celso.configuracaopersonagem

/**
 * Created by logonrm on 16/03/2018.
 */
enum class TipoPersonagemEnum(val id: Int){
    ELFO(0),
    ANAO(1),
    LICANTROPO(2),
    UNDEAD(3);

    companion object {
        fun from(findValue: Int): TipoPersonagemEnum =
                TipoPersonagemEnum.values().first { it.id == findValue}
    }
}