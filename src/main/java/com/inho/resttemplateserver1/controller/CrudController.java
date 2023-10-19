package com.inho.resttemplateserver1.controller;

import com.inho.resttemplateserver1.domain.MemberDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/crud-api")
public class CrudController {

    @GetMapping
    public String getName() {
        return "Flature";
    }

    @GetMapping("/{variable}")
    public String getVariable(@PathVariable String variable) {
        return variable;
    }

    @GetMapping("/param")
    public String getNameWithParam(@RequestParam String name) {
        return "Hello " + name + "!";
    }

    @PostMapping
    public ResponseEntity<MemberDTO> getMember(
        @RequestBody MemberDTO request,
        @RequestParam String name,
        @RequestParam String email,
        @RequestParam String organization
    ) {
        System.out.println(request.getName());
        System.out.println(request.getEmail());
        System.out.println(request.getOrganization());

        MemberDTO memberDTO = new MemberDTO();

        memberDTO.setName(name);
        memberDTO.setEmail(email);
        memberDTO.setOrganization(organization);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(memberDTO);
    }

    @PostMapping("/add-header")
    public ResponseEntity<MemberDTO> addHeader(
        @RequestHeader("my-header") String header,
        @RequestBody MemberDTO memberDTO
    ) {
        System.out.println(header);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(memberDTO);
    }
}
