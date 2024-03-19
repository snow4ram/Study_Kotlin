package testkotlin.demokotlin.application

import testkotlin.demokotlin.entity.Member

interface MemberService {
    fun save(name: String, age: Int)

    fun get(id: Long): Member?
}