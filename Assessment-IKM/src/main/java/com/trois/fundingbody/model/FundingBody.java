package com.trois.fundingbody.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
/**
 * @author sreepriya
 *
 */
@Entity
@Getter
@Setter
@Table(name = "funding_body")
public class FundingBody {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String name;

    private String email;

    private String phone;

    private String contactAddress;

    private Date createdDate;
}
