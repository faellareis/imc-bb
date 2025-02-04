package br.senai.sp.jandira.imc

import br.senai.sp.jandira.imc.model.Medico
import br.senai.sp.jandira.imc.model.Paciente
import java.time.LocalDate

fun main() {

    //Criar o paciente Ana MAria
    var paciente1 = Paciente()
    paciente1.id = 1
    paciente1.nome = "Ana Maria"
    paciente1.email = "ana@email.com"
    paciente1.altura =  1.67
    paciente1.peso = 59
    paciente1.dataNascimento = LocalDate.of(2001, 8, 13)
    paciente1.calcularImc()
    paciente1.classificarImc()
    paciente1.mostrarDadosBiometricos()

    //Criar o paciente Pedro Oliveira
    var paciente2 = Paciente()
    paciente2.id = 2
    paciente2.nome = "Pedro Oliveira"
    paciente2.email = "pedro@email"
    paciente2.altura = 1.78
    paciente2.peso = 66
    paciente2.dataNascimento = LocalDate.of(2007, 6, 9)
    paciente2.calcularImc()
    paciente2.classificarImc()
    paciente2.mostrarDadosBiometricos()

    //Criar um objeto Medico
    var medico1 = Medico()
    medico1.id = 1
    medico1.nome = "Roberta da Silva"
    medico1.especialidades.add("Nutrucionista")
    medico1.especialidades.add("Gastroenterologista")
    medico1.exibirFichaDoMedico()

    var medico2 = Medico()
}

