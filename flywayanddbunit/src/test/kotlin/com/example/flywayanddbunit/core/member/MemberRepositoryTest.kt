package com.example.flywayanddbunit.core.member

import com.github.springtestdbunit.TransactionDbUnitTestExecutionListener
import com.github.springtestdbunit.annotation.DatabaseOperation
import com.github.springtestdbunit.annotation.DatabaseSetup
import com.github.springtestdbunit.annotation.DatabaseTearDown
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.repository.findByIdOrNull
import org.springframework.test.context.TestExecutionListeners
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
@TestExecutionListeners(value = [TransactionDbUnitTestExecutionListener::class])
@Transactional
@DatabaseSetup(value = ["member.xml"], type = DatabaseOperation.CLEAN_INSERT)
@DatabaseTearDown(value = ["member.xml"], type = DatabaseOperation.DELETE_ALL)
class MemberRepositoryTest @Autowired constructor(
    private val memberRepository: MemberRepository
) {

    @Test
    fun findById() {
        // given
        val id = 2L

        // when
        val member = memberRepository.findByIdOrNull(id)

        // then
        assertThat(member!!.id).isEqualTo(id)
        assertThat(member.name).isEqualTo("test1")
        assertThat(member.age).isEqualTo(28)
    }

}