package sopt.org.sopkathon.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sopt.org.sopkathon.common.dto.ApiResponse;
import sopt.org.sopkathon.controller.dto.response.GetGroupResponseDto;
import sopt.org.sopkathon.exception.Success;
import sopt.org.sopkathon.service.GroupService;

@RestController
@RequestMapping("/group")
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;

    @GetMapping("/{groupId}")
    @ResponseStatus(HttpStatus.OK)
    public ApiResponse<GetGroupResponseDto> getGroupInfo(@PathVariable("groupId") final Long groupId) {
        return ApiResponse.success(Success.GET_GROUP_INFO_SUCCESS, groupService.getGroupInfo(groupId));
    }
}
