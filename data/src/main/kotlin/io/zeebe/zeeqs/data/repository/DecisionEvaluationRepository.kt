package io.zeebe.zeeqs.data.repository

import io.zeebe.zeeqs.data.entity.DecisionEvaluation
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface DecisionEvaluationRepository : PagingAndSortingRepository<DecisionEvaluation, Long> {

    fun findAllByDecisionKey(decisionKey: Long): List<DecisionEvaluation>

    fun countByDecisionKey(decisionKey: Long): Long

    fun findAllByProcessInstanceKey(processInstanceKey: Long): List<DecisionEvaluation>

    fun countByProcessInstanceKey(processInstanceKey: Long): Long

    fun findAllByElementInstanceKey(elementInstanceKey: Long): List<DecisionEvaluation>

    fun countByElementInstanceKey(elementInstanceKey: Long): Long
}