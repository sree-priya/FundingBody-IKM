package com.trois.fundingbody.converter;

import com.trois.fundingbody.model.FundingBody;
import com.trois.fundingbody.request.FundingBodyRequest;
import org.springframework.stereotype.Component;
import org.springframework.core.convert.converter.Converter;
/**
 * @author sreepriya
 *
 */
@Component
public class FundingBodyRequestToFundingBodyConverter implements Converter<FundingBodyRequest, FundingBody> {

    @Override
    public FundingBody convert(FundingBodyRequest source) {
        FundingBody fundingBody=new FundingBody();
        fundingBody.setName(source.getName());
        fundingBody.setEmail(source.getEmail());
        fundingBody.setPhone(source.getPhone());
        fundingBody.setContactAddress(source.getContactAddress());
        fundingBody.setCreatedDate(source.getCreatedDate());
        return fundingBody;
    }
}
