/*
 * Copyright (c) 2020 ALİ GÜNGÖR (aligng1620@gmail.com)
 * This software and all associated files are licensed under GPL-3.0.
 */

package tr.havelsan.ueransim.ngap0.ies.sequence_ofs;

import tr.havelsan.ueransim.ngap0.core.*;
import tr.havelsan.ueransim.ngap0.pdu.*;
import tr.havelsan.ueransim.utils.bits.*;
import tr.havelsan.ueransim.utils.octets.*;
import tr.havelsan.ueransim.ngap0.ies.bit_strings.*;
import tr.havelsan.ueransim.ngap0.ies.octet_strings.*;
import tr.havelsan.ueransim.ngap0.ies.printable_strings.*;
import tr.havelsan.ueransim.ngap0.ies.sequences.*;
import tr.havelsan.ueransim.ngap0.ies.sequence_ofs.*;
import tr.havelsan.ueransim.ngap0.ies.choices.*;
import tr.havelsan.ueransim.ngap0.ies.integers.*;
import tr.havelsan.ueransim.ngap0.ies.enumerations.*;

import java.util.List;

public class NGAP_PDUSessionResourceListHORqd extends NGAP_SequenceOf<NGAP_PDUSessionResourceItemHORqd> {

    public NGAP_PDUSessionResourceListHORqd() {
        super();
    }

    public NGAP_PDUSessionResourceListHORqd(List<NGAP_PDUSessionResourceItemHORqd> value) {
        super(value);
    }

    @Override
    public String getAsnName() {
        return "PDUSessionResourceListHORqd";
    }

    @Override
    public String getXmlTagName() {
        return "PDUSessionResourceListHORqd";
    }

    @Override
    public Class<NGAP_PDUSessionResourceItemHORqd> getItemType() {
        return NGAP_PDUSessionResourceItemHORqd.class;
    }
}
