package com.nhnacademy.miniDooray.dto;

import com.nhnacademy.miniDooray.common.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {
    private String id;
    private String password;
    private String email;
    private String name;
    private Status status;
}
