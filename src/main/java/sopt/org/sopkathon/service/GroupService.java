package sopt.org.sopkathon.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sopt.org.sopkathon.controller.dto.response.GetGroupResponseDto;
import sopt.org.sopkathon.domain.Group;
import sopt.org.sopkathon.exception.Error;
import sopt.org.sopkathon.exception.model.NotFoundException;
import sopt.org.sopkathon.infrastructure.GroupRepository;

@Service
@RequiredArgsConstructor
public class GroupService {

    private final GroupRepository groupRepository;

    public GetGroupResponseDto getGroupInfo(Long groupId) {
        Group group = groupRepository.findById(groupId).orElseThrow(
                () -> new NotFoundException(Error.NOT_FOUND_GROUP_EXCEPTION, Error.NOT_FOUND_GROUP_EXCEPTION.getMessage())
        );

        return GetGroupResponseDto.of(group);
    }
}
