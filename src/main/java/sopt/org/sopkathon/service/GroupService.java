package sopt.org.sopkathon.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sopt.org.sopkathon.controller.dto.response.GetGroupResponseDto;
import sopt.org.sopkathon.controller.dto.response.UserResponseDto;
import sopt.org.sopkathon.domain.Group;
import sopt.org.sopkathon.exception.Error;
import sopt.org.sopkathon.exception.model.NotFoundException;
import sopt.org.sopkathon.infrastructure.GroupRepository;
import sopt.org.sopkathon.infrastructure.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GroupService {

    private final GroupRepository groupRepository;
    private final UserRepository userRepository;

    public GetGroupResponseDto getGroupInfo(Long groupId) {
        Group group = groupRepository.findById(groupId).orElseThrow(
                () -> new NotFoundException(Error.NOT_FOUND_GROUP_EXCEPTION, Error.NOT_FOUND_GROUP_EXCEPTION.getMessage())
        );

        List<UserResponseDto> userList = userRepository.findByGroupIdOrderByLife(groupId)
                .stream().map(UserResponseDto::of).collect(Collectors.toList());

        return GetGroupResponseDto.of(group, userList);
    }
}
