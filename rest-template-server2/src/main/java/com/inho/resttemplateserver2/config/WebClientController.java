package com.inho.resttemplateserver2.config;

import com.inho.resttemplateserver2.domain.MemberDTO;
import com.inho.resttemplateserver2.service.RestTemplateService;
import com.inho.resttemplateserver2.service.WebClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/web-client")
public class WebClientController {

    private final WebClientService webClientService;

    @GetMapping
    public String getName() {
        return webClientService.getName();
    }

    @GetMapping("/path-variable")
    public String getNameWithPathVariable() {
        return webClientService.getNameWithPathVariable();
    }

    @GetMapping("/parameter")
    public String getNameWithParameter() {
        return webClientService.getNameWithParameter();
    }

    @PostMapping
    public ResponseEntity<MemberDTO> postDTO() {
        return webClientService.postWithParamAndBody();
    }

    @PostMapping("/header")
    public ResponseEntity<MemberDTO> postWithHeader() {
        return webClientService.postWithHeader();
    }
}
