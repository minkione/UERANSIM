package tr.havelsan.ueransim.ngap0.ies.sequences;

import tr.havelsan.ueransim.ngap0.core.*;
import tr.havelsan.ueransim.ngap0.ies.octet_strings.*;
import tr.havelsan.ueransim.ngap0.ies.integers.*;

public class NGAP_PDUSessionResourceModifyItemModReq extends NGAP_Sequence {

    public NGAP_PDUSessionID pDUSessionID;
    public NGAP_NAS_PDU nAS_PDU;
    public NGAP_OctetString pDUSessionResourceModifyRequestTransfer;

    @Override
    public String getAsnName() {
        return "PDUSessionResourceModifyItemModReq";
    }

    @Override
    public String getXmlTagName() {
        return "PDUSessionResourceModifyItemModReq";
    }

    @Override
    public String[] getMemberNames() {
        return new String[]{"pDUSessionID", "nAS-PDU", "pDUSessionResourceModifyRequestTransfer"};
    }

    @Override
    public String[] getMemberIdentifiers() {
        return new String[]{"pDUSessionID", "nAS_PDU", "pDUSessionResourceModifyRequestTransfer"};
    }
}
