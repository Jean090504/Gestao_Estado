package com.example.gestao_estado.juros

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.gestao_estado.calculos.calcularJuros
import com.example.gestao_estado.calculos.calcularMontante

class JurosScreenViewModel: ViewModel() {
    private val _capital = MutableLiveData<String>("")
    val capital: LiveData<String> = _capital

    private val _taxa = MutableLiveData<String>("")
    val taxa: LiveData<String> = _taxa

    private val _tempo = MutableLiveData<String>("")
    val tempo: LiveData<String> = _tempo

    private val _juros = MutableLiveData<Double>(0.0)
    val juros: LiveData<Double> = _juros

    private val _montante = MutableLiveData<Double>(0.0)
    val montante: LiveData<Double> = _montante





    fun onCapitalChanged(novoCapital: String) {
        _capital.value = novoCapital
    }

    fun onTaxaChanged(novaTaxa: String) {
        _taxa.value = novaTaxa
    }

    fun onTempoChanged(novoTempo: String) {
        _tempo.value = novoTempo
    }

    fun calcularJurosInvestimento(){
        _juros.value = calcularJuros(
            capital = _capital.value!!.toDouble(),
            taxa = _taxa.value!!.toDouble(),
            tempo = _tempo.value!!.toDouble()
        )
    }

    fun calcularMontanteInvestimento(){
        _montante.value = calcularMontante(
            capital = _capital.value!!.toDouble(),
            juros = _juros.value!!
        )
    }
}
