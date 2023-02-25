package com.trois.fundingbody.serviceImpl;

import com.trois.fundingbody.model.FundingBody;
import com.trois.fundingbody.repo.FundingBodyRepository;
import com.trois.fundingbody.service.FundingBodyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author sreepriya
 *
 */
@Service
public class FundingBodyServiceImpl implements FundingBodyService {

    @Autowired
    FundingBodyRepository fundingBodyRepository;
    @Override
    public void addFundingBody(FundingBody fundingBody) {
    fundingBodyRepository.save(fundingBody);
    }
}
