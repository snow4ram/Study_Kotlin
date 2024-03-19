package testkotlin.demokotlin.application

import org.springframework.stereotype.Service
import testkotlin.demokotlin.app.request.MemberRequest
import testkotlin.demokotlin.app.response.MemberResponse
import testkotlin.demokotlin.entity.Member

@Service
class MemberServiceImpl : MemberService {

    private var school: MutableMap<Long, Member> = mutableMapOf()

    private var memberCount: Long = 1

    override fun save(memberRequest: MemberRequest) : MemberResponse? {

        val member = Member(memberRequest.name, memberRequest.age)

        val members = school.put(memberCount, member)

        memberCount++

        return memberRequest.toEntity(members)
    }

    override fun get(id: Long): Member? {
         return school.get(id)
    }
}