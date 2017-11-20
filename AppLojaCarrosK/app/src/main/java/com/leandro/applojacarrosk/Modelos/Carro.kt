package com.leandro.applojacarrosk.Modelos

/**
 * Created by leandro on 20/11/17.
 */
class Carro(_nome: String, _tipo: Int, _qtdPortas: Int, _cor: String):Veiculo(_nome, _tipo){
    var qtdPortas = _qtdPortas;
    var cor = _cor;
}