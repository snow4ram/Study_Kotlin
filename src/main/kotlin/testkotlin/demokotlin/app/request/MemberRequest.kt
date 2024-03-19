package testkotlin.demokotlin.app.request

import lombok.AccessLevel
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.RequiredArgsConstructor


@Getter
public class MemberRequest {

    private var name:String
    private var age:Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}
