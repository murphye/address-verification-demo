package io.solo.addressverification;

import com.qas.ondemand_2011_03.AddressLineType;
import com.qas.ondemand_2011_03.DPVStatusType;
import com.qas.ondemand_2011_03.LineContentType;
import com.qas.ondemand_2011_03.QAAddressType;
import com.qas.ondemand_2011_03.QASearch;
import com.qas.ondemand_2011_03.QASearchResult;
import com.qas.ondemand_2011_03.VerificationFlagsType;
import com.qas.ondemand_2011_03.VerifyLevelType;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class QASearchEndpoint {

    @PayloadRoot(namespace = "http://www.qas.com/web-2013-12", localPart = "QASearch")
	@ResponsePayload
	public QASearchResult verifyAddress(@RequestPayload QASearch request) {
		QASearchResult result = new QASearchResult();

		result.setVerifyLevel(VerifyLevelType.VERIFIED);

		VerificationFlagsType verificationFlags = new VerificationFlagsType();
		verificationFlags.setPostCodeCorrected(true);

		QAAddressType qaAddress = new QAAddressType();
		qaAddress.setDPVStatus(DPVStatusType.DPV_CONFIRMED);

		AddressLineType addressLine = new AddressLineType();
		addressLine.setLineContent(LineContentType.ADDRESS);
		addressLine.setLabel("Premise");
		addressLine.setLine("ABC 123");

		result.setQAAddress(qaAddress);

		return result;
	}

}