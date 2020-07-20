package tr.havelsan.ueransim.ngap0.ies.sequences;

import tr.havelsan.ueransim.ngap0.core.*;
import tr.havelsan.ueransim.ngap0.ies.choices.*;

public class NGAP_ExpectedUEMovingTrajectoryItem extends NGAP_Sequence {

    public NGAP_NGRAN_CGI nGRAN_CGI;
    public NGAP_Integer timeStayedInCell;

    @Override
    public String getAsnName() {
        return "ExpectedUEMovingTrajectoryItem";
    }

    @Override
    public String getXmlTagName() {
        return "ExpectedUEMovingTrajectoryItem";
    }

    @Override
    public String[] getMemberNames() {
        return new String[]{"nGRAN-CGI", "timeStayedInCell"};
    }

    @Override
    public String[] getMemberIdentifiers() {
        return new String[]{"nGRAN_CGI", "timeStayedInCell"};
    }
}
