package tr.havelsan.ueransim.ngap0.ies.sequences;

import tr.havelsan.ueransim.ngap0.core.*;
import tr.havelsan.ueransim.ngap0.ies.octet_strings.*;
import tr.havelsan.ueransim.ngap0.ies.sequence_ofs.*;

public class NGAP_ForbiddenAreaInformation_Item extends NGAP_Sequence {

    public NGAP_PLMNIdentity pLMNIdentity;
    public NGAP_ForbiddenTACs forbiddenTACs;

    @Override
    public String getAsnName() {
        return "ForbiddenAreaInformation-Item";
    }

    @Override
    public String getXmlTagName() {
        return "ForbiddenAreaInformation-Item";
    }

    @Override
    public String[] getMemberNames() {
        return new String[]{"pLMNIdentity", "forbiddenTACs"};
    }

    @Override
    public String[] getMemberIdentifiers() {
        return new String[]{"pLMNIdentity", "forbiddenTACs"};
    }
}
