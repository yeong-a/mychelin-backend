package com.a206.mychelin.controller;

import com.a206.mychelin.service.UserPreferenceService;
import com.a206.mychelin.web.dto.UserPreferenceDto;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@CrossOrigin("*")
@RequiredArgsConstructor
@RestController("/preference")
public class UserPreferenceController {
    private final UserPreferenceService userPreferenceService;

    @ApiOperation(value = "사용자의 취향 설문 결과를 저장한다.")
    @ApiImplicitParam(name = "UserPreferenceRequest", value = "사용자의 입맛과 식당 선택 기준")
    @PostMapping
    public ResponseEntity saveUserPreference(@RequestBody UserPreferenceDto.UserPreferenceRequest userPreferenceRequest, HttpServletRequest httpServletRequest){
        return userPreferenceService.saveUserPreference(userPreferenceRequest, httpServletRequest);
    }

//    @GetMapping("/similar")
//    public ResponseEntity getSimilarUser(HttpServletRequest httpServletRequest) {
//        return userPreferenceService.findMostSimilarUser(httpServletRequest);
//    }
}