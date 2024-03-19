package testkotlin.demokotlin.application

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class MemberServiceImplTest {

    private var service = MemberServiceImpl()

    @Test
    fun save() {
        //give
        var name = "userA"
        var age = 10

        //when
        service.save(name, age)

        //then
        val members = service.get(1L)

        members?.let {
            Assertions.assertThat(members.name).isEqualTo(name)
            Assertions.assertThat(it.age).isEqualTo(age)
        }
    }
}



