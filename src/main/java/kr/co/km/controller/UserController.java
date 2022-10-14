package kr.co.km.controller;

import kr.co.km.service.UserService;
import kr.co.km.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/users")
    public @ResponseBody List<UserVo> users() throws Exception {
        return userService.selectUserList();
    }

    @PostMapping("/login.ado")
    public String login(@RequestParam String name, RedirectAttributes ra, HttpServletRequest request) throws Exception {
        // 파라미터로 받은 유저 정보로 조회
        UserVo user = userService.selectUser(name);

        // 로그인을 시도한 유저가 없으면 로그인 페이지로 이동
        if (user == null) {
            // post 형식으로 에러 메시지 객체 전송
            ra.addFlashAttribute("errMsg", "등록된 사용자가 없습니다.");
            return "redirect:/login";
        } else {
            // 세션 받아오기
            HttpSession session = request.getSession();
            // 세션에 사용자 정보 저장
            session.setAttribute("name", user.getName());
            session.setAttribute("userSeq", user.getUserSeq());
            return "redirect:/todoList";
        }
    }

    @PostMapping("/logout.ado")
    public String logout(HttpSession session) throws Exception {
        session.invalidate();
        return "redirect:/";
    }
}