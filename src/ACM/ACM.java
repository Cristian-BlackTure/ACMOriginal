package ACM;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class ACM extends Mod{
	public ACM() {
		Events.on(FileTreeInitEvent.class, e -> Sfx.load());
	}

	@Override
	public void loadContent() {
                ACMBlock.load();

	}
}
