package sopt.org.sopkathon.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sopt.org.sopkathon.common.dto.ApiResponse;
import sopt.org.sopkathon.controller.dto.request.GetGroupRequestDto;
import sopt.org.sopkathon.controller.dto.response.GetGroupResponseDto;
import sopt.org.sopkathon.exception.Success;
import sopt.org.sopkathon.service.GroupService;

@RestController
@RequestMapping("/group")
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ApiResponse<GetGroupResponseDto> getGroupInfo(@RequestBody final GetGroupRequestDto request) {
        return ApiResponse.success(Success.GET_GROUP_INFO_SUCCESS, groupService.getGroupInfo(request));
    }
}
