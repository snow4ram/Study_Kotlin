package testkotlin.demokotlin.application

import testkotlin.demokotlin.app.request.MemberRequest
import testkotlin.demokotlin.app.response.MemberResponse
import testkotlin.demokotlin.entity.Member

interface MemberService {
    fun save(memberRequest: MemberRequest) : MemberResponse?

    fun get(id: Long): Member?
}