package kr.co.codin.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.codin.repository.domain.Member;
import kr.co.codin.test.service.MemberService;

@Controller
@RequestMapping("member")
public class MemberController {

	@Autowired
	private MemberService service;
	
	@RequestMapping("list.do")
	public void selectMember(Model model) throws Exception {
		System.out.println();
		model.addAttribute("list", service.selectMember());
	}
	
}