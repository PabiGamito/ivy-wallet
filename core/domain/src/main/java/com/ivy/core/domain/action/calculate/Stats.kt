package com.ivy.core.domain.action.calculate

data class Stats(
    val balance: Double,
    val income: Double,
    val expense: Double,
    val incomesCount: Int,
    val expensesCount: Int,
)