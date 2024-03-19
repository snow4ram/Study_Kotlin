package testkotlin.demokotlin.app.request

import testkotlin.demokotlin.app.response.MemberResponse
import testkotlin.demokotlin.entity.Member

data class MemberRequest(
        val name: String,
        val age: Int) {

    fun toEntity(members: Member?): MemberResponse {
        return MemberResponse(
                name = name,
                age = age
        )
    }
}
