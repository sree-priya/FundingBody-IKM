package com.trois.fundingbody.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
/**
 * @author sreepriya
 *
 */
@Getter
@Setter
@ToString
public class FundingBodyRequest {
    @NotNull
    @NotEmpty
    private String name;
    @Email
    private String email;

    private String phone;

    private String contactAddress;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date createdDate;

}
