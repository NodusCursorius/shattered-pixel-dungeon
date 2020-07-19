/*
 * Pixel Dungeon
 * Copyright (C) 2012-2015 Oleg Dolya
 *
 * Shattered Pixel Dungeon
 * Copyright (C) 2014-2020 Evan Debenham
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.shatteredpixel.shatteredpixeldungeon.ui.changelist;

import com.shatteredpixel.shatteredpixeldungeon.items.DewVial;
import com.shatteredpixel.shatteredpixeldungeon.ui.Icons;
import com.shatteredpixel.shatteredpixeldungeon.ui.Window;

import java.util.ArrayList;

public class vAsh_Changes {

    public static void addAllChanges( ArrayList<ChangeInfo> changeInfos ){
        add_vAsh_Changes(changeInfos);
    }

    private static void add_vAsh_Changes(ArrayList<ChangeInfo> changeInfos) {
        ChangeInfo changes = new ChangeInfo("vAsh", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes.addButton( new ChangeButton( new DewVial(),
                "_-_ All classes start with the dew vial.\n" +
                "_-_ Dew vial added by default to left-most quickslot."));

        changes.addButton( new ChangeButton(Icons.get(Icons.AUDIO), "Audio",
                "_-_ Game music changed to Silent Words by Schematist.\n" +
                "_-_ Surface music changed to Mountain Trials by Joshua McLean.\n" +
                "_-_ Theme music changed to Winter Night by Alexander Nakarada."));
    }
}
