package com.smartewaste.backend.dto;

import com.smartewaste.backend.entity.UserAccount;
import com.smartewaste.backend.enums.UserStatus;

public class UserSummaryDto {

    private Long id;
    private String fullName;
    private String email;
    private String phone;
    private UserStatus status;

    // ✅ REQUIRED getters
    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public UserStatus getStatus() {
        return status;
    }

    // ✅ Mapper
    public static UserSummaryDto fromEntity(UserAccount user) {
        UserSummaryDto dto = new UserSummaryDto();
        dto.id = user.getId();
        dto.fullName = user.getFullName();
        dto.email = user.getEmail();
        dto.phone = user.getPhone();
        dto.status = user.getStatus();
        return dto;
    }
}
