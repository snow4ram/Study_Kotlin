package testkotlin.demokotlin.app

import lombok.RequiredArgsConstructor
import lombok.extern.slf4j.Slf4j
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import testkotlin.demokotlin.app.request.MemberRequest
import testkotlin.demokotlin.app.response.MemberResponse
import testkotlin.demokotlin.application.MemberService

@Slf4j
@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
class MemberController (private var memberService: MemberService) {

    @PostMapping("/save")
    public fun save(@RequestBody memberRequest: MemberRequest):MemberResponse? {
        return memberService.save(memberRequest)
    }

}