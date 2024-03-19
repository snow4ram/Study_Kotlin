package testkotlin.demokotlin.application

import org.springframework.stereotype.Service
import testkotlin.demokotlin.entity.Member

@Service
class MemberServiceImpl () :MemberService {

    private var school: MutableMap<Long, Member> = mutableMapOf()

    private var memberCount: Long = 1

    override fun save(name: String, age: Int) {
        val member = Member(name, age)
        school.put(memberCount , member)
        memberCount++
    }

    override fun get(id: Long): Member? {
         return school.get(id)
    }
}