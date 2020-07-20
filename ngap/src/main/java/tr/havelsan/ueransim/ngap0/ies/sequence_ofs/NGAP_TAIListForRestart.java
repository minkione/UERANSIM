package tr.havelsan.ueransim.ngap0.ies.sequence_ofs;

import tr.havelsan.ueransim.ngap0.core.*;
import tr.havelsan.ueransim.ngap0.ies.sequences.*;

import java.util.List;

public class NGAP_TAIListForRestart extends NGAP_SequenceOf<NGAP_TAI> {

    public NGAP_TAIListForRestart() {
        super();
    }

    public NGAP_TAIListForRestart(List<NGAP_TAI> value) {
        super(value);
    }

    @Override
    public String getAsnName() {
        return "TAIListForRestart";
    }

    @Override
    public String getXmlTagName() {
        return "TAIListForRestart";
    }

    @Override
    public Class<NGAP_TAI> getItemType() {
        return NGAP_TAI.class;
    }
}
