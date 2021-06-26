package com.rllontop.devops.web.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class DevopsDto extends BaseItem {
    @Builder
    public DevopsDto(UUID id, Integer version, OffsetDateTime createdDate, OffsetDateTime lastModifiedDate,
                            String message, String to, String from, Integer timeToLifeSec) {
        super(id, version, createdDate, lastModifiedDate);
        this.message = message;
        this.to = to;
        this.from = from;
        this.timeToLifeSec = timeToLifeSec;
    }

    private String message;
    private String to;
    private String from;
    private Integer timeToLifeSec;
}
