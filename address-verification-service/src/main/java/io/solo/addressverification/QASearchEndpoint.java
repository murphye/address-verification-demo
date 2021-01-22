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

    @PayloadRoot(namespace = "http://www.qas.com/OnDemand-2011-03", localPart = "QASearch")
	@ResponsePayload
	public QASearchResult verifyAddress(@RequestPayload QASearch request) {

		String searchString = request.getSearch();
		// TODO: Parse the searchString to get some valid values

		QASearchResult result = new QASearchResult();

		result.setVerifyLevel(VerifyLevelType.VERIFIED);

		VerificationFlagsType verificationFlags = new VerificationFlagsType();
		verificationFlags.setPostCodeCorrected(true);

		QAAddressType qaAddress = new QAAddressType();
		qaAddress.setDPVStatus(DPVStatusType.DPV_CONFIRMED);

		AddressLineType addressLine1 = new AddressLineType();
		addressLine1.setLineContent(LineContentType.ADDRESS);
		addressLine1.setLabel("Premise");
		addressLine1.setLine("ABC 123");

		AddressLineType addressLine2 = new AddressLineType();
		addressLine2.setLineContent(LineContentType.ADDRESS);
		addressLine2.setLabel("City name");
		addressLine2.setLine("ABCD");

		AddressLineType addressLine3 = new AddressLineType();
		addressLine3.setLineContent(LineContentType.ADDRESS);
		addressLine3.setLabel("State code");
		addressLine3.setLine("AB");

		AddressLineType addressLine4 = new AddressLineType();
		addressLine4.setLineContent(LineContentType.ADDRESS);
		addressLine4.setLabel("Zip-Code");
		addressLine4.setLine("12345-9876");

		AddressLineType addressLine5 = new AddressLineType();
		addressLine5.setLineContent(LineContentType.ADDRESS);
		addressLine5.setLabel("Country");
		addressLine5.setLine("UNITED STATES OF AMERICA");

		AddressLineType addressLine6 = new AddressLineType();
		addressLine6.setLineContent(LineContentType.DATA_PLUS);
		addressLine6.setLabel("PBSA");
		addressLine6.setLine("N");

		AddressLineType addressLine7 = new AddressLineType();
		addressLine7.setLineContent(LineContentType.DATA_PLUS);
		addressLine7.setLabel("CMRA");
		addressLine7.setLine("N");

		AddressLineType addressLine8 = new AddressLineType();
		addressLine8.setLineContent(LineContentType.DATA_PLUS);
		addressLine8.setLabel("ZIP5");
		addressLine8.setLine("0");

		AddressLineType addressLine9 = new AddressLineType();
		addressLine9.setLineContent(LineContentType.DATA_PLUS);
		addressLine9.setLabel("ZIP4");
		addressLine9.setLine("1");

		AddressLineType addressLine10 = new AddressLineType();
		addressLine10.setLineContent(LineContentType.DATA_PLUS);
		addressLine10.setLabel("RTYP");
		addressLine10.setLine("S");

		AddressLineType addressLine11 = new AddressLineType();
		addressLine11.setLineContent(LineContentType.DATA_PLUS);
		addressLine11.setLabel("Postnet barcode");
		addressLine11.setLine("138");

		qaAddress.getAddressLine().add(addressLine1);
		qaAddress.getAddressLine().add(addressLine2);
		qaAddress.getAddressLine().add(addressLine3);
		qaAddress.getAddressLine().add(addressLine4);
		qaAddress.getAddressLine().add(addressLine5);
		qaAddress.getAddressLine().add(addressLine6);
		qaAddress.getAddressLine().add(addressLine7);
		qaAddress.getAddressLine().add(addressLine8);
		qaAddress.getAddressLine().add(addressLine9);
		qaAddress.getAddressLine().add(addressLine10);
		qaAddress.getAddressLine().add(addressLine11);

		result.setQAAddress(qaAddress);

		return result;
	}

}