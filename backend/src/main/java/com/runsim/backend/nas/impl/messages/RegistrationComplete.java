package com.runsim.backend.nas.impl.messages;

import com.runsim.backend.nas.Decoder;
import com.runsim.backend.nas.core.messages.PlainNasMessage;
import com.runsim.backend.nas.impl.ies.IESorTransparentContainer;
import com.runsim.backend.utils.OctetInputStream;

public class RegistrationComplete extends PlainNasMessage {

    /* Optional */
    public IESorTransparentContainer sorTransparentContainer;

    @Override
    public RegistrationComplete decodeMessage(OctetInputStream stream) {
        var res = new RegistrationComplete();

        while (stream.hasNext()) {
            int iei = stream.readOctetI();
            switch (iei) {
                case 0x73:
                    res.sorTransparentContainer = Decoder.ie6(stream, false, IESorTransparentContainer.class);
                    break;
            }
        }

        return res;
    }
}