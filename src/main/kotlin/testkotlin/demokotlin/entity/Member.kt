package testkotlin.demokotlin.entity

import lombok.Getter


class Member(
        val name: String,
        val age: Int) {

    override fun toString(): String {
        return "Member(name='$name', age=$age)"
    }
}