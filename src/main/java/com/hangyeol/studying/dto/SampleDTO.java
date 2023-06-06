package com.hangyeol.studying.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data //getter,setter,toString, equals, hashCode
@Builder(toBuilder = true)
public class SampleDTO { // dto의 객체를 model에 추가하여 전달함
    private Long sno;

    private String first;

    private String last;

    private LocalDateTime regTime;
}
