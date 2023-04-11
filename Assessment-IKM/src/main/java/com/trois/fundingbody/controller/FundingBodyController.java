package com.trois.fundingbody.controller;

import com.trois.fundingbody.config.SwaggerConstants;
import com.trois.fundingbody.converter.FundingBodyRequestToFundingBodyConverter;
import com.trois.fundingbody.model.FundingBody;
import com.trois.fundingbody.request.FundingBodyRequest;
import com.trois.fundingbody.service.FundingBodyService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
/**
 * @author sreepriya
 *
 */
@RestController
@RequestMapping("api/v1/funding-body")
public class FundingBodyController {

    @Autowired
    private FundingBodyService fundingBodyService;

    @Autowired
    private FundingBodyRequestToFundingBodyConverter fundingBodyRequestToFundingBodyConverter;


    @ApiResponses(value = {@ApiResponse(code = 400, message = SwaggerConstants.BAD_REQUEST),
            @ApiResponse(code = 201, message = SwaggerConstants.CREATED)})
    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public String createFundingBody(@RequestBody FundingBodyRequest fundingBodyRequest){
        FundingBody fundingBody = fundingBodyRequestToFundingBodyConverter.convert(fundingBodyRequest);
        fundingBodyService.addFundingBody(fundingBody);
        System.out.println("hoi");
        System.out.println("hoi");
        return "created";
    }
}
