package testkotlin.demokotlin.application

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import testkotlin.demokotlin.app.request.MemberRequest

internal class MemberServiceImplTest {

    private var service = MemberServiceImpl()

    private var name = "userA"
    private var age = 10
    @Test
    fun save() {
        //give
        val memberRequest = MemberRequest(name, age)

        //when
        service.save(memberRequest)

        //then
        val members = service.get(1L)

        members?.let {
            Assertions.assertThat(members.name).isEqualTo(name)
            Assertions.assertThat(it.age).isEqualTo(age)
        }
    }
}



