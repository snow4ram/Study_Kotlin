package testkotlin.demokotlin.entity

import lombok.Getter


class Member(
        var name: String,
        var age: Int) {

    override fun toString(): String {
        return "Member(name='$name', age=$age)"
    }
}