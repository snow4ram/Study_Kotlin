package testkotlin.demokotlin.app

import lombok.RequiredArgsConstructor
import lombok.extern.slf4j.Slf4j
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import testkotlin.demokotlin.app.response.MemberResponse

@Slf4j
@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
class MemberController  {



    @PostMapping("")
    public fun save():MemberResponse? {
        return null
    }
}