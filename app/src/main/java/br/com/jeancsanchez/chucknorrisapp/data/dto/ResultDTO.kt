package br.com.jeancsanchez.chucknorrisapp.data.dto

import br.com.jeancsanchez.chucknorrisapp.model.Fact

data class ResultDTO(
    val total: Int,
    val result: List<Fact>
)