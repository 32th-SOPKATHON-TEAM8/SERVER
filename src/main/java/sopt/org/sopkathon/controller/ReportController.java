package sopt.org.sopkathon.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import sopt.org.sopkathon.common.dto.ApiResponse;
import sopt.org.sopkathon.controller.dto.request.PatchReportRequestDto;
import sopt.org.sopkathon.exception.Success;
import sopt.org.sopkathon.service.UserService;

@RestController
@RequestMapping("/report")
@RequiredArgsConstructor
public class ReportController {
    private final UserService userService;

    @PatchMapping
    @ResponseStatus(HttpStatus.OK)
    public ApiResponse getGroupInfo(@RequestBody final PatchReportRequestDto patchReportRequestDto) {
        userService.report(patchReportRequestDto.getUserId());

        return ApiResponse.success(Success.PATCH_REPORT_SUCCESS);
    }

}
