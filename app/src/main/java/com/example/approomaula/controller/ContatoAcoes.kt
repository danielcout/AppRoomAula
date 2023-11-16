package com.example.approomaula.controller

sealed interface ContatoAcoes {
    object CadastrarContato: ContatoAcoes
    object VisualizarDialog: ContatoAcoes
    object OcultarDialog: ContatoAcoes

    data class SetNome(val nome: String): ContatoAcoes
    data class SetSobrenome(val Sobrenome: String): ContatoAcoes
    data class SetTelefone(val telefone: String): ContatoAcoes
    data class SortearContatos(val tipos: String): ContatoAcoes
    data class DeletarContato(val contato: com.example.approomaula.controller.Contato): ContatoAcoes


}