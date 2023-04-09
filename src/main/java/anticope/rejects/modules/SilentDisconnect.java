package anticope.rejects.modules;

import anticope.rejects.MeteorRejectsAddon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class SilentDisconnect extends Module {
    public SilentDisconnect() {
        super(MeteorRejectsAddon.CATEGORY, "silent-disconnect", "Will keep you in the server client sided after disconnecting");
    }
}
